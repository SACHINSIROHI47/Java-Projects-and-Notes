package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class StuLogin1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <head>\n");
      out.write("      <title>Online Admission Form of IGNOU </title>\n");
      out.write("\n");
      out.write("     \n");
      out.write("   </head>\n");
      out.write("<SCRIPT>\n");
      out.write("   \n");
      out.write("    function validate() {\n");
      out.write("if (document.forms[0].email.value==\"\") {\n");
      out.write(" alert(' Please enter valid Email Id!');\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (document.forms[0].pass2.value==\"\") {\n");
      out.write("      alert(' Please enter valid Password!');\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("}\n");
      out.write("</SCRIPT>\n");
      out.write(" <form  action=\"\" onSubmit=\"return validate()\" name=\"f11\" method=\"post\">\n");
      out.write("     \n");
      out.write("\n");
      out.write("<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bgcolor=\"orange\" background=\"images/bk.jpg\" width=\"100%\" height=\"100%\">\n");
      out.write("\n");
      out.write("   <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("     <tbody>\n");
      out.write("        <tr bgcolor=\"green\">\n");
      out.write("          <td valign=\"centre\" width=\"10%\" align=\"middle\">\n");
      out.write("              <img alt=\"no image available\" src=\"images/1.gif\" width=\"80\" height=\"80\">\n");
      out.write("          </td>\n");
      out.write("          <td align=\"middle\"><b><font size=\"+4\" color=\"white\">UNIVERSITY OF IGNOU</font></b>\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr class=\"tdheader1\">\n");
      out.write("         <td colspan=\"2\" bgcolor=\"gray\"><p align=\"LEFT\"><font size=\"+2\" ><marquee> Welcome to the Student</marquee> </font></p>\n");
      out.write("          <font size=\"+2\"></font>\n");
      out.write("         </td>\n");
      out.write("        </tr>\n");
      out.write("      </tbody>\n");
      out.write("    </table>\n");
      out.write("      <table><tr >\n");
      out.write("           <td>\n");
      out.write("                <marquee><img src=\"images/p2.jpg\"><img src=\"images/p3.jpg\"><img src=\"images/p4.jpg\"><marquee>\n");
      out.write("            \n");
      out.write("        </td>\n");
      out.write("          <td>\n");
      out.write("                <img src=\"images/p5.jpg\"><img src=\"images/2.jpg\"><img src=\"images/p10.jpg\">\n");
      out.write("            \n");
      out.write("        </td>\n");
      out.write("        <td>\n");
      out.write("                <marquee><img src=\"images/p1.jpg\"><img src=\"images/p9.jpg\"><img src=\"images/p10.jpg\"><img src=\"images/p11.jpg\"><img src=\"images/p4.jpg\"><img src=\"images/p5.jpg\"><marquee>\n");
      out.write("            \n");
      out.write("        </td></tr></table> \n");
      out.write("\n");
      out.write("\n");
      out.write("  <div align=\"center\">\n");
      out.write("   <table width=\"80%\" border=\"0\">\n");
      out.write("      <tbody>\n");
      out.write("         <tr>\n");
      out.write("            <td width=\"45%\">\n");
      out.write("             <br><br><br><br>\n");
      out.write("               <table width=\"35%\" border=\"0\" align=\"center\">\n");
      out.write("                 <tbody>\n");
      out.write("                   <tr class=\"td5\">\n");
      out.write("                      <td><font size=\"2\">&nbsp;&nbsp;&nbsp;&nbsp;Email ID*\n");
      out.write("                              <b>:</b><input type=\"text\" name=\"email\" size=\"30\"></font>\n");
      out.write("                      </td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr class=\"td5\">\n");
      out.write("                      <td><font size=\"2\">&nbsp;Password*<b>:</b>\n");
      out.write("                          <input type=\"password\" name=\"pass2\" size=\"30\"></font>\n");
      out.write("                      </td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr bgcolor=\"mergenta\">\n");
      out.write("                      <td><font size=\"3\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                           &nbsp;&nbsp;<input type=\"submit\" value=\"Login\" size=\"30\">\n");
      out.write("                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                          <a href=\"Registration.jsp\"><font size=\"4\">&nbsp;New User Registration</font></a>\n");
      out.write("                 </td>\n");
      out.write("               </tr>\n");
      out.write("                 </tbody>\n");
      out.write("               </table>\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("        </tbody>\n");
      out.write("      </table>\n");
      out.write("      ");

    String id=request.getParameter("email");
    
    String pwd=request.getParameter("pass2");
    Connection con;
    Statement st;
    ResultSet rs;
    try
    {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("Jdbc:Odbc:mydsn2","sa","sirohi");
         st=con.createStatement();
         rs=st.executeQuery("select * from registration2 where emailid='"+id+"' and createpwd='"+pwd+"' ");
        
             while(rs.next())
             {
              String str1=rs.getString(10);
              String str2=rs.getString(11);
               
                if(id.trim().isEmpty())
                {
                
      out.write("<center>");
out.println("Plz. Enter Your username");
      out.write("</center>");

               }
             
                    if(pwd.trim().isEmpty())
                   {
                    
      out.write("<center>");
out.println("Plz. Enter Your Password");
      out.write("</center>");

             
                   
                    }
              
             if(id.equals(str1)&& pwd.equals(str2))
                 {
                 
      if (true) {
        _jspx_page_context.forward("Std_Details.jsp");
        return;
      }

                  
                 }
                 else
                     {
                     out.println("Enter the correct EmailID and Password");
                     break;
                     }
                     }
                 
            
     }catch(Exception e){}
    
      out.write("\n");
      out.write("      \n");
      out.write("     <br><p></p></div></form><br><br>\n");
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
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write(" </body>\n");
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
