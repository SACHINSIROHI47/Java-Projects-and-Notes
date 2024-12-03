/* Import servlet packages for Http request and response and for input/output */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SecondServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw=res.getWriter();
		/* Set content type to text/html */
		res.setContentType("text/html");
		/* Display site administrator information */
		pw.println("Administrator Name : Peter Wilkinson<br>");
		pw.println("Email Address : wilkinson_peter@redeye.software.com<br>");		
	}
}
