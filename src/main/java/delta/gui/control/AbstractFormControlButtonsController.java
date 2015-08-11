package delta.gui.control;

/**
 * Base implementation for a form control buttons controller.
 * @author DAM
 */
public abstract class AbstractFormControlButtonsController implements FormControlButtonsController
{
  /**
   * Identifier of the 'ok' button.
   */
  public static final String OK_ID="ok";
  /**
   * Identifier of the 'cancel' button.
   */
  public static final String CANCEL_ID="cancel";
  /**
   * Identifier of the 'apply' button.
   */
  public static final String APPLY_ID="apply";
  private ButtonController _okController;
  private ButtonController _cancelController;
  private ButtonController _applyController;

  /**
   * Constructor.
   */
  public AbstractFormControlButtonsController()
  {
    // Nothing to do!
  }

  public ButtonController getOkButton()
  {
    return _okController;
  }

  protected void setOkButton(ButtonController okController)
  {
    _okController=okController;
  }

  public ButtonController getCancelButton()
  {
    return _cancelController;
  }

  protected void setCancelButton(ButtonController cancelController)
  {
    _cancelController=cancelController;
  }

  public ButtonController getApplyButton()
  {
    return _applyController;
  }

  protected void setApplyButton(ButtonController applyController)
  {
    _applyController=applyController;
  }

  protected void init()
  {
    if (_okController!=null)
    {
      _okController.setText("OK");
    }
    if (_cancelController!=null)
    {
      _cancelController.setText("Cancel");
    }
    if (_applyController!=null)
    {
      _applyController.setText("Apply");
    }
}

  public void dispose()
  {
    if (_okController!=null)
    {
      _okController.dispose();
      _okController=null;
    }
    if (_cancelController!=null)
    {
      _cancelController.dispose();
      _cancelController=null;
    }
    if (_applyController!=null)
    {
      _applyController.dispose();
      _applyController=null;
    }
  }
}
