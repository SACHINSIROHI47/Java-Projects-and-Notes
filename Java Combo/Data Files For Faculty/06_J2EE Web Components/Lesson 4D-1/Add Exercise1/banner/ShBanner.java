package banner;
/* Import packages */
import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.*;
public class ShBanner extends BodyTagSupport
{
	String banner="";
	/* Get the banner text from the banner string variable */
	public String getBanner()
	{
			return this.banner;
	}
	/* Set the banner text to the banner string variable */
	public void setBanner(String newbanner)
	{
			this.banner = newbanner;
	}
	public int doAfterBody() throws JspException
	{
		try
		{
			BodyContent bc = getBodyContent();/* Get the bodycontent as string */
			String body = bc.getString();/* GetJspWriter to output content */
			JspWriter out = bc.getEnclosingWriter();/* Create an instance of the JSPWriter */
			out.println("<H2><center>"+this.getBanner()+"</center></H2>");
			if(body != null)/* Check the content of the body */
				out.print("<CENTER><marquee>"+body+"</marquee></CENTER>");
		}
		catch(Exception ioe)
		{
		        throw new JspException("Error:"+ioe.getMessage());
		}
		return SKIP_BODY;
	}/* End doAfterBody() method */
	public int doEndTag() throws JspException
		{
		      return SKIP_PAGE;
		}
}/* End shBanner */
