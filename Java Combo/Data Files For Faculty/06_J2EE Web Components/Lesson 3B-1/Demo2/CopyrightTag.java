/* Imports the package needed to implement the custom tag */
package copyright;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
/* Extending the TagSupport interface */
public class CopyrightTag extends TagSupport
{
	/* Invokes when the start tag of the custom tag is encountered */
	public int doStartTag() throws JspException
	{
		try
		{
			/* Creating an instance of the JSPWriter for displaying the output */
			JspWriter out=pageContext.getOut();
			out.println("<BR><B>Copyright 1994-2004 New Tech Books Inc.<B>");
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
