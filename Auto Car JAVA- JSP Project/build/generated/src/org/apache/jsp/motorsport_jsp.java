package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class motorsport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>motor sport</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <h1>CAR & BIKE NEWS</h1>\n");
      out.write("       <img src=\"image//motor.jpg\" style=\"width: 100%; height: 100%;\">\n");
      out.write("       <div style=\"text-align: center;\">\n");
      out.write("           <marquee>\n");
      out.write("         <img src=\"image//motor1.jpg\">\n");
      out.write("          <img src=\"image//motor2.jpg\">\n");
      out.write("           <img src=\"image//motor3.jpg\">\n");
      out.write("            <img src=\"image//motor4.jpg\">\n");
      out.write("           </marquee>\n");
      out.write("       </div>\n");
      out.write("        <p style=\"font-size: 20px;\"><img src=\"image//motor1.jpg\">\n");
      out.write("          Vettel loses his 2nd place finish in the Hungarian GP after not having enough fuel in his car to provide a sample.       \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 20px;\"><img src=\"image//motor2.jpg\">\n");
      out.write("          Ocon wins ahead of Vettel, while Hamilton re-takes 2021 F1 championship lead after 3rd place finish.    \n");
      out.write("        </p>\n");
      out.write("         <p style=\"font-size: 20px;\"><img src=\"image//motor3.jpg\">\n");
      out.write("         New Michael Schumacher Netflix documentary is “fully supported” by the seven-time F1 champion’s fam...\n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 20px;\"><img src=\"image//motor4.jpg\">\n");
      out.write("         Mahindra Racing’s Alex Lynn sealed his maiden Formula E win as Audi’s Lucas di Grassi was disqualified.   \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 20px;\"><img src=\"image//motor5.jpg\">\n");
      out.write("        Audi says its electrified Dakar racer will help develop future road cars from the company.   \n");
      out.write("        </p>\n");
      out.write("         <p style=\"font-size: 20px;\"><img src=\"image//motor6.jpg\">\n");
      out.write("        Hamilton had to overcome a penalty after making contact with Verstappen on the opening lap. \n");
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
