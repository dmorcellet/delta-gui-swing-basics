package delta.gui.swing;

import javax.swing.JCheckBox;

import delta.gui.control.BooleanDataController;

/**
 * Controller for boolean data (Swing version).
 * @author DAM
 */
public class SwingBooleanDataController implements BooleanDataController
{
  private JCheckBox _checkbox;

  /**
   * Constructor.
   */
  public SwingBooleanDataController()
  {
    _checkbox=new JCheckBox();
  }

  /**
   * Constructor.
   * @param checkbox Associated checkbox.
   */
  public SwingBooleanDataController(JCheckBox checkbox)
  {
    _checkbox=checkbox;
  }

  public void setValue(Boolean value)
  {
    _checkbox.setSelected(value.booleanValue());
  }

  public Boolean getValue()
  {
    boolean selected=_checkbox.isSelected();
    return Boolean.valueOf(selected);
  }

  public void dispose()
  {
    _checkbox=null;
  }
}
