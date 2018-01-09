package delta.gui.swing;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import delta.gui.control.TextDataController;

/**
 * Controller for textual data (Swing version).
 * @author DAM
 */
public class SwingTextDataController implements TextDataController, SwingComponentProvider<JTextComponent>
{
  private JTextField _textField;

  /**
   * Constructor.
   */
  public SwingTextDataController()
  {
    _textField=new JTextField();
  }

  /**
   * Constructor.
   * @param textField Associated text field.
   */
  public SwingTextDataController(JTextField textField)
  {
    _textField=textField;
  }

  public void setValue(String text)
  {
    _textField.setText(text);
  }

  public String getValue()
  {
    return _textField.getText();
  }

  public JTextComponent getComponent()
  {
    return _textField;
  }

  public void dispose()
  {
    _textField=null;
  }
}
