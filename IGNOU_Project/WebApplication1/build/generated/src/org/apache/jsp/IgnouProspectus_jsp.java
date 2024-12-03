package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class IgnouProspectus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("      \n");
      out.write("<title>Online Admission Form of IGNOU </title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bgcolor=\"#fff5ee\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <tbody><tr bgcolor=\"black\"> \n");
      out.write("    <td align=\"middle\" valign=\"centre\" width=\"10%\"> \n");
      out.write("        <img height=\"50\" src=\"images/ignou-new.png\" width=\"50\"> \n");
      out.write("    </td>\n");
      out.write("    <td align=\"middle\"><font color=\"white\" size=\"+3\" name=\"verdana\">INDIRA GANDHI NATIONAL OPEN UNIVERSITY</font>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr><td colspan=\"2\">&nbsp; </td></tr>\n");
      out.write("  <tr class=\"tdheader\" bgcolor=\"#00bfff\" height=\"10%\">\n");
      out.write("\n");
      out.write("<td colspan=\"2\" height=\"10%><p align=\"center\"><font size=\"+2\"><marquee behaviour=\"alternate\">Welcome To the Prospectus Deatils Form</marquee> </font></p>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("<table align=\"center\" >\n");
      out.write("       <tr>\n");
      out.write("           \n");
      out.write("                  <td bgcolor=\"mergenta\" >\n");
      out.write("                     <a href=\"onlineadmissionform.jsp\"><font size=\"4\">&nbsp;Home Page&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("                 <td bgcolor=\"mergenta\">\n");
      out.write("                     <a href=\"AdmLogin.jsp\"><font size=\"4\">&nbsp;Administration&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("                 <td bgcolor=\"mergenta\">\n");
      out.write("                     <a href=\"Regionalcenter.jsp\"><font size=\"4\">&nbsp;RegionalCenter&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("                 <td bgcolor=\"mergenta\"><a href=\"Studycenter.jsp\"><font size=\"4\">&nbsp;Study center&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("           <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"AboutUs2.jsp\"><font size=\"4\">About IGNOU  </font></a>\n");
      out.write("                \n");
      out.write("              </td>\n");
      out.write("              <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"Online_Admission.jsp\"><font size=\"4\">Online Registration  </font></a>\n");
      out.write("                \n");
      out.write("              </td>\n");
      out.write("            \n");
      out.write("             <td bgcolor=\"mergenta\" >\n");
      out.write("               <a href=\"Sitemap2.jsp\"><font size=\"4\">&nbsp;Site Map  &nbsp; </font></a>\n");
      out.write("                </td>\n");
      out.write("           <td bgcolor=\"mergenta\" >\n");
      out.write("               \n");
      out.write("                <a href=\"Contact2.jsp\"><font size=\"4\">&nbsp;Contact Us  &nbsp;&nbsp; </font></a>\n");
      out.write("             \n");
      out.write("              </td>\n");
      out.write("           <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"programmesearch.jsp\"><font size=\"4\">&nbsp;Courses Details &nbsp; </font></a>\n");
      out.write("               \n");
      out.write("              </td>\n");
      out.write("               <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"All_Programme.jsp\"><font size=\"4\">&nbsp;All Programme&nbsp; </font></a>\n");
      out.write("               \n");
      out.write("              </td>\n");
      out.write("               \n");
      out.write("               </tr>\n");
      out.write("            \n");
      out.write("            </table>\n");
      out.write("<form action=\"\" name=\"f10\" method=\"post\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("       \n");
      out.write("              \n");
      out.write("              <div> <a href=\"Prospectus.pdf\" align=\"right\"><font size=\"+2\"> Download Prospectus Details</font></a></div>\n");
      out.write("          \n");
      out.write("       <br>\n");
      out.write("              \n");
      out.write("             <div> <a href=\"MASTERS.doc\" align=\"right\"><font size=\"+2\"> Download DateSheet</font></a></div>\n");
      out.write("          \n");
      out.write("       <br>    \n");
      out.write("             <div> <a href=\"Revised programme fee_July 2013 (1).xls\"><font size=\"+2\">Revised programme fee_July 2013</font> </a><div>\n");
      out.write("   \n");
      out.write("        <br>    \n");
      out.write("             <div> <a href=\"paper\\MCS-011.pdf\"><font size=\"+2\">Download Previous Question Paper</font> </a><div>\n");
      out.write("        <br>     \n");
      out.write("             \n");
      out.write("             <div> <a href=\"Examform.pdf\"><font size=\"+2\">Download Exam Form</font> </a><div>\n");
      out.write("                 <br>     \n");
      out.write("             \n");
      out.write("             <div> <a href=\"feedetail.docx\"><font size=\"+2\">Download Fee Details for other Counrty Students</font> </a><div>\n");
      out.write("        \n");
      out.write("        <br> <br> <br> <br> <br>\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
