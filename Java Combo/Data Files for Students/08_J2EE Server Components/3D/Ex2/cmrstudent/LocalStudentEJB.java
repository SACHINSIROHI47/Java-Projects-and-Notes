package cmrstudent;

import java.util.*;
import javax.ejb.*;

public abstract class LocalStudentEJB implements EntityBean
{
   protected EntityContext ctx;
   public abstract String getStudentName();
   public abstract void setStudentName(String sname);
   public abstract String getStudentId();
   public abstract void setStudentId(String stdid);
   public abstract Collection getCourses();
   public abstract void setCourses(Collection crs);

   public void addCourse(LocalCourse cr)
    {
         try
          { 
              Collection courses = getCourses();
              courses.add(cr);
           }
         catch(Exception ex)
          {}
     }   

  
 /* Callback methods */
   public void setEntityContext(EntityContext ctx) 
    { this.ctx = ctx;
      }
   public void unsetEntityContext() 
    { this.ctx = null;
     }
   public void ejbActivate() 
    {}
   public void ejbPassivate() 
    {}
   public void ejbStore() 
    {}
   public void ejbLoad() 
    {}
   public void ejbRemove() throws RemoveException 
    {}
   
   public String ejbCreate(String name) throws CreateException 
    {
      String sid = getUniqueId();
      setStudentId(sid);
      setStudentName(name);
      return null;
     }
   public void ejbPostCreate(String name) throws CreateException 
    {} 
   

   String getUniqueId(){
      return new Long(System.currentTimeMillis()).toString();
   }
}
