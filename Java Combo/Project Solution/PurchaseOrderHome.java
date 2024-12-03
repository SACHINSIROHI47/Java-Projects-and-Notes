package project;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;
import java.util.*;

public interface PurchaseOrderHome extends EJBHome {

  public PurchaseOrder create(String custid, String supid, String supname, String product, String qty)
    throws CreateException, RemoteException;
  
  public PurchaseOrder findByPrimaryKey(String poid)
    throws FinderException, RemoteException;

}
