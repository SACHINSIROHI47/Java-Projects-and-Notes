package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.lang.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("<form    action=\"\"  name=\"f11\" method=\"post\" >\n");
      out.write("EmailID<input type=\"text\" name=\"email\" size=\"30\">\n");
      out.write("                      Password*<input type=\"password\" name=\"pass2\" size=\"30\"></font>\n");
      out.write("                      <input type=\"submit\" value=\"Login\" size=\"30\">\n");
      out.write("                      <select name=\"pass3\" size=\"1\">\n");
      out.write("                          <option value=\"eid\">eid</option>\n");
      out.write("                           <option value=\"sachin@gmail.com\">sachin@gmail.com</option>\n");
      out.write("                      </select>\n");
      out.write("\n");
      out.write("    ");

    String id2=request.getParameter("pass3");
    out.println(id2);
    String id=request.getParameter("email");
    String pwd=request.getParameter("pass2");
    Connection con;
    Statement st;
    ResultSet rs;
    try
    {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("Jdbc:Odbc:mydsn","sa","sirohi");
    st=con.createStatement();
    rs=st.executeQuery("select * from registration where emailid='"+id2+"' and createpwd='"+pwd+"'");
    
      out.write("\n");
      out.write("    <table border=1 align=center>\n");
      out.write("        <tr><th>Email Id</th><th>Password</th></tr>\n");
      out.write("        ");

        while(rs.next())
        {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(rs.getString("emailid"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("createpwd"));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("    ");

    }catch(Exception e){}
    
      out.write("\n");
      out.write("</form>                        \n");
      out.write(" </body>\n");
      out.write("</html>\n");
      out.write("    ");
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
