package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class loginpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<div>\n");
      out.write("    \n");
      out.write("  <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("      <tbody>\n");
      out.write("          <tr bgcolor=\"blue\">\n");
      out.write("             <td valign=\"centre\" width=\"10%\" align=\"middle\">\n");
      out.write("                 <img alt=\"no image available\"  src=\"images/1.gif\" width=\"100\" height=\"100\">\n");
      out.write("             </td>\n");
      out.write("             <td align=\"middle\"><b><font size=\"+4\" color=\"white\">UNIVERSITY OF IGNOU</font></b>\n");
      out.write("             </td>\n");
      out.write("          </tr>\n");
      out.write("          </table>\n");
      out.write("</div>\n");
      out.write("<center><h1><marquee>Online Admission System </marquee></h1></center>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("<title>Online Admission Form of IGNOU </title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("</HEAD>\n");
      out.write("\n");
      out.write("\n");
      out.write("<SCRIPT>\n");
      out.write("function validate() {\n");
      out.write("if (document.forms[0].t1.value==\"\") {\n");
      out.write("alert(\"Please Enter the Name !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (document.forms[0].t2.value==\"\") {\n");
      out.write("alert(\"Please Enter the Password !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("alert(\"Welcome!\");\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("</SCRIPT>\n");
      out.write("<FORM onSubmit=\"return validate()\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<body bgcolor=\"blue\">\n");
      out.write("<form name=\"f1\" method=\"post\">\n");
      out.write("<center><table>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("<tr>    \n");
      out.write("  \n");
      out.write("    <td> <center><b>User Name<b></b></center></td><td><center><input type=\"text\" name=\"t1\" ></center></td>\n");
      out.write("</tr>  <br>\n");
      out.write("<center><td><b>Password</b></td></center>\n");
      out.write("<center><td><input type=\"password\" name=\"t2\" value=\"\" /></center>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr><td></td></tr>\n");
      out.write("<tr>\n");
      out.write("    <td></td>\n");
      out.write("<td>    <input type=\"submit\" name=\"b1\" value=\"LogIn\">\n");
      out.write("   <input type=\"reset\" name=\"r1\" value=\"Reset\" /></td>\n");
      out.write("</tr>\n");
      out.write("</table></center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String user=request.getParameter("t1");
String pass=request.getParameter("t2");

     try{
             
    
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn2", "sa", "sirohi");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select * from loginpage");
        

     while(rs.next())
         {
         String username=rs.getString(1);
         String password=rs.getString(2);
       // if ((username=="" ||username==null) &&(password==""|| password==null)) {
 
                //out.println("No Data_values are exist in database ");
           // }
      
     
         //if(user=="" || user==null|| user.trim().isEmpty())
                
                if(user.trim().isEmpty())
                {
                
      out.write("<center>");
out.println("Plz. Enter Your username");;
      out.write("</center>");

               }
                   //if (pass=="" || pass==null || pass.trim().isEmpty())  
                    if(pass.trim().isEmpty())
                   {
                    
      out.write("<center>");
out.println("Plz. Enter Your Password");
      out.write("</center>");

             
                   
                    }
                   
               if(user.equals(username) && pass.equals(password))
        // if (user.toLowerCase().trim().equals(username) && pass.toLowerCase().trim().equals(password)) 
             
               { 
             
            // System.out.println("Connection Establish successfully...valuesmatch");
             
      out.write("\n");
      out.write("             ");
      if (true) {
        _jspx_page_context.forward("Registration.jsp");
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
      out.write("<br><br><br><br><br><br>\n");
      out.write("  <table border=\"3\">\n");
      out.write("    <tr>\n");
      out.write("      <td valign=\"centre\" width=\"10%\" align=\"middle\"><b>\n");
      out.write("          Welcome Dear Students<br><br> University\n");
      out.write("          of IGNOU Provide you several kind of programme. </b><br><br><b>For Registration Wish you all the best.</b>\n");
      out.write("      </td>\n");
      out.write("     </tr>\n");
      out.write("   </table>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
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