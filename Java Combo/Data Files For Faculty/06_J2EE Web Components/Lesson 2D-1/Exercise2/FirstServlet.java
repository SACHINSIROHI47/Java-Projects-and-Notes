/* Import servlet packages for http request and response and for input/output */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet
{
	HttpSession session = null;
	PrintWriter pw = null;
	String userName = null;
	int num;
	/* Accept request from client and send response to the client */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try {
			session = request.getSession(true);
			pw = response.getWriter();
			/* Retrieve value of user_name and number in userName and num respectively */
			userName = request.getParameter("user_name");
			num = Integer.parseInt(request.getParameter("number"));
			Integer numb = new Integer(num);
			/* Set a request attribute */
			request.setAttribute("number", numb);
			/* Set a session attribute */
			session.setAttribute("User",userName);
	
			/* Forward request to SecondPage servlet. */		
			RequestDispatcher disp = request.getRequestDispatcher("SecondServlet");
			disp.forward(request, response);
		} catch(Exception e)
		{
			/* If an exception is thrown dispatch the request to the ErrorServlet servlet */
			RequestDispatcher disp = request.getRequestDispatcher("ErrorServlet");			
            request.setAttribute("EXCEPTION", e);
			disp.forward(request, response);
		}
	}
}
