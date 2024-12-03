package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SiteMap_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <title>Online Admission Form of IGNOU</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"orange\">\n");
      out.write("\n");
      out.write("    <body bgcolor=\"orange\">\n");
      out.write(" <form name=\"f8\" method=\"post\">\n");
      out.write("      \n");
      out.write("        <table width=\"100%\" height=\"100%\">\n");
      out.write("            <tr bgcolor=\"green\" width=\"100%\" height=\"100%\">\n");
      out.write("                <td align=\"middle\" ><b><font size=\"+4\" color=\"white\">UNIVERSITY OF IGNOU</font></b>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td colspan=\"2\"><p align=\"LEFT\" ><font size=\"+2\" color=\"white\">&nbsp;&nbsp;&nbsp;&nbsp;UNIVERSITY SITE MAP</font></p>\n");
      out.write("                    <font size=\"+2\"></font>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("          <td colspan=\"2\"><p align=\"LEFT\" ><font size=\"+3\" color=\"green\" > <marquee>UNIVERSITY SITE MAP LOCATION PLAN </marquee> </font></p>\n");
      out.write("                    <font size=\"+2\"></font>\n");
      out.write("                </td> \n");
      out.write("        <table><tr><td valign=\"centre\" width=\"10%\" align=\"middle\">\n");
      out.write("                     <br><br>\n");
      out.write("                      \n");
      out.write("                                      \n");
      out.write("                    <img src=\"images/map2.jpg\"  width=\"50%\" height=\"150%\">\n");
      out.write("        </td></tr></table>\n");
      out.write("    \n");
      out.write("     <br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("  <table border=\"3\">\n");
      out.write("    <tr>\n");
      out.write("      <td valign=\"centre\" width=\"10%\" align=\"middle\"><b>\n");
      out.write("          Dear Students and Parents<br><br> University\n");
      out.write("          of IGNOU welcomes you to online Admission facility.<br>Enjoy hassle\n");
      out.write("          free, safe and secure admission. Save your precious time, energy and money. It\n");
      out.write("          is convenient. You can do it from anywhere. Use it !<br>\n");
      out.write("          We wish you a Happy admission and joyful learning.</b><br><br>\n");
      out.write("      </td>\n");
      out.write("     </tr>\n");
      out.write("   </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
