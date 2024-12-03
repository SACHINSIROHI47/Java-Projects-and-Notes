package beans;
import java.rmi.RemoteException;
import javax.ejb.EJBObject;
public interface Stock extends EJBObject  {
public String getStockId() throws RemoteException;
public String getStockName() throws RemoteException;
public void setStockName(String sname) throws RemoteException;
}
