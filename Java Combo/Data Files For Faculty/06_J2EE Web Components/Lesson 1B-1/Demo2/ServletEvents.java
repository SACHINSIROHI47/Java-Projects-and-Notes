import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class ServletEvents extends HttpServlet
{	
	ServletContext ctx;
	PrintWriter pw;
	public void init(ServletConfig cfig)
	{
  		/*Obtain the ServletContext object*/
		ctx = cfig.getServletContext();		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
        /*Set the context attribute*/
		ctx.setAttribute("URL","jdbc:odbc:EmployeesDB");
        /*Obtain the PrintWriter object*/
		pw = response.getWriter();
        /*Send response to indicate that the URL attribute as been set*/
        response.setContentType("text/html");
        /*Print the time of adding attribute to context object. */
		pw.println("<B>The JDBC URL has been set as a context attribute at " + new Date() + "</B></BR>");
		/*Remove the attribute from the context object. */
		ctx.removeAttribute("URL");		
		/*Print the time of removing the attribute from the context object. */
        pw.println("<B>The JDBC URL has been removed from context at " + new Date() + "</B>");
	}	
}
