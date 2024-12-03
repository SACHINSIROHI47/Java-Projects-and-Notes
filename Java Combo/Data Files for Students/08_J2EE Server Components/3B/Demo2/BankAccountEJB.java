package bank;

import java.util.*;
import java.io.*;
import java.rmi.*;
import javax.naming.*;
import javax.ejb.*;

public abstract class BankAccountEJB implements EntityBean
{
   protected EntityContext ctx;
   public abstract String getAccountId();
   public abstract void setAccountId(String accId);
   public abstract String getCustomerId();
   public abstract void setCustomerId(String custid);
   public abstract String getCustomerName();
   public abstract void setCustomerName(String name);
   public abstract String getAccount();
   public abstract void setAccount(String account);
  
  /* Callback methods. */
   public void setEntityContext(EntityContext ctx) {
      print("setEntityContext called");
      this.ctx = ctx;
   }
   public void unsetEntityContext() {
      print("unsetEntityContext called.\n");
      this.ctx = null;
   }
   public void ejbActivate() {
      print("ejbActivate() called.\n");
   }
   public void ejbPassivate() {
      print("ejbPassivate() called.\n");
   }
   public void ejbStore() {
      print("ejbStore() called.\n");
   }
   public void ejbLoad() {
      print("ejbLoad() called.\n");
   }
   public void ejbRemove() throws RemoveException {
      print("ejbRemove() called.\n");
   }
   public String ejbCreate( String custid,String cname, String account) throws CreateException 
{
      print("ejbCreate() called.\n");
      String accountId = getUniqueId();
      setAccountId(accountId);
      setCustomerId(custid);      
      setCustomerName(cname);
      setAccount(account);
      return null;
   }
   public void ejbPostCreate(String custid,String cname, String account) throws CreateException {
      print("ejbPostCreate() called.\n");
   }
void print(String s) {
      System.out.println(s);
   }

   String getUniqueId(){
      return new Long(System.currentTimeMillis()).toString();
   }
}
