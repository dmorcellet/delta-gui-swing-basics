package delta.gui.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import delta.gui.build.swing.SwingFormButtonsPanelBuilder;
import delta.gui.control.ButtonController;
import delta.gui.control.Callback;
import delta.gui.control.CallbackData;
import delta.gui.control.FormControlButtonsController;
import delta.gui.control.FormController;

/**
 * Test for form controller.
 * @author DAM
 */
public class TestFormController
{
  private static JPanel buildDataFormPanel()
  {
    JPanel panel=new JPanel();
    panel.setLayout(new GridBagLayout());

    GridBagConstraints c=new GridBagConstraints(0,0,1,1,0.0,1.0,GridBagConstraints.WEST, GridBagConstraints.NONE,new Insets(5,5,5,5),0,0);
    // Name
    JLabel labelName=new JLabel("Name:");
    labelName.setName("label_text");
    JTextField textFieldName=new JTextField();
    textFieldName.setName("text");
    c.gridx=0;c.gridy=0;
    panel.add(labelName,c);
    c.gridx=1;c.fill=GridBagConstraints.HORIZONTAL;
    panel.add(textFieldName,c);
    // Alive
    JLabel labelAlive=new JLabel("Alive:");
    labelAlive.setName("label_boolean");
    JCheckBox checkboxAlive=new JCheckBox();
    checkboxAlive.setName("boolean");
    c.gridx=0;c.gridy=1;
    panel.add(labelAlive,c);
    c.gridx=1;c.fill=GridBagConstraints.HORIZONTAL;
    panel.add(checkboxAlive,c);
    return panel;
  }

  private static void doOK(FormController<MyData> controller)
  {
    MyData newData=controller.getValue();
    System.out.println(newData);
  }

  private static JPanel buildFullPanel()
  {
    JPanel panel=new SwingFormButtonsPanelBuilder().build();
    FormControlButtonsController c=new SwingFormButtonsController(panel);

    JPanel fullPanel=new JPanel(new BorderLayout());
    JPanel dataPanel=buildDataFormPanel();
    final FormController<MyData> formController=buildFormController(dataPanel);
    fullPanel.add(dataPanel,BorderLayout.CENTER);
    fullPanel.add(panel,BorderLayout.SOUTH);
    ButtonController okButton=c.getOkButton();
    Callback okCallback=new Callback()
    {
      public void run(CallbackData data)
      {
        doOK(formController);
      }
    };
    okButton.setCallback(okCallback);
    return fullPanel;
  }

  private static FormController<MyData> buildFormController(Container c)
  {
    FormController<MyData> controller=new MyFormController();
    SwingFormControllerBuilder builder=new SwingFormControllerBuilder(c,controller);
    builder.registerTextController("name","text","label_text");
    builder.registerBooleanController("alive","boolean","label_boolean");
    MyData data=new MyData();
    data.setText("MORCELLET");
    data.setBoolean(true);
    controller.setValue(data);
    return controller;
  }

  /**
   * Main method for this test.
   * @param args Not used.
   */
  public static void main(String[] args)
  {
    JPanel panel=buildFullPanel();
    JFrame f=new JFrame();
    f.getContentPane().add(panel);
    f.pack();
    f.setVisible(true);
  }
}
