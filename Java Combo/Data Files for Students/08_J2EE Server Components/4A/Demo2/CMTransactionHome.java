import java.util.*;
import java.rmi.*;
import javax.ejb.*;
public interface CMTransactionHome extends EJBHome {
/* Create methods */
public CMTransaction create(String custid,String tran) throws CreateException, RemoteException;
   /* Finder methods */
public CMTransaction findByPrimaryKey(String key) throws FinderException, RemoteException;
}
