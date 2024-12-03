package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ride_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>FIRST RIDE / REVIEWS</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>FIRST RIDE / REVIEWS</h1>\n");
      out.write("        <img src=\"image//ride.jpg\">\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//ride2.jpg\">\n");
      out.write("            We put the smaller iteration of Aprilia's maxi-style scooter through its paces.    \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//ride3.jpg\">\n");
      out.write("            The FZ-X is a retro-modern take on the tried and tested FZ platform that’s built specially for the Indian market.\n");
      out.write("        </p>\n");
      out.write("           <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//ride4.jpg\">\n");
      out.write("            A full road test reveals what is perhaps the most tempting EV offering out there.     \n");
      out.write("        </p> \n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//rivauto.jpg\">\n");
      out.write("            The Alpinestars Bionic Action knee guards are basic knee armour for off-road use.        \n");
      out.write("        </p>  \n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//rivauto1.jpg\">\n");
      out.write("            The Alpinestars Racefend gloves are minimal motocross gloves.          \n");
      out.write("        </p>  \n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//rivauto2.jpg\">\n");
      out.write("            Cost-effective multi-season riding pants with premium armour.                  \n");
      out.write("        </p> \n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//rivauto3.jpg\">\n");
      out.write("            Comprehensive upper body protection for off-road riding.                 \n");
      out.write("        </p> \n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//rivauto4.jpg\">\n");
      out.write("            Lightweight MX apparel for off-roading.                   \n");
      out.write("        </p> \n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//rivauto5.jpg\">\n");
      out.write("            The Royal Enfield Windfarer is a lightweight and well-ventilated riding jacket.                     \n");
      out.write("        </p> \n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//rivauto6.jpg\">\n");
      out.write("            With updated styling and electronics, the Versys 1000 is much more appealing than its predecessor.                          \n");
      out.write("        </p> \n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//rivauto7.jpg\">\n");
      out.write("            The new Apache RTR 160 4V makes more power and weighs less than the previous model. Here's how it's like to ride.                               \n");
      out.write("        </p> \n");
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
