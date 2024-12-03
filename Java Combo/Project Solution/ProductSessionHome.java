package project;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface ProductSessionHome extends EJBHome {

  public ProductSession create()
    throws CreateException, RemoteException;

}