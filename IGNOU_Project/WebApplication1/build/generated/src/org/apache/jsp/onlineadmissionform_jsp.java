package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class onlineadmissionform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <title> \n");
      out.write("Online Admission Form of IGNOU </title>\n");
      out.write("\n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write(" <form action=\"\" method=\"post\">\n");
      out.write("   <body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bgcolor=\"#fff5ee\"  width=\"100%\" height=\"100%\">\n");
      out.write("     <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("      <tbody>\n");
      out.write("          <tr bgcolor=\"black\">\n");
      out.write("             <td valign=\"centre\" width=\"10%\" align=\"middle\">\n");
      out.write("                 <img alt=\"no image available\"  src=\"images/1.gif\" width=\"80\" height=\"80\">\n");
      out.write("             </td>\n");
      out.write("             <td align=\"middle\"><marquee behavior=\"alternate\" scrollamount=\"3\"> <b><font size=\"+4\" color=\"white\">UNIVERSITY OF IGNOU</font></b>\n");
      out.write("             </marquee></td>\n");
      out.write("          </tr>          \n");
      out.write("          <tr class=\"tdheader1\">\n");
      out.write("            <td bgcolor=\"#00bfff\" colspan=\"2\"><p align=\"center\"><font size=\"+2\"><marquee> Welcome To Online Admission&nbsp;\n");
      out.write("                        </marquee></font></p><font size=\"+2\"></font>\n");
      out.write("            </td>   \n");
      out.write("          </tr>\n");
      out.write("         </tbody>\n");
      out.write("      </table>\n");
      out.write("      \n");
      out.write("      <table align=\"center\" >\n");
      out.write("       <tr>\n");
      out.write("           \n");
      out.write("                 <td bgcolor=\"mergenta\" >\n");
      out.write("                     <a href=\"AdmLogin.jsp\"><font size=\"4\">&nbsp;Administrator&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("                 <td bgcolor=\"mergenta\">\n");
      out.write("                     <a href=\"Regionalcenter.jsp\"><font size=\"4\">&nbsp;RegionalCenter&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("                 <td bgcolor=\"mergenta\">\n");
      out.write("                     <a href=\"Studycenter.jsp\"><font size=\"4\">&nbsp;StudyCenter&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("                 <td bgcolor=\"mergenta\"><a href=\"Online_Admission.jsp\"><font size=\"4\">&nbsp;Online Registration&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("           <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"AboutUs2.jsp\"><font size=\"4\">&nbsp;About IGNOU  &nbsp; </font></a>\n");
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
      out.write("               <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"IgnouProspectus.jsp\"><font size=\"4\">&nbsp;Student Zone&nbsp; </font></a>\n");
      out.write("               \n");
      out.write("              </td>\n");
      out.write("               </tr>\n");
      out.write("            \n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("      <table><tr >\n");
      out.write("       <td>\n");
      out.write("                <img src=\"imag2/05.jpg\">\n");
      out.write("            \n");
      out.write("        </td>\n");
      out.write("          \n");
      out.write("          <td><img src=\"imag2/01.jpg\">\n");
      out.write("        </td>\n");
      out.write("          <td>\n");
      out.write("               <img src=\"imag2/02.jpg\">\n");
      out.write("            \n");
      out.write("        </td>\n");
      out.write("          <td>\n");
      out.write("                <img src=\"imag2/03.jpg\">\n");
      out.write("            \n");
      out.write("        </td>\n");
      out.write("        <td>\n");
      out.write("                <marquee><img src=\"imag2/06.jpg\"><img src=\"imag2/07.jpg\"><img src=\"imag2/08.jpg\"><img src=\"imag2/09.jpg\"><img src=\"imag2/010.jpg\">\n");
      out.write("                <img src=\"imag2/011.jpg\"><img src=\"imag2/012.jpg\"><img src=\"imag2/013.jpg\">><img src=\"imag2/014.jpg\"><marquee>\n");
      out.write("            \n");
      out.write("        </td></tr>\n");
      out.write("     \n");
      out.write("    </table> \n");
      out.write("      \n");
      out.write("    <font size=\"+3\" color=\"blue\"><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    Latest News</b></font>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("         \n");
      out.write("                <table width=\"100%\" border=\"0\">\n");
      out.write("                    <tr>\n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("                        <td width=\"75%\">  \n");
      out.write("                            <div>&nbsp;&nbsp;&nbsp;<font size=\"+2\" color=\"Black\"><b>About IGNOU Established</b></font></div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <p>&nbsp;&nbsp;The Indira Gandhi National Open University (IGNOU), established by an Act of Parliament in 1985, has continuously striven to build an inclusive knowledge society through inclusive education. It has tried to&nbsp;&nbsp; increase the Gross Enrollment Ratio (GER) by offering high-quality teaching through the Open and Distance Learning (ODL) mode.</p>\n");
      out.write("                            <p>The University began by offering two academic programmes in 1987, i.e., Diploma in Management and Diploma in Distance Education, with a strength of 4,528 students.</p>\n");
      out.write("                            <p>Today, it serves the educational aspirations of over 4 million students in India and 36 other countries through 21 Schools of Studies and a network of 67 regional centres, around 3,000 learner support centres and 67 overseas centres. The University offers about 490 certificate, diploma, degree and doctoral programmes, with a strength of nearly 420 faculty members and academic staff at the headquarters and regional centres and about 36,000 academic counsellors from conventional institutions of higher learning, professional organisations, and industry among others.</p>\n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("                  \n");
      out.write("               \n");
      out.write("    \n");
      out.write("            <td width=\"25%\" bgcolor=\" light pink\" >\n");
      out.write("                \n");
      out.write("                <marquee direction =\"up\">\n");
      out.write("                    \n");
      out.write("                <font  color=\"blue\"><b>Datesheet for TermEnd Examination June2013</b></font><br>\n");
      out.write("                <font  color=\"red\"><b>Hall Ticket April-2013 MCA/BCA/BHM/BAIHA</b></font><br>\n");
      out.write("                 <font  color=\"green\"><b>Revised Fee Details</b></font><br>\n");
      out.write("                  <font  color=\"dark yellow\"><b>Hall Ticket April-2013 MCA/BCA/BHM/BAIHA</b></font><br>\n");
      out.write("                  <font  color=\"sky blue\"><b>Result Of Term End Examination</b></font><br>\n");
      out.write("                  <font  color=\"yellow\"><b>Attendance April-2013 MCA/BCA/BHM/BAIHAt</b></font><br>\n");
      out.write("                  <font  color=\"pink\"><b>Revised Schedule of Submission of june 2013 TEE Exam Form(Rc Noida</b></font><br>\n");
      out.write("                  <font  color=\"blue\"><b>PGDCC Entrance Examination Result</b></font><br>\n");
      out.write("                  <font  color=\"green\"><b>B.ED Prospectus for the January 2014 session</b></font><br>\n");
      out.write("                  <font  color=\"red\"><b>Two Day National Seminar on Translation and Discourses of Power in Preview Theare, EMPC </b></font><br>\n");
      out.write("                  <font  color=\"blue+red\"><b>Counselling schedule of IGNOU SC 1604 (VAZE COLLEGE) under RC Mumbai</b></font><br>\n");
      out.write("                  <font  color=\"light green\"><b>Allowing old students of BCA(pre-revised sylb.) to complete their degree by Dec.2013 TEE</b></font><br>\n");
      out.write("                  <font  color=\"white\"><b>Admission alert</b></font><br>\n");
      out.write("                  <font  color=\"red\"><b>MBA Entrance Notification</b></font><br>\n");
      out.write("                  <font  color=\"green\"><b>Revised Course syllabus </b></font><br>\n");
      out.write("                  <font  color=\"blue\"><b>Online Registration alert</b></font><br>\n");
      out.write("                  <font  color=\"pink\"><b>Entrance Result</b></font><br>\n");
      out.write("                  <font  color=\"yellow\"><b>PHD seminar Notification</b></font><br>\n");
      out.write("                \n");
      out.write("            </marquee>           \n");
      out.write("                    \n");
      out.write("              \n");
      out.write("            </td>\n");
      out.write("           </tr>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("      \n");
      out.write("   \n");
      out.write("     <p></p></div></form>\n");
      out.write("     \n");
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
