package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Login_0020Form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .contin{\n");
      out.write("                color: black;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 30px;\n");
      out.write("                box-sizing: content-box;\n");
      out.write("  width: 1000px;\n");
      out.write("  border: 5px solid black;\n");
      out.write("  \n");
      out.write("  margin-left: 300px;\n");
      out.write("  background-image: url(image//img6.jpg)\n");
      out.write("            } \n");
      out.write("            input[type=text] {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Form</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:powderblue;\">\n");
      out.write("        \n");
      out.write("        <h1 style=\"text-align:center;\">Insurance login form!</h1>\n");
      out.write("        <form>\n");
      out.write("        <div class=\"contin\">\n");
      out.write("        First Name:<input type=\"text\" name=\"username\" size=\"30\"/><br/><br/>\n");
      out.write("        Password: &nbsp;<input type=\"text\" name=\"password\" size=\"30\"/><br/><br/>\n");
      out.write("        <input style=\"font-size: 25px;\" type=\"submit\" value=\"Submit\"/>\n");
      out.write("        \n");
      out.write("        ");

            try
            {
                Statement st;
                ResultSet rs;
                String str1,str2,ustr=null,pstr=null;
                str1=request.getParameter("username");
                str2=request.getParameter("password");
                String url="jdbc:mysql://localhost:3306/javawebsite";
                String user="root";
                String pass="12345";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection(url, user, pass);
                st=con.createStatement();
                rs=st.executeQuery("select username,passwd from login");
                while(rs.next())
                {
                    ustr=rs.getString("username");
                    pstr=rs.getString("passwd");
                    
                }
              //  out.println(ustr+" "+pstr);
               // out.println(str1+""+str2);
                if(str1.equals(ustr)&& str2.equals(pstr))
                {
                    out.println("Login Successfully");
                    
      out.write("\n");
      out.write("                    ");
      if (true) {
        _jspx_page_context.forward("Registration.jsp");
        return;
      }
      out.write("\n");
      out.write("                    ");

                }
                else
                {
                    out.println("Login UnSuccessfully");
                }
                }
                catch(Exception ex)
                {
                        
                   ex.printStackTrace();    
                    }
                    
        
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
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
