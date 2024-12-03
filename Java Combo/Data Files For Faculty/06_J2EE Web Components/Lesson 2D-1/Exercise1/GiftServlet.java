import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class GiftServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		boolean cookieFound = false;
		Cookie myCookie = null;
		/* Retrieve the cookies into a cookie array */
		Cookie[] cookieset = req.getCookies();
		/* Set the content type */
		res.setContentType("text/html");
		/* Retrieve a reference to PrintWriter object */
		PrintWriter pw = res.getWriter();
		pw.println("<HTML>");
		pw.println("<BODY>");
		
		/* Check if the cookieset is empty or not */
		if (cookieset != null)
		{
			/* Iterate through all the cookies int the cookieset array */
			for (int i = 0; i<cookieset.length; i++)
			{
				/* Comapare the name of the cookies in the cookieset array with "logincount" */
				if (cookieset[i].getName().equals("logincount"))	
				{
					/* Set the cookieFound boolean variable to true */
					cookieFound = true;
					/* Store the reference of the found cookie in the myCookie */
					myCookie = cookieset[i];
				}
			}
		}
		/* Check if the cookie is found */
		if (cookieFound)
		{
			/* Retrieve the value of the cookie and parse it to int data type */
			int temp=Integer.parseInt(myCookie.getValue());
			/* Iterate the value */
			temp++;
			/* Check if the value is equal to 5 */
			if (temp == 5)
			/* Display the greeting message */
			pw.println("Congratulations!!!!!!!!!!!!!!!!!!!, a gift is awaiting you");
			/* Display the number of times the end user have visited the site */
			pw.println("The number of times you have logged in is : " + String.valueOf(temp));
			/* Set the value of the cookie */
			myCookie.setValue(String.valueOf(temp));
			int age = 60*60*24*30; 
			
			/*Set the maximum age of the cookie to one month */
			myCookie.setMaxAge(age);
			/* Add the cookie to myCookie object */
			res.addCookie(myCookie);
			/* Set the cookieFound boolean variable to false. */
			cookieFound = false;
		}			
		else
		{
			/* Set the value of the temp variable to 1 */
			int temp=1;
			pw.println("This is the first time you have logged on to the server");
			/* Create a new cookie */
			myCookie=new Cookie("logincount",String.valueOf(temp));
			int age=60*60*24*30;
			/* Set the maximum age of the cookie to one month */
			myCookie.setMaxAge(age);
			/* Add the cookie to myCookie object */
			res.addCookie(myCookie);
		} 
		pw.println("</BODY>");
		pw.println("</HTML>");
    }
}    
