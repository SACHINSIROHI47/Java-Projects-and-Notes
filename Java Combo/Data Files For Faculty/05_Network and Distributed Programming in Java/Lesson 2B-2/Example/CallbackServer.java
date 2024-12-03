import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
public class CallbackServer
{
  	public static void main(String[] args) throws Exception
  	{
    	/* Create the server remote object */
	SRemote b = new SRemoteImpl();
	/* Export the remote object */
    	UnicastRemoteObject.exportObject(b);
    	System.out.println("Binding a remote object to the registry.");
	/* Bind the remote object */
    	Naming.rebind("callback",b);
    	System.out.println("Binding has been completed.");
    	System.out.println("Now server is waiting for client request...\n");
  	}
}
