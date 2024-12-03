package cmrstudent;

import java.util.*;
import javax.ejb.*;

public abstract class LocalCourseEJB implements EntityBean
{
   protected EntityContext ctx;
   public abstract String getCourseName();
   public abstract void setCourseName(String cname);
   public abstract String getCourseId();
   public abstract void setCourseId(String cid);

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
      String cid = getUniqueId();
      setCourseId(cid);
      setCourseName(name);
      return null;
     }
   public void ejbPostCreate(String name) throws CreateException 
    {} 
   
   String getUniqueId(){
      return new Long(System.currentTimeMillis()).toString();
   }
}
