package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class COMPARISONbike_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>COMPARISON REVIEWS</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>COMPARISON REVIEWS</h1>\n");
      out.write("        <img src=\"image//combike.jpg\">\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//combike1.jpg\">\n");
      out.write("            We find out which 160cc motorcycle has the best balance between sporty fun and efficiency.                   \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//combike1_1.jpg\">\n");
      out.write("            Choosing between the fantastic Ducati Multistrada 950 S and capable Triumph Tiger 900 GT is tougher than you’d .                   \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//combike3.jpg\">\n");
      out.write("            We find out how Honda’s 180cc Hornet 2.0 competes against the 200cc machines it’s priced on par with.                       \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//combike4.jpg\">\n");
      out.write("           Two Japanese 250cc nakeds go head to head in a battle for supremacy.                       \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//combike5.jpg\">\n");
      out.write("           The Ather 450 locks horns with the TVS Ntorq 125 as we pit the electric scooter against its fossil fuel competitor.                          \n");
      out.write("        </p>\n");
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
