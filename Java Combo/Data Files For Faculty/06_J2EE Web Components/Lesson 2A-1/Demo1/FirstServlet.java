/* Import the required packages. */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/* Define the FirstServlet servlet that extends HttpServlet. */
public class FirstServlet extends HttpServlet
{
/* Override the doGet() method of HttpServlet class. */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
/* Invoke the doPost() method of HttpServlet class. */
		doPost(req, res);
	}
/* Override the doPost() method of HttpServlet that implements the servlet functionality. */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String username = req.getParameter("user");
		String password = req.getParameter("password");
		int counter = 0;
		PrintWriter pw = res.getWriter();
		/* Authenticate the user. */
		if (username.equals("Mike")&& password.equals("abc123"))
		{
			pw.println( username + "! Welcome to Online Shopping." + "<BR>");	
			counter = 0;
/* Create a session for the user and store the value of username. */
			HttpSession session = req.getSession(true);
			session.setAttribute("user", username);
		}
		else 
		{
			pw.println("Sorry! Invalid username and password");
			counter = 1;
		}
					
		if (counter == 0)
		{ 
		/* Display the contents to the user. */
			pw.println("<HTML><BODY>");
			pw.println("<HR>");
			
			pw.println("<FORM ACTION = http://localhost:8080/session_demo_cntxt/servlet/SecondSessionServlet METHOD=POST>");
		  		
			pw.println("<TABLE WIDTH=500>");
			pw.println("<TR><TH>ITEM NO</TH> <TH>SHIRT TYPE </TH> <TH>BUY</TH> </TR> ");
			pw.println("<TR><TD> 1 </TD><TD> PeterEngland  </TD> <TD> <INPUT NAME = c1 TYPE = CHECKBOX VALUE = PeterEngland ></TD> </TR> ");		
			pw.println("<TR><TD> 2 </TD><TD> Excaliber     </TD> <TD> <INPUT NAME = c2 TYPE = CHECKBOX VALUE = Excaliber ></TD> </TR> ");
				
			pw.println("<TR><TD> 3 </TD><TD> Vaun Newman   </TD> <TD> <INPUT NAME = c3 TYPE = CHECKBOX VALUE = VaunNewman></TD> </TR> ");
				
			pw.println("<TR><TD> 4 </TD><TD> Wills Classic </TD> <TD> <INPUT NAME = c4 TYPE = CHECKBOX VALUE = WillsClassic></TD> </TR> ");		   
				
			pw.println("</TABLE>");	
			pw.println("<INPUT TYPE = SUBMIT VALUE = SUBMIT>");				
			pw.println("</FORM>");
			pw.println("</BODY></HTML>");
			pw.close();
		}	
	}
}
