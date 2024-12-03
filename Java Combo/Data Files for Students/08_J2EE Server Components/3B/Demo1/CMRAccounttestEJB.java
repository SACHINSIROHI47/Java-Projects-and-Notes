package cmrbank;

import java.util.*;
import javax.ejb.*;

public abstract class CMRAccounttestEJB implements EntityBean
{
   protected EntityContext ctx;
   public abstract String getAccountType();
   public abstract void setAccountType(String accname);
   public abstract String getAccountId();
   public abstract void setAccountId(String accid);

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
      String accId = getUniqueId();
      setAccountId(accId);
      setAccountType(name);
      return null;
     }
   public void ejbPostCreate(String name) throws CreateException 
    {} 
   
void print(String s) {
      System.out.println(s);
   }

   String getUniqueId(){
      return new Long(System.currentTimeMillis()).toString();
   }
}
