package product;

import java.util.*;
import java.io.*;
import java.rmi.*;
import javax.naming.*;
import javax.ejb.*;

public abstract class ProductEJB implements EntityBean
{
   protected EntityContext ctx;
   public abstract String getProductId();
   public abstract void setProductId(String pid);
   public abstract String getProductName();
   public abstract void setProductName(String pname);
   public abstract String getProductType();
   public abstract void setProductType(String ptype);
   public abstract String getAmount();
   public abstract void setAmount(String amount);
  
 /* Callback methods */
   public void setEntityContext(EntityContext ctx) {
        this.ctx = ctx;
   }
   public void unsetEntityContext() {
       this.ctx = null;
   }
   public void ejbActivate() {}  
   
   public void ejbPassivate() {}
   
   public void ejbStore() {}
   
   public void ejbLoad() {}
   
   public void ejbRemove() throws RemoveException {}
    
   public String ejbCreate(String pname, String ptype, String amount) throws CreateException 
{
      String productid = getUniqueId();
      setProductId(productid);
      setProductName(pname);      
      setProductType(ptype);
      setAmount(amount);
      return null;
   }
   public void ejbPostCreate(String pname, String ptype, String amount) throws CreateException {
       }

   String getUniqueId(){
      return new Long(System.currentTimeMillis()).toString();
   }
}
