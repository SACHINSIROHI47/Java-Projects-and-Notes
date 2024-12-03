package temp;

import java.rmi.RemoteException;
import javax.ejb.EJBHome;
import javax.ejb.CreateException;


public interface TempconverterHome extends EJBHome
{
  Tempconverter create() throws RemoteException, CreateException; 
}  
