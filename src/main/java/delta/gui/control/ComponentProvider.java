package delta.gui.control;

/**
 * GUI component provider.
 * @param <T> Type of the managed component.
 * @author DAM
 */
public interface ComponentProvider<T>
{
  /**
   * Get the managed GUI component.
   * @return the managed GUI component.
   */
  T getComponent();
}
