import java.util.*;
import javax.ejb.*;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import javax.transaction.*;

public class JTABankEJB implements SessionBean {

   private String customerId;
   private float balance;
   private SessionContext context;
   private Connection con;
   private String dbName = "java:comp/env/jdbc/JTA";

   public void deposit(float amount) {

      UserTransaction ut = context.getUserTransaction();

      try {
         ut.begin();
         updateBalance(amount);
         balance += amount;
         insertFund(balance);
         ut.commit();
      } catch (Exception ex) {
          try {
             ut.rollback();
          } catch (SystemException syex) {
              throw new EJBException
                 ("Rollback failed: " + syex.getMessage());
          }
          throw new EJBException 
             ("Transaction failed: " + ex.getMessage());
     }
   }

   public void ejbCreate(String id) throws CreateException {

      customerId = id;

      try {
         makeConnection();
         balance = 5000;
      } catch (Exception ex) {
          throw new CreateException(ex.getMessage());
      }
     
   }

   public void ejbRemove()  {

      try {
         con.close();
      } catch (SQLException ex) {
          throw new EJBException(ex.getMessage());
      }
   }

   public void ejbActivate()  {

      try {
         makeConnection();
      } catch (Exception ex) {
          throw new EJBException(ex.getMessage());
      }
   }

   public void ejbPassivate()  {

      try {
         con.close();
      } catch (SQLException ex) {
          throw new EJBException(ex.getMessage());
      }
   }

   public void setSessionContext(SessionContext context) {
      this.context = context;
   }

   public JTABankEJB() {}

   private void makeConnection() 
   {
     try {
      InitialContext ic = new InitialContext();
      DataSource ds = (DataSource) ic.lookup(dbName);
      con =  ds.getConnection();
    } catch(Exception ex){
            throw new EJBException("Unable to connect to database. " + ex.getMessage());
        }
   }

   private void updateBalance(float amount) 
      throws SQLException {

      String updateStatement =
            "update customer set balance =  balance - ? " +
            "where id = ?";

      PreparedStatement prepStmt = 
            con.prepareStatement(updateStatement);

      prepStmt.setFloat(1, amount);
      prepStmt.setString(2, customerId);
      prepStmt.executeUpdate();
      prepStmt.close();
   }

   private void insertFund(float amount)
      throws SQLException {

      String insertStatement =
            "insert into fund values " +
            "(?, ?)";

      PreparedStatement prepStmt =
            con.prepareStatement(insertStatement);

      prepStmt.setString(1, customerId);
      prepStmt.setFloat(2, amount);
      prepStmt.executeUpdate();
      prepStmt.close();
  }

}
