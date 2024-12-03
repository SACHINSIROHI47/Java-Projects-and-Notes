//LoginEvent.java
import java.util.*;
public class LoginEvent extends EventObject 
{
	public String uname;	
public String pass;	
public LoginEvent(Object obj,String uname,String pass)	
{            
//Invoke the base class constructor		
super(obj);		
this.uname=uname;		
this.pass=pass;	
}
}