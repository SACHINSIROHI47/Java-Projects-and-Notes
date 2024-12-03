package student;

import java.util.*; 
import java.io.*; 
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class StudentGradeEJB implements SessionBean { 

    private  javax.ejb.SessionContext m_ctx = null; 

    public void setSessionContext(SessionContext ctx) { 
        m_ctx = ctx; 
    } 

    public void ejbCreate() throws java.rmi.RemoteException, javax.ejb.CreateException {}   
     
    public void ejbRemove() {} 
 
    public void ejbActivate() {} 

    public void ejbPassivate() {} 

   public String calculateGrade(int num1, int num2, int num3) throws java.rmi.RemoteException { 
       int sum = num1 + num2 + num3;
       if(sum >= 210)
          return "grade A"; 
       else 
          return "grade B";  
       
      } 
}
