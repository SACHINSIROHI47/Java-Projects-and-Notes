import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ManagerServlet extends HttpServlet
{
  public void doGet(HttpServletRequest request, 
                     HttpServletResponse response)
  {
    try
    {
      response.setContentType("text/html");
      PrintWriter display = response.getWriter();
      display.println("<html><body>");
      display.println("Login by Form based authentication is successful. Thanks... ");
      display.println("</body></html>");
      display.close();     
    } 
    catch(Exception exc)
    {
      exc.printStackTrace();
     }
   }
}  
