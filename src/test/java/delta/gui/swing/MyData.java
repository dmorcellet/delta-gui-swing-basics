package delta.gui.swing;

/**
 * @author dm
 */
public class MyData
{
  private String _text;
  private boolean _boolean;

  public MyData()
  {
    
  }

  /**
   * @return the text
   */
  public String getText()
  {
    return _text;
  }

  /**
   * @param text the text to set
   */
  public void setText(String text)
  {
    _text=text;
  }

  /**
   * @return the boolean
   */
  public boolean isBoolean()
  {
    return _boolean;
  }

  /**
   * @param b the boolean to set
   */
  public void setBoolean(boolean b)
  {
    _boolean=b;
  }

  @Override
  public String toString()
  {
    return "Text: "+_text+", boolean:"+_boolean;
  }
}
