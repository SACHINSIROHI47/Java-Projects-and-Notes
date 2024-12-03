
<%@page  language ="java" import="java.sql.*" %>

<html>
    <head>      
      <title>Online Admission Form of IGNOU </title>
    </head>
    <SCRIPT>


function validate() {
if (document.forms[0].fname.value=="") {
alert("Please Enter the FistName !");
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
if (document.forms[0].year.value=="") {
alert("Please Enter the year !");
return false;
}
if (document.forms[0].programme.value=="") {
alert("Please Enter the programme  !");
return false;
}
if (document.forms[0].degree.value=="") {
alert("Please Enter the degree  !");
return false;
}
if (document.forms[0].session.value=="") {
alert("Please Enter the session  !");
return false;
}
if (document.forms[0].add.value=="") {
alert("Please Enter the address !");
return false;
}

if (document.forms[0].journal.value=="") {
alert("Please Enter the journal !");
return false;
}

if (document.forms[0].emailid.value=="") {
alert("Please Enter the EmailId !");
return false;
}


if (document.forms[0].pass1.value=="") {
alert("Please Enter the Password !");
return false;
}

if (document.forms[0].pass2.value=="") {
alert("Please Enter the Confirm Password !");
return false;
}

}
</SCRIPT>
<FORM onSubmit="return validate()">
    <body bgcolor="orange">
 <form name="f01" method="post">
      
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
             <br><br><br>
               <table width="58%" border="0" align="center">
                 <tbody>      
                     <tr>
                      <td><font size="2" color="white"><b>*First Name</b> &nbsp&nbsp&nbsp; &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                           <input type="text" name="fname" size="30"></font>
                      </td>
                     
                      <td ><font size="2" color="white"><b>*Last Name</b><b>:</b>
                           <input type="text" name="lname" size="30"></font>
                      </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                      <td ><font size="2" color="white"><b>*Birthday</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>
                              <select  name="day1" size="1" >
                              <option >-Day-</option><option value="1">01</option><option value="2">02</option>
                              <option value="3">03</option><option value="4">04</option><option value="5">05</option>
                              <option value="6">06</option><option value="7">07</option><option value="8">08</option>
                              <option value="9">09</option><option value="10">10</option><option value="11">11</option>
                              <option value="12">12</option><option value="13">13</option><option value="14">14</option>
                              <option value="15">15</option><option value="16">16</option><option value="17">17</option>
                              <option value="18">18</option><option value="19">19</option><option value="20">20</option>
                              <option value="21">21</option><option value="22">22</option><option value="23">23</option>
                              <option value="24">24</option><option value="25">25</option><option value="26">26</option>
                              <option value="27">27</option><option value="28">28</option><option value="29">29</option>
                              <option value="30">30</option><option value="31">31</option>
                           </select>
                           <select  name="month1" size="1">
                              <option>-Month-</option><option value="jan">January</option>
                              <option value="feb">February</option><option value="mar">March</option>
                              <option value="apr">April</option><option value="may">May</option>
                              <option value="jun">June</option><option value="jul">July</option>
                              <option value="aug">August</option><option value="sep">September</option>
                              <option value="oct">October</option><option value="nov">November</option>
                              <option value="dec">December</option>
                           </select>
                          
                           <select  name="year" size="1">
                              <option value="">-Year-</option><option value="1930">1930</option>
                              <option value="1931">1931</option><option value="1932">1932</option>
                              <option value="1933">1933</option><option value="1934">1934</option>
                              <option value="1935">1935</option><option value="1936">1936</option>
                              <option value="1937">1937</option><option value="1938">1938</option>
                              <option value="1939">1939</option><option value="1940">1940</option>
                              <option value="1941">1941</option><option value="1942">1942</option>
                              <option value="1943">1943</option><option value="1944">1944</option>
                              <option value="1945">1945</option><option value="1946">1946</option>
                              <option value="1947">1947</option><option value="1948">1948</option>
                              <option value="1949">1949</option><option value="1950">1950</option>
                              <option value="1951">1951</option><option value="1952">1952</option>
                              <option value="1953">1953</option><option value="1954">1954</option>
                              <option value="1955">1955</option><option value="1956">1956</option>
                              <option value="1957">1957</option><option value="1958">1958</option>
                              <option value="1959">1959</option><option value="1960">1960</option>
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
                              <option value="1995">1995</option><option value="1996">1996</option>
                              <option value="1997">1997</option><option value="1998">1998</option>
                              <option value="1999">1999</option><option value="2000">2000</option>
                              <option value="2001">2001</option><option value="2002">2002</option>
                              <option value="2003">2003</option><option value="2004">2004</option>
                              <option value="2005">2005</option><option value="2006">2006</option>
                              <option value="2007">2007</option><option value="2008">2008</option>
                              <option value="2009">2009</option><option value="2010">2010</option>
                              <option value="2011">2011</option><option value="2012">2012</option>
                              <option value="2013">2013</option>
                           </select>
                         </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                     <td><font size="2"color="white"><b>*Gender</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                         <input type="radio" name="gender" value="male" color="white" checked><i>Male</i>&nbsp;&nbsp;
                         <input type="radio" name="gender" value="female" color="white"><i>Female</i>
                     </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                  
                   <tr><td><font size="2" color="white"><b>*Programme Stream</b> 
                             
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>
                           <select name="programme" size="1" >
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
                    <tr><td><font size="2" color="white"><b>*Delivery Type</b> 
                     &nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>
                              <select name="degree" size="1">
                             <option value="">-Select-</option> <option value="Regular">Regular</option>
                              <option value="Distance">Distance</option><option value="Online">Online</option>
                                  </select>          
                                               
                    </td></tr>            
                                      
                    <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                    <tr><td><font size="2" color="white"><b>*Session</b> 
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>
                              <select name="session" size="1">
                             <option value="">-Session-</option> <option value="July">July</option>
                              <option value="January">January</option>
                                  </select>
                        
                        
                        
                    </td></tr>
                   
                   
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                    <tr>
                     <td><font size="2" color="white"><b>*Address</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                        </font><input type="text" name="add" size="30">
                         </textarea>
                     </td>
                   </tr>
                     <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                     <td><font size="2" color="white"><b>*Journal No</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;<b>:</b>
                         <input type="text" name="journal" size="30"></font>
                     </td>
                   </tr>
                   
                   
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                     <td><font size="2" color="white"><b>*Email Id</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                         <input type="text" name="emailid" size="30"></font>
                     </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                     <td><font size="2"color="white"><b>*Create a Password</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;<b>:</b>
                         <input type="password" name="pass1" size="30">
                         </font>
                     </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                     <td><font size="2"color="white"><b>*Confirm your Password</b> <b>:</b>
                         <input type="password" name="pass2" size="30">
                         </font>
                     </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                     <td><font size="2"color="white"><b>*Mobile No</b> &nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                         <input type="text" name="mobile" size="30" maxlength="11" ></font>
                     </td>
                     <td><font size="2"color="white"><b>Alternate No</b> <b>:</b>
                         <input type="text" name="altno" size="30" maxlength="11"></font>
                     </td>
                   </tr>

                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                  <tr>
                         
<td>    <br>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="bt" value="LogIn" width="100%" height="10%">
                         &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="Search" value="Search" width="100%" height="10%">
                             &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="Update" value="Update" width="100%" height="10%">
                                 &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="Delete" value="Delete" width="100%" height="10%">
  &nbsp;&nbsp;&nbsp;&nbsp;<b> <input type="reset" name="rt" value="Reset" width="100%" height="20%" /></b></td>
</tr>
                   
                 </tbody>
               </table>
            </td>
          </tr>
        </tbody>
      </table>
    

      <%
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
                
                      %><center><b><%out.println("Registration hs been Successfully");%></b></center><%}
           else
               {
                
                %><center><b><%out.println("Password and confirm password is not match");%></b></center><%
               }
               }
                  
          
         
          
     
catch(Exception e1)
{}

%>

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
