package delta.gui.control;

/**
 * Controller for a piece of data.
 * <p>
 * Allows edition of a data of a given type.
 * @param <T> Type of managed data.
 * @author DAM
 */
public interface DataController<T> extends Disposable
{
  /**
   * Set the value of this controller.
   * @param value Value to set.
   */
  void setValue(T value);

  /**
   * Get the current value of this controller.
   * @return the current value of this controller.
   */
  T getValue();
}
