package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class journalpage2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("          <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Online Admission Form of IGNOU </title>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<script>\n");
      out.write("   function validate() {\n");
      out.write("if (document.forms[0].txt1.value==\"\") {\n");
      out.write("alert(\"Please Enter the Registration NO !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("<form method=\"post\" onSubmit=\"return validate()\"\">\n");
      out.write("<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bgcolor=\"#fff5ee\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("<tr bgcolor=\"black\"> \n");
      out.write("    <td align=\"middle\" valign=\"centre\" width=\"10%\"> <img height=\"50\" src=\"images/ignou-new.png\" width=\"50\"> </td>\n");
      out.write("    <td align=\"middle\"><font color=\"white\" size=\"+3\" name=\"verdana\">INDIRA GANDHI NATIONAL OPEN UNIVERSITY</font>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr><td colspan=\"2\">&nbsp; </td></tr>\n");
      out.write(" <tr bgcolor=\"#00bfff\" height=\"10%\">\n");
      out.write("\n");
      out.write("<td colspan=\"2\" height=\"10%><p align=\"center\"><font size=\"+2\"><marquee behaviour=\"alteration\">Welcome To Online Admission&nbsp;</marquee> </font></p>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr><tr></tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table align=\"center\" >\n");
      out.write("       <tr>\n");
      out.write("           \n");
      out.write("                  <td bgcolor=\"mergenta\" >\n");
      out.write("                     <a href=\"onlineadmissionform.jsp\"><font size=\"4\">&nbsp;Home Page&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("                 <td bgcolor=\"mergenta\">\n");
      out.write("                     <a href=\"AdmLogin.jsp\"><font size=\"4\">&nbsp;Administration&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("                 <td bgcolor=\"mergenta\">\n");
      out.write("                     <a href=\"Regionalcenter.jsp\"><font size=\"4\">&nbsp;RegionalCenter&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("                 <td bgcolor=\"mergenta\"><a href=\"Studycenter.jsp\"><font size=\"4\">&nbsp;Study center&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("           <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"AboutUs2.jsp\"><font size=\"4\">About IGNOU  </font></a>\n");
      out.write("                \n");
      out.write("              </td>\n");
      out.write("              <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"Online_Admission.jsp\"><font size=\"4\">Online Registration  </font></a>\n");
      out.write("                \n");
      out.write("              </td>\n");
      out.write("            \n");
      out.write("             <td bgcolor=\"mergenta\" >\n");
      out.write("               <a href=\"Sitemap2.jsp\"><font size=\"4\">&nbsp;Site Map  &nbsp; </font></a>\n");
      out.write("                </td>\n");
      out.write("           <td bgcolor=\"mergenta\" >\n");
      out.write("               \n");
      out.write("                <a href=\"Contact2.jsp\"><font size=\"4\">&nbsp;Contact Us  &nbsp;&nbsp; </font></a>\n");
      out.write("             \n");
      out.write("              </td>\n");
      out.write("           <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"programmesearch.jsp\"><font size=\"4\">&nbsp;Courses Details &nbsp; </font></a>\n");
      out.write("               \n");
      out.write("              </td>\n");
      out.write("               <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"All_Programme.jsp\"><font size=\"4\">&nbsp;All Programme&nbsp; </font></a>\n");
      out.write("               \n");
      out.write("              </td>\n");
      out.write("               <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"IgnouProspectus.jsp\"><font size=\"4\">&nbsp;Student Zone&nbsp; </font></a>\n");
      out.write("               \n");
      out.write("              </td>\n");
      out.write("               </tr>\n");
      out.write("            \n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<p></p></div>\n");
      out.write("<h1>Challan Form</h1>\n");
      out.write("<table align=\"center\">\n");
      out.write("    <tr>\n");
      out.write("        <td >\n");
      out.write("       Registration No: <input type=\"text\" name=\"txt1\" > \n");
      out.write("       </td>\n");
      out.write("    </tr><br>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <tr><td><br><br>\n");
      out.write("        &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;\n");
      out.write("        <input type=\"submit\" name=\"Click\" value=\"LogIn\">\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"Firstpageonline.jsp\"><input type=\"button\" name=\"bt3\" value=\"Back\" width=\"100%\" height=\"10%\"></a>\n");
      out.write("&nbsp;&nbsp;\n");
      out.write("<b> <input type=\"reset\" name=\"rt\" value=\"Reset\" width=\"100%\" height=\"20%\" /></b>\n");
      out.write("        <td>\n");
      out.write("        </tr>\n");
      out.write("</table>\n");
      out.write("\n");

String rg=request.getParameter("txt1");


     try{
             
    
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn", "sa", "sirohi");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select reg from onlinereg");
        

     while(rs.next())
         {
         String regt=rs.getString(1);
         
  
                
                if(rg.trim().isEmpty())
                {
                
      out.write("<center>");
out.println("Plz. Enter Your Valid Registration NO");
      out.write("</center>");

               }
             
                   
                   
               if(rg.equals(regt))
   
             
               { 
            
             
      out.write("\n");
      out.write("             \n");
      out.write("             ");
      if (true) {
        _jspx_page_context.forward("journalpage.jsp");
        return;
      }
      out.write("\n");
      out.write("         ");
}
         else
         
      out.write(" <center>");
 out.println("Login Failed,Please Try Again");
      out.write("</center>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("         \n");
      out.write("        \n");
      out.write("         ");

     }
}catch(Exception e1)
{}


      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</body></html>\n");
      out.write("    \n");
      out.write(" \n");
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
