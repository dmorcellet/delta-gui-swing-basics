package delta.gui.control;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for a form controller.
 * @param <T> Type of managed data.
 * @author DAM
 */
public class FormController<T>
{
  private List<FieldController<?>> _controllers;

  private T _value;

  /**
   * Constructor.
   */
  public FormController()
  {
    _controllers=new ArrayList<FieldController<?>>();
  }

  /**
   * Get the current value of the managed data.
   * @return a value.
   */
  public T getValue()
  {
    return _value;
  }

  /**
   * Set the value of the data to manage.
   * @param value Value to set.
   */
  public void setValue(T value)
  {
    _value=value;
  }

  protected void addController(FieldController<?> fieldController)
  {
    _controllers.add(fieldController);
  }
}
