/* Import servlet packages for Http request and response and for input/output */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		/* Create an instance of PrintWriter */
		PrintWriter pw=response.getWriter();
		/* Set content type to text/html */
		response.setContentType("text/html");
		pw.println("<h3> Hello! Welcome to the site</h3>");
                
                pw.println("Your browser is: "+(String)request.getAttribute("browser")+"<Br>");
                pw.println("The MIME type your browser prefers: "+(String)request.getAttribute("accept")+"<Br>");
                pw.println("The language your browser expects: "+(String)request.getAttribute("acceptLang")+"<Br>");
                pw.println("The host name and port accessed by your browser: "+(String)request.getAttribute("host")+"<Br>");
              
	}
}
