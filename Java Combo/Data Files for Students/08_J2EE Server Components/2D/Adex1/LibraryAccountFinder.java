import java.util.*;
import javax.ejb.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LibraryAccountFinder extends HttpServlet 
{
    Library lib = null;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
	int id = 0;

	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	id = Integer.parseInt(request.getParameter("accNo"));

      try {
            Context initial = new InitialContext();
            Object objref = initial.lookup("ejb/SimpleLibraryBean");
            LibraryHome home = (LibraryHome) PortableRemoteObject.narrow(objref, LibraryHome.class);	                        
	      lib = home.findByPrimaryKey(id+"");	    
		String name = lib.getName();
		out.println("<h2><b>" + "Welcome " + name + "</b></h1>");
		out.println("</form></html>"); 

      }catch (ObjectNotFoundException onfex)
	{
     		out.println(" INVALID MEMBER ID");
		out.println(" PLEASE RETRY" + "<a href=http://localhost:8080/library/LibraryAccountFinder.html> Find </a>");
      }catch (Exception ex)
	{
         out.println("Caught an exception." +  "</BR> - -" + ex + "</BR>");
      } 
    }
}
