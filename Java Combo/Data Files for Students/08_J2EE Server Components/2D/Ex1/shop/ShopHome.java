package shop;

import java.io.Serializable;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface ShopHome extends EJBHome {
   Shop create() throws RemoteException, CreateException;
}
