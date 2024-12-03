package project;

import java.rmi.RemoteException;
import javax.ejb.EJBObject;

public interface Supplier extends EJBObject  
{
  public String getSupplierId() throws RemoteException;

  public String getSupplierName() throws RemoteException;
  public void setSupplierName(String sname) throws RemoteException;

  public String getCity() throws RemoteException;
  public void setCity(String city) throws RemoteException;

  public String getProduct() throws RemoteException;
  public void setProduct(String dept) throws RemoteException;

}