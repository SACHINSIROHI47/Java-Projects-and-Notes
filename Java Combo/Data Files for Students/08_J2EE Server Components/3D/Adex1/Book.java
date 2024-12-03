package book;

import java.rmi.*;
import javax.ejb.*;

public interface Book extends EJBObject 
{
   public String getBookId() throws RemoteException;
   public void setBookId(String bookid) throws RemoteException;
   public String getBookName() throws RemoteException;
   public void setBookName(String bookName) throws RemoteException;
   public String getBookCategory() throws RemoteException;
   public void setBookCategory(String bkCtg) throws RemoteException;
}
