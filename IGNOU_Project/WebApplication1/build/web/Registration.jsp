<%@page  language ="java" import="java.sql.*" %>
<%@page pageEncoding="UTF-8"%>
<html>
    <head>      
      <title>Online Admission Form of IGNOU </title>
    </head>
    <SCRIPT type="text/javascript">
function Load()
{
if (document.forms[0].regt.value=="") {
return false;
}
if (document.forms[0].fname.value=="") {
return false;
}
if (document.forms[0].fther.value=="") {
return false;
}
if (document.forms[0].mther.value=="") {
return false;
}
if (document.forms[0].ctgry.value=="") {
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
if (document.forms[0].gender.value=="") {
return false;
}
if (document.forms[0].adds.value=="") {
return false;
}
if (document.forms[0].dst.value=="") {
return false;
}
if (document.forms[0].stat.value=="") {
return false;
}
if (document.forms[0].cntry.value=="") {
return false;
}


if (document.forms[0].pncode.value=="") {
return false;
}

if (document.forms[0].pgrm.value=="") {
return false;
}
if (document.forms[0].del.value=="") {
return false;
}
if (document.forms[0].ssn.value=="") {
return false;
}
if (document.forms[0].jrnl.value=="") {
return false;
}
}

function validate() {
if (document.forms[0].regt.value=="") {
alert("Please Enter the Registration !");
return false;
}
if (document.forms[0].fname.value=="") {
alert("Please Enter the FistName !");
return false;
}
if (document.forms[0].fther.value=="") {
alert("Please Enter the Father Name !");
return false;
}
if (document.forms[0].mther.value=="") {
alert("Please Enter the Mother Name !");
return false;
}
if (document.forms[0].ctgry.value=="") {
alert("Please Enter the Category !");
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
alert("Please Enter the year !");
return false;
}
if (document.forms[0].gender.value=="") {
alert("Please Select the Gender  !");
return false;
}
if (document.forms[0].adds.value=="") {
alert("Please Enter the Address  !");
return false;
}
if (document.forms[0].dst.value=="") {
alert("Please Enter the District Name  !");
return false;
}
if (document.forms[0].stat.value=="") {
alert("Please Enter the State !");
return false;
}
if (document.forms[0].cntry.value=="") {
alert("Please Enter the Country Name !");
return false;
}


if (document.forms[0].pncode.value=="") {
alert("Please Enter the Pincode !");
return false;
}

if (document.forms[0].pgrm.value=="") {
alert("Please Enter the Programme !");
return false;
}
if (document.forms[0].del.value=="") {
alert("Please Enter the Delivery Type Name !");
return false;
}
if (document.forms[0].ssn.value=="") {
alert("Please Enter the Session Name !");
return false;
}
if (document.forms[0].jrnl.value=="") {
alert("Please Enter the Journal Name !");
return false;
}





}
</SCRIPT>
<FORM onSubmit="return validate()"  action = "" method="POST"  validate="true">
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
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Online_Admission.jsp"><input type="button" name="bt3" value="Back" width="100%" height="10%"></a>
&nbsp;
 <a href="studentdwn.jsp" > <b> <input type="Button" name="rt" value="Download Student Details" width="100%" height="20%" /> </b></a>
            
        
        <table width="100%" border="0">
      <tbody>
             <tr>  
       
            <td width="45%"><hr shade="2">
          
               <table width="58%" border="0" align="center">
                 <tbody>
                     <tr><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size="+2">This online application is provisional subject to payment of application fees/postal charges</font><b></tr>
                     
                     <br>
                     <tr>
                     <td><font size="2" color="white"><b>*Registration NO</b> 
                           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                        </font><input type="text" name="regt" size="30">
                         </textarea>
                     </td>
                   </tr>
                     <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
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
                      <td><font size="2" color="white"><b>*Father Name</b>  &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                           <input type="text" name="fther" size="30"></font>
                      </td>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                      <td><font size="2" color="white"><b>*Mother Name</b>  &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                           <input type="text" name="mther" size="30"></font>
                      </td>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                       <td><font size="2" color="white"><b>*Category</b> &nbsp&nbsp&nbsp; &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                            <select  name="ctgry" size="1" >
                              <option value="">-Select-</option><option value="OBC">OBC</option><option value="GEN">GEN</option> 
                              <option value="ST">ST</option><option value="SC">SC</option>
                              <option value="OTHER">OTHER</option> 
                       </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   
                   <tr>
                      <td ><font size="2" color="white"><b>*Date OF Birth</b> 
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
                   <tr>
                     <td><font size="2"color="white"><b>*Gender</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                         <input type="radio" name="gender" value="male" color="white" checked><i>Male</i>&nbsp;&nbsp;
                         <input type="radio" name="gender" value="female" color="white"><i>Female</i>
                     </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                     <td><font size="2" color="white"><b>*Address</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                        </font><input type="text" name="adds" size="30">
                         </textarea>
                     </td>
                   </tr>
                     <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                       <td><font size="2" color="white"><b>*District</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                           <input type="text" name="dst" size="30"></font>
                       </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                       <td><font size="2" color="white"><b>*State</b> &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                           <input type="text" name="stat" size="30"></font>
                       </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                       <td><font size="2" color="white"><b>*Country</b> &nbsp&nbsp&nbsp; &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                           <input type="text" name="cntry" size="30"></font>
                       </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   
                   <tr>
                       <td><font size="2" color="white"><b>*Pincode</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                           <input type="text" name="pncode" size="30"></font>
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
                    <tr><td><font size="2" color="white"><b>*Delivery Type</b> 
                     &nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>
                              <input type="text" name="del" size="30">         
                                               
                    </td></tr>            
                                      
                    <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                    <tr><td><font size="2" color="white"><b>*Session</b> 
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b></font>
                              <select name="ssn" size="1">
                             <option value="">-Session-</option> <option value="June">June</option>
                              <option value="December">December</option>
                                  </select>
                        
                        
                        
                    </td></tr>
                   
                   
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                    
                   <tr>
                     <td><font size="2" color="white"><b>*Journal No</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;<b>:</b>
                         <input type="text" name="jrnl" size="30"></font>
                     </td>
                   </tr>
                   
                   
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr>
                     <td><font size="2" color="white"><b>*Email Id</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                         <input type="text" name="emlid" size="30"></font>
                     </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   
                   
                   <tr>
                     <td><font size="2"color="white"><b>*Mobile No</b> &nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>:</b>
                         <input type="text" name="mbl" size="30" maxlength="11" ></font>
                     </td>
                     <td><font size="2"color="white"><b>Alternate No</b> <b>:</b>
                         <input type="text" name="altno" size="30" maxlength="11"></font>
                     </td>
                   </tr>
                   
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <br><br>
                  
                   
                   
                  <table border="" align="center">
                   <tr>&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp
                        Educational Qualification Details:-
                        <br><br>
                       <th>Exam Passed</th><th>Stream</th><th>Year of passing</th><th>%Marks</th>    
                   </tr>
                   <tr>
                       
                       <th><input type="text" name="ps1"></th>
                       <th><input type="text" name="ps2"></th>
                       <th><input type="text" name="ps3"></th>
                       <th><input type="text" name="ps4"></th>    
                   </tr>
                    <tr>
                       
                       <th><input type="text" name="ps5"></th>
                       <th><input type="text" name="ps6"></th>
                       <th><input type="text" name="ps7"></th>
                       <th><input type="text" name="ps8"></th>    
                   </tr>
                    <tr>
                       
                       <th><input type="text" name="ps9"></th>
                       <th><input type="text" name="ps10"></th>
                       <th><input type="text" name="ps11"></th>
                       <th><input type="text" name="ps12"></th>    
                   </tr>
                      <tr>
                       
                       <th><input type="text" name="ps13"></th>
                       <th><input type="text" name="ps14"></th>
                       <th><input type="text" name="ps15"></th>
                       <th><input type="text" name="ps16"></th>    
                   </tr>
                             
                 
                   </table>           
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
    
                   
                
      <%
String a1=request.getParameter("regt");
String a2=request.getParameter("fname");
String a3=request.getParameter("lname");
String a4=request.getParameter("fther");
String a5=request.getParameter("mther");
String a6=request.getParameter("ctgry");

String dy=request.getParameter("day");
String mnth=request.getParameter("month");
String yr=request.getParameter("year");                         
String a7=dy+"-"+mnth+"-"+yr; 

String a8=request.getParameter("gender");
String a9=request.getParameter("adds");
String a10=request.getParameter("dst");
String a11=request.getParameter("stat");
String a12=request.getParameter("cntry");
String a13=request.getParameter("pncode");
String a14=request.getParameter("pgrm");
String a15=request.getParameter("del");
String a16=request.getParameter("ssn");
String a17=request.getParameter("jrnl");
String a18=request.getParameter("emlid");     
String a19=request.getParameter("mbl");
String a20=request.getParameter("altno");
     
String a21=request.getParameter("ps1");
String a22=request.getParameter("ps2");
String a23=request.getParameter("ps3");
String a24=request.getParameter("ps4");
String a25=request.getParameter("ps5");
String a26=request.getParameter("ps6");
String a27=request.getParameter("ps7");
String a28=request.getParameter("ps8");
String a29=request.getParameter("ps9");
String a30=request.getParameter("ps10");
String a31=request.getParameter("ps11");     
String a32=request.getParameter("ps12");
String a33=request.getParameter("ps13");  
String a34=request.getParameter("ps14");
String a35=request.getParameter("ps15");
String a36=request.getParameter("ps16");


     try{
         
             
    
      
   
         Connection con1=null;   
      PreparedStatement st = null;
    
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
     con1=DriverManager.getConnection("jdbc:odbc:mydsn", "sa", "sirohi");

     st=con1.prepareStatement("insert into reg_tion(reg,fname,lname,father,mother,category,dob,gender,addrs,dist,state,country,pincode,p_stream,del_type,session,journal,Email,mobile,altr,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");     
                   
     
                            st.setString(1,a1);
                            st.setString(2,a2);
                            st.setString(3,a3);
                            st.setString(4,a4);
                            st.setString(5,a5);
                            st.setString(6,a6);
                            st.setString(7,a7);
                            st.setString(8,a8);
                            st.setString(9,a9);
                            st.setString(10,a10);
                            st.setString(11,a11);
                            st.setString(12,a12);
                            st.setString(13,a13);
                            st.setString(14,a14);
                            st.setString(15,a15);
                            st.setString(16,a16);
                            st.setString(17,a17);
                            st.setString(18,a18);
                            st.setString(19,a19);
                            st.setString(20,a20);
                            st.setString(21,a21);
                            st.setString(22,a22);
                            st.setString(23,a23);
                            st.setString(24,a24);
                            st.setString(25,a25);
                            st.setString(26,a26);
                            st.setString(27,a27);
                            st.setString(28,a28);
                            st.setString(29,a29);
                            st.setString(30,a30);
                            st.setString(31,a31);
                            st.setString(32,a32);
                            st.setString(33,a33);
                            st.setString(34,a34);
                            st.setString(35,a35);
                            st.setString(36,a36);
              st.executeUpdate();
              st.clearParameters(); 



             st.close();
             
           
             con1.close();
                    out.println("Registration has been Successfully");
    
       }                 
     
catch(Exception e1)
{}

%>   
                   
                   
                   
                  <tr>
                         
<td>    <br>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="bt" value="LogIn" width="100%" height="10%" >
  &nbsp;&nbsp;&nbsp;&nbsp;<b> <input type="reset" name="rt" value="Reset" width="100%" height="20%" /> </b> 

</b></td>
</b></td>

</tr>
       
                 </tbody>
               </table>
               
            </td>
          </tr>
        </tbody>
      </table>
      
    


    </form>
      <br><br><br>
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
