package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insurancedekho_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"#\">\n");
      out.write("            <img src=\"image//dekho.jpg\" width=\"200\" height=\"90\">\n");
      out.write("        </a>\n");
      out.write("        <h1 style=\"font-size: 25px;\">Thank you for your interest.</h1>\n");
      out.write("        <h2 style=\"font-size: 25px;\">Our associate will call you shortly with the details.</h2>\n");
      out.write("        <h3 style=\"font-size: 25px;\">Benefits of Being an InsuranceDekho PoSP</h3>\n");
      out.write("        <p style=\"font-size: 25px;\">Understand your options. Identify the best value. Enjoy peace of mind</p>\n");
      out.write("        <div style=\"text-align: center;\">\n");
      out.write("        <img src=\"image//become.jpg\" width=\"1000\" height=\"700\">\n");
      out.write("        </div><br/>\n");
      out.write("        <img src=\"image//a1.jpg\" style='width: 200px; height: 90px;'>\n");
      out.write("        <h1>29+ insurers as partners</h1>\n");
      out.write("        <p>Get motor and health quotes from 29+</p>\n");
      out.write("        <p>insurer on a single platform.</p>\n");
      out.write("        <img src=\"image//a2.jpg\" style='width: 200px; height: 90px;'>\n");
      out.write("        <h1>Paperless policy</h1>\n");
      out.write("        <p>Completely hassle-free, instant and digital</p>\n");
      out.write("        <p>policy issuance process.</p>\n");
      out.write("        <img src=\"image//a3.jpg\" style='width: 200px; height: 90px;'>\n");
      out.write("        <h1>Product training></h1>\n");
      out.write("        <p>Get professionally trained about all</p>\n");
      out.write("        <p>insurance products.</p>\n");
      out.write("        <h1 style=\"font-size: 40px;text-align: center;\">What Does An Insurance PoSP Do?</h1>\n");
      out.write("        <p style=\"text-align: center;\">An insurance PoSP, also called a Point of Sale Person (POSP), sells insurance policies to customers on behalf of the certifying entity. He/she is also</p>\n");
      out.write("        <p style=\"text-align: center;\">responsible for advising customers on policy selection, assisting them in the documentation, and claim settlement process.s</p>\n");
      out.write("        <img src=\"image//Become1.jpg\" width=\"1400\" height=\"900\">\n");
      out.write("    </body>\n");
      out.write("</html>");
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
