package student;

import javax.ejb.EJBHome;

public interface StudentGradeHome extends EJBHome 
{ 
    public StudentGrade create() throws java.rmi.RemoteException, javax.ejb.CreateException; 
}  
