/* Import the required packages. */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
/* Extends HttpServlet class. */
public class EmployeeInformation extends HttpServlet
{
	/* Override the doGet() method of HttpServlet class. */
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		/* Invoke the doPost() method that implements the functionality of the servlet. */
		doPost (req,resp);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		/* Declare the objects of ResultSet, PreparedStatement, and Connection classes. */
		ResultSet rs = null;
		PreparedStatement pstmt=null;
	             PreparedStatement pstmt2=null;
		Connection con=null;
            /* Set the content type of response to text/html. */
		resp.setContentType("text/html");
		/* Obtain an instance of PrintWriter. */
		PrintWriter out=resp.getWriter();
		try
		{
			
			/* Load the JDBC ODBC bridge driver. */
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			/* Create a connection object using the DSN, empDSN. */
			con=DriverManager.getConnection("jdbc:odbc:empDSN","test","password");                   
			/* Retrieve the user information from the object of HttpServletRequest class. */
			String fname=req.getParameter("f_name");
			String lname=req.getParameter("l_name");
			String addr=req.getParameter("address");
			String dept=req.getParameter("department");
			int age = Integer.parseInt(req.getParameter("age"));
			String desig=req.getParameter("designation");
            /*Create a PreparedStatement object to insert employee data*/
            pstmt=con.prepareStatement ("Insert into Employee_Master(emp_fname,emp_lname,address,dept,age,desig)values(?,?,?,?,?,?)");
            /*Set parameter values of SQL satement*/ 
            pstmt.setString(1,fname);
            pstmt.setString(2,lname);
            pstmt.setString(3,addr);
            pstmt.setString(4,dept); 
            pstmt.setInt(5,age);
            pstmt.setString(6,desig); 

            /*Execute the PreparedStatement object*/ 
            pstmt.executeUpdate();  
                 
            /*Create PreparedStaement to rerieve employee data*/
			pstmt2=con.prepareStatement ("select * from Employee_Master");
            /*Execute the PreparedStatement object*/ 
			rs=pstmt2.executeQuery();
			out.println("<H3>The employee information stored in the database are:</H3><BR>");
			/* Retrieve the employee information stored in the database. */

			out.println("<HTML><BODY>");
			out.println("<TABLE BORDER=1 WIDTH=80%>");
			out.println("<TR>");
			out.println("<TH>First Name</TH><TH>Last Name</TH><TH>Address</TH><TH>Department</TH><TH>Age</TH><TH>Designation</TH>");
			out.println("</TR>");

			/* Display the employee information on the client browser. */
			while (rs.next())
			{
				out.println("<TR>");
				out.println("<TD>" + rs.getString("emp_fname") + "</TD>");
				out.println("<TD>" + rs.getString("emp_lname") + "</TD>");
				out.println("<TD>" + rs.getString("address") + "</TD>");
				out.println("<TD>" + rs.getString("dept") + "</TD>");
				out.println("<TD>" + rs.getInt("age") + "</TD>");
				out.println("<TD>" + rs.getString("desig") + "</TD>");
				out.println("</TR>");
			}
			out.println("</TABLE>");
			out.println("</BODY>");
			out.println("</HTML>");
		}
		catch(Exception exp)
		{
			out.println(exp.toString());
		}
	}
}
