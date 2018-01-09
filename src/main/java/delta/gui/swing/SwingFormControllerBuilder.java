package delta.gui.swing;

import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.apache.log4j.Logger;

import delta.gui.control.DataController;
import delta.gui.control.FieldController;
import delta.gui.control.FormController;
import delta.gui.swing.utils.SwingUtils;

/**
 * @author DAM
 */
public class SwingFormControllerBuilder implements SwingComponentProvider<Container>
{
  private static final Logger LOGGER=Logger.getLogger("gui.swing.basics");
  private Container _c;
  private FormController<?> _formController;

  /**
   * Constructor.
   * @param c Swing container to use.
   * @param formController Associated form controller.
   */
  public SwingFormControllerBuilder(Container c, FormController<?> formController)
  {
    _c=c;
    _formController=formController;
  }

  public Container getComponent()
  {
    return _c;
  }

  /**
   * Register a text controller.
   * @param id Controller id.
   * @param componentName Name of text component.
   * @param labelName Name of label component.
   */
  public void registerTextController(String id, String componentName, String labelName)
  {
    JTextField textField=SwingUtils.findComponentByName(_c, componentName, JTextField.class);
    if (textField!=null)
    {
      SwingTextDataController textController=new SwingTextDataController(textField);
      registerController(id,textController,labelName);
    }
    else
    {
      LOGGER.warn("Text field not found: "+componentName);
    }
  }

  /**
   * Register a boolean controller.
   * @param id Controller id.
   * @param componentName Name of text component.
   * @param labelName Name of label component.
   */
  public void registerBooleanController(String id, String componentName, String labelName)
  {
    JCheckBox checkbox=SwingUtils.findComponentByName(_c, componentName, JCheckBox.class);
    if (checkbox!=null)
    {
      SwingBooleanDataController textController=new SwingBooleanDataController(checkbox);
      registerController(id,textController,labelName);
    }
  }

  private <TYPE> void registerController(String id, DataController<TYPE> dataController, String labelName)
  {
    JLabel label=null;
    if (labelName!=null)
    {
      label=SwingUtils.findComponentByName(_c, labelName, JLabel.class);
    }
    SwingLabelController labelController=null;
    if (label!=null)
    {
      labelController=new SwingLabelController(label);
    }
    FieldController<TYPE> fieldController=new FieldController<TYPE>(labelController,dataController);
    _formController.registerController(id, fieldController);
  }
}
