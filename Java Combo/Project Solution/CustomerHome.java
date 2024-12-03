package project;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;

public interface CustomerHome extends EJBHome {

  public Customer create(String custid, String pwd, String name, String dept)
    throws CreateException, RemoteException;
  
  public Customer findByPrimaryKey(String custid)
    throws FinderException, RemoteException;
}