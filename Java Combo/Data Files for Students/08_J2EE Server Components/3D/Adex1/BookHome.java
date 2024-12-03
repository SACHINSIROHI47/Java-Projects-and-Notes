package book;

import java.util.*;
import java.rmi.*;
import javax.ejb.*;

public interface BookHome extends EJBHome 
{
   /* Create methods. */
	public Book create(String bookid, String bookName,String bookCategory) throws CreateException, RemoteException;
   /* Finder methods. */
	public Book findByPrimaryKey(String bookid) throws FinderException, RemoteException;
	public Collection findByName(String bookName) throws FinderException, RemoteException;
}
