/* Import servlet packages for Http request and response and for input/output */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw=res.getWriter();
		/* Set content type to text/html */
		res.setContentType("text/html");
		String user_name=req.getParameter("user_name");
		pw.println("<h3> Hello &nbsp;" + user_name +"! &nbsp;Welcome to the Application</h3>");
		pw.println("<b>Contact information of Application Administrator is</b><br>");
		/* Forward request to SecondServlet servlet */
		RequestDispatcher disp = req.getRequestDispatcher("SecondServlet");
		disp.include(req, res);
	}
}
