package cmrstudent; 

import javax.ejb.*;
import java.util.*;

public interface LocalStudentHome extends EJBLocalHome
{
   public LocalStudent create(String name) throws CreateException;
   public LocalStudent findByPrimaryKey(String sid) throws FinderException;
}
