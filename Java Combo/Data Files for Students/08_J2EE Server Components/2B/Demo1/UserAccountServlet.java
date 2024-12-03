import java.util.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class UserAccountServlet extends HttpServlet 
{
    int id = 129;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
	String name = null;
	String address = null;
	String phoneNo = null;
	name = request.getParameter("name");
	address = request.getParameter("address");
	phoneNo = request.getParameter("phoneNo");
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
        try {
            /* Accesses a BMP entity bean. */
Context initial = new InitialContext();
            Object objref = initial.lookup("SimpleUserAccount");
            UserAccountHome home = (UserAccountHome) 	    PortableRemoteObject.narrow(objref, UserAccountHome.class);	
	    id++;
		/* Stores data in the database using BMP entity bean create() method.*/
            UserAccount userAcc = home.create(id + "", name, address, phoneNo);
            out.flush();
        } catch (Exception ex)
	{
            out.println("Caught an exception." + "</BR>");
	    out.println(ex.toString());            
        }
    } 
}
