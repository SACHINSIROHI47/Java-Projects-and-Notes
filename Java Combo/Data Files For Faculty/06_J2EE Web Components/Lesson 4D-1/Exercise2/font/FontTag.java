/* Imports the packages */
package font;
import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.util.*;
public class FontTag extends BodyTagSupport
{
	String fontType="";
	/* Get the banner text from the banner string variable */
	public String getFontType()
	{
			return this.fontType;
	}
	/* Set the banner text to the banner string variable */
	public void setFontType(String font)
	{
			this.fontType = font;
	}
	public int doAfterBody() throws JspException
	{
		try
		{
			/* Get the bodycontent as string */
			BodyContent bc = getBodyContent();
			/* GetJspWriter to output content */
			String body = bc.getString();
			/* Create an instance of the JSPWriter */
			JspWriter out = bc.getEnclosingWriter();
			if(body != null)/* Check the content of the body */
				out.print("<CENTER><font face ="+ fontType +">"+body+"</font></CENTER>");
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
}/* End FontTag */
