<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .contin{
                color: black;
                text-align: center;
                font-size: 30px;
                box-sizing: content-box;
  width: 1000px;
  border: 5px solid black;
  
  margin-left: 300px;
  background-image: url(image//img6.jpg)
            } 
            input[type=text] {
  box-sizing: border-box;
}
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
    </head>
    <body style="background-color:powderblue;">
        
        <h1 style="text-align:center;">Insurance login form!</h1>
        <form>
        <div class="contin">
        First Name:<input type="text" name="username" size="30"/><br/><br/>
        Password: &nbsp;<input type="text" name="password" size="30"/><br/><br/>
        <input style="font-size: 25px;" type="submit" value="Submit"/>
        
        <%
            try
            {
                Statement st;
                ResultSet rs;
                String str1,str2,ustr=null,pstr=null;
                str1=request.getParameter("username");
                str2=request.getParameter("password");
                String url="jdbc:mysql://localhost:3306/javawebsite";
                String user="root";
                String pass="12345";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection(url, user, pass);
                st=con.createStatement();
                rs=st.executeQuery("select username,passwd from login");
                while(rs.next())
                {
                    ustr=rs.getString("username");
                    pstr=rs.getString("passwd");
                    
                }
              //  out.println(ustr+" "+pstr);
               // out.println(str1+""+str2);
                if(str1.equals(ustr)&& str2.equals(pstr))
                {
                    out.println("Login Successfully");
                    %>
                    <jsp:forward page ="Registration.jsp"/>
                    <%
                }
                else
                {
                    out.println("Login UnSuccessfully");
                }
                }
                catch(Exception ex)
                {
                        
                   ex.printStackTrace();    
                    }
                    
        %>
        </div>
    </form>
    </body>
</html>
