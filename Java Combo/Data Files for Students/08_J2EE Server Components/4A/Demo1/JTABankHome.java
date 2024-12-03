import java.io.Serializable;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface JTABankHome extends EJBHome {
   JTABank create(String cid) throws 
            RemoteException, CreateException; 
}
