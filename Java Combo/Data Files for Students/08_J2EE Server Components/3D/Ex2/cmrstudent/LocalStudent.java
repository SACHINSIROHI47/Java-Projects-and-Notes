package cmrstudent;

import javax.ejb.*;
import java.util.*;

public interface LocalStudent extends EJBLocalObject
{
  public void addCourse(LocalCourse course);
  public String getStudentId();
  public String getStudentName();
  public void setStudentName(String name);
  public Collection setCourses();
}
