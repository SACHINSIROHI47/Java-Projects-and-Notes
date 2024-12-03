package cmrbank;

import java.util.*;
import javax.ejb.*;

public abstract class CMRCustomertestEJB implements EntityBean
{
   protected EntityContext ctx;
   public abstract String getCustomerName();
   public abstract void setCustomerName(String cname);
   public abstract String getCustomerId();
   public abstract void setCustomerId(String custid);
   public abstract Collection getCMRAccounts();
   public abstract void setCMRAccounts(Collection accs);

   public void addAccount(LocalAccount acc)
    {
         try
          { 
              Collection acnts = getCMRAccounts();
              acnts.add(acc);
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
      String custId = getUniqueId();
      setCustomerId(custId);
      setCustomerName(name);
      return null;
     }
   public void ejbPostCreate(String name) throws CreateException 
    {} 
   

   String getUniqueId(){
      return new Long(System.currentTimeMillis()).toString();
   }
}
