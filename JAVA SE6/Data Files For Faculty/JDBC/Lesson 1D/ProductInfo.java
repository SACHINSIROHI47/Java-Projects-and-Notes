import java.sql.*;
public class ProductInfo
{
    public static void main(String args[])
    { 
        int cont;
        try
        {
	    /*Initialize and load the JDBC-ODBC Bridge driver*/
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	    /*Establish a database connection*/
	    Connection con = DriverManager.getConnection("jdbc:odbc:MyDSN","administrator","");
	   /*Create the customer table using the CREATE TABLE statement*/
	   String str = " INSERT INTO product VALUES (1009,'Computer',200, 5, 'Number')";
    	    /*Create a Statement object*/
	   Statement stmt = con.createStatement();
	   int count = stmt.executeUpdate(str);
       	   System.out.println("Row inserted");
	   stmt.close();
                con.close();
        }
      catch(Exception e)
      {
          System.out.println("Error " + e);
      }
  }
}
