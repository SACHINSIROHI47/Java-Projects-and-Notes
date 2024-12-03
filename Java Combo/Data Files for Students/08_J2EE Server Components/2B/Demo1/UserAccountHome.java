import java.util.Collection;
import java.rmi.RemoteException;
import javax.ejb.*;
public interface UserAccountHome extends EJBHome 
{
    public UserAccount create(String id, String name, String address, String phoneNo) throws RemoteException, CreateException;
    public UserAccount findByPrimaryKey(String id) throws FinderException, RemoteException;
    public Collection findByName(String name) throws FinderException, RemoteException;
}
