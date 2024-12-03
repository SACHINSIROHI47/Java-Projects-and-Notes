package project;

import java.rmi.RemoteException;
import javax.ejb.EJBObject;

public interface PurchaseOrder extends EJBObject  
{
  public String getPurchaseOrderId() throws RemoteException;

  public String getCustomerId() throws RemoteException;
  public void setCustomerId(String cid) throws RemoteException;

  public String getSupplierId() throws RemoteException;
  public void setSupplierId(String sid) throws RemoteException;

  public String getSupplierName() throws RemoteException;
  public void setSupplierName() throws RemoteException;
  
  public String getProduct() throws RemoteException;
  public void setProduct(String product) throws RemoteException;

  public String getQuantity() throws RemoteException;
  public void setQuantity(String qty) throws RemoteException;

}