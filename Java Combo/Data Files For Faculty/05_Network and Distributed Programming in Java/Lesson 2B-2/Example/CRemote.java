import java.rmi.Remote;
import java.rmi.RemoteException;
public interface CRemote extends Remote
{	
	/* Declare the remote method for the client */
	public void displayValue(String s) throws RemoteException;
}
