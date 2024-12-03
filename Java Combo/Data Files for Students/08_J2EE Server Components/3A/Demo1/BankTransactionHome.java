package bank;

import java.util.*;
import java.rmi.*;
import javax.ejb.*;

public interface BankTransactionHome extends EJBHome {
   /* Create methods */
public BankTransaction create(String custid,String tran, String amount) throws CreateException, RemoteException;
   /* Finder methods */
public BankTransaction findByPrimaryKey(String key) throws FinderException, RemoteException;
}
