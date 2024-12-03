<%@page language="java" import="java.sql.*" import="java.lang.*"%>
<%@page pageEncoding="UTF-8"%>

    
<html>
<body>
<form    action=""  name="f11" method="post" >
EmailID<input type="text" name="email" size="30">
                      Password*<input type="password" name="pass2" size="30"></font>
                      <input type="submit" value="Login" size="30">
                      <select name="pass3" size="1">
                          <option value="eid">eid</option>
                           <option value="sachin@gmail.com">sachin@gmail.com</option>
                      </select>

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
    con=DriverManager.getConnection("Jdbc:Odbc:mydsn","sa","sirohi");
    st=con.createStatement();
    rs=st.executeQuery("select * from registration where emailid='"+id2+"' and createpwd='"+pwd+"'");
    %>
    <table border=1 align=center>
        <tr><th>Email Id</th><th>Password</th></tr>
        <%
        while(rs.next())
        {
        %>
        <tr>
            <td><%=rs.getString("emailid")%></td>
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
    