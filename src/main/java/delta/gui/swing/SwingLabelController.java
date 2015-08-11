package delta.gui.swing;

import javax.swing.JLabel;

import delta.gui.control.LabelController;

/**
 * Controller for a label (Swing version).
 * @author DAM
 */
public class SwingLabelController implements LabelController, SwingComponentProvider<JLabel>
{
  private JLabel _label;

  /**
   * Constructor.
   */
  public SwingLabelController()
  {
    _label=new JLabel();
  }

  public String getLabel()
  {
    return _label.getText();
  }

  public void setLabel(String label)
  {
    _label.setText(label);
  }

  public JLabel getComponent()
  {
    return _label;
  }

  public void dispose()
  {
    _label=null;
  }
}
