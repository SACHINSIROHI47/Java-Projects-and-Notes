package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public final class Firstpageonline_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


String blanknull(String s) {
  return (s == null) ? "" : s;
}

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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>      \n");
      out.write("      <title>Online Admission Form of IGNOU </title>\n");
      out.write("    </head>\n");
      out.write("    <SCRIPT type=\"text/javascript\">\n");
      out.write("        function Load()\n");
      out.write("        {\n");
      out.write("        \n");
      out.write("if (document.forms[0].fname.value==\"\") {\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (document.forms[0].day.value==\"\") {\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].month.value==\"\") {\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].year.value==\"\") {\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].category.value==\"\") {\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (document.forms[0].day1.value==\"\") {\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].month1.value==\"\") {\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].year1.value==\"\") {\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("function validate() {\n");
      out.write("\n");
      out.write("\n");
      out.write("if (document.forms[0].fname.value==\"\") {\n");
      out.write("alert(\"Please Enter the FistName !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (document.forms[0].day.value==\"\") {\n");
      out.write("alert(\"Please Enter the days  !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].month.value==\"\") {\n");
      out.write("alert(\"Please Enter the months !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].year.value==\"\") {\n");
      out.write("alert(\"Please Enter the year of date of birth !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].pgrm.value==\"\") {\n");
      out.write("alert(\"Please Enter Programme !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (document.forms[0].category.value==\"\") {\n");
      out.write("alert(\"Please Enter the category !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (document.forms[0].day1.value==\"\") {\n");
      out.write("alert(\"Please Enter the days  !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].month1.value==\"\") {\n");
      out.write("alert(\"Please Enter the months !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].year1.value==\"\") {\n");
      out.write("alert(\"Please Enter the year of registration !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("</SCRIPT>\n");
      out.write("\n");
      out.write("<FORM onSubmit=\"return validate()\" action = \"\" method=\"POST\"  validate=\"true\">\n");
      out.write("   \n");
      out.write("    <body bgcolor=\"orange\" onload=\"Load();\" >\n");
      out.write(" \n");
      out.write("      \n");
      out.write("        <table width=\"100%\" height=\"15%\" >\n");
      out.write("            <tr bgcolor=\"green\" width=\"150%\" height=\"120%\">\n");
      out.write("                <td align=\"middle\" ><b><font size=\"+4\" color=\"white\">UNIVERSITY OF IGNOU</font></b>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                <td colspan=\"2\"><p align=\"LEFT\" ><font size=\"+2\" color=\"white\"> <marquee>Welcome for New Registration</marquee> </font></p>\n");
      out.write("                    <font size=\"+2\"></font>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <table width=\"100%\" border=\"0\">\n");
      out.write("      <tbody>\n");
      out.write("        \n");
      out.write("             <tr>\n");
      out.write("            <td width=\"45%\"><hr shade=\"2\">\n");
      out.write("             <table align=\"center\" >\n");
      out.write("       <tr>\n");
      out.write("           \n");
      out.write("                 <td bgcolor=\"mergenta\" >\n");
      out.write("                     <a href=\"AdmLogin.jsp\"><font size=\"4\">&nbsp;Administrator&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("                 <td bgcolor=\"mergenta\">\n");
      out.write("                     <a href=\"Regionalcenter.jsp\"><font size=\"4\">&nbsp;RegionalCenter&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("                 <td bgcolor=\"mergenta\">\n");
      out.write("                     <a href=\"Studycenter.jsp\"><font size=\"4\">&nbsp;StudyCenter&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("                 <td bgcolor=\"mergenta\"><a href=\"Online_Admission.jsp\"><font size=\"4\">&nbsp;Online Registration&nbsp;</font></a>\n");
      out.write("                 </td>\n");
      out.write("           <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"AboutUs2.jsp\"><font size=\"4\">&nbsp;About IGNOU  &nbsp; </font></a>\n");
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
      out.write("                 <a href=\"All_Programme.jsp\"><font size=\"4\">All Programme </font></a>\n");
      out.write("               \n");
      out.write("              </td>\n");
      out.write("               <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"IgnouProspectus.jsp\"><font size=\"4\">Student Zone</font></a>\n");
      out.write("               \n");
      out.write("              </td>\n");
      out.write("                 <td bgcolor=\"mergenta\" >\n");
      out.write("                 <a href=\"Online_Admission.jsp\"><font size=\"4\">Logout </font></a>\n");
      out.write("               \n");
      out.write("              </td>\n");
      out.write("               </tr>\n");
      out.write("            \n");
      out.write("            </table>\n");
      out.write("             <br>\n");
      out.write("               <table width=\"58%\" border=\"0\" align=\"center\">\n");
      out.write("                 <tbody> \n");
      out.write("                     \n");
      out.write("\n");
      out.write("                   \n");
      out.write("                     \n");
      out.write("                     <tr>\n");
      out.write("                      <td><font size=\"2\" color=\"white\"><b>*First Name</b> &nbsp&nbsp&nbsp; &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>\n");
      out.write("                           <input type=\"text\" name=\"fname\" size=\"30\" ></font>\n");
      out.write("                      </td>\n");
      out.write("                                         ");
      out.write("\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                     </br>\n");
      out.write("                      <td ><font size=\"2\" color=\"white\"><b>*Last Name</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>\n");
      out.write("                           <input type=\"text\" name=\"lname\" size=\"30\"></font>\n");
      out.write("                      </td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr>\n");
      out.write("                      <td ><font size=\"2\" color=\"white\"><b>*Date of Birth</b>\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>\n");
      out.write("                              <select  name=\"day\" size=\"1\" >\n");
      out.write("                             <option value=\"\">-Day-</option><option value=\"01\">01</option><option value=\"02\">02</option>\n");
      out.write("                              <option value=\"03\">03</option><option value=\"04\">04</option><option value=\"05\">05</option>\n");
      out.write("                              <option value=\"06\">06</option><option value=\"07\">07</option><option value=\"08\">08</option>\n");
      out.write("                              <option value=\"09\">09</option><option value=\"10\">10</option><option value=\"11\">11</option>\n");
      out.write("                              <option value=\"12\">12</option><option value=\"13\">13</option><option value=\"14\">14</option>\n");
      out.write("                              <option value=\"15\">15</option><option value=\"16\">16</option><option value=\"17\">17</option>\n");
      out.write("                              <option value=\"18\">18</option><option value=\"19\">19</option><option value=\"20\">20</option>\n");
      out.write("                              <option value=\"21\">21</option><option value=\"22\">22</option><option value=\"23\">23</option>\n");
      out.write("                              <option value=\"24\">24</option><option value=\"25\">25</option><option value=\"26\">26</option>\n");
      out.write("                              <option value=\"27\">27</option><option value=\"28\">28</option><option value=\"29\">29</option>\n");
      out.write("                              <option value=\"30\">30</option><option value=\"31\">31</option>\n");
      out.write("                           </select>\n");
      out.write("                           <select  name=\"month\" size=\"1\">\n");
      out.write("                           <option value=\"\">-Month-</option><option value=\"January\">January</option>\n");
      out.write("                              <option value=\"February\">February</option><option value=\"March\">March</option>\n");
      out.write("                              <option value=\"April\">April</option><option value=\"May\">May</option>\n");
      out.write("                              <option value=\"June\">June</option><option value=\"July\">July</option>\n");
      out.write("                              <option value=\"August\">August</option><option value=\"September\">September</option>\n");
      out.write("                              <option value=\"October\">October</option><option value=\"November\">November</option>\n");
      out.write("                              <option value=\"December\">December</option>\n");
      out.write("                           </select>\n");
      out.write("                          \n");
      out.write("                           <select  name=\"year\" size=\"1\">\n");
      out.write("                              <option value=\"\">-Year-</option><option value=\"1960\">1960</option>\n");
      out.write("                              <option value=\"1961\">1961</option><option value=\"1962\">1962</option>\n");
      out.write("                              <option value=\"1963\">1963</option><option value=\"1964\">1964</option>\n");
      out.write("                              <option value=\"1965\">1965</option><option value=\"1966\">1966</option>\n");
      out.write("                              <option value=\"1967\">1967</option><option value=\"1968\">1969</option>\n");
      out.write("                              <option value=\"1969\">1969</option><option value=\"1970\">1970</option>\n");
      out.write("                              <option value=\"1971\">1971</option><option value=\"1972\">1972</option>\n");
      out.write("                              <option value=\"1973\">1973</option><option value=\"1974\">1974</option>\n");
      out.write("                              <option value=\"1975\">1975</option><option value=\"1976\">1976</option>\n");
      out.write("                              <option value=\"1977\">1977</option><option value=\"1978\">1978</option>\n");
      out.write("                              <option value=\"1979\">1979</option><option value=\"1980\">1980</option>\n");
      out.write("                              <option value=\"1981\">1981</option><option value=\"1982\">1982</option>\n");
      out.write("                              <option value=\"1983\">1983</option><option value=\"1984\">1984</option>\n");
      out.write("                              <option value=\"1985\">1985</option><option value=\"1986\">1986</option>\n");
      out.write("                              <option value=\"1987\">1987</option><option value=\"1988\">1988</option>\n");
      out.write("                              <option value=\"1989\">1989</option><option value=\"1990\">1990</option>\n");
      out.write("                              <option value=\"1991\">1991</option><option value=\"1992\">1992</option>\n");
      out.write("                              <option value=\"1993\">1993</option><option value=\"1994\">1994</option>\n");
      out.write("                              <option value=\"1995\">1995</option>\n");
      out.write("                           </select>\n");
      out.write("                         </td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                  \n");
      out.write("                   <tr><td><font size=\"2\" color=\"white\"><b>*Programme Stream</b> \n");
      out.write("                             \n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>\n");
      out.write("                           <select name=\"pgrm\" size=\"1\" >\n");
      out.write("                               <option value=\"\">-Programme-</OPTION><option value=\"PGDCA\">PGDCA</OPTION>\n");
      out.write("                               <option value=\"BCA\">BCA</OPTION><option value=\"MCA\">MCA</OPTION>\n");
      out.write("                               <option value=\"BBA\">BBA</OPTION><option value=\"MBA\">MBA</OPTION>\n");
      out.write("                               <option value=\"B.Com\">B.Com</OPTION><option value=\"M.Com\">M.Com</OPTION>\n");
      out.write("                               <option value=\"BA\">BA</OPTION><option value=\"MA\">MA</OPTION>\n");
      out.write("                               <option value=\"B.Sc\">B.Sc</OPTION><OPTION VALUE=\"M.Sc\">M.Sc</OPTION>\n");
      out.write("                               <option value=\"OTHER\">OTHER</OPTION>\n");
      out.write("                           </select>\n");
      out.write("                   </td></tr>\n");
      out.write("                    <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr>\n");
      out.write("                     <td><font size=\"2\"color=\"white\"><b>*Mobile No</b> &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>\n");
      out.write("                         <input type=\"text\" name=\"mobile\" size=\"30\" maxlength=\"11\" ></font>\n");
      out.write("                     </td>                    \n");
      out.write("\n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr>\n");
      out.write("                  \n");
      out.write("                   \n");
      out.write("                      <td ><font size=\"2\" color=\"white\"><b>*Category</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>\n");
      out.write("                    <select  name=\"category\" size=\"1\" >\n");
      out.write("                              <option value=\"\">-Select-</option><option value=\"OBC\">OBC</option><option value=\"GEN\">GEN</option> \n");
      out.write("                              <option value=\"ST\">ST</option><option value=\"SC\">SC</option>\n");
      out.write("                              <option value=\"OTHER\">OTHER</option> \n");
      out.write("                   </tr>\n");
      out.write("                   \n");
      out.write("                    <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr>\n");
      out.write("                      <td ><font size=\"2\" color=\"white\"><b>*Date Of Registration</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            <b>:</b></font>\n");
      out.write("                              <select  name=\"day1\" size=\"1\" >\n");
      out.write("                              <option value=\"\">-Day-</option><option value=\"01\">01</option><option value=\"02\">02</option>\n");
      out.write("                              <option value=\"03\">03</option><option value=\"04\">04</option><option value=\"05\">05</option>\n");
      out.write("                              <option value=\"06\">06</option><option value=\"07\">07</option><option value=\"08\">08</option>\n");
      out.write("                              <option value=\"09\">09</option><option value=\"10\">10</option><option value=\"11\">11</option>\n");
      out.write("                              <option value=\"12\">12</option><option value=\"13\">13</option><option value=\"14\">14</option>\n");
      out.write("                              <option value=\"15\">15</option><option value=\"16\">16</option><option value=\"17\">17</option>\n");
      out.write("                              <option value=\"18\">18</option><option value=\"19\">19</option><option value=\"20\">20</option>\n");
      out.write("                              <option value=\"21\">21</option><option value=\"22\">22</option><option value=\"23\">23</option>\n");
      out.write("                              <option value=\"24\">24</option><option value=\"25\">25</option><option value=\"26\">26</option>\n");
      out.write("                              <option value=\"27\">27</option><option value=\"28\">28</option><option value=\"29\">29</option>\n");
      out.write("                              <option value=\"30\">30</option><option value=\"31\">31</option>\n");
      out.write("                           </select>\n");
      out.write("                           <select  name=\"month1\" size=\"1\">\n");
      out.write("                              <option value=\"\">-Month-</option><option value=\"january\">January</option>\n");
      out.write("                              <option value=\"February\">February</option><option value=\"March\">March</option>\n");
      out.write("                              <option value=\"April\">April</option><option value=\"May\">May</option>\n");
      out.write("                              <option value=\"June\">June</option><option value=\"July\">July</option>\n");
      out.write("                              <option value=\"August\">August</option><option value=\"September\">September</option>\n");
      out.write("                              <option value=\"October\">October</option><option value=\"November\">November</option>\n");
      out.write("                              <option value=\"December\">December</option>\n");
      out.write("                           </select>\n");
      out.write("                          \n");
      out.write("                           <select  name=\"year1\" size=\"1\">\n");
      out.write("                              <option value=\"\">-Year-</option>\n");
      out.write("                              <option value=\"2013\">2013</option>\n");
      out.write("                             \n");
      out.write("                           </select>\n");
      out.write("                          </td>\n");
      out.write("                   </tr>\n");
      out.write("                   \n");
      out.write("     ");

String fn=request.getParameter("fname");
String ln=request.getParameter("lname");
String d=request.getParameter("day");
String m=request.getParameter("month");
String y=request.getParameter("year");   
                      
String dt1=d+"-"+m+"-"+y;   

String pg=request.getParameter("pgrm");
String mb=request.getParameter("mobile");
String cetgry=request.getParameter("category");
String d2=request.getParameter("day1");
String m2=request.getParameter("month1");
String y2=request.getParameter("year1"); 
     String dt2=d2+"-"+m2+"-"+y2;    	

     try{
         
      Connection con1=null;   
      PreparedStatement st = null;
    
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
     con1=DriverManager.getConnection("jdbc:odbc:mydsn", "sa", "sirohi");

           
     st=con1.prepareStatement("insert into onlinereg(fname,lname,dob,progrm,mobile,category,datofreg)values(?,?,?,?,?,?,?)"); 
                   
                        st.setString(1,fn);
                        st.setString(2,ln);
                         st.setString(3,dt1);
                         st.setString(4,pg);
                          st.setString(5,mb);
                           st.setString(6,cetgry);
                            st.setString(7,dt2);
                            
              st.executeUpdate();
              st.clearParameters(); 



             st.close();
             
           
             con1.close();
             out.println("Basic Information has been Save Successfully");
            response.sendRedirect("journalpage.jsp");            
                     
                   
                       
         }
catch(Exception e1)
{}
  

      out.write('\n');
      out.write(' ');
      out.write(' ');

     try
     {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn", "sa", "sirohi");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select reg from onlinereg where fname='"+fn+"' and dob='"+dt1+"'");
        

     while(rs.next())
         {
         
      out.write("<table><tr>Registration No:-");
      out.print(rs.getString(1));
      out.write("</tr></table>");

          }
       }
          catch(Exception e)
                  {}
                  
       
                  
      out.write("\n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("                   \n");
      out.write("                  <tr>\n");
      out.write("                         \n");
      out.write("<td>    <br>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" name=\"b1\" value=\"LogIn\" width=\"100%\" height=\"10%\">\n");
      out.write("                    \n");
      out.write("  &nbsp;&nbsp;&nbsp;&nbsp;<b> <input type=\"reset\" name=\"rt\" value=\"Reset\" width=\"100%\" height=\"20%\" />\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"Online_Admission.jsp\"><input type=\"button\" name=\"bt3\" value=\"Back\" width=\"100%\" height=\"10%\"></b></td>\n");
      out.write("</tr>\n");
      out.write("                   \n");
      out.write("                 </tbody>\n");
      out.write("               </table>\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("        </tbody>\n");
      out.write("      </table>\n");
      out.write("        \n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table><td width=\"45%\" valign=\"center\" align=\"middle\"><a href=\"journalpage2.jsp\"><img src=\"images\\download.jpg\"/></a></td></table>\n");
      out.write("    </form>\n");
      out.write("      <br><br>\n");
      out.write("  <table border=\"3\">\n");
      out.write("    <tr>\n");
      out.write("      <td valign=\"centre\" width=\"10%\" align=\"middle\"><b>\n");
      out.write("          Dear Students and Parents<br><br> University\n");
      out.write("          of IGNOU welcomes you to online Admission facility.<br>Enjoy hassle\n");
      out.write("          free, safe and secure admission. Save your precious time, energy and money. It\n");
      out.write("          is convenient. You can do it from anywhere. Use it !<br>\n");
      out.write("          We wish you a Happy admission and joyful learning.</b><br><br>\n");
      out.write("      </td>\n");
      out.write("     </tr>\n");
      out.write("   </table>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("   \n");
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
