/* Import the required packages. */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io. *;

/* Define the Calculate servlet that extends HttpServlet. */
public class Calculate extends HttpServlet
{
/* Override the doGet() method that implements the servlet functionality. */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw=res.getWriter();
		int number1=Integer.parseInt(req.getParameter("num1"));	
		int number2=Integer.parseInt(req.getParameter("num2"));
		int sum=number1+number2;
		pw.println("Sum of the numbers is&nbsp;&nbsp;"+sum);
	}
}
