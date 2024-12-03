package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ree_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body {  \n");
      out.write("\n");
      out.write("  background: #C5E1A5; \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(" form {  \n");
      out.write("\n");
      out.write("   width: 30%;  \n");
      out.write("\n");
      out.write("   margin: 60px auto;  \n");
      out.write("\n");
      out.write("   background: #efefef;  \n");
      out.write("\n");
      out.write("   padding: 60px 120px 80px 120px;  \n");
      out.write("\n");
      out.write("   text-align: center;  \n");
      out.write("\n");
      out.write("   -webkit-box-shadow: 2px 2px 3px rgba(0,0,0,0.1); \n");
      out.write("\n");
      out.write("   box-shadow: 2px 2px 3px rgba(0,0,0,0.1); \n");
      out.write("\n");
      out.write("}\n");
      out.write("label {  \n");
      out.write("\n");
      out.write("  display: block;  \n");
      out.write("\n");
      out.write("  position: relative;  \n");
      out.write("\n");
      out.write("  margin: 40px 0px; \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(" .label-txt {  \n");
      out.write("\n");
      out.write("   position: absolute;  \n");
      out.write("\n");
      out.write("   top: -1.6em;  \n");
      out.write("\n");
      out.write("   padding: 10px;  \n");
      out.write("\n");
      out.write("   font-family: sans-serif;  \n");
      out.write("\n");
      out.write("   font-size: .8em;  \n");
      out.write("\n");
      out.write("   letter-spacing: 1px;  \n");
      out.write("\n");
      out.write("   color: rgb(120,120,120);  \n");
      out.write("\n");
      out.write("   transition: ease .3s; \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(" .input {  \n");
      out.write("\n");
      out.write("   width: 100%;  \n");
      out.write("\n");
      out.write("   padding: 10px;  \n");
      out.write("\n");
      out.write("   background: transparent;  \n");
      out.write("\n");
      out.write("   border: none;  \n");
      out.write("\n");
      out.write("   outline: none; \n");
      out.write("\n");
      out.write(" }\n");
      out.write(".line-box {  \n");
      out.write("\n");
      out.write("  position: relative;  \n");
      out.write("\n");
      out.write("  width: 100%;  \n");
      out.write("\n");
      out.write("  height: 2px;  \n");
      out.write("\n");
      out.write("  background: #BCBCBC; \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(" .line {  \n");
      out.write("\n");
      out.write("   position: absolute;  \n");
      out.write("\n");
      out.write("   width: 0%;  \n");
      out.write("\n");
      out.write("   height: 2px;  \n");
      out.write("\n");
      out.write("   top: 0px;  \n");
      out.write("\n");
      out.write("   left: 50%;  \n");
      out.write("\n");
      out.write("   transform: translateX(-50%);  \n");
      out.write("\n");
      out.write("   background: #8BC34A;  \n");
      out.write("\n");
      out.write("   transition: ease .6s; \n");
      out.write("\n");
      out.write("}  \n");
      out.write("\n");
      out.write("\n");
      out.write(" .input:focus + .line-box .line {  \n");
      out.write("\n");
      out.write("   width: 100%; \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(" .label-active {  \n");
      out.write("\n");
      out.write("   top: -3em; \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(" button {  \n");
      out.write("\n");
      out.write("   display: inline-block; \n");
      out.write("\n");
      out.write("   padding: 12px 24px;  \n");
      out.write("\n");
      out.write("   background: rgb(220,220,220);  \n");
      out.write("\n");
      out.write("   font-weight: bold;  \n");
      out.write("\n");
      out.write("   color: rgb(120,120,120);  \n");
      out.write("\n");
      out.write("   border: none;  outline: none;  \n");
      out.write("\n");
      out.write("   border-radius: 3px;  \n");
      out.write("\n");
      out.write("   cursor: pointer;  \n");
      out.write("\n");
      out.write("   transition: ease .3s; \n");
      out.write("\n");
      out.write("}  \n");
      out.write("\n");
      out.write("\n");
      out.write(" button:hover {  \n");
      out.write("\n");
      out.write("   background: #8BC34A;  \n");
      out.write("\n");
      out.write("   color: #ffffff; \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("       <div>   \n");
      out.write("\n");
      out.write("          <form>    \n");
      out.write("\n");
      out.write("            <h4 class=\"text-warning text-center pt-5\">Registration Page</h4>  \n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <label>     \n");
      out.write("\n");
      out.write("              <input type=\"text\" class=\"input\" name=\"email\" placeholder=\"EMAIL\"/>                   <div class=\"line-box\">          \n");
      out.write("\n");
      out.write("              <div class=\"line\"></div>        \n");
      out.write("\n");
      out.write("              </div>    \n");
      out.write("\n");
      out.write("            </label>     \n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <label>     \n");
      out.write("\n");
      out.write("              <input \n");
      out.write("\n");
      out.write("                     type=\"text\" \n");
      out.write("\n");
      out.write("                     class=\"input\" \n");
      out.write("\n");
      out.write("                    name=\"username\"        \n");
      out.write("\n");
      out.write("                     placeholder=\"USERNAME\"/>        \n");
      out.write("\n");
      out.write("              <div class=\"line-box\">         \n");
      out.write("\n");
      out.write("                <div class=\"line\"></div>        \n");
      out.write("\n");
      out.write("              </div>    \n");
      out.write("\n");
      out.write("            </label>     \n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <label>     \n");
      out.write("\n");
      out.write("              <input \n");
      out.write("\n");
      out.write("                     type=\"password\" \n");
      out.write("\n");
      out.write("                     class=\"input\" \n");
      out.write("\n");
      out.write("                     name=\"password\" \n");
      out.write("\n");
      out.write("                     placeholder=\"PASSWORD\"/>        \n");
      out.write("\n");
      out.write("              <div class=\"line-box\">          \n");
      out.write("\n");
      out.write("                <div class=\"line\"></div>        \n");
      out.write("\n");
      out.write("              </div>    \n");
      out.write("\n");
      out.write("            </label>     \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <label>     \n");
      out.write("\n");
      out.write("              <input  type=\"password\" \n");
      out.write("\n");
      out.write("                     class=\"input\" \n");
      out.write("\n");
      out.write("                     name=\"confirm\" \n");
      out.write("\n");
      out.write("                     placeholder=\"CONFIRM PASSWORD\"/>      \n");
      out.write("\n");
      out.write("              <div class=\"line-box\">        \n");
      out.write("\n");
      out.write("                <div class=\"line\"></div>      \n");
      out.write("\n");
      out.write("              </div>    \n");
      out.write("\n");
      out.write("            </label>     \n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"submit\" /> \n");
      out.write("\n");
      out.write("          </form> \n");
      out.write("\n");
      out.write("      </div> \n");
      out.write("        ");

        try
        {
        String str1,str2,str3,str4;
        str1=request.getParameter("email");
        str2=request.getParameter("username");
        str3=request.getParameter("password");
        str4=request.getParameter("confirm");
      //  out.println(str1+""+str2+""+str3+""+str4+""+str5+""+str6+""+str7+""+str8+""+str9+""+str10);
        String url="jdbc:mysql://localhost:3306/registion";
        String user="root";
        String pass="12345";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,user,pass);
        String sql="insert into login(email,username,pasword,confirm)values(?,?,?,?);";
         PreparedStatement prep = con.prepareStatement(sql);
         prep.setString(1,str1);
         prep.setString(2,str2);
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
