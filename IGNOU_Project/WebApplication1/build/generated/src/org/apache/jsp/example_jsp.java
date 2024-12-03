package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class example_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Online Admission Form of IGNOU </title>\n");
      out.write("\n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("   <body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bgcolor=\"#ffeffe\">\n");
      out.write("     <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("      <tbody>\n");
      out.write("          <tr bgcolor=\"green\">\n");
      out.write("             <td valign=\"centre\" width=\"10%\" align=\"middle\">\n");
      out.write("                 <img alt=\"no image available\"  src=\"images/1.gif\" width=\"80\" height=\"80\">\n");
      out.write("             </td>\n");
      out.write("             <td align=\"middle\"><b><font size=\"+4\" color=\"white\">UNIVERSITY OF IGNOU</font></b>\n");
      out.write("             </td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <td colspan=\"2\">&nbsp; </td>\n");
      out.write("          </tr>\n");
      out.write("          <tr class=\"tdheader1\">\n");
      out.write("            <td colspan=\"2\"><p align=\"center\"><font size=\"+2\"><marquee> Welcome To Online Admission&nbsp;\n");
      out.write("                        </marquee></font></p><font size=\"+2\"></font>\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("       </tbody>\n");
      out.write("      </table>\n");
      out.write("\n");
      out.write(" <form action=\"Instruction.jsp\" method=\"post\">\n");
      out.write("  <div align=\"center\">\n");
      out.write("   <table width=\"80%\" border=\"0\">\n");
      out.write("    <tbody>\n");
      out.write("        <tr><td width=\"45%\">\n");
      out.write("            <br><br><br><br>\n");
      out.write("          <table width=\"70%\" border=\"0\">\n");
      out.write("            <tbody>\n");
      out.write("               <tr class=\"td3\">\n");
      out.write("                 <td bgcolor=\"pink\"><a href=\"AdmLogin.html\"><font size=\"2\">&nbsp;Administrator</font></a>\n");
      out.write("                 </td>\n");
      out.write("               </tr>\n");
      out.write("               <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("               <tr class=\"td5\">\n");
      out.write("                 <td><a href=\"EmpLogin.html\"><font size=\"2\">&nbsp;Employee</font></a>\n");
      out.write("                 </td>\n");
      out.write("               </tr>\n");
      out.write("               <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("               <tr class=\"td3\">\n");
      out.write("                 <td><a href=\"StuLogin.html\"><font size=\"2\">&nbsp;Student</font></a>\n");
      out.write("                 </td>\n");
      out.write("               </tr>\n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
      out.write("         </td>\n");
      out.write("         <td valign=\"center\" width=\"45%\" align=\"middle\"><a href=\"Apply.html\"><br>\n");
      out.write("              <img alt=\"no image available\"  src=\"images/2.jpg\" width=\"50%\" height=\"80%\"></a>\n");
      out.write("         </td>\n");
      out.write("      </tr>\n");
      out.write("    </tbody>\n");
      out.write("   </table>\n");
      out.write("     <br><p></p></div></form>\n");
      out.write(" </body>\n");
      out.write("</html>");
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
