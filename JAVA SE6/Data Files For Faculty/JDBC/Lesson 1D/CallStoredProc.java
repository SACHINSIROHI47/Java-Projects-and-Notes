import java.sql.*;
public class CallStoredProc
{
   public static void main(String args[])
   {
	try
  	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver")	;
		Connection con=DriverManager.getConnection("jdbc:odbc:MyDSN","user1","");
		String str = "{call selectRow}";
		CallableStatement cstmt = con.prepareCall(str);
	      	ResultSet rs = cstmt.executeQuery();
	      	while(rs.next())
         		{
		            System.out.println("Id   : " +   Integer.toString(rs.getInt(1))+"\n");
		            System.out.println("Name : "+rs.getString(2)+"\n");
		            System.out.println("Address : " + rs.getString(3)+"\n");
		            System.out.println("Phone no : " +rs.getString(4)+"\n");
		            System.out.println("-----------------------------------------------\n");
 	             }

	} 
     	catch(Exception e)
     	{
		System.out.println("Error : " + e);
	}
  }
}
