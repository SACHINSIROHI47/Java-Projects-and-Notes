package cmrstudent;

import javax.ejb.*;
import java.util.*;

public interface LocalCourse extends EJBLocalObject
{ 
  public String getCourseId();
  public String getCourseName();
  public void setCourseName(String name);

}
 
