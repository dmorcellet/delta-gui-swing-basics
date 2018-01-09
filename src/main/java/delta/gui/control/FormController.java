package delta.gui.control;

import java.util.List;

import delta.common.utils.collections.ListOrderedMap;

/**
 * Base class for a form controller.
 * @param <T> Type of managed data.
 * @author DAM
 */
public class FormController<T>
{
  private ListOrderedMap<FieldController<?>> _controllers;

  private T _value;

  /**
   * Constructor.
   */
  public FormController()
  {
    _controllers=new ListOrderedMap<FieldController<?>>();
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

  /**
   * Register a controller.
   * @param id Controller id.
   * @param fieldController Field controller.
   */
  public void registerController(String id, FieldController<?> fieldController)
  {
    _controllers.put(id,fieldController);
  }

  /**
   * Get a field controller.
   * @param controllerClass Type of field controller.
   * @param id Controller id.
   * @return A field controller or <code>null</code> if not found.
   */
  @SuppressWarnings("unchecked")
  public <FT> FieldController<FT> getController(Class<FT> controllerClass, String id)
  {
    return (FieldController<FT>)_controllers.get(id);
  }

  /**
   * Get all registered controllers.
   * @return A list of field controllers.
   */
  public List<FieldController<?>> getAllControllers()
  {
    return _controllers.values();
  }
}
