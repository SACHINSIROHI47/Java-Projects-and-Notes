package student;

import javax.ejb.EJBObject;

public interface StudentGrade extends EJBObject { 
    public String calculateGrade(int num1, int num2, int num3) throws java.rmi.RemoteException; 
}
