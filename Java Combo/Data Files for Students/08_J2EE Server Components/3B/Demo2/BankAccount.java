package bank;

import java.rmi.*;
import javax.ejb.*;

public interface BankAccount extends EJBObject 
{
   public String getAccountId() throws RemoteException;
   public String getCustomerId() throws RemoteException;
   public void setCustomerId(String custid) throws RemoteException;
   public String getCustomerName() throws RemoteException;
   public void setCustomerName(String cname) throws RemoteException;
   public String getAccount() throws RemoteException;
   public void setAccount(String acc) throws RemoteException;

}
