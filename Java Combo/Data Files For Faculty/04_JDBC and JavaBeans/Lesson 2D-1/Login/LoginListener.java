/*Import Java packages to create the event listener*/
import java.util.* ;
/*Define the custom event listener that responds to custom events. The event listener extends the EventListener interface of Java*/
public interface LoginListener extends EventListener 
{
	/*Declare a method that dispatches objects of the custom event class*/
public void validateLogin(LoginEvent mec);
}
