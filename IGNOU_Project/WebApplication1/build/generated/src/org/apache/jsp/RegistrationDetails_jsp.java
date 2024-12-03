package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class RegistrationDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>      \n");
      out.write("      <title>Online Admission Form of IGNOU </title>\n");
      out.write("    </head>\n");
      out.write("    <SCRIPT>\n");
      out.write("\n");
      out.write("\n");
      out.write("function validate() {\n");
      out.write("if (document.forms[0].fname.value==\"\") {\n");
      out.write("alert(\"Please Enter the FistName !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].day1.value==\"\") {\n");
      out.write("alert(\"Please Enter the days  !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].month1.value==\"\") {\n");
      out.write("alert(\"Please Enter the months !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].year.value==\"\") {\n");
      out.write("alert(\"Please Enter the year !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].programme.value==\"\") {\n");
      out.write("alert(\"Please Enter the programme  !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].degree.value==\"\") {\n");
      out.write("alert(\"Please Enter the degree  !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].session.value==\"\") {\n");
      out.write("alert(\"Please Enter the session  !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("if (document.forms[0].add.value==\"\") {\n");
      out.write("alert(\"Please Enter the address !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (document.forms[0].journal.value==\"\") {\n");
      out.write("alert(\"Please Enter the journal !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (document.forms[0].emailid.value==\"\") {\n");
      out.write("alert(\"Please Enter the EmailId !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("if (document.forms[0].pass1.value==\"\") {\n");
      out.write("alert(\"Please Enter the Password !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (document.forms[0].pass2.value==\"\") {\n");
      out.write("alert(\"Please Enter the Confirm Password !\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("}\n");
      out.write("</SCRIPT>\n");
      out.write("<FORM onSubmit=\"return validate()\">\n");
      out.write("    <body bgcolor=\"orange\">\n");
      out.write(" <form name=\"f01\" method=\"post\">\n");
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
      out.write("             <br><br><br>\n");
      out.write("               <table width=\"58%\" border=\"0\" align=\"center\">\n");
      out.write("                 <tbody>      \n");
      out.write("                     <tr>\n");
      out.write("                      <td><font size=\"2\" color=\"white\"><b>*First Name</b> &nbsp&nbsp&nbsp; &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>\n");
      out.write("                           <input type=\"text\" name=\"fname\" size=\"30\"></font>\n");
      out.write("                      </td>\n");
      out.write("                     \n");
      out.write("                      <td ><font size=\"2\" color=\"white\"><b>*Last Name</b><b>:</b>\n");
      out.write("                           <input type=\"text\" name=\"lname\" size=\"30\"></font>\n");
      out.write("                      </td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr>\n");
      out.write("                      <td ><font size=\"2\" color=\"white\"><b>*Birthday</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>\n");
      out.write("                              <select  name=\"day1\" size=\"1\" >\n");
      out.write("                              <option >-Day-</option><option value=\"1\">01</option><option value=\"2\">02</option>\n");
      out.write("                              <option value=\"3\">03</option><option value=\"4\">04</option><option value=\"5\">05</option>\n");
      out.write("                              <option value=\"6\">06</option><option value=\"7\">07</option><option value=\"8\">08</option>\n");
      out.write("                              <option value=\"9\">09</option><option value=\"10\">10</option><option value=\"11\">11</option>\n");
      out.write("                              <option value=\"12\">12</option><option value=\"13\">13</option><option value=\"14\">14</option>\n");
      out.write("                              <option value=\"15\">15</option><option value=\"16\">16</option><option value=\"17\">17</option>\n");
      out.write("                              <option value=\"18\">18</option><option value=\"19\">19</option><option value=\"20\">20</option>\n");
      out.write("                              <option value=\"21\">21</option><option value=\"22\">22</option><option value=\"23\">23</option>\n");
      out.write("                              <option value=\"24\">24</option><option value=\"25\">25</option><option value=\"26\">26</option>\n");
      out.write("                              <option value=\"27\">27</option><option value=\"28\">28</option><option value=\"29\">29</option>\n");
      out.write("                              <option value=\"30\">30</option><option value=\"31\">31</option>\n");
      out.write("                           </select>\n");
      out.write("                           <select  name=\"month1\" size=\"1\">\n");
      out.write("                              <option>-Month-</option><option value=\"jan\">January</option>\n");
      out.write("                              <option value=\"feb\">February</option><option value=\"mar\">March</option>\n");
      out.write("                              <option value=\"apr\">April</option><option value=\"may\">May</option>\n");
      out.write("                              <option value=\"jun\">June</option><option value=\"jul\">July</option>\n");
      out.write("                              <option value=\"aug\">August</option><option value=\"sep\">September</option>\n");
      out.write("                              <option value=\"oct\">October</option><option value=\"nov\">November</option>\n");
      out.write("                              <option value=\"dec\">December</option>\n");
      out.write("                           </select>\n");
      out.write("                          \n");
      out.write("                           <select  name=\"year\" size=\"1\">\n");
      out.write("                              <option value=\"\">-Year-</option><option value=\"1930\">1930</option>\n");
      out.write("                              <option value=\"1931\">1931</option><option value=\"1932\">1932</option>\n");
      out.write("                              <option value=\"1933\">1933</option><option value=\"1934\">1934</option>\n");
      out.write("                              <option value=\"1935\">1935</option><option value=\"1936\">1936</option>\n");
      out.write("                              <option value=\"1937\">1937</option><option value=\"1938\">1938</option>\n");
      out.write("                              <option value=\"1939\">1939</option><option value=\"1940\">1940</option>\n");
      out.write("                              <option value=\"1941\">1941</option><option value=\"1942\">1942</option>\n");
      out.write("                              <option value=\"1943\">1943</option><option value=\"1944\">1944</option>\n");
      out.write("                              <option value=\"1945\">1945</option><option value=\"1946\">1946</option>\n");
      out.write("                              <option value=\"1947\">1947</option><option value=\"1948\">1948</option>\n");
      out.write("                              <option value=\"1949\">1949</option><option value=\"1950\">1950</option>\n");
      out.write("                              <option value=\"1951\">1951</option><option value=\"1952\">1952</option>\n");
      out.write("                              <option value=\"1953\">1953</option><option value=\"1954\">1954</option>\n");
      out.write("                              <option value=\"1955\">1955</option><option value=\"1956\">1956</option>\n");
      out.write("                              <option value=\"1957\">1957</option><option value=\"1958\">1958</option>\n");
      out.write("                              <option value=\"1959\">1959</option><option value=\"1960\">1960</option>\n");
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
      out.write("                              <option value=\"1995\">1995</option><option value=\"1996\">1996</option>\n");
      out.write("                              <option value=\"1997\">1997</option><option value=\"1998\">1998</option>\n");
      out.write("                              <option value=\"1999\">1999</option><option value=\"2000\">2000</option>\n");
      out.write("                              <option value=\"2001\">2001</option><option value=\"2002\">2002</option>\n");
      out.write("                              <option value=\"2003\">2003</option><option value=\"2004\">2004</option>\n");
      out.write("                              <option value=\"2005\">2005</option><option value=\"2006\">2006</option>\n");
      out.write("                              <option value=\"2007\">2007</option><option value=\"2008\">2008</option>\n");
      out.write("                              <option value=\"2009\">2009</option><option value=\"2010\">2010</option>\n");
      out.write("                              <option value=\"2011\">2011</option><option value=\"2012\">2012</option>\n");
      out.write("                              <option value=\"2013\">2013</option>\n");
      out.write("                           </select>\n");
      out.write("                         </td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr>\n");
      out.write("                     <td><font size=\"2\"color=\"white\"><b>*Gender</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>\n");
      out.write("                         <input type=\"radio\" name=\"gender\" value=\"male\" color=\"white\" checked><i>Male</i>&nbsp;&nbsp;\n");
      out.write("                         <input type=\"radio\" name=\"gender\" value=\"female\" color=\"white\"><i>Female</i>\n");
      out.write("                     </td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                  \n");
      out.write("                   <tr><td><font size=\"2\" color=\"white\"><b>*Programme Stream</b> \n");
      out.write("                             \n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>\n");
      out.write("                           <select name=\"programme\" size=\"1\" >\n");
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
      out.write("                    <tr><td><font size=\"2\" color=\"white\"><b>*Delivery Type</b> \n");
      out.write("                     &nbsp;&nbsp;&nbsp;\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>\n");
      out.write("                              <select name=\"degree\" size=\"1\">\n");
      out.write("                             <option value=\"\">-Select-</option> <option value=\"Regular\">Regular</option>\n");
      out.write("                              <option value=\"Distance\">Distance</option><option value=\"Online\">Online</option>\n");
      out.write("                                  </select>          \n");
      out.write("                                               \n");
      out.write("                    </td></tr>            \n");
      out.write("                                      \n");
      out.write("                    <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                    <tr><td><font size=\"2\" color=\"white\"><b>*Session</b> \n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>\n");
      out.write("                              <select name=\"session\" size=\"1\">\n");
      out.write("                             <option value=\"\">-Session-</option> <option value=\"July\">July</option>\n");
      out.write("                              <option value=\"January\">January</option>\n");
      out.write("                                  </select>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </td></tr>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                    <tr>\n");
      out.write("                     <td><font size=\"2\" color=\"white\"><b>*Address</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>\n");
      out.write("                        </font><input type=\"text\" name=\"add\" size=\"30\">\n");
      out.write("                         </textarea>\n");
      out.write("                     </td>\n");
      out.write("                   </tr>\n");
      out.write("                     <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr>\n");
      out.write("                     <td><font size=\"2\" color=\"white\"><b>*Journal No</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                             &nbsp;<b>:</b>\n");
      out.write("                         <input type=\"text\" name=\"journal\" size=\"30\"></font>\n");
      out.write("                     </td>\n");
      out.write("                   </tr>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr>\n");
      out.write("                     <td><font size=\"2\" color=\"white\"><b>*Email Id</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>\n");
      out.write("                         <input type=\"text\" name=\"emailid\" size=\"30\"></font>\n");
      out.write("                     </td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr>\n");
      out.write("                     <td><font size=\"2\"color=\"white\"><b>*Create a Password</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                             &nbsp;&nbsp;&nbsp;<b>:</b>\n");
      out.write("                         <input type=\"password\" name=\"pass1\" size=\"30\">\n");
      out.write("                         </font>\n");
      out.write("                     </td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr>\n");
      out.write("                     <td><font size=\"2\"color=\"white\"><b>*Confirm your Password</b> <b>:</b>\n");
      out.write("                         <input type=\"password\" name=\"pass2\" size=\"30\">\n");
      out.write("                         </font>\n");
      out.write("                     </td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                   <tr>\n");
      out.write("                     <td><font size=\"2\"color=\"white\"><b>*Mobile No</b> &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>\n");
      out.write("                         <input type=\"text\" name=\"mobile\" size=\"30\" maxlength=\"11\" ></font>\n");
      out.write("                     </td>\n");
      out.write("                     <td><font size=\"2\"color=\"white\"><b>Alternate No</b> <b>:</b>\n");
      out.write("                         <input type=\"text\" name=\"altno\" size=\"30\" maxlength=\"11\"></font>\n");
      out.write("                     </td>\n");
      out.write("                   </tr>\n");
      out.write("\n");
      out.write("                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("                  <tr>\n");
      out.write("                         \n");
      out.write("<td>    <br>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" name=\"bt\" value=\"LogIn\" width=\"100%\" height=\"10%\">\n");
      out.write("                         &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" name=\"Search\" value=\"Search\" width=\"100%\" height=\"10%\">\n");
      out.write("                             &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" name=\"Update\" value=\"Update\" width=\"100%\" height=\"10%\">\n");
      out.write("                                 &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" name=\"Delete\" value=\"Delete\" width=\"100%\" height=\"10%\">\n");
      out.write("  &nbsp;&nbsp;&nbsp;&nbsp;<b> <input type=\"reset\" name=\"rt\" value=\"Reset\" width=\"100%\" height=\"20%\" /></b></td>\n");
      out.write("</tr>\n");
      out.write("                   \n");
      out.write("                 </tbody>\n");
      out.write("               </table>\n");
      out.write("            </td>\n");
      out.write("          </tr>\n");
      out.write("        </tbody>\n");
      out.write("      </table>\n");
      out.write("    \n");
      out.write("\n");
      out.write("      ");

String fn1=request.getParameter("fname");
String ln2=request.getParameter("lname");
String d3=request.getParameter("day1");
String m4=request.getParameter("month1");
String y5=request.getParameter("year");   
                      
String dt=d3+"-"+m4+"-"+y5;    	

String g6=request.getParameter("gender");
String prog=request.getParameter("programme");
String deg=request.getParameter("degree");
String sess=request.getParameter("session");
String ad=request.getParameter("add");
String jou=request.getParameter("journal");


String e7=request.getParameter("emailid");
String p8=request.getParameter("pass1");
String p9=request.getParameter("pass2");
String m10=request.getParameter("mobile");
String a11=request.getParameter("altno");


     try{
         
         if(p8.equals(p9))
             {
    
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
     Connection con1=DriverManager.getConnection("jdbc:odbc:mydsn2", "sa", "sirohi");
     Statement st1=con1.createStatement();
      
     st1.executeUpdate("insert into registration2 values('"+fn1+"','"+ln2+"' ,'"+dt +"' ,'"+g6+"' ,'"+prog+"','"+deg+"','"+sess+"','"+ad+"','"+jou+"','"+e7+"' ,'"+p8+"' ,'"+p9+"' ,'"+m10+"' ,'"+a11+"')");
                
                      
      out.write("<center><b>");
out.println("Registration hs been Successfully");
      out.write("</b></center>");
}
           else
               {
                
                
      out.write("<center><b>");
out.println("Password and confirm password is not match");
      out.write("</b></center>");

               }
               }
                  
          
         
          
     
catch(Exception e1)
{}


      out.write("\n");
      out.write("\n");
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
      out.write("    \n");
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
