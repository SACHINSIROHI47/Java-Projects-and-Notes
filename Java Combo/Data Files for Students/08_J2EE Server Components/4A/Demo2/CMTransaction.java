import java.rmi.*;
import javax.ejb.*;
public interface CMTransaction extends EJBObject 
{
   public String getTransactionId() throws RemoteException;
   public String getCustomerId() throws RemoteException;
   public void setCustomerId(String custid) throws RemoteException;
   public String getTransactionType() throws RemoteException;
   public void setTransactionType(String trantype) throws     RemoteException;
   public void checkAmount(float amount) throws RemoteException; 
} 
