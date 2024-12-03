package browserclient;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.rpc.Stub;
import javax.naming.*;

public class HoroscopeClient extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
    	PrintWriter out= res.getWriter();
    	String inputSunSign = null;
		try
		{
			/* Obtain the initial context */
			Context ic = new InitialContext();
			/* Perform JNDI lookup to locate the Web service */
			HoroscopeWebService hws = (HoroscopeWebService) ic.lookup("java:comp/env/service/Horoscope_WebService");
			/* Obtain the reference of Web service endpoint address */
			HoroscopeInterface hPort = (HoroscopeInterface)hws.getHoroscopeInterfacePort();
			/* Set the Web service endpoint address */
			((Stub) hPort)._setProperty(Stub.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/horoscope-context/sunsign");
			/* Retrieve the user specified sun sign passed as request parameter */
			inputSunSign = req.getParameter("sunsign");
			if(inputSunSign.equals("") == false)
			{
				/* Check for a specific sun sign */
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
					/* Display the sun sign trait corresponding to the user specified sun sign */
					if(inputSunSign.equalsIgnoreCase("ARIES"))
						out.println(hPort.getSunSignTrait(0));
					if(inputSunSign.equalsIgnoreCase("TAURUS"))
						out.println(hPort.getSunSignTrait(1));
					if(inputSunSign.equalsIgnoreCase("GEMINI"))
						out.println(hPort.getSunSignTrait(2));
					if(inputSunSign.equalsIgnoreCase("CANCER"))
						out.println(hPort.getSunSignTrait(3));
					if(inputSunSign.equalsIgnoreCase("LEO"))
						out.println(hPort.getSunSignTrait(4));
					if(inputSunSign.equalsIgnoreCase("VIRGO"))
						out.println(hPort.getSunSignTrait(5));
					if(inputSunSign.equalsIgnoreCase("LIBRA"))
						out.println(hPort.getSunSignTrait(6));
					if(inputSunSign.equalsIgnoreCase("SCORPIO"))
						out.println(hPort.getSunSignTrait(7));
					if(inputSunSign.equalsIgnoreCase("SAGITTARIUS"))
						out.println(hPort.getSunSignTrait(8));
					if(inputSunSign.equalsIgnoreCase("CAPRICORN"))
						out.println(hPort.getSunSignTrait(9));
					if(inputSunSign.equalsIgnoreCase("AQUARIUS"))
						out.println(hPort.getSunSignTrait(10));
					if(inputSunSign.equalsIgnoreCase("PISCES"))
						out.println(hPort.getSunSignTrait(11));
				}
				else
				{
					out.println("The input does not match with any of the 12 zodiac signs. Please try again...");
				}
			}
			else
			{
				out.println("You did not specify a sun sign. Please enter a valid sun sign...");
			}
		}
      	catch (Exception ex) 
      	{
	      	out.println(ex.getMessage());
    	}
	}
}
