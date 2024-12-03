package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class examplerecord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <form name=\"frm\" method=\"post\">\n");
      out.write("        <body>\n");
      out.write("            Name :-<input type=\"text\"  name=\"f1\" size=\"20\" value=\"\">\n");
      out.write("             <input type=\"submit\" name=\"bt\" value=\"LogIn\">\n");
      out.write("           \n");
      out.write("            \n");
      out.write("             \n");
      out.write("            \n");
      out.write("        </body>\n");
      out.write("        \n");
      out.write("          ");

          String tt=request.getParameter("f1");

     try{
         
         
       Connection con;
    Statement st;
    ResultSet rs;
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("Jdbc:Odbc:mydsn","sa","sirohi");
    st=con.createStatement();
    rs=st.executeQuery("select * from onlinereg");            
         

      out.write("\n");
      out.write("        \n");
      out.write("           <table border=\"\"  align=\"center\" >\n");
      out.write("        <tr>\n");
      out.write("      <th>Registration No</th>     \n");
      out.write("      <th>First Name</th><th>Last Name</th>\n");
      out.write("      <th>Date Of Birth</th>\n");
      out.write("      <th>Mobile No</th><th>Category</th>\n");
      out.write("      <th>Date Of Registration</th><th>Amount of Application Fees</th>\n");
      out.write("      </th>   \n");
      out.write("    \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("     ");

        
        while(rs.next())
        {
        
      out.write("\n");
      out.write("       \n");
      out.write("            <tr>\n");
      out.write("                <td> ");
rs.getString(1);
      out.write(" </td>\n");
      out.write("                <td> ");
rs.getString(2);
      out.write(" </td>\n");
      out.write("                <td> ");
rs.getString(3);
      out.write(" </td>\n");
      out.write("                <td> ");
rs.getString(4);
      out.write(" </td>\n");
      out.write("                <td> ");
rs.getString(5);
      out.write(" </td>\n");
      out.write("                <td> ");
rs.getString(6);
      out.write(" </td>\n");
      out.write("                <td> ");
rs.getString(7);
      out.write(" </td>\n");
      out.write("                <td> ");
rs.getString(8);
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("      \n");
      out.write("    ");
} 
      out.write("\n");
      out.write("      \n");
      out.write("  ");
 
  }
     catch(Exception e1)
     { }
     
   
      out.write("\n");
      out.write("    </form>>\n");
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
