/* Import the packages */
package test;
import java.io.Serializable;
import java.util.*;
import java.sql.*;
import java.io.*;
/* Creating an class BankUser and implement the Serializable interface */
public class BankUser implements Serializable
{

	private String userId, pwd;
	public int result;
	/* Setting the userId property */
	public void setUserId(String userId)
	{
		if(userId!= null)
		  this.userId = userId;
	}
	/* Get the userId property */
	public String getUserId()
	{
		return this.userId;
	}
	/* Get the value of pwd property */
	public String getPwd()
	{
		return this.pwd;
	}
	/* Setting the pwd property */
	public void setPwd(String Password)
	{
		if (Password != null)
			this.pwd = Password;
	}
	/* Defining a method to fetch the result from the User_Login database */
	public int getResult()
	{
		try
		{
			/* Loading the driver */
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			/* Creating a connection */
			Connection con = DriverManager.getConnection("jdbc:odbc:UserLoginDataSource", "", "");
			/* Creating a prepared statement */
			PreparedStatement stat = con.prepareStatement( "SELECT * FROM User_Login WHERE user_id = ? AND user_password = ?");
			/* Set the userId and password in the query */
			stat.setString(1,userId);
			stat.setString(2,pwd);
			/* Get the result set from the User_Login database */
			ResultSet rs = stat.executeQuery();
			if(rs.next())
			{
				/* If the entered user name and password are correct */
				return 1;
			}
			else
			{
				/* If the entered user name or password is incorrect */
				return 0;
			}
		}
		/* Handling the exception */
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		/* Returning the vector */
		return 3;
	}/* End getResult() */
}/* End BankUser */
