package horoscope;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HoroscopeInterface extends Remote
{
	public String getSunSignTrait(int sunsign) throws RemoteException;
}
