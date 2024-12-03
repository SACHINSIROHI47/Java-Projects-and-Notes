import java.util.*;
import java.io.*;
import java.rmi.*;
import javax.naming.*;
import javax.ejb.*;

public abstract class CMTransactionEJB implements EntityBean
{
   protected EntityContext ctx;
   protected float min_amnt = 5000;
   public abstract String getTransactionId();
   public abstract void setTransactionId(String tranId);
   public abstract String getCustomerId();
   public abstract void setCustomerId(String custid);
   public abstract String getTransactionType();
   public abstract void setTransactionType(String tran_type);
     
 /*Callback methods*/
   public void setEntityContext(EntityContext ctx)
  {
     print("setEntityContext called");
     this.ctx = ctx;
   }
   public void unsetEntityContext()
  {
      print("unsetEntityContext called.\n");
      this.ctx = null;
   }
   public void ejbActivate()
  {
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
   public String ejbCreate( String custid,String tran_type) throws CreateException 
{
      print("ejbCreate() called.\n");
      String transactionId = getUniqueId();
      setTransactionId(transactionId);
      setCustomerId(custid);      
      setTransactionType(tran_type);
      return null;
   }
   public void ejbPostCreate(String custid,String tran_type) throws CreateException {
      print("ejbPostCreate() called.\n");
   }
void print(String s) {
      System.out.println(s);
   }

   String getUniqueId(){
      return new Long(System.currentTimeMillis()).toString();
   }
   public void checkAmount(float amnt) throws RemoteException, InsufficientBalanceException
   {
      min_amnt -= amnt;
      if(min_amnt < 1000)
       { ctx.setRollbackOnly();
        throw new InsufficientBalanceException();       
       }
   }    
 }
