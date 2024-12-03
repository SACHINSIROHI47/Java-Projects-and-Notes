package cmrstudent;

import javax.ejb.*;
import java.util.*;

public interface LocalCourseHome extends EJBLocalHome
{
   public LocalCourse create(String name) throws CreateException;
   public LocalCourse findByPrimaryKey(String cid) throws FinderException;
}
