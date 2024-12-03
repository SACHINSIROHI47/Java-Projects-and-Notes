package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Automoblie Registration Page</title>\n");
      out.write("<style>\n");
      out.write("   \n");
      out.write("h2{\n");
      out.write(" font-family: Sans-serif; \n");
      out.write(" font-size: 24px;     \n");
      out.write(" font-style: normal; \n");
      out.write(" font-weight: bold; \n");
      out.write(" color: blue;\n");
      out.write(" text-align: center; \n");
      out.write(" text-decoration: underline\n");
      out.write("}\n");
      out.write("table{\n");
      out.write(" font-family: verdana; \n");
      out.write(" color:white; \n");
      out.write(" font-size: 16px; \n");
      out.write(" font-style: normal;\n");
      out.write(" font-weight: bold;\n");
      out.write(" background: linear-gradient(to bottom, #33ccff 0%, #ff99cc 100%);  \n");
      out.write(" border-collapse: collapse; \n");
      out.write(" border: 4px solid #000000;\n");
      out.write(" border-style: dashed;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("table.inner{\n");
      out.write(" border: 10px\n");
      out.write("}\n");
      out.write("input[type=text], input[type=email], input[type=number]{\n");
      out.write(" width: 50%;\n");
      out.write(" padding: 6px 12px;\n");
      out.write(" margin: 5px 0;\n");
      out.write(" box-sizing: border-box;\n");
      out.write("}\n");
      out.write("input[type=submit], input[type=reset]{\n");
      out.write(" width: 15%;\n");
      out.write(" padding: 8px 12px;\n");
      out.write(" margin: 5px 0;\n");
      out.write(" box-sizing: border-box;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" <form>\n");
      out.write("<h2><marquee>Automoblie Registration Page</h2></marquee>\n");
      out.write("<table align=\"center\" cellpadding = \"10\">\n");
      out.write("<tr>\n");
      out.write("<td>First Name</td>\n");
      out.write("<td><input type=\"text\" name=\"FirstName\" maxlength=\"50\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Last Name</td>\n");
      out.write("<td><input type=\"text\" name=\"LastName\" maxlength=\"50\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Email ID</td>\n");
      out.write("<td><input type=\"email\" name=\"EmailI\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Mobile Number</td>\n");
      out.write("<td>\n");
      out.write("<input type=\"text\" name=\"MobileNumber\" maxlength=\"100\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<!---------------------- Gender ------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>Gender</td>\n");
      out.write("<td>\n");
      out.write("<input type=\"radio\" name=\"Gender\" value=\"Male\" />\n");
      out.write("Male\n");
      out.write("<input type=\"radio\" name=\"Gender\" value=\"Female\" />\n");
      out.write("Female\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<!------------------------- Address ---------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>Address<br /><br /><br /></td>\n");
      out.write("<td><textarea name=\"Address\" rows=\"10\" cols=\"50\"></textarea></td>\n");
      out.write("</tr>\n");
      out.write("<!-------------------------- City ------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>City</td>\n");
      out.write("<td><input type=\"text\" name=\"City\" maxlength=\"50\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<!----- -------------------- Pin Code-------------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>Pin Code</td>\n");
      out.write("<td><input type=\"Number\" name=\"PinCode\" maxlength=\"6\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<!---------------------------- State ----------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>State</td>\n");
      out.write("<td><input type=\"text\" name=\"State\" maxlength=\"50\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<!------------------------------ Country --------------------------------->\n");
      out.write("<tr>\n");
      out.write("<td>Country</td>\n");
      out.write("<td><input type=\"text\" name=\"Country\" placeholder=\"India\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"2\" align=\"center\">\n");
      out.write("<input type=\"submit\" value=\"Submit\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("    ");

        try
        {
        String str1,str2,str3,str4,str5,str6,str7,str8,str9,str10;
        str1=request.getParameter("FirstName");
        str2=request.getParameter("LastName");
        str3=request.getParameter("EmailI");
        str4=request.getParameter("MobileNumber");
        str5=request.getParameter("Gender");
        str6=request.getParameter("Address");
        str7=request.getParameter("City");
        str8=request.getParameter("PinCode");
        str9=request.getParameter("State");
        str10=request.getParameter("Country");
      //  out.println(str1+""+str2+""+str3+""+str4+""+str5+""+str6+""+str7+""+str8+""+str9+""+str10);
        String url="jdbc:mysql://localhost:3306/javawebsite";
        String user="root";
        String pass="12345";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,user,pass);
        String sql="insert into registration(Fname,lname,email,mobno,gender,address,city,pincode,state,country) values (?,?,?,?,?,?,?,?,?,?)";
         PreparedStatement prep = con.prepareStatement(sql);
         prep.setString(1,str1);
         prep.setString(2,str2);
         prep.setString(3,str3);
         prep.setString(4,str4);
         prep.setString(5,str5);
         prep.setString(6,str6);
         prep.setString(7,str7);
         prep.setString(8,str8);
         prep.setString(9,str9);
         prep.setString(10,str10);
         prep.executeUpdate();
         prep.close();
        // out.println("record has been save successfully");
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    
      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
