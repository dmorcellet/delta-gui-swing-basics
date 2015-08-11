package delta.gui.control;

/**
 * Button controller.
 * @author DAM
 */
public interface ButtonController extends Disposable
{
  /**
   * Set button's text.
   * @param text Text to set.
   */
  void setText(String text);
  /**
   * Set button's callback.
   * @param callback Callback to set.
   */
  void setCallback(Callback callback);
}
