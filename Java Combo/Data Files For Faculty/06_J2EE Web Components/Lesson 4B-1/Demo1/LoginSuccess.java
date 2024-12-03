import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginSuccess extends HttpServlet
{
  public void doGet(HttpServletRequest request,
                     HttpServletResponse response)
  {
    try
    {
      response.setContentType("text/html");
      PrintWriter display = response.getWriter();
      display.println("<html><body>");
      display.println("Thank you, You have been successfully authenticated using form-based authentication.");
      display.println("</body></html>");
      display.close();     
    } 
    catch(Exception exc)
    {
      exc.printStackTrace();
     }
   }
}  
