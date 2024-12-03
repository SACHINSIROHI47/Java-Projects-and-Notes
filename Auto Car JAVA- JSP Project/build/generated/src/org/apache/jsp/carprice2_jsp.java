package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class carprice2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"border: 1px solid black; width: 300px; background-color: orangered;\">\n");
      out.write("        <label>First Name</label>\n");
      out.write("        <input type=\"text\" name=\"FirstName\" maxlength=\"50\"/><br/><br/>\n");
      out.write("        <label>Enail</label>&nbsp; &nbsp; &nbsp;  &nbsp; &nbsp;          \n");
      out.write("        <input type=\"email\" name=\"EmailI\"/><br/><br/>\n");
      out.write("        <label>phone no</label>&nbsp; &nbsp; \n");
      out.write("        <input type=\"text\" name=\"MobileNumber\" maxlength=\"100\"/><br/><br/>\n");
      out.write("        <input type=\"submit\" value=\"submit\"/>\n");
      out.write("        </div>\n");
      out.write("         ");

        try
        {
        String str1,str3,str4;
        str1=request.getParameter("FirstName");
        str3=request.getParameter("EmailI");
        str4=request.getParameter("MobileNumber");
      //  out.println(str1+""+str2+""+str3+""+str4+""+str5+""+str6+""+str7+""+str8+""+str9+""+str10);
        String url="jdbc:mysql://localhost:3306/javawebsite";
        String user="root";
        String pass="12345";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,user,pass);
        String sql="insert into registration(Fname,lname,email,mobno,gender,address,city,pincode,state,country) values (?,?,?,?,?,?,?,?,?,?)";
         PreparedStatement prep = con.prepareStatement(sql);
         prep.setString(1,str1);
        
         prep.setString(3,str3);
         prep.setString(4,str4);
         
         prep.executeUpdate();
         prep.close();
        // out.println("record has been save successfully");
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
