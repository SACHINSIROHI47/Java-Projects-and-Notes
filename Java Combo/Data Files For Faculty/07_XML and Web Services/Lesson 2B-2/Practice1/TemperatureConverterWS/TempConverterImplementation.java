package temp_converter;

import java.rmi.RemoteException;

public class TempConverterImplementation implements TempConverterInterface
{
	public double getFahrenheit(double celcius) throws RemoteException
	{
		double fahrenheit = 0;
		fahrenheit = ((1.8) * celcius) + 32.0;
		return fahrenheit;
	}
}
