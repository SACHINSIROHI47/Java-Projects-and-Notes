/* Import the required packages. */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/* Define the FinalServlet servlet that extends HttpServlet. */
public class FinalServlet extends HttpServlet
{
/* Override the doPost() method of HttpServlet class that implements the servlet functionality. */
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String shcode1 = null;
		String shcode2 = null;
		String shcode3 = null;		
		String shcode4 = null;		
		int price1 = 0;
		int price2 = 0;
		int price3 = 0;
		int price4 = 0;
		int totalPrice = 0;
		
		String username = "";
				
		PrintWriter pw = response.getWriter();

		/* Retrieve the session object. */
		HttpSession session = request.getSession(true);

		/* Retrieve the value bound to "user". */
		username = (String)session.getAttribute("user");	

		/* Retrieve the value bound to "counter".*/
		String counter = (String)session.getAttribute("counter");
		int count = Integer.parseInt(counter);
	
		for(int i=1; i<=count-1; i++)
		{ 		

		/* Create a String array. */
			String shname []= new String[count-1];
			shname[i-1] = (String)session.getAttribute("c"+i);

		/* Calculate the total price of selected items.*/
			
			if ((shname[i-1]).equals("c1"))
			{
				price1 = 65;
			}	  
			if ((shname[i-1]).equals("c2"))
			{
				price2 = 70;
			}
			if ((shname[i-1]).equals("c3"))
			{
				price3 = 85;
			}	  	  
			if ((shname[i-1]).equals("c4"))
			{
				price4 = 75;
			}	   
		}
/* Calculate the total bill. */			
		totalPrice = price1 + price2 + price3 + price4;		
/* Display the total bill that the user has to pay. */
		pw.println(username + ", your bill is $" + totalPrice);
		
		pw.println("</BODY></HTML>");
		pw.close();
	}

}
