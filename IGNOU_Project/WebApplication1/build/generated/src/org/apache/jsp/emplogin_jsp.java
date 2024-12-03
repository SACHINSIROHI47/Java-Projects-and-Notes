package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmpLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("    <title>Online Admission Form of IGNOU </title>\n");
      out.write("\n");
      out.write("    \n");
      out.write("   </head>\n");
      out.write("\n");
      out.write(" <body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bgcolor=\"#d5c0fe\">\n");
      out.write("  <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("   <tbody>\n");
      out.write("      <tr bgcolor=\"blue\">\n");
      out.write("          <td valign=\"centre\" width=\"10%\" align=\"middle\"> <img alt=\"no image available\"\n");
      out.write("              src=\"images/1.gif\" width=\"80\" height=\"80\"> </td>\n");
      out.write("          <td align=\"middle\"><b><font size=\"+4\" color=\"white\">UNIVERSITY OF IGNOU</font></b></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("          <td colspan=\"2\">&nbsp; </td>\n");
      out.write("      </tr>\n");
      out.write("      <tr class=\"tdheader1\">\n");
      out.write("          <td colspan=\"2\"><p align=\"LEFT\"><font size=\"+2\">&nbsp; <marquee>Welcome to the Employee</marquee>&nbsp; </font></p><font\n");
      out.write("              size=\"+2\"></font>\n");
      out.write("          </td>\n");
      out.write("      </tr>\n");
      out.write("   </tbody>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("<form name=\"EmpLogin\" action=\"Instruction.jsp\" method=\"post\">\n");
      out.write(" <div align=\"center\">\n");
      out.write("  <table width=\"80%\" border=\"0\">\n");
      out.write("   <tbody>\n");
      out.write("     <tr><td width=\"45%\">\n");
      out.write("         <br><br><br><br>\n");
      out.write("       <table width=\"35%\" border=\"0\" align=\"center\">\n");
      out.write("         <tbody>\n");
      out.write("           <tr class=\"td5\">\n");
      out.write("             <td><b><font size=\"2\">&nbsp;Employee Id*</b><b>:</b>\n");
      out.write("                 <input type=\"text\" name=\"email\" size=\"30\"></font>\n");
      out.write("             </td>\n");
      out.write("           </tr>\n");
      out.write("           <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("           <tr class=\"td5\">\n");
      out.write("             <td><b><font size=\"2\">&nbsp;&nbsp;&nbsp;&nbsp;Password*</b>\n");
      out.write("             <b>:</b><input type=\"password\" name=\"password\" size=\"30\"></font>\n");
      out.write("             </td>\n");
      out.write("           </tr>\n");
      out.write("           <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("           <tr bgcolor=\"#d5c0fe\" align=\"center\">\n");
      out.write("            <td><font size=\"3\"><input type=\"submit\" value=\"Login\" size=\"30\" onclick=\"return evalidate()\">\n");
      out.write("                </font></td>\n");
      out.write("           </tr>\n");
      out.write("         </tbody>\n");
      out.write("       </table>\n");
      out.write("     </td>\n");
      out.write("    </tr>\n");
      out.write("   </tbody>\n");
      out.write("  </table>\n");
      out.write("    <br><p></p></div></form>\n");
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
