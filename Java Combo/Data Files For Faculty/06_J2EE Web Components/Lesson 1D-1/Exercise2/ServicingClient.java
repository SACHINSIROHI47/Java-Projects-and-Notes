import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ServicingClient extends HttpServlet 
{	
	PrintWriter pw;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws 

ServletException, IOException
				{
		/*Obtain the PrintWriter object*/
		pw = response.getWriter();
/*Send response to indicate that the URL attribute as been set*/
				response.setContentType("text/html");	
		pw.println("Servicing the client........");
					try {
				Thread.sleep(2000);
/* You can put the animation related logic here. */	
		}catch(InterruptedException ie)
					{
				pw.println(ie.toString());
					}
			  	}
}		
