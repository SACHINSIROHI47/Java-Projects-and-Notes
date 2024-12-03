import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ContextAdder extends HttpServlet
{
	ServletContext ctx;
      /*This method is called to initialize the servlet*/  
	public void init(ServletConfig cfig)
	{
             /*Obtain the ServletContext object*/
		 ctx = cfig.getServletContext();
	}
     /*Override the doGet() method*/
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
            /*Set portno attribute with value 8080 in servlet context*/
            ctx.setAttribute("portno","8080");
            /*Redirect to ContextRetriever servlet*/
		response.sendRedirect("http://localhost:8080/exercise2_context/servlet/ContextRetriever");
		
	}
}
