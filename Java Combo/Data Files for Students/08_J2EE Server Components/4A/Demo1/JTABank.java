import java.util.*;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface JTABank extends EJBObject {
 
   public void deposit(float amnt) throws RemoteException;
   
}
