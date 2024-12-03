package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carloan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Car Loan EMI Calculator</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Car Loan EMI Calculator</h1>\n");
      out.write("      <p style=\"font-size: 25px;\">\n");
      out.write("          <img src=\"image//carlocan1.jpg\">\n");
      out.write("   Use Axis Bank Car Loan EMI \n");
      out.write("   Calculate to know \n");
      out.write("   how much you need to own a car.\n");
      out.write("           </p>\n");
      out.write("           <a href=\"http://localhost:8080/WebApplication2/Registration.jsp\">\n");
      out.write("               <input type=\"submit\" value=\"Get a call back\" style=\"font-size: 30px;\"/>\n");
      out.write("           </a>\n");
      out.write("           <h1>Car Loan EMI Calculator</h1>\n");
      out.write("           <p style=\"font-size: 25px;\">Today, buying a dream car is \n");
      out.write("     almost within your reach irrespective whether\n");
      out.write("     you are salaried or self-employed. \n");
      out.write("     You don’t need to be wealthy enough or \n");
      out.write("     save a fair amount of money to buy your first \n");
      out.write("     car, unlike a couple of decades ago. \n");
      out.write("     You can simply avail a new Car Loan and drive in your dream car sooner.\n");
      out.write("    </p>\n");
      out.write("    <h2>How to Use Car Loan EMI Calculator?</h2>\n");
      out.write("    <p style=\"font-size: 20px;\">Simply key in the amount, \n");
      out.write("     rate and tenure for which the \n");
      out.write("     car loan is sought, \n");
      out.write("     the Car Loan EMI Calculator \n");
      out.write("     will automatically reflect the approximate\n");
      out.write("     EMI’s applicable for the loan tenure.</p>\n");
      out.write("    <h2>What is an EMI?</h2>\n");
      out.write("    <p style=\"font-size: 20px;\">The Equated Monthly Instalment \n");
      out.write(" (or EMI) consists of the principal \n");
      out.write(" portion of the loan amount and the interest. \n");
      out.write(" Therefore, EMI = principal amount + interest \n");
      out.write(" paid on the Car Loan. The EMI, usually, \n");
      out.write(" remains fixed for the entire tenure of your loan, \n");
      out.write(" and it is to be repaid over the tenure of the loan on a monthly basis.\n");
      out.write(" </p>\n");
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
