package delta.gui.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import delta.gui.control.ButtonController;
import delta.gui.control.Callback;
import delta.gui.control.CallbackData;

/**
 * Controller for a Swing button.
 * @author DAM
 */
public class SwingButtonController implements ButtonController, SwingComponentProvider<JButton>, ActionListener
{
  private JButton _button;
  private Callback _callback;

  /**
   * Constructor.
   * @param button Button to manage.
   */
  public SwingButtonController(JButton button)
  {
    setButton(button);
  }

  public JButton getComponent()
  {
    return _button;
  }

  /**
   * Set the button to manage.
   * @param button
   */
  private void setButton(JButton button)
  {
    if (_button!=null)
    {
      dispose();
    }
    _button=button;
    _button.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  {
    if (_callback!=null)
    {
      CallbackData data=new CallbackData();
      _callback.run(data);
    }
  }

  public void setText(String text)
  {
    _button.setText(text);
  }

  public void setCallback(Callback callback)
  {
    _callback=callback;
  }

  public void dispose()
  {
    if (_button!=null)
    {
      _button.removeActionListener(this);
      _button=null;
    }
  }
}
