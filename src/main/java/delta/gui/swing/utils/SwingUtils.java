package delta.gui.swing.utils;

import java.awt.Component;
import java.awt.Container;

/**
 * Swing-related utilities.
 * @author DAM
 */
public class SwingUtils
{
  /**
   * Find a component using name and type.
   * @param c Container component.
   * @param name Name of the component to get.
   * @param clazz Class of component to get.
   * @return A component or <code>null</code> if not found.
   */
  public static <T> T findComponentByName(Container c, String name, Class<T> clazz)
  {
    T ret=isComponentEligible(c,name,clazz);
    if (ret==null)
    {
      int nbChildren=c.getComponentCount();
      for(int i=0;i<nbChildren;i++)
      {
        Component childComponent=c.getComponent(i);
        ret=isComponentEligible(childComponent,name,clazz);
        if (ret!=null)
        {
          return ret;
        }
        if (childComponent instanceof Container)
        {
          ret=findComponentByName((Container)childComponent,name,clazz);
          if (ret!=null)
          {
            return ret;
          }
        }
      }
    }
    return null;
  }

  private static <T> T isComponentEligible(Component c, String name, Class<T> clazz)
  {
    String componentName=c.getName();
    if (name.equals(componentName)) {
      if (clazz.isAssignableFrom(c.getClass()))
      {
        return clazz.cast(c);
      }
    }
    return null;
  }
}
