import java.util.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class CMAccountServlet extends HttpServlet 
{
    float amount;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
	String cid = request.getParameter("custid");
	String acnt_type = request.getParameter("acc");
	amount = Float.valueOf(request.getParameter("amount")).floatValue();
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
        try {
            Context initial = new InitialContext();
            Object objref = initial.lookup("java:comp/env/ejb/cmtranejb");
            CMTransactionHome home = (CMTransactionHome)PortableRemoteObject.narrow(objref, CMTransactionHome.class);	
            CMTransaction tran = home.create(cid,acnt_type);
            tran.checkAmount(amount);  
            out.flush();
        } catch (Exception ex)
	{
            out.println("Caught an exception." + "</BR>");
 	    out.println(ex.toString());            
        }
    } 
}
