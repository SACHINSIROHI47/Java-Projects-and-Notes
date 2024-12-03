package temp_converter;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TempConverterInterface extends Remote
{
	public double getFahrenheit(double celcius) throws RemoteException;
}
