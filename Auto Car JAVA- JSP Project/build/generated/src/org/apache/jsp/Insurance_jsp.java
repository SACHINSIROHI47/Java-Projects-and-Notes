package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Insurance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Websites for Insurance Agents and Agencies</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"insurancedekho.jsp\" method=\"post\">\n");
      out.write("        <a href=\"https://www.getitc.com/\" title=\"home\">\n");
      out.write("            <img id=\"Image1\" src=\"image//img.jpg\" width=\"200\" height=\"90\">\n");
      out.write("        </a>\n");
      out.write("        <h1 style=\"font-size: 60px;\">Websites for Insurance</h1>\n");
      out.write("        <h1 style=\"font-size: 60px;\">Agents and Agencies</h1>\n");
      out.write("        <p style=\"font-size: 30px;\">The experts on the Insurance Website Builder team know how to build great</p>\n");
      out.write("        <p style=\"font-size: 30px;\">websites for insurance agents and agencies as we’ve built thousands of websites</p>\n");
      out.write("        <p style=\"font-size: 30px;\">for more than 15 years.</p>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"img\">\n");
      out.write("        <p style=\"font-size: 25px;\">Trusted by partners across the United States</p>\n");
      out.write("        <img src=\"image//smart choice.jpg\" style=\"width: 200px; height: 90px\">\n");
      out.write("        <img src=\"image//Nationwide.jpg\" style=\"width: 200px; height: 90px\">\n");
      out.write("        <img src=\"image//IIANC_logo.jpg\" style=\"width: 200px; height: 90px\">\n");
      out.write("        <img src=\"image//group.jpg\" style=\"width: 200px; height: 90px\">\n");
      out.write("        <img src=\"image//trusted.jpg\" style=\"width: 200px; height: 90px\">\n");
      out.write("        <img src=\"image//grange.jpg\" style=\"width: 200px; height: 90px\">\n");
      out.write("        </div>\n");
      out.write("        <input style=\"text-align: center; font-size: 30px;\" type=\"submit\" value=\"welcome\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
