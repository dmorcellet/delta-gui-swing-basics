package delta.gui.build.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import delta.gui.control.AbstractFormControlButtonsController;

/**
 * Builder for a Swing form control buttons panel.
 * @author DAM
 */
public class SwingFormButtonsPanelBuilder
{
  /**
   * Build a form buttons panel.
   * @return a panel with form control buttons.
   */
  public JPanel build()
  {
    // OK
    JButton okButton=new JButton();
    okButton.setName(AbstractFormControlButtonsController.OK_ID);
    JButton cancelButton=new JButton();
    cancelButton.setName(AbstractFormControlButtonsController.CANCEL_ID);
    JButton applyButton=new JButton();
    applyButton.setName(AbstractFormControlButtonsController.APPLY_ID);

    // Assembly
    JPanel panel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
    panel.add(okButton);
    panel.add(cancelButton);
    panel.add(applyButton);
    return panel;
  }
}
