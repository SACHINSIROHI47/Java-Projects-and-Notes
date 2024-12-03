import java.rmi.*;
public interface EmpRemote extends Remote
{
	/* Declare the method that stores the information about the employee */
	String insertInformation(String fname, String lname, String address, String city, String phone, String salary, String designation, String depttype) throws RemoteException;	
}
