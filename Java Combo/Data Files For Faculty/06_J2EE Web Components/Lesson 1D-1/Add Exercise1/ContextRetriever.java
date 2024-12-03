import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ContextRetriever extends HttpServlet
{
	ServletContext ctx = null;

/*This method is called to initialize the servlet*/  
	public void init(ServletConfig cfig)
	{
 /*Obtain the ServletContext object*/
		ctx = cfig.getServletContext();	

	}
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
            /*Retrieve value of portNo attribute from servlet context*/	
            String contextValue= (String)ctx.getAttribute("portno");		
		response.setContentType("text/html");
            /*Display the context value*/
            PrintWriter pw = response.getWriter();
		pw.println("<B>The retrieved context value is:  "+ contextValue + "<BR></B>");

	}
}
