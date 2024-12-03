package project;

import java.rmi.RemoteException;
import javax.ejb.EJBObject;

public interface Customer extends EJBObject  
{
  public String getCustomerId() throws RemoteException;

  public String getPassword() throws RemoteException;
  public void setPassword(String pwd) throws RemoteException;

  public String getCustomerName() throws RemoteException;
  public void setCustomerName(String name) throws RemoteException;

  public String getDepartment() throws RemoteException;
  public void setDepartment(String dept) throws RemoteException;

}