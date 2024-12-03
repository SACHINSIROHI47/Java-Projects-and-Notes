package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class EmpLogin1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("    <title>Online Admission Form of IGNOU </title>\n");
      out.write("\n");
      out.write("    \n");
      out.write("   </head>\n");
      out.write("   \n");
      out.write("<SCRIPT>\n");
      out.write("   \n");
      out.write("    function validate() {\n");
      out.write("if (document.forms[0].email12.value==\"\") {\n");
      out.write(" alert(' Please enter valid Employee Id!');\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (document.forms[0].pass12.value==\"\") {\n");
      out.write("      alert(' Please enter valid Password!');\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("}\n");
      out.write("</SCRIPT>\n");
      out.write("<FORM onSubmit=\"return validate()\">\n");
      out.write("\n");
      out.write(" <body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bgcolor=\"#fff5ee\">\n");
      out.write("     \n");
      out.write("  <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("   <tbody>\n");
      out.write("      <tr bgcolor=\"green\">\n");
      out.write("          <td valign=\"centre\" width=\"10%\" align=\"middle\"> <img alt=\"no image available\"\n");
      out.write("              src=\"images/1.gif\" width=\"80\" height=\"80\"> </td>\n");
      out.write("          <td align=\"middle\"><b><font size=\"+4\" color=\"white\">UNIVERSITY OF IGNOU</font></b></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("          <td colspan=\"2\">&nbsp; </td>\n");
      out.write("      </tr>\n");
      out.write("      <tr class=\"tdheader1\">\n");
      out.write("          <td colspan=\"2\"><p align=\"LEFT\"><font size=\"+2\"><marquee>Welcome to the Employee</marquee></font></p><font\n");
      out.write("              size=\"+2\"></font>\n");
      out.write("          </td>\n");
      out.write("      </tr>\n");
      out.write("   </tbody>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("<form name=\"EmpLogin1\" action=\"\" method=\"post\">\n");
      out.write(" <div align=\"center\">\n");
      out.write("  <table width=\"80%\" border=\"0\">\n");
      out.write("   <tbody>\n");
      out.write("     <tr><td width=\"45%\">\n");
      out.write("         <br><br><br><br>\n");
      out.write("       <table width=\"35%\" border=\"0\" align=\"center\">\n");
      out.write("         <tbody>\n");
      out.write("           <tr class=\"td5\">\n");
      out.write("             <td><b><font size=\"2\">&nbsp;Employee Id*</b><b>:</b>\n");
      out.write("                 <input type=\"text\" name=\"email12\" size=\"30\"></font>\n");
      out.write("             </td>\n");
      out.write("           </tr>\n");
      out.write("           <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("           <tr class=\"td6\">\n");
      out.write("             <td><b><font size=\"2\">&nbsp;&nbsp;&nbsp;&nbsp;Password*</b>\n");
      out.write("             <b>:</b>&nbsp;<input type=\"password\" name=\"pass12\" size=\"30\"></font>\n");
      out.write("             </td>\n");
      out.write("           </tr>\n");
      out.write("           <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("           <tr align=\"center\">\n");
      out.write("            <td><font size=\"3\"><input type=\"submit\" value=\"Login\" size=\"30\" \">\n");
      out.write("                </font></td>\n");
      out.write("           </tr>\n");
      out.write("         </tbody>\n");
      out.write("       </table>\n");
      out.write("     </td>\n");
      out.write("    </tr>\n");
      out.write("   </tbody>\n");
      out.write("  </table>\n");
      out.write("    <br><p></p></div>\n");
      out.write("\n");

String email1=request.getParameter("email12");
String pwd1=request.getParameter("pass12");

     try{
             
    
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn2", "sa", "sirohi");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select * from employee");
       System.out.println("Successfully Run..");

     while(rs.next())
         {
         String email2=rs.getString("empid");
         String pwd2=rs.getString("epwd");
       
                   
               if(email1.equals(email2) && pwd1.equals(pwd2))
                    {            
                        
      out.write("\n");
      out.write("             ");
      if (true) {
        _jspx_page_context.forward("EmpDetails.jsp");
        return;
      }
      out.write("\n");
      out.write("         ");
}
         else
         
      out.write(" <center>");
 out.println("Login Failed,Please Try Again");
      out.write("</center>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("         ");

     }
}catch(Exception e1)
{}


      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("       <br><br><br><br><br><br><br><br><br><br>\n");
      out.write("<table border=\"3\">\n");
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
