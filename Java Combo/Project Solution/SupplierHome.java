package project;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;
import java.util.*;

public interface SupplierHome extends EJBHome {

  public Supplier create(String supid, String name, String city, String product)
    throws CreateException, RemoteException;
  
  public Supplier findByPrimaryKey(String supid)
    throws FinderException, RemoteException;

      public Collection findByProduct(String product) throws FinderException, RemoteException;
}
