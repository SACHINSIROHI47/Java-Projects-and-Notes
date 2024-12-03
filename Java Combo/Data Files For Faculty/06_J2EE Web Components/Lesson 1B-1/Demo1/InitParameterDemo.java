/*Import the necessary packages*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class InitParameterDemo extends HttpServlet
{
	String strName;
	String strValue; 
	Enumeration enum;
	
	public void init() throws ServletException
	{
                /*Obain the ServletContext object*/
		ServletContext ctx = getServletContext();
		try
		{
                       /*Obtain the name of the context initialization parameter as an Enumeration*/			
			enum = ctx.getInitParameterNames();
			/*Check for elements of the Enumeration object*/
			while (enum.hasMoreElements())
			{
                                /*Retrieve the initialization parameter name*/
				strName = (String)enum.nextElement();
                                /*Retrieve the initialization parameter value*/	
				strValue = ctx.getInitParameter(strName);
				
			}			
		}
		catch(Exception e)
		{
                        /*Log any exception to the server log file*/
			ctx.log(e.toString());
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
                /*Send a message indicating the name and value of the initialization parameter as response*/
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Please post your valuable feedback and suggestions to: "+strValue  );
			
	}
}
