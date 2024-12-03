package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class studentdwn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    \n");
      out.write("<script>\n");
      out.write("function printpage()\n");
      out.write("  {\n");
      out.write("  window.print()\n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write("<form method=\"post \" name=\"ff1\">\n");
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
      out.write("<td colspan=\"2\" height=\"10%><p align=\"center\"><font size=\"+2\"><marquee behaviour=\"alteration\">Welcome to Students Registration Details Form&nbsp;</marquee> </font></p>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr><tr>\n");
      out.write("   \n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<h1>Download Student Details</h1>\n");
      out.write(" &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"Registration.jsp\"><input type=\"button\" name=\"bt3\" value=\"Back\" width=\"100%\" height=\"10%\"></a>\n");
      out.write("\n");
      out.write(" &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("\n");
      out.write("        <td>\n");
      out.write("       Registration No: <input type=\"text\" name=\"txt2\" > \n");
      out.write("       </td>\n");
      out.write("       <td>\n");
      out.write("       <input type=\"submit\" name=\"b1\" value=\"LogIn\">\n");
      out.write("       <td>\n");
      out.write("           <td>\n");
      out.write("           <input type=\"button\" value=\"Print this page\" onclick=\"printpage()\">\n");
      out.write("           </td>\n");
      out.write("           <br>\n");
      out.write("\n");


     try{
         
         String rgg=request.getParameter("txt2");
         Connection con;
         Statement st;
         ResultSet rs;
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("Jdbc:Odbc:mydsn","sa","sirohi");
         st=con.createStatement();
         //rs=st.executeQuery("select  reg,fname,lname,father,mother,category,dob,gender,addrs,dist,state,country,pincode,p_stream,del_type,session,journal,Email,mobile,altr,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,13,14,15,16 from reg_tion where reg='"+rgg+"'");            
         rs=st.executeQuery("select * from reg_tion where reg='"+rgg+"'");            

      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("                  <table border=\"\"  align=\"center\" >\n");
      out.write("        <tr>\n");
      out.write("      <th>Registration No</th><th>First Name</th><th>Last Name</th>\n");
      out.write("      <th>Father Name</th><th>Mother Name</th>\n");
      out.write("      <th>Category</th><th>Date Of Birth</th>\n");
      out.write("      <th>Gender</th><th>Address</th>\n");
      out.write("      <th>District</th><th>State</th>\n");
      out.write("      <th>Country</th><th>Pincode</th>\n");
      out.write("      <th>Programme</th><th>Delivery Type</th>\n");
      out.write("      <th>Session</th><th>Journal No</th>\n");
      out.write("      <th>EmailID</th><th>Mobile NO</th>\n");
      out.write("      <th>Alternate No</th>\n");
      out.write("      <th>Exam Passed</th><th>Stream</th>\n");
      out.write("      <th>Year of passing</th><th>% of Marks</th>\n");
      out.write("      <th>Exam Passed</th><th>Stream</th>\n");
      out.write("      <th>Year of passing</th><th>% of Marks</th>\n");
      out.write("      <th>Exam Passed</th><th>Stream</th>\n");
      out.write("      <th>Year of passing</th><th>% of Marks</th>\n");
      out.write("      <th>Exam Passed</th><th>Stream</th>\n");
      out.write("      <th>Year of passing</th><th>% of Marks</th>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("       \n");
      out.write("    \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    ");

        
        while(rs.next())
        {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("        <td > ");
      out.print(rs.getString(1));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(2));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(3));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(4));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(5));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(6));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(7));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(8));
      out.write(" </td>\n");
      out.write("        <td > ");
      out.print(rs.getString(9));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(10));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(11));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(12));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(13));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(14));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(15));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(16));
      out.write(" </td>\n");
      out.write("        <td > ");
      out.print(rs.getString(17));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(18));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(19));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(20));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(21));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(22));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(23));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(24));
      out.write(" </td>\n");
      out.write("        <td > ");
      out.print(rs.getString(25));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(26));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(27));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(28));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(29));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(30));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(31));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(32));
      out.write(" </td>\n");
      out.write("        <td > ");
      out.print(rs.getString(33));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(34));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(35));
      out.write(" </td>\n");
      out.write("        <td> ");
      out.print(rs.getString(36));
      out.write(" </td>\n");
      out.write("        </tr>\n");
      out.write("    ");
} 
      out.write("\n");
      out.write("      \n");
      out.write("  ");
 
  }
     catch(Exception e1)
     { }
     
   
      out.write("\n");
      out.write("      \n");
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
