import java.io.*;
import java.rmi.*;

public class RMIFileServer 
{
	public static void main(String args[]) 
	{
		/* Set the RMI security manager */         		
		System.setSecurityManager(new RMISecurityManager());
      		try 
		{
			/* Create the remote object */         		
			FileRemote f = new FileRemoteImpl("FServer");
			/* Bind the remote object to the RMI registry */
         		Naming.rebind("rmi://192.168.0.52/FServer", f);
			System.out.println("Object is registered.");
			System.out.println("Now server is waiting for client request...");
      		} 
		catch(Exception e) 
		{
         		System.out.println("FileServer: " + e);
         	}
   	}
}
