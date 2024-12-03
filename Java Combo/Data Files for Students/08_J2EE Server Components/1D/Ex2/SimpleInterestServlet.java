import java.io.*; 
import javax.servlet.*; 
import javax.naming.*; 
import javax.servlet.http.*; 
import javax.rmi.PortableRemoteObject;
import javax.ejb.*;
import simple.SimpleInterest;
import simple.SimpleInterestHome; 

public class SimpleInterestServlet extends HttpServlet 
{  
   public void doGet (HttpServletRequest request,HttpServletResponse response) 
        throws ServletException, IOException 
   { 
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");   
	
	float rate = Float.valueOf(request.getParameter("rate")).floatValue();
	float time = Float.valueOf(request.getParameter("time")).floatValue();
	float amount = Float.valueOf(request.getParameter("amount")).floatValue();

      SimpleInterest simple = null;
      SimpleInterestHome home = null; 
      InitialContext ic = null; 
      try { 
         ic = new InitialContext(); 
      }catch (Exception e) { 
          out.println("First " + e.toString());          
      } 

      try { 
          Object obj = ic.lookup("java:comp/env/ejb/simple"); 
          home = (SimpleInterestHome)PortableRemoteObject.narrow(obj, SimpleInterestHome.class);	   
      }catch(Exception e) { 
          out.println("Second " + e.toString());          
      } 
      try { 
            simple = home.create();  
        }catch(CreateException e) { 
            out.println("Third " + e.toString());            
        }  
        float interest = simple.calculateInterest(rate, time, amount);
        out.println("<B>Simple Interest : " + interest + " </B>"); 
    }
} 
