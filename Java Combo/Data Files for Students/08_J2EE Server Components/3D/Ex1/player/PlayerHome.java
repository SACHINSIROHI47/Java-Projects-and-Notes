package player;
import java.util.*;
import java.rmi.*;
import javax.ejb.*;
public interface PlayerHome extends EJBHome {
   /* Create methods */
public Player create(String pname,String pposition, String pclub) throws CreateException, RemoteException;
   /* Finder methods */
public Player findByPrimaryKey(String key) throws FinderException, RemoteException;

}
