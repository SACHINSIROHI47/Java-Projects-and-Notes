import java.awt.*;
import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.lang.*;
import java.util.*;

public class PCServer extends UnicastRemoteObject implements PCRemote
{
	/* Define the constructor */
	PCServer() throws RemoteException
	{
		super();
	}
	/* Define the remote method */
	public String orderPC(String name, String address, String city, String phone, String email, String model, String processor) throws RemoteException
	{
		System.out.println("Server process online PC order..");
		/* Calculate the bill */ 
		int count1 = 0;
		int count2 = 0;
		int total = 0;
		if(processor.equals("Celeron"))
			count1 = 1;
		else if (processor.equals("Pentium-I"))
			count1 = 2;
		else if (processor.equals("Pentium-II"))
			count1 = 3;
		else if (processor.equals("Pentium-III"))
			count1 = 4;
		else if (processor.equals("Pentium-IV"))
			count1 = 5;
		if(model.equals("SAMSUNG"))
			count2 = 1;
		else if (model.equals("WIPRO"))
			count2 = 2;
		else if (model.equals("HCL"))
			count2 = 3;
		else if (model.equals("HP"))
			count2 = 4;
		else if (model.equals("COMPAQ"))
			count2 = 5;
		else if (model.equals("DELL"))
			count2 = 6;
		total = (count1 * 50) + (count2 * 100);
		/* Display the result on the screen */
		String orderstring = new String();
		orderstring += " A " + model + " computer of " + processor + " delivered to " + name + " at " + address + city;
		System.out.println(orderstring);
		/* Send the result back to the client */
		String totalstring = new String();
		System.out.println("Server sent the result back to the client.");
		totalstring = "$" + total + ".00";
		return totalstring;
	}
	public static void main(String args[])
	{
		try
		{
		/* Set the security manager */
		System.setSecurityManager(new RMISecurityManager());
		/* Create a local instance of the PCServer */
		PCServer server = new PCServer();
		/* Put the local instance into the Naming Server */
		System.out.println("Rebinding the local server...");
		Naming.rebind("PCServer", server);
		System.out.println("PC Server is ready...");
		}
		catch(Exception e)
		{
			System.out.println("Error!" + e.toString());
		}
	}
}
