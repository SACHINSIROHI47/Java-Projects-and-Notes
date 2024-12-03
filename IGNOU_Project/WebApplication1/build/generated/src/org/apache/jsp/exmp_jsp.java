package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exmp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("<TITLE>Background Image</TITLE>\n");
      out.write("</HEAD>\n");
      out.write("\n");
      out.write("<BODY background=\"red\">\n");
      out.write("<SCRIPT>\n");
      out.write("function validate() {\n");
      out.write("if (document.forms[0].name.value==\"\") {\n");
      out.write("alert(\"Please Enter the Name !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("alert(\"Welcome!\");\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("</SCRIPT>\n");
      out.write("<FORM onSubmit=\"return validate()\">\n");
      out.write("<P><BR><BR><BR>\n");
      out.write("<FONT COLOR=\"white\" SIZE=\"4\">Enter the Name:\n");
      out.write("<INPUT TYPE=\"text\" NAME=\"name\" size=\"35\" VALUE=\"\" >\n");
      out.write("<BR><BR>\n");
      out.write("<INPUT TYPE=SUBMIT VALUE=\"Submit\">\n");
      out.write("<BR>\n");
      out.write("<B><FONT COLOR=BLACK SIZE=4>\n");
      out.write("</TABLE>\n");
      out.write("</FORM>\n");
      out.write("</BODY>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
