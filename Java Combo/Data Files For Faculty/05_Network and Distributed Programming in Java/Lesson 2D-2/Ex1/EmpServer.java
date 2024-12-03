import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
public class EmpServer extends UnicastRemoteObject implements EmpRemote
{
	/* Declare the JDBC variables */
	static ResultSet result;
	static Connection con;
	static PreparedStatement stat;
	/* Define the default constructor of the server class */
	public EmpServer() throws RemoteException
	{
		super();
	}
	/* Define the remote method, insertInformation() */
	public String insertInformation(String fname, String lname, String address, String city, String phone, String salary, String designation, String depttype) throws RemoteException
	{
		int no_of_rows = 0;
		String string = "FAILED!";
		try
		{
			int empsalary = Integer.parseInt(salary);
			/* The forName() method finds the specified JDBC driver */
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			/* Establish a connection between application and database */
			con=DriverManager.getConnection("jdbc:odbc:MyDSN", "administrator", "");
			/* Create a object of Statement interface */
			stat=con.prepareStatement("insert into EmpInfo values(?, ?, ?, ?, ?, ?, ?, ?)");
			stat.setString(1, fname);
			stat.setString(2, lname);
			stat.setString(3, address);
			stat.setString(4, city);
			stat.setString(5, phone);
			stat.setInt(6, empsalary);
			stat.setString(7, designation);
			stat.setString(8, depttype);
			/* Executes the SQL query to update the table */
			no_of_rows = stat.executeUpdate();
			System.out.println("The number of rows are:"+ no_of_rows);
			if(no_of_rows > 0)
			{
				string = "SUCCESS!";
			}
		}
		catch(Exception v)
		{
			System.out.println("Error:" + v);
		}
		return string;
	}
	public static void main(String args[])
	{
		/* Set the security manger */
		System.setSecurityManager(new RMISecurityManager());
		try
		{
			/* Create the server object */
			EmpServer emp_ser = new EmpServer();
			/* Bind the server object to the RMI registry */
			Naming.rebind("EmpInfo", emp_ser);
			System.out.println("Server is registered.");
			System.out.println("Now, server is waiting for client request...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}/* End of main() method */
}/* End of the EmpServer class */
