package delta.gui.control;

/**
 * Controller for a set of form control buttons.
 * @author DAM
 */
public interface FormControlButtonsController extends Disposable
{
  /**
   * Get the controller for the 'ok' button.
   * @return a button controller or <code>null</code>.
   */
  ButtonController getOkButton();

  /**
   * Get the controller for the 'cancel' button.
   * @return a button controller or <code>null</code>.
   */
  ButtonController getCancelButton();

  /**
   * Get the controller for the 'apply' button.
   * @return a button controller or <code>null</code>.
   */
  ButtonController getApplyButton();
}
