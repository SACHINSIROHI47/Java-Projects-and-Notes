package bank;

import java.util.*;
import java.rmi.*;
import javax.ejb.*;

public interface BankAccountHome extends EJBHome {
   /* Create methods. */
public BankAccount create(String custid,String cname,String atype) throws CreateException, RemoteException;
   /* Finder methods. */
public BankAccount findByPrimaryKey(String key) throws FinderException, RemoteException;
public Collection findByName(String name) throws FinderException, RemoteException;
}
