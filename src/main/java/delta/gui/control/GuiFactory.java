package delta.gui.control;

import delta.gui.swing.SwingFactory;

/**
 * Factory for GUI controllers.
 * @author DAM
 */
public class GuiFactory
{
  private SwingFactory _factory;

  /**
   * Constructor.
   */
  public GuiFactory()
  {
    _factory=new SwingFactory();
  }

  /**
   * Build a field controller.
   * @param dataController Data controller to use.
   * @return A new field controller.
   */
  public <T> FieldController<T> buildFieldController(DataController<T> dataController)
  {
    LabelController labelController=_factory.buildLabelController();
    return new FieldController<T>(labelController,dataController);
  }

  /**
   * Build a form control buttons controller.
   * @return A new controller.
   */
  public FormControlButtonsController buildFormControlButtonsController()
  {
    return _factory.buildFormControlButtonsController();
  }
}
