import java.rmi.Remote;
import java.io.Serializable;
public class CRemoteImpl implements CRemote, Serializable
{
	/* Define the remote method of the client interface */
	public void displayValue(String s)
  	{
    		System.out.println(s);
  	}
}
