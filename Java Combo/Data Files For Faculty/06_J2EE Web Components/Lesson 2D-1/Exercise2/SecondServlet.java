/* Import servlet packages for http request and response and for input/output */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SecondServlet extends HttpServlet
{
	HttpSession session = null;
	PrintWriter pw = null;
	String userName = null;
	int num;
	/* Accept request from client and send response to the client */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try {
			pw = response.getWriter();		
			session = request.getSession(true);
			/* Retrieve the session attribute */
			userName = (String)session.getAttribute("User");				
			/* Retrieve the request attribute */
			Integer num = (Integer) request.getAttribute("number");	
			/* Generate the random number  */
			double randomNum = 10*(Math.random());		
			/* Wrap the randomNum in an Integer object */
			Integer newNum = new Integer((int)randomNum);	

			/* Compare the two numbers */
			if (num.equals(newNum))
			{
				/* Display the success message */
				pw.println("<FONT SIZE = 4> <B>" + " Congratulations!  " + userName + "</B>" + ", you have hit the right number" + " </FONT>");							
			}
			else
			{
				/* Display the failure message */
				pw.println("<FONT SIZE = 4> <B>" + " Sorry!  " + userName + "</B>" + ", you have hit the wrong number" + " </FONT><BR>" );			
				pw.println("<FONT SIZE = 4> " + "The lucky number is <B>"+ newNum + "</B></FONT>");			
			}
		} catch(Exception e)
		{
			/* If an exception is thrown dispatch the request to the ErrorServlet servlet */
			RequestDispatcher disp = request.getRequestDispatcher("ErrorServlet");			
            request.setAttribute("EXCEPTION", e);
			disp.forward(request, response);
		}
	}
}
