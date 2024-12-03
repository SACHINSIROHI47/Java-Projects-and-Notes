package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RENAULT_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>RENAULT F1</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>RENAULT F1</h1>\n");
      out.write("        <img src=\"image//re.jpg\">\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//re1.jpg\">\n");
      out.write("            Formula One Power Units are among the most complex, efficient and powerful ones in racing today. Renault Sport are on...\n");
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//re2.jpg\">\n");
      out.write("            Every Formula One champion has to start somewhere. We take a look at how the Renault Sport Academy is grooming talent...\n");
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//re3.jpg\">\n");
      out.write("            A pit stop in Formula One can make the difference between victory and defeat. That is why Renault F1 devotes hours of...\n");
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("            <img src=\"image//re4.jpg\">\n");
      out.write("           Over 40 years of success in F1 hasn’t dulled Renault’s hunger for more. They’re back, and they̵..\n");
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
