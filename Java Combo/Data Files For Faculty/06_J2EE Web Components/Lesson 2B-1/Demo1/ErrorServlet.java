import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ErrorServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{		
		PrintWriter pw= response.getWriter();
	/* Retrieve the information stored in the Exception attribute from the request object. */
		Exception exc = (Exception)request.getAttribute("EXCEPTION");	

	/*	Retrieve the message associated with the exception. */
		String msg = exc.getMessage();
		pw.println("<HTML>");
		pw.println("<BODY>");
		pw.println("<H1>OOP'S An error has occurred. </H1>");

		/* Display the exception class and message. */
		pw.println("<B> Exception Type  : " + exc.getClass() + " <BR/>");
		pw.println("<B> Message  : " + msg + " <BR/><HR/>"); 
		pw.println("Please try again......................");
		pw.println("</BODY>");
		pw.println("</HTML>");
	}
}
