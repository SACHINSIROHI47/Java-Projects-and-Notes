package movie;

import java.io.Serializable;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface MovieHome extends EJBHome {
   Movie create() throws RemoteException, CreateException; 
}
