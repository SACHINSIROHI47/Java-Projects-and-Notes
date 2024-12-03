import java.sql.*;
public class UpdatableResultSet
{
   public static void main(String args[])
   {
      try
      {
        //Initialize and load the JDBC-ODBC bridge driver
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        //Establish a connection with a database
         Connection con = DriverManager.getConnection("jdbc:odbc:MyDSN","administrator","");
        //Create a Statement object 
          Statement stmt = con.createStatement();
         //Create an Updateable resultset
          stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         //Execute the SELECT statement to retrieve author information
          ResultSet rs = stmt.executeQuery("SELECT au_id, city, state FROM authors WHERE au_id='10001' ");
          rs.next();
          //Update data  
          rs.updateString("state", "MD");
          rs.updateString("city", "Rockville");
          rs.updateRow();
          Statement stmt1 = con.createStatement();
          ResultSet rs1 = stmt1.executeQuery("SELECT au_id, city, state   FROM authors WHERE au_id='10001' ");
          rs1.next();
          System.out.println(rs1.getString(1) + ", " + rs1.getString(2) + ", " + rs1.getString(3));	
          con.close();
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
   }
}
