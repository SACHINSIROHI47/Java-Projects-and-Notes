package shop;

import java.util.*;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface Shop extends EJBObject {
 
   public String addCart(String prod_name) throws RemoteException;
   
   public Vector getSelectedProducts() throws RemoteException;
}
