package project;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBObject;
import javax.ejb.FinderException;
import java.util.*;
public interface ProductSession extends EJBObject {

  public String getCustomer(String custid)
   throws FinderException, RemoteException;

   public String [] getSuppliers(String prod)
   throws FinderException, RemoteException;

  public void addCustomer(String custid, String pwd, String name, String dept)
    throws CreateException, RemoteException;

  public void addPurchaseOrder(String custid, String sid, String sname, String product, String qty)
    throws CreateException, RemoteException;  
}