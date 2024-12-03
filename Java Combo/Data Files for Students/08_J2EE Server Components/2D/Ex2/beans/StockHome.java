package beans;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;
public interface StockHome extends EJBHome {
    public Stock create(String stockid, String name)
    throws CreateException, RemoteException;
      public Stock findByPrimaryKey(String stockid)
    throws FinderException, RemoteException;
}
