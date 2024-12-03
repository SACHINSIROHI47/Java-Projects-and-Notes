<%@page language="java" import="java.sql.*" import="java.lang.*"%>
<%@page pageEncoding="UTF-8"%>

    
<html>
<body>
<form    action=""  name="f11" method="post" >
    <table><tr>
        <td>  Registration Id*: <input type="password" name="pass2" size="30"></font>
        </td></br>
        </tr>
        <tr>
        <td>
        Student Name:<input type="text" name="stdname" size="30">
        </td></tr><br>
        <tr>
        <td>Bank Name <input type="text" name="bkname" size="30" value=""%>></font>
        </td></tr><br>
        <tr><td>Bank Fee <input type="text" name="bkfee" size="30"></font>
        </td></tr><br>
        <tr>
         <td>Bank Name<input type="text" name="bkname" size="30"></font>
        </td>
        </tr>
        <tr><td>
                      <input type="submit" value="Login" size="30">
                   
         </td></tr>             
                     
</table>

    <%
    String id2=request.getParameter("pass3");
    out.println(id2);
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
    rs=st.executeQuery("select * from registration2 where emailid='"+id2+"' and createpwd='"+pwd+"'");
    %>
    <table border=1 align=center>
        <tr><th>Email Id</th><th>Password</th></tr>
        <%
        while(rs.next())
        {
        %>
        <tr>
            <td><%=rs.getString("emailid") %></td>
             <td><%String str=rs.getString("emailid");
           
             
             %></td>
            <td><%=rs.getString("createpwd")%></td>
        </tr>
        <%
        }
        %>
    </table>
    <%
    }catch(Exception e){}
    %>
</form>                        
 </body>
</html>
    