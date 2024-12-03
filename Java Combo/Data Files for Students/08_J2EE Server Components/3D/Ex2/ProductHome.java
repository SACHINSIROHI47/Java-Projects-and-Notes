package product;

import java.util.*;
import java.rmi.*;
import javax.ejb.*;

public interface ProductHome extends EJBHome {
   /* Create methods */
public Product create(String pname,String ptype, String amount) throws CreateException, RemoteException;
   /* Finder methods */
public Product findByPrimaryKey(String key) throws FinderException, RemoteException;

}
