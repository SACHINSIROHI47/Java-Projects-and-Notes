package bank;

import java.util.*;
import java.io.*;
import java.rmi.*;
import javax.naming.*;
import javax.ejb.*;

public abstract class BankTransactionEJB implements EntityBean
{
   protected EntityContext ctx;
   public abstract String getTransactionId();
   public abstract void setTransactionId(String tranId);
   public abstract String getCustomerId();
   public abstract void setCustomerId(String custid);
   public abstract String getTransactionType();
   public abstract void setTransactionType(String tran_type);
   public abstract String getAmount();
   public abstract void setAmount(String amount);
  
 /* Callback methods */
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
   public String ejbCreate( String custid,String tran_type, String amount) throws CreateException 
{
      print("ejbCreate() called.\n");
      String transactionId = getUniqueId();
      setTransactionId(transactionId);
      setCustomerId(custid);      
      setTransactionType(tran_type);
      setAmount(amount);
      return null;
   }
   public void ejbPostCreate(String custid,String tran_type, String amount) throws CreateException {
      print("ejbPostCreate() called.\n");
   }
void print(String s) {
      System.out.println(s);
   }

   String getUniqueId(){
      return new Long(System.currentTimeMillis()).toString();
   }
}
