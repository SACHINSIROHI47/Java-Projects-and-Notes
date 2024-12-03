import java.util.Collection;
import java.rmi.RemoteException;
import javax.ejb.*;
 
public interface LibraryHome extends EJBHome 
{
    public Library create(String id, String name, String address, String phoneNo) throws RemoteException, CreateException;
    public Library findByPrimaryKey(String id) throws FinderException, RemoteException;
}