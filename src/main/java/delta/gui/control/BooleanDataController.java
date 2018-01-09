package delta.gui.control;

/**
 * Controller for boolean data.
 * @author DAM
 */
public interface BooleanDataController extends DataController<Boolean>
{
  void setValue(Boolean value);

  Boolean getValue();
}
