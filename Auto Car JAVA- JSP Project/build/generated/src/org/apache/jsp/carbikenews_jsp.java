package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carbikenews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>CAR & BIKE NEWS</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>CAR & BIKE NEWS</h1>\n");
      out.write("        <img src=\"image//cb.jpg\">\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//cb1.jpg\">\n");
      out.write("            This is Mercedes’ first All-Terrain model since the off-road oriented E-Class in 2017.\n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//cb2.jpg\">\n");
      out.write("            Rajiv Sethu and Senthil Kumar to race for Honda in the 2021 Indian National Motorcycle Racing Championship’s Pr...\n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//cb3.jpg\">\n");
      out.write("            This is a limited-period offer and part of KTM’s 10-year celebrations.        \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//cb4.jpg\">\n");
      out.write("            The new Ola scooters have a set of features seen for the first time on a scooter.    \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//cb5.jpg\">\n");
      out.write("            The Kawasaki Z900RS SE comes equipped with an Öhlins S46 monoshock with a remote preload adjuster.              \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//cb6.jpg\">\n");
      out.write("            Graphite Capsule Editions available in matte-finish paint with gloss-finished contrast inserts; no mechanical updates.    \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//cb7.jpg\">\n");
      out.write("            Jeep has released a video of international-spec Commander revealing interior and exterior styling.    \n");
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
