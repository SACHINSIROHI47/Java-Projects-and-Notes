/* Import the required packages. */
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EmployeeDetails extends HttpServlet
{
	static int i;
	Connection con;
	PrintWriter out;
	ResultSet rs;
	public void init()
	{
		i = 0;	
		con=null;
		out=null;
		rs=null;
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		i++;
		out=response.getWriter();

		out.println("<B>You are user no. " + i +" to visit this site.</B><BR><BR>");

		try
		{
                        /*Load the JDBC-ODBC bridge driver*/
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        /*Obtain a Connection object*/
			con=DriverManager.getConnection("jdbc:odbc:EmployeesDB","test","password");

			PreparedStatement pstmt=null;
			String query=null;
                        /*Create SQL query*/
			query= "select emp_fname, address, age, desig from Employee_Master where id=?";
                        /*Create PreparedStatement object*/
			pstmt=con.prepareStatement(query);
                        /*Obtain the request parameter and specify it as value of the SQL statement parameter*/
			pstmt.setInt(1,Integer.parseInt(request.getParameter("id")));
                        /*Execute PreparedStatement*/
			rs=pstmt.executeQuery();
			out.println("<B><center>Employee Details </center></B><BR><BR>");
                        /*Obtain the ResultSet meta data*/
			ResultSetMetaData rsmd= rs.getMetaData();
                        /*Obtain the number of columns in the ResultSet*/
			int colcount=rsmd.getColumnCount();
			out.println("<TABLE ALIGN = CENTER BORDER=1 CELLPADDING=2>");
			out.println("<TR>");
                        /*Display column names in table*/
			for(int i=1; i<=colcount; i++)
			{
out.println("<TH>" + rsmd.getColumnLabel(i)+"</TH>");
			}
	out.println("</TR>");
	/*Iterate through the ResultSet*/
	while(rs.next())
	{
     /*Send the name, address, age, and designation values as response to the client */  	out.println("<TR>");
	out.println("<TD>" + rs.getString("emp_fname") + "</TD>");
out.println("<TD>" + rs.getString("address") + "</TD>");
	out.println("<TD>" + rs.getString("age") + "</TD>");
	out.println("<TD>" + rs.getString("desig") + "</TD>");
	out.println("</TR>");
	}
               out.println("</TABLE>");
	        out.println("</BODY>");
	}
	catch(Exception e)
	{
               /*Send exception message if any*/
		out.println(e.toString());
	}
	}
	
	public void destroy()
	{
		try
		{
			i = 0;	
			con.close();
			out.close();
			rs.close();
		}
		catch (SQLException se)
		{
			out.println(se.toString());
		}
	}
}
