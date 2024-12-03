import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;

public class CallbackClient
{
  	public static void main(String[] args)
  	{
    	SRemote callbackS=null;
    	CRemote callbackC=null;
    	try
    	{
	      	/* Find the remote object */	
		callbackS = (SRemote)Naming.lookup("rmi://192.168.0.52/callback");
		System.out.println("Remote to access SRemote is "+callbackS.getClass().getName());
      		/* Retrieve the value of the remote object */
		callbackC = callbackS.getCallback();
		System.out.println("SRemote will call "+callbackC.getClass().getName());
      		/* Export the client remote object */
		UnicastRemoteObject.exportObject(callbackC);
      		callbackS.registerClient(callbackC); 
    	} 
    	catch(MalformedURLException me)
    	{
      		System.out.println("Error: " + me);
     	} 
    	catch(NotBoundException nbe)
    	{
      		System.out.println("Error: " + nbe);
    	} 
    	catch(RemoteException re)
    	{
    		System.out.println("Error: " + re);
    	}
  	}
}
