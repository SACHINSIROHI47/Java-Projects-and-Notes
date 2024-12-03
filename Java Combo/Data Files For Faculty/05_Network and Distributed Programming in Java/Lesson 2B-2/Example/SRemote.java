import java.rmi.Remote;
import java.rmi.RemoteException;
public interface SRemote extends Remote
{
	/* Declare the server remote method */	
	public void registerClient(CRemote c) throws RemoteException;
  	/* Declare the method that returns the CRemote type */
	public CRemote getCallback() throws RemoteException; 
}
