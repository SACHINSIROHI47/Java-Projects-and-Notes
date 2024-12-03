import java.util.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class JTABankServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
	String cid = null;
	float amount;
	cid = request.getParameter("custid");
       amount = Float.valueOf(request.getParameter("depositamnt")).floatValue();
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
        try {
            Context initial = new InitialContext();
            Object objref = initial.lookup("java:comp/env/ejb/jtatransaction");
            JTABankHome home = (JTABankHome)PortableRemoteObject.narrow(objref, JTABankHome.class);    
            JTABank jbank = home.create(cid);
            jbank.deposit(amount);
            out.println("<b>" + "The amount has been successfully transfered in your account." + "</b>");
            out.flush();
        } catch (Exception ex)
	{
            out.println("Caught an exception." + "</BR>");
 	    out.println(ex.toString());            
        }
    } 
}
