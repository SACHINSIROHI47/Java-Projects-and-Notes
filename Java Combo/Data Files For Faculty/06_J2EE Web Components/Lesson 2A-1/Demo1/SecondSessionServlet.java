/* Import the required packages. */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

/* Define the SecondSessionServlet class that extends HttpServlet. */
public class SecondSessionServlet extends HttpServlet
{
/* Override the doPost() method of HttpServlet. */

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
/*Declare local variables to store session information. */	
		String user = null ;
  		String item = null;
		int i = 1;
		Enumeration enum = null;

	/* Obtain an instance of the PrintWriter class. */
		PrintWriter pw = response.getWriter();

		/* Retrieve the session object. */
		HttpSession session = request.getSession(true);

		/* Retrieve the value bound to "user".	 */
		user = (String)session.getAttribute("user");	

		/* Retrieve the name of all the parameters passed by the end user. */
		enum = request.getParameterNames();		
		while (enum.hasMoreElements())
		{
			String sname = (String)enum.nextElement();

		/* Store the names in the session object. */
			session.setAttribute ("c"+i, sname);			
			i++;
		}

		/* Store the counter value in the session object. */
		session.setAttribute("counter", i +"");

		/* Dispatch the request to the FinalServlet servlet. */
		RequestDispatcher disp = request.getRequestDispatcher("FinalServlet");
		disp.forward(request, response);
    }

}
