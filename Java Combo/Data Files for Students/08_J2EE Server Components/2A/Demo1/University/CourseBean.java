package University;
import java.util.*;
import javax.ejb.*;

public class CourseBean implements SessionBean 
{

String studentName;
String studentRollNo;
Vector selectedCourse;
public void ejbCreate(String StudentName, String RollNo) throws CreateException 
{
if (StudentName == null) 
{
throw new CreateException("Null person not allowed.");
}
    		else 
    		{
      studentName= StudentName;
}
      selectedCourse = new Vector();
  	}

public String addCourse(String Cname) 
{	  
		if (Cname==null)
	  	{
			return "";		  
       }
    		try
	 	{
	 if(!selectedCourse.isEmpty())
	 {	
            Enumeration enumer = selectedCourse.elements();           
            String title="";    
            while(enumer.hasMoreElements()) 
            {            	    
   	       			title = (String)enumer.nextElement();
              	if(title!=null)                
             			 	{
          	 	/* Checks whether a same course is again selected.*/       
	         	       	if(Cname.equals(title))
	             			{
		            		return "You have already selected this course";
	                		}	                
	            			}
            			}               
/* Adds the course in the cart.*/
selectedCourse.addElement(Cname);
			}
    			else
    			{
      /* Adds the course in the cart.*/
	      selectedCourse.addElement(Cname);
			}
		}	
	catch(Exception e)
		{
			return "Error";	
		}
	return "";
  	}

  	public String removeCourse(String Cname) 
{

/* Removes a course from the cart.*/
boolean result = selectedCourse.removeElement(Cname);
if (result == false)
{
return Cname + "course is not in cart.";
}
return "Course Removed";
   	}
public Vector getSelectedCourse() 
{
      		return selectedCourse;
   	}
public CourseBean() {}
public void ejbRemove() {}
public void ejbActivate() {}
public void ejbPassivate() {}
public void setSessionContext(SessionContext sc) {}
}  
