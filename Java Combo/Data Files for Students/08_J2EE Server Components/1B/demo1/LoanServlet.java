import java.io.*; 
import javax.servlet.*; 
import javax.naming.*; 
import javax.servlet.http.*; 
import javax.rmi.PortableRemoteObject;
import javax.ejb.*; 

public class LoanServlet extends HttpServlet 
{  
   public void doGet (HttpServletRequest request,HttpServletResponse response) 
        throws ServletException, IOException 
   { 
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");   
	
	float rate = Float.valueOf(request.getParameter("rate")).floatValue();
	float time = Float.valueOf(request.getParameter("time")).floatValue();
	float amount = Float.valueOf(request.getParameter("amount")).floatValue();

      Loan myLoanRemote = null;
      LoanHome myLoanHome = null; 
      InitialContext initContext = null; 
      try { 
         initContext = new InitialContext(); 
      }catch (Exception e) { 
          out.println("First " + e.toString());          
      } 

      try { 
          String JNDIName = "ejb/SimpleLoan"; 
          Object obj = initContext.lookup(JNDIName); 
          myLoanHome = (LoanHome)PortableRemoteObject.narrow(obj, LoanHome.class);	   
      }catch(Exception e) { 
          out.println("Second " + e.toString());          
      } 
     try { 
            myLoanRemote = myLoanHome.create();  
        }catch(CreateException e) { 
            out.println("Third " + e.toString());            
        }  
        float interest = myLoanRemote.calculateInterest(rate, time, amount);
        out.println("<B>Interest : " + interest + " </B>"); 
    
}
}        
