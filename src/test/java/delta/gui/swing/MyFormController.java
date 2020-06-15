package delta.gui.swing;

import delta.gui.control.FieldController;
import delta.gui.control.FormController;

/**
 * Simple form controller for objects of type 'MyData'.
 * @author DAM
 */
public class MyFormController extends FormController<MyData>
{
  @Override
  public MyData getValue()
  {
    MyData data=new MyData();
    // Name
    FieldController<String> textController=getController(String.class,"name");
    String newName=textController.getValue();
    data.setText(newName);
    // Alive
    FieldController<Boolean> booleanController=getController(Boolean.class,"alive");
    Boolean newAlive=booleanController.getValue();
    data.setBoolean(newAlive.booleanValue());
    return data;
  }

  @Override
  public void setValue(MyData value)
  {
    super.setValue(value);
    // Name
    FieldController<String> textController=getController(String.class,"name");
    textController.setLabel("NOM");
    textController.setValue(value.getText());
    // Alive
    FieldController<Boolean> booleanController=getController(Boolean.class,"alive");
    booleanController.setLabel("Vivant");
    booleanController.setValue(Boolean.valueOf(value.isBoolean()));
  }
}
