package product;

import java.rmi.*;
import javax.ejb.*;

public interface Product extends EJBObject 
{
   public String getProductId() throws RemoteException;

   public String getProductName() throws RemoteException;

   public void setProductName(String pname) throws RemoteException;

   public String getProductType() throws RemoteException;

   public void setProductType(String ptype) throws RemoteException;

   public String getAmount() throws RemoteException;

   public void setAmount(String amount) throws RemoteException;

}
