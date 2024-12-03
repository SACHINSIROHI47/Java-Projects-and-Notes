<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Automoblie Registration Page</title>
<style>
   
h2{
 font-family: Sans-serif; 
 font-size: 24px;     
 font-style: normal; 
 font-weight: bold; 
 color: blue;
 text-align: center; 
 text-decoration: underline
}
table{
 font-family: verdana; 
 color:white; 
 font-size: 16px; 
 font-style: normal;
 font-weight: bold;
 background: linear-gradient(to bottom, #33ccff 0%, #ff99cc 100%);  
 border-collapse: collapse; 
 border: 4px solid #000000;
 border-style: dashed;
  
}
table.inner{
 border: 10px
}
input[type=text], input[type=email], input[type=number]{
 width: 50%;
 padding: 6px 12px;
 margin: 5px 0;
 box-sizing: border-box;
}
input[type=submit], input[type=reset]{
 width: 15%;
 padding: 8px 12px;
 margin: 5px 0;
 box-sizing: border-box;
}
</style>
</head>
<body>
 <form>
<h2><marquee>Automoblie Registration Page</h2></marquee>
<table align="center" cellpadding = "10">
<tr>
<td>First Name</td>
<td><input type="text" name="FirstName" maxlength="50"/>
</td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="LastName" maxlength="50"/>
</td>
</tr>
<tr>
<td>Email ID</td>
<td><input type="email" name="EmailI"/></td>
</tr>
<tr>
<td>Mobile Number</td>
<td>
<input type="text" name="MobileNumber" maxlength="100"/>
</td>
</tr>
<!---------------------- Gender ------------------------------------->
<tr>
<td>Gender</td>
<td>
<input type="radio" name="Gender" value="Male" />
Male
<input type="radio" name="Gender" value="Female" />
Female
</td>
</tr>
<!------------------------- Address ---------------------------------->
<tr>
<td>Address<br /><br /><br /></td>
<td><textarea name="Address" rows="10" cols="50"></textarea></td>
</tr>
<!-------------------------- City ------------------------------------->
<tr>
<td>City</td>
<td><input type="text" name="City" maxlength="50"/>
</td>
</tr>
<!----- -------------------- Pin Code-------------------------------------->
<tr>
<td>Pin Code</td>
<td><input type="Number" name="PinCode" maxlength="6"/>
</td>
</tr>
<!---------------------------- State ----------------------------------->
<tr>
<td>State</td>
<td><input type="text" name="State" maxlength="50"/>
</td>
</tr>
<!------------------------------ Country --------------------------------->
<tr>
<td>Country</td>
<td><input type="text" name="Country" placeholder="India" /></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit">
</td>
</tr>
</table>
    <%
        try
        {
        String str1,str2,str3,str4,str5,str6,str7,str8,str9,str10;
        str1=request.getParameter("FirstName");
        str2=request.getParameter("LastName");
        str3=request.getParameter("EmailI");
        str4=request.getParameter("MobileNumber");
        str5=request.getParameter("Gender");
        str6=request.getParameter("Address");
        str7=request.getParameter("City");
        str8=request.getParameter("PinCode");
        str9=request.getParameter("State");
        str10=request.getParameter("Country");
      //  out.println(str1+""+str2+""+str3+""+str4+""+str5+""+str6+""+str7+""+str8+""+str9+""+str10);
        String url="jdbc:mysql://localhost:3306/javawebsite";
        String user="root";
        String pass="12345";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,user,pass);
        String sql="insert into registration(Fname,lname,email,mobno,gender,address,city,pincode,state,country) values (?,?,?,?,?,?,?,?,?,?)";
         PreparedStatement prep = con.prepareStatement(sql);
         prep.setString(1,str1);
         prep.setString(2,str2);
         prep.setString(3,str3);
         prep.setString(4,str4);
         prep.setString(5,str5);
         prep.setString(6,str6);
         prep.setString(7,str7);
         prep.setString(8,str8);
         prep.setString(9,str9);
         prep.setString(10,str10);
         prep.executeUpdate();
         prep.close();
        // out.println("record has been save successfully");
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    %>
</form>
</body>
</html>