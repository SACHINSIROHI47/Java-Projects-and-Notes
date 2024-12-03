/*Import Java packages to create the custom event class*/
import java.util.*;
/*Create the custom event class that extends the EventObject class of Java*/
public class LoginEvent extends EventObject 
{
	/*Declare the variables for the event class*/	
public String uname;	
public String pass;	
/*Define the constructor for the event class*/
public LoginEvent(Object obj,String uname,String pass)	
{            
/*Invoke the base class constructor*/		
super(obj);		
this.uname=uname;		
this.pass=pass;	
}
}
