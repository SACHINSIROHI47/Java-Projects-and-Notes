<%@page contentType="text/html" language="java" import="java.sql.*" import="javax.sql.*" %>
<%@page pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>      
      <title>Online Admission Form of IGNOU </title>
    </head>
    <SCRIPT type="text/javascript">
        function Load()
        {
        
if (document.forms[0].fname.value=="") {
return false;
}

if (document.forms[0].day.value=="") {
return false;
}
if (document.forms[0].month.value=="") {
return false;
}
if (document.forms[0].year.value=="") {
return false;
}
if (document.forms[0].category.value=="") {
return false;
}

if (document.forms[0].day1.value=="") {
return false;
}
if (document.forms[0].month1.value=="") {
return false;
}
if (document.forms[0].year1.value=="") {
return false;
}
        }
        
        
        


function validate() {


if (document.forms[0].fname.value=="") {
alert("Please Enter the FistName !");
return false;
}

if (document.forms[0].day.value=="") {
alert("Please Enter the days  !");
return false;
}
if (document.forms[0].month.value=="") {
alert("Please Enter the months !");
return false;
}
if (document.forms[0].year.value=="") {
alert("Please Enter the year of date of birth !");
return false;
}
if (document.forms[0].pgrm.value=="") {
alert("Please Enter Programme !");
return false;
}

if (document.forms[0].category.value=="") {
alert("Please Enter the category !");
return false;
}

if (document.forms[0].day1.value=="") {
alert("Please Enter the days  !");
return false;
}
if (document.forms[0].month1.value=="") {
alert("Please Enter the months !");
return false;
}
if (document.forms[0].year1.value=="") {
alert("Please Enter the year of registration !");
return false;
}


}
</SCRIPT>

<FORM onSubmit="return validate()" action = "" method="POST"  validate="true">
   
    <body bgcolor="orange" onload="Load();" >
 
      
        <table width="100%" height="15%" >
            <tr bgcolor="green" width="150%" height="120%">
                <td align="middle" ><b><font size="+4" color="white">UNIVERSITY OF IGNOU</font></b>
                </td>
                
                <td colspan="2"><p align="LEFT" ><font size="+2" color="white"> <marquee>Welcome for New Registration</marquee> </font></p>
                    <font size="+2"></font>
                </td>
            </tr>
        </table>
        <table width="100%" border="0">
      <tbody>
        
             <tr>
            <td width="45%"><hr shade="2">
             <table align="center" >
       <tr>
           
                 <td bgcolor="mergenta" >
                     <a href="AdmLogin.jsp"><font size="4">&nbsp;Administrator&nbsp;</font></a>
                 </td>
                 <td bgcolor="mergenta">
                     <a href="Regionalcenter.jsp"><font size="4">&nbsp;RegionalCenter&nbsp;</font></a>
                 </td>
                 <td bgcolor="mergenta">
                     <a href="Studycenter.jsp"><font size="4">&nbsp;StudyCenter&nbsp;</font></a>
                 </td>
                 <td bgcolor="mergenta"><a href="Online_Admission.jsp"><font size="4">&nbsp;Online Registration&nbsp;</font></a>
                 </td>
           <td bgcolor="mergenta" >
                 <a href="AboutUs2.jsp"><font size="4">&nbsp;About IGNOU  &nbsp; </font></a>
                
              </td>
            
             <td bgcolor="mergenta" >
               <a href="Sitemap2.jsp"><font size="4">&nbsp;Site Map  &nbsp; </font></a>
                </td>
           <td bgcolor="mergenta" >
               
                <a href="Contact2.jsp"><font size="4">&nbsp;Contact Us  &nbsp;&nbsp; </font></a>
             
              </td>
           <td bgcolor="mergenta" >
                 <a href="programmesearch.jsp"><font size="4">&nbsp;Courses Details &nbsp; </font></a>
               
              </td>
               <td bgcolor="mergenta" >
                 <a href="All_Programme.jsp"><font size="4">All Programme </font></a>
               
              </td>
               <td bgcolor="mergenta" >
                 <a href="IgnouProspectus.jsp"><font size="4">Student Zone</font></a>
               
              </td>
                 <td bgcolor="mergenta" >
                 <a href="Online_Admission.jsp"><font size="4">Logout </font></a>
               
              </td>
               </tr>
            
            </table>
             <br>
               <table width="58%" border="0" align="center">
                 <tbody> 
                     

                   
                     
                     <tr>
                      <td><font size="2" color="white"><b>*First Name</b> &nbsp&nbsp&nbsp; &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                           <input type="text" name="fname" size="30" ></font>
                      </td>
                                         <%!
String blanknull(String s) {
  return (s == null) ? "" : s;
}
%>
                      </tr>
                      <tr>
                     </br>
                      <td ><font size="2" color="white"><b>*Last Name</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                           <input type="text" name="lname" size="30"></font>
                      </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                      <td ><font size="2" color="white"><b>*Date of Birth</b>
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>
                              <select  name="day" size="1" >
                             <option value="">-Day-</option><option value="01">01</option><option value="02">02</option>
                              <option value="03">03</option><option value="04">04</option><option value="05">05</option>
                              <option value="06">06</option><option value="07">07</option><option value="08">08</option>
                              <option value="09">09</option><option value="10">10</option><option value="11">11</option>
                              <option value="12">12</option><option value="13">13</option><option value="14">14</option>
                              <option value="15">15</option><option value="16">16</option><option value="17">17</option>
                              <option value="18">18</option><option value="19">19</option><option value="20">20</option>
                              <option value="21">21</option><option value="22">22</option><option value="23">23</option>
                              <option value="24">24</option><option value="25">25</option><option value="26">26</option>
                              <option value="27">27</option><option value="28">28</option><option value="29">29</option>
                              <option value="30">30</option><option value="31">31</option>
                           </select>
                           <select  name="month" size="1">
                           <option value="">-Month-</option><option value="January">January</option>
                              <option value="February">February</option><option value="March">March</option>
                              <option value="April">April</option><option value="May">May</option>
                              <option value="June">June</option><option value="July">July</option>
                              <option value="August">August</option><option value="September">September</option>
                              <option value="October">October</option><option value="November">November</option>
                              <option value="December">December</option>
                           </select>
                          
                           <select  name="year" size="1">
                              <option value="">-Year-</option><option value="1960">1960</option>
                              <option value="1961">1961</option><option value="1962">1962</option>
                              <option value="1963">1963</option><option value="1964">1964</option>
                              <option value="1965">1965</option><option value="1966">1966</option>
                              <option value="1967">1967</option><option value="1968">1969</option>
                              <option value="1969">1969</option><option value="1970">1970</option>
                              <option value="1971">1971</option><option value="1972">1972</option>
                              <option value="1973">1973</option><option value="1974">1974</option>
                              <option value="1975">1975</option><option value="1976">1976</option>
                              <option value="1977">1977</option><option value="1978">1978</option>
                              <option value="1979">1979</option><option value="1980">1980</option>
                              <option value="1981">1981</option><option value="1982">1982</option>
                              <option value="1983">1983</option><option value="1984">1984</option>
                              <option value="1985">1985</option><option value="1986">1986</option>
                              <option value="1987">1987</option><option value="1988">1988</option>
                              <option value="1989">1989</option><option value="1990">1990</option>
                              <option value="1991">1991</option><option value="1992">1992</option>
                              <option value="1993">1993</option><option value="1994">1994</option>
                              <option value="1995">1995</option>
                           </select>
                         </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                  
                   <tr><td><font size="2" color="white"><b>*Programme Stream</b> 
                             
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>
                           <select name="pgrm" size="1" >
                               <option value="">-Programme-</OPTION><option value="PGDCA">PGDCA</OPTION>
                               <option value="BCA">BCA</OPTION><option value="MCA">MCA</OPTION>
                               <option value="BBA">BBA</OPTION><option value="MBA">MBA</OPTION>
                               <option value="B.Com">B.Com</OPTION><option value="M.Com">M.Com</OPTION>
                               <option value="BA">BA</OPTION><option value="MA">MA</OPTION>
                               <option value="B.Sc">B.Sc</OPTION><OPTION VALUE="M.Sc">M.Sc</OPTION>
                               <option value="OTHER">OTHER</OPTION>
                           </select>
                   </td></tr>
                    <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                     <td><font size="2"color="white"><b>*Mobile No</b> &nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                         <input type="text" name="mobile" size="30" maxlength="11" ></font>
                     </td>                    

                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                  
                   
                      <td ><font size="2" color="white"><b>*Category</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>
                    <select  name="category" size="1" >
                              <option value="">-Select-</option><option value="OBC">OBC</option><option value="GEN">GEN</option> 
                              <option value="ST">ST</option><option value="SC">SC</option>
                              <option value="OTHER">OTHER</option> 
                   </tr>
                   
                    <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                      <td ><font size="2" color="white"><b>*Date Of Registration</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <b>:</b></font>
                              <select  name="day1" size="1" >
                              <option value="">-Day-</option><option value="01">01</option><option value="02">02</option>
                              <option value="03">03</option><option value="04">04</option><option value="05">05</option>
                              <option value="06">06</option><option value="07">07</option><option value="08">08</option>
                              <option value="09">09</option><option value="10">10</option><option value="11">11</option>
                              <option value="12">12</option><option value="13">13</option><option value="14">14</option>
                              <option value="15">15</option><option value="16">16</option><option value="17">17</option>
                              <option value="18">18</option><option value="19">19</option><option value="20">20</option>
                              <option value="21">21</option><option value="22">22</option><option value="23">23</option>
                              <option value="24">24</option><option value="25">25</option><option value="26">26</option>
                              <option value="27">27</option><option value="28">28</option><option value="29">29</option>
                              <option value="30">30</option><option value="31">31</option>
                           </select>
                           <select  name="month1" size="1">
                              <option value="">-Month-</option><option value="january">January</option>
                              <option value="February">February</option><option value="March">March</option>
                              <option value="April">April</option><option value="May">May</option>
                              <option value="June">June</option><option value="July">July</option>
                              <option value="August">August</option><option value="September">September</option>
                              <option value="October">October</option><option value="November">November</option>
                              <option value="December">December</option>
                           </select>
                          
                           <select  name="year1" size="1">
                              <option value="">-Year-</option>
                              <option value="2013">2013</option>
                             
                           </select>
                          </td>
                   </tr>
                   
     <%
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
  
%>
  <%
     try
     {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn", "sa", "sirohi");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select reg from onlinereg where fname='"+fn+"' and dob='"+dt1+"'");
        

     while(rs.next())
         {
         %><table><tr>Registration No:-<%=rs.getString(1)%></tr></table><%
          }
       }
          catch(Exception e)
                  {}
                  
       
                  %>
                   
                  
                   
                  <tr>
                         
<td>    <br>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="b1" value="LogIn" width="100%" height="10%">
                    
  &nbsp;&nbsp;&nbsp;&nbsp;<b> <input type="reset" name="rt" value="Reset" width="100%" height="20%" />
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Online_Admission.jsp"><input type="button" name="bt3" value="Back" width="100%" height="10%"></b></td>
</tr>
                   
                 </tbody>
               </table>
            </td>
          </tr>
        </tbody>
      </table>
        
   



        <table><td width="45%" valign="center" align="middle"><a href="journalpage2.jsp"><img src="images\download.jpg"/></a></td></table>
    </form>
      <br><br>
  <table border="3">
    <tr>
      <td valign="centre" width="10%" align="middle"><b>
          Dear Students and Parents<br><br> University
          of IGNOU welcomes you to online Admission facility.<br>Enjoy hassle
          free, safe and secure admission. Save your precious time, energy and money. It
          is convenient. You can do it from anywhere. Use it !<br>
          We wish you a Happy admission and joyful learning.</b><br><br>
      </td>
     </tr>
   </table>
    
    </body>
   
</html>
