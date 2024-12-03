package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.FinderException;
import javax.ejb.NoSuchEntityException;
import javax.ejb.ObjectNotFoundException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



public class StockBeanEJB implements EntityBean {
  private String stockId;
  private String sname;
  private EntityContext context;
  private Connection conn;
  public String getStockId() {
    return stockId;
  }
  public String getStockName() {
    return sname;
  }
  public void setStockName(String name) {
    this.sname = name;
  }
  public String ejbFindByPrimaryKey(String primaryKey)
    throws FinderException {
    boolean result;
    try {
      String stmt =
        "select stockId " +
        "from stocktable where stockId = ? ";
      PreparedStatement pstmt =
        conn.prepareStatement(stmt);
      pstmt.setString(1, primaryKey);

      ResultSet rs = pstmt.executeQuery();
      result = rs.next();
      pstmt.close();
    }
    catch (SQLException ex) {
      throw new EJBException("ejbFindByPrimaryKey: " +
        ex.getMessage());
    }

    if (result) {
      return primaryKey;
    }
    else {
      throw new ObjectNotFoundException
        ("Stock " + primaryKey + " not found.");
    }
  }

  public String ejbCreate(String stockId, String name)
    throws CreateException {

    try {
      String findstmt =
        "select stockId " +
        "from stocktable where stockId = ? ";
      PreparedStatement pfindstmt =
        conn.prepareStatement(findstmt);
      pfindstmt.setString(1, stockId);

      ResultSet rs = pfindstmt.executeQuery();
      boolean findresult = rs.next();
      if (findresult) {
        throw new CreateException("Stock already exists!");
      }

      String stmt =
        "insert into stocktable values ( ? , ? )";
      PreparedStatement pstmt = conn.prepareStatement(stmt);

      pstmt.setString(1, stockId);
      pstmt.setString(2, name);

      pstmt.executeUpdate();
      pstmt.close();
    }
    catch (SQLException ex) {
      ex.printStackTrace();
      throw new EJBException("ejbCreate: " + ex.getMessage());
    }

    this.stockId = stockId;
    this.sname = name;

    return stockId;
  }

  public void ejbPostCreate(String stockId, String name)
    throws CreateException { }

  public void ejbRemove() {
    try {
      String stmt =
        "delete from stocktable where stockId = ? ";
      PreparedStatement pstmt =
        conn.prepareStatement(stmt);

      pstmt.setString(1, stockId);
      pstmt.executeUpdate();
      pstmt.close();
    }
    catch (SQLException ex) {
      throw new EJBException("ejbRemove: " + ex.getMessage());
    }
  }

  public void ejbLoad() {
    try {
      String stmt =
        "select name from stocktable where stockId = ? ";
      PreparedStatement pstmt =
        conn.prepareStatement(stmt);

      pstmt.setString(1, stockId);

      ResultSet rs = pstmt.executeQuery();

      if (rs.next()) {
        this.sname = rs.getString(1);
        pstmt.close();
      }
      else {
         pstmt.close();
         throw new NoSuchEntityException("Stock: " +
           stockId + " not in database.");
      }
    }
    catch (SQLException ex) {
      throw new EJBException("ejbLoad: " + ex.getMessage());
    }
  }

  public void ejbStore() {
    try {
      String stmt =
            "update stocktable set name =  ? " +
            "where stockId = ?";
      PreparedStatement pstmt =
        conn.prepareStatement(stmt);

      pstmt.setString(1, sname);
      pstmt.setString(2, stockId);
      int rowCount = pstmt.executeUpdate();
      pstmt.close();

      if (rowCount == 0) {
        throw new EJBException("Store for " +
          stockId + " failed.");
      }
    }
    catch (SQLException ex) {
      throw new EJBException("ejbStore: " + ex.getMessage());
    }
  }

  public void ejbPassivate() { }

  public void ejbActivate() { }

  public void setEntityContext(EntityContext ctx) {
    context = ctx;

    try {
      getDatabaseConnection();
    }
    catch (Exception ex) {
      throw new EJBException("Unable to connect to database. " +
      ex.getMessage());
    }
  }

  public void unsetEntityContext() {
    context = null;
    try {
      conn.close();
    }
    catch (SQLException ex) {
      throw new EJBException("unsetEntityContext: " +
        ex.getMessage());
    }
  }


  private void getDatabaseConnection()
    throws NamingException, SQLException {

    InitialContext ctx = new InitialContext();
    DataSource ds =
      (DataSource) ctx.lookup("java:comp/env/jdbc/ejbUserAccount");
    conn =  ds.getConnection();
  }
}
