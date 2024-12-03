package University;
import java.util.*;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;
public interface Course extends EJBObject 
{
   public String addCourse(String Cname) throws RemoteException;
   public String removeCourse(String Cname) throws RemoteException;
   public Vector getSelectedCourse() throws RemoteException;
}
