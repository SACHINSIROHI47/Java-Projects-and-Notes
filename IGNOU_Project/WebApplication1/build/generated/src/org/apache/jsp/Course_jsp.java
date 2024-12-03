package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.lang.*;

public final class Course_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Online Admission Form of IGNOU</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body bgcolor=\"orange\">\n");
      out.write("\n");
      out.write("\n");
      out.write(" <form name=\"f6\" method=\"post\">\n");
      out.write("      \n");
      out.write("        <table width=\"100%\" height=\"100%\">\n");
      out.write("            <tr bgcolor=\"green\" width=\"100%\" height=\"100%\">\n");
      out.write("                <td align=\"middle\" ><b><font size=\"+4\" color=\"white\">UNIVERSITY OF IGNOU</font></b>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td colspan=\"2\"><p align=\"LEFT\" ><font size=\"+2\" color=\"white\"> <marquee>COURSES/PROGRAMME DETAILS</marquee> </font></p>\n");
      out.write("                    <font size=\"+2\"></font>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("                   <table>\n");
      out.write("                        <br><br><br><br><tr><td><font size=\"+2\" color=\"white\"><b>*Programme Stream</b> \n");
      out.write("                             \n");
      out.write("                              &nbsp;&nbsp;&nbsp;<b>:</b></font>\n");
      out.write("                           <select name=\"p1\" size=\"1\" >\n");
      out.write("                               <option value=\"\">-Programme-</OPTION><option value=\"PGDCA\">PGDCA</OPTION>\n");
      out.write("                               <option value=\"BCA\">BCA</OPTION><option value=\"MCA\">MCA</OPTION>\n");
      out.write("                               <option value=\"BBA\">BBA</OPTION><option value=\"MBA\">MBA</OPTION>\n");
      out.write("                               <option value=\"B.Com\">B.Com</OPTION><option value=\"M.Com\">M.Com</OPTION>\n");
      out.write("                               <option value=\"BA\">BA</OPTION><option value=\"MA\">MA</OPTION>\n");
      out.write("                               <option value=\"B.Sc\">B.Sc</OPTION><OPTION VALUE=\"M.Sc\">M.Sc</OPTION>\n");
      out.write("                              \n");
      out.write("                           </select>\n");
      out.write("                       </td>\n");
      out.write("                       <tr>\n");
      out.write("                           <td width=\"20%\" height=\"20%\">\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><input type=\"submit\" value=\"LogIn\" size=\"+2\" ></b></tr>\n");
      out.write("               </td></tr></TABLE>\n");
      out.write("\n");
      out.write("    ");

    String id2=request.getParameter("p1");
    //out.println(id2);
   // String id=request.getParameter("email");
    //String pwd=request.getParameter("pass2");
    Connection con;
    Statement st;
    ResultSet rs;
    try
    {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("Jdbc:Odbc:mydsn2","sa","sirohi");
    st=con.createStatement();
    rs=st.executeQuery("select * from course where p_name='"+id2+"'");
    
      out.write("\n");
      out.write("    <br><br>\n");
      out.write("    <table border=1>\n");
      out.write("        <tr><th>P_Name</th><th>P_Qualification</th><th>p_Duration</th><th>p_Fee</th></tr>\n");
      out.write("        ");

        while(rs.next())
        {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("             <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("              <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("    ");

    }catch(Exception e){}
    
      out.write("\n");
      out.write("    \n");
      out.write("      </form>\n");
      out.write("       <br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
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
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
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
