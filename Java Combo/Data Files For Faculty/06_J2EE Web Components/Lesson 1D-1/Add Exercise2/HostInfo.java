/* Import the required packages. */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
/* Define the HostInfo class that extends HttpServlet class. */
public class HostInfo extends HttpServlet
{
	/* Override the doGet() method of HttpServlet class. */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		/* Invoke the doPost() method that implements the servlet functionality. */
		doPost(req,res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		/* Declare the variable that stores the information of remote user. */
		String rhost = req.getRemoteHost();
		String raddr = req.getRemoteAddr();
		/* Obtain an instance of PrintWriter. */
		PrintWriter pw = res.getWriter();	
		/* Set the content type as text/html. */
		res.setContentType("text/html");
		/* Print the remote user information to the client browser using the object of PrintWriter class. */
		pw.println("<H3>Details of client machine from which the request is coming:</H3>");
		pw.println("<B>Hostname of Client Machine : </B>" + rhost + "<BR>");
		pw.println("<B>IP Address of Client Machine : </B>" + raddr);
	}
}
