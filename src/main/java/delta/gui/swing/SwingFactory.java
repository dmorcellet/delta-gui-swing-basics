package delta.gui.swing;

import delta.gui.control.FormControlButtonsController;
import delta.gui.control.LabelController;
import delta.gui.control.TextDataController;

/**
 * Factory for Swing controllers.
 * @author DAM
 */
public class SwingFactory
{
  /**
   * Build a label controller.
   * @return a new label controller.
   */
  public LabelController buildLabelController()
  {
    return new SwingLabelController();
  }

  /**
   * Build a textual data controller.
   * @return a new textual data controller.
   */
  public TextDataController buildTextDataController()
  {
    return new SwingTextDataController();
  }

  /**
   * Build a form control buttons controller.
   * @return a new controller.
   */
  public FormControlButtonsController buildFormControlButtonsController()
  {
    return new SwingFormButtonsController();
  }
}
