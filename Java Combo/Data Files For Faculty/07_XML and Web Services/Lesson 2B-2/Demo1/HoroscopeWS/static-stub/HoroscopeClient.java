package staticstub;
import javax.xml.rpc.Stub;
import java.io.*;

public class HoroscopeClient
{
	private String endpointAddress;
	public static void main(String args[])
	{
		String inputSunSign = null;
		try
		{
			Stub stub = createProxy();
			stub._setProperty(Stub.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/horoscope-context/sunsign");
			HoroscopeInterface hface = (HoroscopeInterface) stub;
			BufferedReader	br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter your sun sign: ");
			inputSunSign = br.readLine();
			if(inputSunSign.equals("") == false)
			{
				if( inputSunSign.equalsIgnoreCase("ARIES") != false || 
			   		inputSunSign.equalsIgnoreCase("TAURUS") != false ||
			   		inputSunSign.equalsIgnoreCase("GEMINI") != false || 
 			   		inputSunSign.equalsIgnoreCase("CANCER") != false || 
			   		inputSunSign.equalsIgnoreCase("LEO") != false || 
			   		inputSunSign.equalsIgnoreCase("VIRGO") != false || 
			   		inputSunSign.equalsIgnoreCase("LIBRA") != false ||
			   		inputSunSign.equalsIgnoreCase("SCORPIO") != false || 
			   		inputSunSign.equalsIgnoreCase("SAGITTARIUS") != false || 
			   		inputSunSign.equalsIgnoreCase("CAPRICORN") != false || 
			   		inputSunSign.equalsIgnoreCase("AQUARIUS") != false || 
			   		inputSunSign.equalsIgnoreCase("PISCES") != false)
				{
					if(inputSunSign.equalsIgnoreCase("ARIES"))
						System.out.println(hface.getSunSignTrait(0));
					if(inputSunSign.equalsIgnoreCase("TAURUS"))
						System.out.println(hface.getSunSignTrait(1));
					if(inputSunSign.equalsIgnoreCase("GEMINI"))
						System.out.println(hface.getSunSignTrait(2));
					if(inputSunSign.equalsIgnoreCase("CANCER"))
						System.out.println(hface.getSunSignTrait(3));
					if(inputSunSign.equalsIgnoreCase("LEO"))
						System.out.println(hface.getSunSignTrait(4));
					if(inputSunSign.equalsIgnoreCase("VIRGO"))
						System.out.println(hface.getSunSignTrait(5));
					if(inputSunSign.equalsIgnoreCase("LIBRA"))
						System.out.println(hface.getSunSignTrait(6));
					if(inputSunSign.equalsIgnoreCase("SCORPIO"))
						System.out.println(hface.getSunSignTrait(7));
					if(inputSunSign.equalsIgnoreCase("SAGITTARIUS"))
						System.out.println(hface.getSunSignTrait(8));
					if(inputSunSign.equalsIgnoreCase("CAPRICORN"))
						System.out.println(hface.getSunSignTrait(9));
					if(inputSunSign.equalsIgnoreCase("AQUARIUS"))
						System.out.println(hface.getSunSignTrait(10));
					if(inputSunSign.equalsIgnoreCase("PISCES"))
						System.out.println(hface.getSunSignTrait(11));
				}
				else
				{
					System.out.println("The input does not match with any of the 12 zodiac signs. Please try again...");
				}
			}
			else
			{
				System.out.println("You did not specify a sun sign. Please enter a valid sun sign...");
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			System.exit(1);
		}
	}	
	private static Stub createProxy()
	{
		return (Stub) (new HoroscopeWebService_Impl().getHoroscopeInterfacePort());
	}
}
