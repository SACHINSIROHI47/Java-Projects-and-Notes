package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TRAVELOGUES_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>TRAVELOGUES</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>TRAVELOGUES</h1>\n");
      out.write("        <img src=\"image//tr.jpg\">\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("        <img src=\"image//tr1.jpg\">  \n");
      out.write("        The Surf to Snow rally saw 120 people, traverse over 9,500km in 10 Mahindra SUVs, from Mumbai to Leh and back.      \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("        <img src=\"image//tr2.jpg\">  \n");
      out.write("        Some people are mad enough to ride into the Himalayas during winter. We don ten layers of clothes to observe and part..   \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("         <img src=\"image//tr3.jpg\">  \n");
      out.write("        We witness the sights and sounds of China and experience the country's highways as we continue onward on our journey.    \n");
      out.write("        </p>\n");
      out.write("        <p style=\"font-size: 25px;\">\n");
      out.write("         <img src=\"image//tr4.jpg\">  \n");
      out.write("        The first ride of the wanderers is complete. Check out the ride of a lifetime.           \n");
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
