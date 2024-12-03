import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
import java.util.*;

public class ErnstBankServerImpl extends UnicastRemoteObject
implements ErnstBankServer
{
	static ResultSet result;
	static Connection con;
	static PreparedStatement p_stat;
	static Statement stat;

	public ErnstBankServerImpl() throws RemoteException
	{
		super();
	}

public Vector display(String sLoan_registration_id,String sFirstName, String sLastName) throws RemoteException
	{
		Vector vec = new Vector();
		ResultSet rs = null;
		String sBalance = "";
	  	String sLoanAmt = "";
		String sAddress = "";
String sSql = new String();
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:MyDSN", "administrator", "");
			stat=con.createStatement();
sSql = "Select mBalance,mLoan_Amount,cAddress "+
"from Loan_Registration Lr,Loan_Details Ld " +
"where Lr.cLoan_registration_id = Ld.cLoan_registration_id "+
"and Ld.cLoan_registration_id ='"+sLoan_registration_id+"' " +
"and Lr.cFirst_name='"+sFirstName+"' " +
"and Lr.cLast_name='"+sLastName+ "' ";
			System.out.println(sSql);
			rs = stat.executeQuery(sSql);
			if(rs.next())
                  {
			  sBalance = rs.getString(1);
			  sLoanAmt = rs.getString(2);
			  sAddress = rs.getString(3);
			}

			vec.add(sBalance);
			vec.add(sLoanAmt);
			vec.add(sAddress);

		}

		catch(Exception v)
		{
			System.out.println("Error is "+v.getMessage());
		}
		return vec;
	}
public String update(String sLoan_registration_id,String sAddress) throws RemoteException
	{
		String sReturn = "fail";
		int rowsAffected = 0;
String sSql = "";
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:MyDSN", "administrator", "");
			stat=con.createStatement();
sSql = "Update Loan_Registration set cAddress = '"+sAddress+"'"+       
" where cLoan_registration_id ='"+sLoan_registration_id+"'";
System.out.println(sSql);
			rowsAffected = stat.executeUpdate(sSql);

			if(rowsAffected>0)
			{
			 sReturn = "success";
			}

		}

		catch(Exception v)
		{
			System.out.println("Error is "+v.getMessage());
		}

		return sReturn;
	}
public static void main(String args[])
	{
		System.setSecurityManager(new RMISecurityManager());
		try
		{
  		  ErnstBankServerImpl instance = new ErnstBankServerImpl();
		  Naming.rebind("ErnstBankServer",instance);
		  System.out.println("Server Registered");
		}
		catch(Exception e)
		{
		  System.err.println(e);
		}
	}
}
