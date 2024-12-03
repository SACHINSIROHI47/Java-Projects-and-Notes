/* Import the required packages. */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
/* Define the ErrorServlet servlet that extends HttpServlet. */

public class ErrorServlet extends HttpServlet
{
  	final String EXC = "javax.servlet.error.exception";	
	final String MSG = "javax.servlet.error.message";
	final String ST = "javax.servlet.error.status_code";

/* Override the doGet() method of HttpServlet that implements the servlet functionality. */	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  	{
		ServletContext sc = getServletContext();
/* Obtain an instance of the PrintWriter class. */
		PrintWriter pw = response.getWriter();
/* Obtain the information about the exception that is thrown. */
		Exception exc = (Exception)request.getAttribute(EXC);	
/* Obtain the Status code of from the HttpServletRequest. */
		Integer st_cd = (Integer)request.getAttribute(ST);	
/* Obtain the message string that explains the error or the exception that is generated . */
		String msg = (String)request.getAttribute(MSG);
		pw.println("<HTML>");
		pw.println("<BODY>");
		pw.println("<HR>");
/* Display the detail error information to the client. */
		pw.println("<H1>Sorry, an error has occurred that has prevented the server from servicing your request.</H1>");
		pw.println("<FONT SIZE = 5>");
		pw.println("<TABLE ALIGN = CENTER>");
		pw.println("<TR BGCOLOR = LIGHTGREY>");
		pw.println("<TD><B> Status Code  : </B></TD><TD>" + st_cd + " </TD>");
		pw.println("</TR>");
		pw.println("<TR>");
		pw.println("<TD><B> Type of Exception :</B></TD><TD>" + exc.getClass() + " </TD>");
		pw.println("</TR>");
		pw.println("<TR BGCOLOR = LIGHTGREY>");
		pw.println("<TD><B> Message Description  : </B></TD><TD>" + msg + " </TD><HR/>");
		String str=exc.toString()+st_cd.toString()+msg;
		sc.log("Exception occurred", exc);
		pw.println("</TR>");
		pw.println("</TABLE>");
		pw.println("</FONT>");
		pw.println("<HR>");
		pw.println("<HR>");
		pw.println("<CENTER><H1>Please try again...</H1></CENTER>");
		pw.println("</BODY>");
		pw.println("</HTML>");
	}
}
