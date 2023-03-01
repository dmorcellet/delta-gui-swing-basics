package delta.gui.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

import delta.gui.control.ButtonController;
import delta.gui.control.Callback;
import delta.gui.control.CallbackData;
import delta.gui.control.FormControlButtonsController;
import delta.gui.control.GuiFactory;

/**
 * Test for form control buttons.
 * @author DAM
 */
public class TestFormControlButtons
{
  /**
   * Main method for this test.
   * @param args Not used.
   */
  public static void main(String[] args)
  {
    GuiFactory factory=new GuiFactory();
    FormControlButtonsController c=factory.buildFormControlButtonsController();
    ButtonController okButton=c.getOkButton();
    Callback okCallback=new Callback()
    {
      public void run(CallbackData data)
      {
        System.out.println("OK: "+data);
      }
    };
    okButton.setCallback(okCallback);
    JPanel panel=((SwingFormButtonsController)c).getComponent();
    JFrame f=new JFrame();
    f.getContentPane().add(panel);
    f.pack();
    f.setVisible(true);
  }
}
