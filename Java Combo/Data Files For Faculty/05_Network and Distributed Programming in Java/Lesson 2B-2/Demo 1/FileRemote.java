import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FileRemote extends Remote 
{
	/* Declare the remote method */
	public byte[] loadFile(String filename) throws RemoteException;
}
