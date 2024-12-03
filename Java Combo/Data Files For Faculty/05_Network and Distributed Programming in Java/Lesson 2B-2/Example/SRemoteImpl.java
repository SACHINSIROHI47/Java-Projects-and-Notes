import java.rmi.RemoteException;
import java.io.Serializable;
public class SRemoteImpl implements SRemote, Serializable
{
	CRemote caller;
  	CRemote called;
  	/* Define the constructor */
	public SRemoteImpl() throws RemoteException
  	{
    		this.called = new CRemoteImpl();
  	}
  	/* Define the registerClient() method */
	public void registerClient(CRemote c) throws RemoteException
  	{
		System.out.println("A client registered "+ c.getClass().getName());
  	}
  	/* Define the getCallback() method */
	public CRemote getCallback() throws RemoteException
  	{
	/* Return the name and class of the server */ 
	System.out.println("A client got" + this.called.getClass().getName());
    	return this.called;
  	}
}
