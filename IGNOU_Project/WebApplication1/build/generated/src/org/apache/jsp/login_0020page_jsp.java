package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_0020page_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<form name=\"form\" method=\"post\" onsubmit=\"return validLogin();\">\n");
      out.write("  <br>\n");
      out.write("<center><h1>Student Online Admission(Mici College)</h1></center>>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<title>Mici Meerut(U.P)india </title>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"sky blue\">\n");
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
      out.write("<tr><td></td></tr>\n");
      out.write("<tr>\n");
      out.write("    <td></td>\n");
      out.write("<td>    <input type=\"submit\" name=\"b1\" value=\"LogIn\">\n");
      out.write("   <input type=\"reset\" name=\"r1\" value=\"Reset\" /></td>\n");
      out.write("</tr>\n");
      out.write("</table></center>\n");
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
      
     
         if(user=="" || user==null|| user.trim().isEmpty())
                {
                
      out.write("<center>");
out.println("Plz. Enter Your username");;
      out.write("</center>");

               }
                   if (pass=="" || pass==null || pass.trim().isEmpty())  
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
        _jspx_page_context.forward("LoginSuccess.jsp");
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
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<h2><span><center>Welcome Students</center><strong><font color='Red'></font></strong></span></h2> \n");
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
