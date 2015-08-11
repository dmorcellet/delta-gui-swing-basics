package delta.gui.control;

/**
 * Controller for textual data.
 * @author DAM
 */
public interface TextDataController extends DataController<String>
{
  void setValue(String value);

  String getValue();
}
