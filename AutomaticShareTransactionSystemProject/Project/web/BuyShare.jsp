<%-- 
    Document   : BuyShare
    Created on : Feb 15, 2014, 7:04:58 PM
    Author     : chaudhary
--%>

<%@page contentType="text/html" language="java" import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Automatic Share Transaction System</title>
         <style laguage="text/css">
            		body
			{
				background-image:url(image/.jpg);
				background-repeat:repeat-y;
				background-attachment:fixed;
				background-position:top center
			}

    </style>
    
    </head>
    <script type="text/javascript">

 function trim(s)
 {
    return s.replace(/^\s*/,"").replace(/\s*$/,"");

 }
  function isNumberKey(evt)
 {
    var charCode = (evt.which) ? evt.which : event.keyCode

    if (charCode > 31 && (charCode < 48 || charCode > 57))
     {
	return false;
     }
      return true;
  //on text box event = onkeypress="return isNumberKey(event)"
 }

 function validate()
 {
       var str=/^[A-Za-z][.A-Za-z ]{0,100}$/;

       var chge="Are you sure you want to buy the share!";


   if((trim(document.form.fname.value)=="") || str.test(trim(document.form.fname.value))==false)
	{
	alert("Please fill your first name and should be characters only");
	document.form.fname.focus();
	return false;
        }
   else if((trim(document.form.buy.value)==""))
        {
         alert("Please Fill the number of share to buy !");
         document.form.buy.focus();
         return false;
        }

   else if(trim(document.form.buy.value).length<=0 || trim(document.form.buy.value)<=0)
         {
         alert("Number of share value is Zero !.");
         document.form.buy.focus();
         return false;
          }
   else if(trim(document.form.buy.value)>trim(document.form.noshare.value))
          {
         alert("Number of share value is exceed please Fill the exist share value !.");
         document.form.buy.focus();
         return false;
          }

   if(confirm(chge)==false)
        {
         return false;
        }

  }
</script>

   
    <body bgcolor="mergenta">
<%!
     Connection con;
     Statement st;
     ResultSet rs;
     String str,str2,sst,com_pnay;
%>
    <table>
        <tr>


               <td align="middle" valign="centre" width="10%" height="30" bgcolor="white">
                 <font size="+7" color="brown"><B>AUTOMATIC SHARE TRANSACTION SYSTEM</B></font>
                 </td>
        </tr>
        <TR>
         <td align="middle" valign="centre" width="10%"  bgcolor="BLACK">
                 <marquee behavior="alternate" scrollamount="3"><font size="5" color="white"><B>Welcome  to Buy Share Page </B></font></MARQUEE>

          </td>
        </TR>

        </table>
        <table align="center">
            <tr>
                <td bgcolor="mergenta">
                <td bgcolor="white"> <a href="HomePage.jsp"><font color="brown" size="5" <b>Home</b></font></a>|</td>
                <td bgcolor="white" ><a href="About_Us.jsp"><font  color="green" size="5">About Us</font></a>|</td>
                <td bgcolor="white"><a href="Contact_Us.jsp"><font color="brown" size="5" >Contact Us</font></a>|</td>
                <td bgcolor="white"><a href="VisionAndMission.jsp"><font color="green" size="5" >Vision & Mission</font></a>|</td>
                <td bgcolor="white"><a href="SellShare.jsp"><font color="brown" size="5" >Sale Share</font></a>|</td>
               

                 </tr>

        </table>
    <br/>

    <table align="center"><tr><td><font size="5" color="brown">Buy share</font></td></tr></table><br>


    <table align="center"><tr> <td align="left">

      Company:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            
    <script>
        var selGate = "empty"
        var a

       


    </script>
       <%!
   String CategoryCombo;%>




      <SELECT id="cmbGate" name="abc" SIZE="1" STYLE ="width: 200px" onchange="chGate()" >
          <option value="" selected >Please Select:</option>
           <%
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:mydsn","sa","sachin");
            st=con.createStatement();
            rs=st.executeQuery("select companyname from CompanyRegistration ");
           %>
           <% while(rs.next()) {
            CategoryCombo = rs.getString("companyname");%>
           <OPTION value ="<%=CategoryCombo%>"><%=CategoryCombo%>
          </OPTION>
           <%
           }
           %>
        </SELECT>
   <form name="form" onSubmit="return validate()" method="Post" >
      <div id="selected"></div>
 
  <script>
                function chGate()
                {
                     var e = document.getElementById("cmbGate");//get the combobox
                     selGate= e.options[e.selectedIndex].value;//get selected value
                     //document.getElementById("selected").innerHTML = "selected:"+selGate;
                     window.location.replace("BuyShare.jsp?h1="+selGate);
                }
   </script>

  <%

    try
         {
          sst=request.getParameter("h1");
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          con=DriverManager.getConnection("jdbc:odbc:mydsn","sa","sachin");
          st=con.createStatement();
          rs=st.executeQuery("select * from CompanyRegistration where companyname='"+sst+"'");
           while(rs.next())
           {
           str=rs.getString("noofshare");
           str2=rs.getString("sharevalue");
           }
          }
       catch(Exception e1)
         {
         }
    %>


 <br>       
             First Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="fname" size="30"><font color="red">&nbsp;*</font><br></br>
             Middle Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="mname" size="30"><br></br>
             Last Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="lname" size="30"><br></br>
             NoofAvailableShare:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="noshare" size="30"  value="<%=str==null ? "" : str%>" style="background: lightgrey" readonly><br></br>
             
             Share Value:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="svalue" size="30" bgcolor="gray" id="s1" value="<%=str2==null ? "" : str2%>" style="background: lightgrey" readonly >&nbsp;Per Share Price<br></br>
             Number of share to Buy:&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="text" name="buy" size="30" maxlength="" id="s2" onkeypress="return isNumberKey(event)" ><font color="red">&nbsp;*</font><br></br></br>
             
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             <input type="submit" name="BuyShare" value="BuyShare">&nbsp;&nbsp;
              <input type="Reset" name="Reset">&nbsp;&nbsp;
              <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

              <%

try
{
// out.println(sst);
 String k1=request.getParameter("fname");
 String k2=request.getParameter("mname");
 String k3=request.getParameter("lname");
 String k4=request.getParameter("noshare");
 String k5=request.getParameter("svalue");
 String k6=request.getParameter("buy");

 if((k1.equals("null") || k1.toString()=="") ||  (k4.equals("null") || k4.toString()=="") || (k5.equals("null") || k5.toString()=="")|| (k6.equals("null")|| k1.toString()==""))
     {
     }
 else
     {

 int i=st.executeUpdate("insert into buyshare values('"+sst+"','"+k1+"','"+k2+"','"+k3+"','"+k4+"','"+k5+"','"+k6+"')");
if(i!=0)
    {
        
          %><jsp:forward page="PrintBuyDetails.jsp" />

         <%

         
    }

else
     { %><font color="green" ><b>
         <%
         out.println("Share not buy Successfully");

          %> </b></font>

         <%
 }
}
 }
catch(Exception e)
    {
    }
   %>
          </td>
    </tr>

</table>
    </body>
    </form>
</html>
