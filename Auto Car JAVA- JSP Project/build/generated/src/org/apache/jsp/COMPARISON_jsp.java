package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class COMPARISON_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <a href=\"#\">\n");
      out.write("        <img src=\"image//riviews1.jpg\">\n");
      out.write("        </a><br/><br/>\n");
      out.write("        <p style=\"font-size: 25px;\"><img src=\"image//riv.jpg\"/>Can Nissan’s new Magnite really swipe the value-for-money crown from the biggest name in the business? We bring...\n");
      out.write("      </p>\n");
      out.write("      <p style=\"font-size: 25px;\">\n");
      out.write("       <img src=\"image//riv1.jpg\"/>\n");
      out.write("       The Tata Altroz just got a power-up with the introduction of a new turbo-petrol version. We tell you what the top-of-...\n");
      out.write("      </p>\n");
      out.write("      <p style=\"font-size: 25px;\">\n");
      out.write("          <img src=\"image//riv2.jpg\"/>\n");
      out.write("         How do the MG ZS EV, Tata Nexon EV and Hyundai Kona Electric stack up, and which is the one that best meets your elec...\n");
      out.write("      </p>\n");
      out.write("      <p style=\"font-size: 25px;\">\n");
      out.write("          <img src=\"image//riv4.jpg\">\n");
      out.write("          For the new RS7 to find its place in the pantheon of all-time great super sedans, we must pit it against the latest v...\n");
      out.write("      </p>\n");
      out.write("      <p style=\"font-size: 25px;\">\n");
      out.write("          <img src=\"image//riv5.jpg\">\n");
      out.write("          In the left corner is the new Kia Sonet. On the right is its cousin, the Hyundai Venue. We play referee in the big fi...\n");
      out.write("      </p>\n");
      out.write("       <p style=\"font-size: 25px;\">\n");
      out.write("          <img src=\"image//riv6.jpg\">\n");
      out.write("         The Tata Nexon gets a new look, added features and a more powerful 120hp petrol engine. We see how it stacks up again...\n");
      out.write("      </p>\n");
      out.write("      <p style=\"font-size: 25px;\">\n");
      out.write("          <img src=\"image//riv8.jpg\">\n");
      out.write("         In this first-of-its-kind comparison, we test two premium all-electric cars to find out how practical and usable they...\n");
      out.write("      </p>\n");
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
