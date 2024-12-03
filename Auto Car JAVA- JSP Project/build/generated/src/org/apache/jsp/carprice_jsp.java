package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carprice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>car price</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Select Brand</h1>\n");
      out.write("        <select style=\"width:280px; height: 40px;\">\n");
      out.write("            <option>Audi</option>\n");
      out.write("            <option>Bmw</option>\n");
      out.write("            <option>Datsun</option>\n");
      out.write("            <option>Dc</option>\n");
      out.write("            <option>Force</option>\n");
      out.write("            <option>Kia</option>\n");
      out.write("        </select>\n");
      out.write("        <h1>Select Model</h1>\n");
      out.write("        <select style=\"width:280px; height: 40px;\">\n");
      out.write("            <option>Q2</option>\n");
      out.write("            <option>A8</option>\n");
      out.write("            <option>Q8</option>\n");
      out.write("            <option>A7</option>\n");
      out.write("            <option>A4</option>\n");
      out.write("            <option>A6</option>\n");
      out.write("        </select><br/><br/>\n");
      out.write("        <div>\n");
      out.write("            <img src=\"image//bmwcar.jpg\" width=\"900\" height=\"700\">\n");
      out.write("        </div>\n");
      out.write("        <label style=\"font-size: 35px;\">Select City:</label>\n");
      out.write("        <input type=\"text\" name=\"Select City\" placeholder=\"Type your Area\" size=\"40\" style=\"font-size: 25px;\"/><br/><br/>\n");
      out.write("        <a href=\"http://localhost:8080/WebApplication2/Registration.jsp\">\n");
      out.write("        <input type=\"submit\" value=\"Enquire Now\" style=\"font-size: 30px;\"/>\n");
      out.write("        </a>\n");
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
