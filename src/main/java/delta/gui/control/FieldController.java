package delta.gui.control;

/**
 * Controller for a field.
 * Such a controller manages:
 * <ul>
 * <li>A label controller,
 * <li>A data controller.
 * </ul>.
 * @param <T> Type of managed data.
 * @author DAM
 */
public class FieldController<T>
{
  private LabelController _labelController;
  private DataController<T> _dataController;

  /**
   * Constructor.
   */
  public FieldController()
  {
    _labelController=null;
    _dataController=null;
  }

  /**
   * Constructor.
   * @param labelController Controller for a label.
   * @param dataController Controller for a piece of data.
   */
  public FieldController(LabelController labelController, DataController<T> dataController)
  {
    _labelController=labelController;
    _dataController=dataController;
  }

  /**
   * Set the value of the label.
   * @param label Label to set.
   */
  public void setLabel(String label)
  {
    _labelController.setLabel(label);
  }

  /**
   * Set the value of the managed data.
   * @param value Value to set.
   */
  public void setValue(T value)
  {
    _dataController.setValue(value);
  }

  /**
   * Get the current value of the managed data.
   * @return a data value (may be <code>null</code>).
   */
  public T getValue()
  {
    return _dataController.getValue();
  }
}
