import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ForwardError extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
  	{
  	/* Retrieve the ServletConfig and ServletContext objects. */		
        ServletConfig config=getServletConfig();
        ServletContext contx=config.getServletContext();
        /* Retrieve the RequestDispatcher object */
        RequestDispatcher dispatcher=contx.getRequestDispatcher("/servlet/ErrorServlet");     
		
	    try {
			/* Throw NumberFormatException. */
      	  	int x=Integer.parseInt("samplestring");			
    	} catch (Exception ex) 
		{
		/* Store the exception object in the request object. */
			
            request.setAttribute("EXCEPTION", ex);
            /* Dispatch the request to ErrorServlet servlet. */
	        dispatcher.forward(request, response);
		}
  	}
}
