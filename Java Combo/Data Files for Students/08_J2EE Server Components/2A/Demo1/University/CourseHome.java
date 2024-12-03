package University;
import java.io.Serializable;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface CourseHome extends EJBHome 
{
Course create(String StudentName, String RollNo) throws RemoteException, CreateException; 
}
