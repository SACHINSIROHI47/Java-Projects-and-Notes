package staticstub;

import javax.xml.rpc.Stub;
import java.io.*;

public class TempConverterClient
{
	private String endpointAddress;
	public static void main(String args[])
	{
		double celcius = 0;
		try
		{
			Stub stub = createProxy();
			stub._setProperty(Stub.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/tempconverter/fahrenheit");
			TempConverterInterface hface = (TempConverterInterface) stub;
			BufferedReader	br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter temperature in celcius : ");
			celcius = Double.parseDouble(br.readLine());
			System.out.println("The fahrenheit value is :" + hface.getFahrenheit(celcius));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}	
	private static Stub createProxy()
	{
		return (Stub) (new TempConverterWebService_Impl().getTempConverterInterfacePort());
	}
}
