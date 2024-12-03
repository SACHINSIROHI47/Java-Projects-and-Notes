import java.io.*; 
import javax.servlet.*; 
import javax.naming.*; 
import javax.servlet.http.*; 
import javax.rmi.PortableRemoteObject;
import javax.ejb.*;
import student.StudentGrade;
import student.StudentGradeHome; 

public class StudentgradeServlet extends HttpServlet 
{  
   public void doGet (HttpServletRequest request,HttpServletResponse response) 
        throws ServletException, IOException 
   { 
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");   
	
	int num1 = Integer.valueOf(request.getParameter("num1")).intValue();
	int num2 = Integer.valueOf(request.getParameter("num2")).intValue();
	int num3 = Integer.valueOf(request.getParameter("num3")).intValue();

      StudentGrade student = null;
      StudentGradeHome home = null; 
      InitialContext ic = null; 
      try { 
         ic = new InitialContext(); 
      }catch (Exception e) { 
          out.println("First " + e.toString());          
      } 

      try { 
          Object obj = ic.lookup("java:comp/env/ejb/student"); 
          home = (StudentGradeHome)PortableRemoteObject.narrow(obj, StudentGradeHome.class);	   
      }catch(Exception e) { 
          out.println("Second " + e.toString());          
      } 
      try { 
            student = home.create();  
        }catch(CreateException e) { 
            out.println("Third " + e.toString());            
        }  
        String res = student.calculateGrade(num1, num2, num3);
        out.println("<B>Student grade is:  " + res + " </B>"); 
    }
}
