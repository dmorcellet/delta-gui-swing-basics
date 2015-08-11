package delta.gui.control;

/**
 * Controller for a label.
 * @author DAM
 */
public interface LabelController extends Disposable
{
  /**
   * Get the value of the managed label.
   * @return A string value.
   */
  String getLabel();

  /**
   * Set the value of the managed label.
   * @param label Label to set.
   */
  void setLabel(String label);
}
