<%@page language ="java" import="java.sql.*" contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
   <head>
      <title>Online Admission Form of IGNOU </title>

     
   </head>
<SCRIPT>
   
    function validate() {
if (document.forms[0].email.value=="") {
 alert(' Please enter valid Email Id!');
return false;
}

if (document.forms[0].pass2.value=="") {
      alert(' Please enter valid Password!');
return false;
}

}
</SCRIPT>
 <form  action="" onSubmit="return validate()" name="f11" method="post">
     

<body topmargin="0" leftmargin="0" rightmargin="0" bgcolor="orange" background="images/bk.jpg" width="100%" height="100%">

   <table width="100%" cellpadding="0" cellspacing="0">
     <tbody>
        <tr bgcolor="green">
          <td valign="centre" width="10%" align="middle">
              <img alt="no image available" src="images/1.gif" width="80" height="80">
          </td>
          <td align="middle"><b><font size="+4" color="white">UNIVERSITY OF IGNOU</font></b>
          </td>
        </tr>
        
        <tr class="tdheader1">
         <td colspan="2" bgcolor="gray"><p align="LEFT"><font size="+2" ><marquee> Welcome to the Student</marquee> </font></p>
          <font size="+2"></font>
         </td>
        </tr>
      </tbody>
    </table>
      <table><tr >
           <td>
                <marquee><img src="images/p2.jpg"><img src="images/p3.jpg"><img src="images/p4.jpg"><marquee>
            
        </td>
          <td>
                <img src="images/p5.jpg"><img src="images/2.jpg"><img src="images/p10.jpg">
            
        </td>
        <td>
                <marquee><img src="images/p1.jpg"><img src="images/p9.jpg"><img src="images/p10.jpg"><img src="images/p11.jpg"><img src="images/p4.jpg"><img src="images/p5.jpg"><marquee>
            
        </td></tr></table> 


  <div align="center">
   <table width="80%" border="0">
      <tbody>
         <tr>
            <td width="45%">
             <br><br><br><br>
               <table width="35%" border="0" align="center">
                 <tbody>
                   <tr class="td5">
                      <td><font size="2">&nbsp;&nbsp;&nbsp;&nbsp;Email ID*
                              <b>:</b><input type="text" name="email" size="30"></font>
                      </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr class="td5">
                      <td><font size="2">&nbsp;Password*<b>:</b>
                          <input type="password" name="pass2" size="30"></font>
                      </td>
                   </tr>
                   <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                   <tr bgcolor="mergenta">
                      <td><font size="3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                           &nbsp;&nbsp;<input type="submit" value="Login" size="30">
                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                          <a href="Registration.jsp"><font size="4">&nbsp;New User Registration</font></a>
                 </td>
               </tr>
                 </tbody>
               </table>
            </td>
          </tr>
        </tbody>
      </table>
      <%
    String id=request.getParameter("email");
    
    String pwd=request.getParameter("pass2");
    Connection con;
    Statement st;
    ResultSet rs;
    try
    {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("Jdbc:Odbc:mydsn2","sa","sirohi");
         st=con.createStatement();
         rs=st.executeQuery("select * from registration2 where emailid='"+id+"' and createpwd='"+pwd+"' ");
        
             while(rs.next())
             {
              String str1=rs.getString(10);
              String str2=rs.getString(11);
               
                if(id.trim().isEmpty())
                {
                %><center><%out.println("Plz. Enter Your username");%></center><%
               }
             
                    if(pwd.trim().isEmpty())
                   {
                    %><center><%out.println("Plz. Enter Your Password");%></center><%
             
                   
                    }
              
             if(id.equals(str1)&& pwd.equals(str2))
                 {
                 %><jsp:forward page="Std_Details.jsp"></jsp:forward><%
                  
                 }
                 else 
                     {
                     out.println("Enter the correct EmailID and Password");
                     break;
                     }
                     }
                 
            
     }catch(Exception e){}
    %>
      
     <br><p></p></div></form><br><br>
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
