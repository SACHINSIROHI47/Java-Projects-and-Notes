import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface Library extends EJBObject 
{    	
    public String getName() throws RemoteException;
    public String getAddress() throws RemoteException;
    public String getPhoneNo() throws RemoteException;    
}