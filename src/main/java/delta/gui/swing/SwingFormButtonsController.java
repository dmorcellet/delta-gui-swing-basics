package delta.gui.swing;

import javax.swing.JButton;
import javax.swing.JPanel;

import delta.gui.build.swing.SwingFormButtonsPanelBuilder;
import delta.gui.control.AbstractFormControlButtonsController;
import delta.gui.swing.utils.SwingUtils;

/**
 * Controller for form buttons (Swing version).
 * @author DAM
 */
public class SwingFormButtonsController extends AbstractFormControlButtonsController implements SwingComponentProvider<JPanel>
{
  private JPanel _panel;

  /**
   * Constructor.
   */
  public SwingFormButtonsController()
  {
    JPanel panel=new SwingFormButtonsPanelBuilder().build();
    setPanel(panel);
  }

  /**
   * Constructor.
   * @param panel Panel to wrap.
   */
  public SwingFormButtonsController(JPanel panel)
  {
    setPanel(panel);
  }

  private void setPanel(JPanel panel)
  {
    JButton okButton=SwingUtils.findComponentByName(panel,AbstractFormControlButtonsController.OK_ID, JButton.class);
    if (okButton!=null)
    {
        SwingButtonController okButtonController=new SwingButtonController(okButton);
        setOkButton(okButtonController);
    }
    JButton cancelButton=SwingUtils.findComponentByName(panel,AbstractFormControlButtonsController.CANCEL_ID, JButton.class);
    if (cancelButton!=null)
    {
        SwingButtonController cancelButtonController=new SwingButtonController(cancelButton);
        setCancelButton(cancelButtonController);
    }
    JButton applyButton=SwingUtils.findComponentByName(panel,AbstractFormControlButtonsController.APPLY_ID, JButton.class);
    if (applyButton!=null)
    {
        SwingButtonController applyButtonController=new SwingButtonController(applyButton);
        setApplyButton(applyButtonController);
    }
    init();
    _panel=panel;
  }

  public JPanel getComponent()
  {
    return _panel;
  }

  @Override
  public void dispose()
  {
    super.dispose();
    _panel=null;
  }
}
