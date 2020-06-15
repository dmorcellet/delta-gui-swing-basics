package delta.gui.swing;

/**
 * Sample test data.
 * @author DAM
 */
public class MyData
{
  private String _text;
  private boolean _boolean;

  /**
   * Constructor.
   */
  public MyData()
  {
    // Nothing
  }

  /**
   * Get the value of the 'text' attribue.
   * @return A string value.
   */
  public String getText()
  {
    return _text;
  }

  /**
   * Set the value of the 'text' attribute.
   * @param text the value to set.
   */
  public void setText(String text)
  {
    _text=text;
  }

  /**
   * Get the value of the 'boolean' attribute.
   * @return A boolean value.
   */
  public boolean isBoolean()
  {
    return _boolean;
  }

  /**
   * Set the value of the 'boolean' attribute.
   * @param booleanValue the value to set.
   */
  public void setBoolean(boolean booleanValue)
  {
    _boolean=booleanValue;
  }

  @Override
  public String toString()
  {
    return "Text: "+_text+", boolean:"+_boolean;
  }
}
