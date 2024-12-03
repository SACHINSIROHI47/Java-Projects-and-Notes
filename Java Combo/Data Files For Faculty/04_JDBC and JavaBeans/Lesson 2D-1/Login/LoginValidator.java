import java.awt.* ;
import java.awt.event.* ;
import javax.swing.*;
import java.sql.*;

public class LoginValidator extends JFrame implements LoginListener 
{
	LoginBean meb;
	public LoginValidator() 
	{
		super("Login Form");
            /*Initialise the login bean*/
		meb = new LoginBean();
            /*Add the login bean to the frame window*/
		getContentPane().add(meb);
            /* Register LoginValidator as a listener of the 
            LoginEvent by invoking the following method of the 
            LoginBean */
		meb.addLoginListener(this);
	}
	public void validateLogin(LoginEvent mec) 
	{
		String temp1=mec.uname;
		String temp2=mec.pass;
		try 
	    	{
	/*Connecting with the database using the DSN,MyDSN*/		    	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:MyDSN", "administrator", "");
/*Using PreparedStatement to retrieve the database entry corresponding to the username and password specified by the user*/		    	
PreparedStatement stat = con.prepareStatement("SELECT * FROM validate_user WHERE username = ? AND password = ?");
		    	stat.setString(1,temp1); 
		    	stat.setString(2,temp2);
/*Storing the result of the PreparedStatement query in a ResultSet*/
ResultSet rs = stat.executeQuery();
/*Check if there exists a database entry in the ResultSet object*/
		    	if(rs.next())
		    	{
			JOptionPane.showMessageDialog(this,new 
                    String("Valid Login Details"));
    			}
	    		else 
    			{
			JOptionPane.showMessageDialog(this,new 
                    String("Invalid Login Details"));
    			}
	    	}catch(Exception e)
	    	{
		    	System.out.println("Error!" + e);
	    	}
	}
/*Defining the Main() method*/
	public static void main(String a[]) 
	{
		LoginValidator mec = new LoginValidator();
		mec.setSize(300, 300);
		mec.setVisible(true);
	}
}
