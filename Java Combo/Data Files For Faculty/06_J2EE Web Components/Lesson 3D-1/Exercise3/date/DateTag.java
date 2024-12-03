/* Imports the package needed to implement the custom tag */
package date;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.GregorianCalendar;
/* Extending the TagSupport interface */
public class DateTag extends TagSupport
{
	/* Invokes when the start tag of the custom tag is encountered */
	public int doStartTag() throws JspException
	{
		try
		{
			/* Creating an instance of the JSPWriter for displaying the output */
			JspWriter out=pageContext.getOut();
			/* Declaring the variable for system date */
			String dt;
			/* Creating an instance of GregorianCalendar class */
			GregorianCalendar now = new GregorianCalendar();
			/* Invoking the getTime() method */
			dt = now.getTime().toString();
			/* Finding the substring of the dt(date) */
			String dt1 = dt.substring(11,16);
			out.println("<BR><B>Welcome to our Website <B>");
			out.println("<br>");
			out.println("The system time is: "+dt1);
		}
		catch (Exception ioException)
		{
			System.err.println("IO Exception");
			System.err.println("ioException.toString()");
		}
		/* Returning the SKIP_BODY, as the body content is not be evaluated */
		return SKIP_BODY;
	}
	/* Invokes when the end tag of the custom tag is encountered */
	public int doEndTag() throws JspException
	{
      /* Skip the processing of the rest of the page */
      return SKIP_PAGE;
   }
}
