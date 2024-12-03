import java.rmi.*;
public interface PCRemote extends Remote
{
	/* Declare the orderPC() method */
	String orderPC(String name, String address, String city, String phone, String email, String model, String processor) throws RemoteException;
}

