import java.sql.*;
import javax.sql.*;
import java.util.*;
import java.math.*;
import javax.ejb.*;
import javax.naming.*;
public class UserAccountBean implements EntityBean 
{
    private String id;
    private String name;
    private String address;
    private String phoneNo;
    private EntityContext context;
    private Connection con;
    private final static String dbName = "java:comp/env/jdbc/UserAccountDB";
    public String getName() 
    {
        return name;
    }

    public String getAddress() 
    {
        return address;
    }
    public String getPhoneNo() 
    {
        return phoneNo;
    }
/*--------------------------------------------------------------------------------------------------------------*/
    public String ejbCreate(String id, String name, String address, String phoneNo) throws CreateException 
    {
       try {
            insertRow(id, name, address, phoneNo);
        } catch (Exception ex) 
	  {
            throw new EJBException("ejbCreate: " + ex.getMessage());
        }
        this.id = id;
        this.name = name;        
	 this.address = address;
	 this.phoneNo = phoneNo;
	 return id;
    }
    public String ejbFindByPrimaryKey(String primaryKey) throws FinderException 
    {
        boolean result;
        try {
            result = selectByPrimaryKey(primaryKey);
        } catch (Exception ex) 
	  {
            throw new EJBException("ejbFindByPrimaryKey: " + ex.getMessage());
        }
        if (result) 
	  {
            return primaryKey;
        } 
	  else 
	  {
            throw new ObjectNotFoundException ("Row for id " + primaryKey + " not found.");
        }
    }
    public Collection ejbFindByName(String name) throws FinderException 
    {
        Collection result;
        try {
            result = selectByName(name);
        } catch (Exception ex) 
	  {
            throw new EJBException("ejbFindByName " + ex.getMessage());
        }
        return result;
    }
    public void ejbRemove() 
    {
        try {
            deleteRow(id);
        } catch (Exception ex) 
	  {
            throw new EJBException("ejbRemove: " + ex.getMessage());
        }
    } 
    public void setEntityContext(EntityContext context) 
    {
        this.context = context;
    }
   public void unsetEntityContext() {}
    public void ejbActivate() 
    {
        id = (String) context.getPrimaryKey();
    }
    public void ejbPassivate() 
    {
        id = null;
    }
    public void ejbLoad() 
    {
        try {
            loadRow();
        } catch (Exception ex) 
	  {
            throw new EJBException("ejbLoad: " + ex.getMessage());
        }
    }
    public void ejbStore() 
    {
        try {
            storeRow();
        } catch (Exception ex) 
	  {
            throw new EJBException("ejbStore: " + ex.getMessage());
        }
    }
    public void ejbPostCreate(String id, String name, String address, String phoneNo) {}
    /*********************** Database Routines *************************/

    private void makeConnection() 
    {
        try {
            InitialContext ic = new InitialContext();
            DataSource ds = (DataSource) ic.lookup(dbName);
            con = ds.getConnection();
        } catch (Exception ex) 
	{
            throw new EJBException("Unable to connect to database. " + ex.getMessage());
        }
    }
    private void releaseConnection() 
    {
        try {
            con.close();
        } catch (SQLException ex) 
	{
            throw new EJBException("releaseConnection: " + ex.getMessage());
        }
    }
    private void insertRow(String id, String name, String address, String phoneNo) throws SQLException 
    {
        makeConnection();
        String insertStatement = "insert into useraccount values ( ? , ? , ? , ? )";
        PreparedStatement prepStmt = con.prepareStatement(insertStatement);
        prepStmt.setString(1, id);
        prepStmt.setString(2, name);
        prepStmt.setString(3, address);
        prepStmt.setString(4, phoneNo);
        prepStmt.executeUpdate();
        prepStmt.close();
        releaseConnection();
    }
    private void deleteRow(String id) throws SQLException 
    {
        makeConnection();
        String deleteStatement = "delete from savingsaccount where id = ? ";
        PreparedStatement prepStmt = con.prepareStatement(deleteStatement);
        prepStmt.setString(1, id);
        prepStmt.executeUpdate();
        prepStmt.close();        
	releaseConnection();
    }
    private boolean selectByPrimaryKey(String primaryKey) throws SQLException 
    {
        makeConnection();
        String selectStatement = "select id " + "from useraccount where id = ? ";
        PreparedStatement prepStmt = con.prepareStatement(selectStatement);
        prepStmt.setString(1, primaryKey);
        ResultSet rs = prepStmt.executeQuery();
        boolean result = rs.next();
        prepStmt.close();
        releaseConnection();
        return result;
    }
    private Collection selectByName(String name) throws SQLException 
    {
        makeConnection();
        String selectStatement = "select id " + "from useraccount where name = ? ";
        PreparedStatement prepStmt = con.prepareStatement(selectStatement);
        prepStmt.setString(1, name);
        ResultSet rs = prepStmt.executeQuery();
        ArrayList a = new ArrayList();
        while (rs.next()) 
	 {
            String id = rs.getString(1);
            a.add(id);
        }
        prepStmt.close();
        releaseConnection();
        return a;
    }
    private void loadRow() throws SQLException 
    {
       makeConnection();
       String selectStatement = "select name, address, phoneno " + "from useraccount where id = ? ";
       PreparedStatement prepStmt = con.prepareStatement(selectStatement);
       prepStmt.setString(1, id);
       ResultSet rs = prepStmt.executeQuery();
       if (rs.next()) 
       {
           this.name = rs.getString(1);
	    this.address = rs.getString(2);
  	    this.phoneNo = rs.getString(3);
           prepStmt.close();
       } 
       else 
       {
            prepStmt.close();
            throw new NoSuchEntityException("Row for id " + id + " not found in database.");
       }
       releaseConnection();
    }
    private void storeRow() throws SQLException 
    {
        makeConnection();
        String updateStatement = "update useraccount set name =  ? ," + "address = ?, phoneno = ?" + " where id = ?";
        PreparedStatement prepStmt = con.prepareStatement(updateStatement);
        prepStmt.setString(1, name);
        prepStmt.setString(2, address);
        prepStmt.setString(3, phoneNo);
        prepStmt.setString(4, id);
        int rowCount = prepStmt.executeUpdate();
        prepStmt.close();
        if (rowCount == 0) 
	  {
            throw new EJBException("Storing row for id " + id + " failed.");
        }
        releaseConnection();
    }
} 