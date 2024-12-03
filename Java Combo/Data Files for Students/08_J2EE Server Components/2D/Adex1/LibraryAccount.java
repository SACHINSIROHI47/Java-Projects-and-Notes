import java.util.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LibraryAccount extends HttpServlet 
{
    int id = 125;
    Library lib;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    { 
	String name = null;
	String address = "";
	String phoneNo = null;

	name = request.getParameter("name");
	address = request.getParameter("address");
	phoneNo = request.getParameter("phoneNo");

	PrintWriter out = response.getWriter();
	response.setContentType("text/html");

      try {
            Context initial = new InitialContext();
            Object objref = initial.lookup("ejb/SimpleLibraryBean");
            LibraryHome home = (LibraryHome)PortableRemoteObject.narrow(objref, LibraryHome.class);	
	      id++;
            lib = home.create(id + "", name, address, phoneNo);
      } catch (Exception ex)
	{
          out.println("Caught an exception." + "</BR>");
 	    out.println("The Exception is " + ex.toString());            
      }

	if (lib != null)
	{
		out.println("<html>");
		out.println("<body>");
		out.println("<p align = center> <h1> Congratulations " + name + "</h1> <br>" );
		out.println("<h2> Your account has been created </h1> <br>");
		out.println("<h3> Your registration id is " + id);
		out.println("</body></html>");
	}
    }
}
