import javax.servlet.*;
import java.io.*;
import java.util.*;

public class ServletEventListener implements ServletContextListener, ServletContextAttributeListener, ServletRequestListener
{	
	ServletContext contx;
	String name;	
	String value;

	public void contextInitialized(ServletContextEvent ce)
	{
      	contx=ce.getServletContext();
      	/*Log the time of initailizing the context. */
		contx.log("Context has been initialized at " + new Date());		
	}
	public void contextDestroyed(ServletContextEvent ce)
	{
		/*Log the time of destroying the context. */
		contx.log("Context has been destroyed at " + new Date());		
	}

	public  void attributeAdded(ServletContextAttributeEvent srae)
	{
		/* Obtain the name and value of the attribute. */
        name=srae.getName();
        value=(String)srae.getValue();
        /*Log the time of adding the attribute to context object. */
		contx.log("An attribute with name: "  + name + " and value: " + value  + " has been added to the context at: " + new Date());			
	}
	public  void attributeRemoved(ServletContextAttributeEvent srae)
	{
		/*Log the time of removing the attribute from the context object. */
		contx.log("Attribute with name: "  + name + " and value: " + value  + " has been removed from the context at: " + new Date());				
	}

	public  void attributeReplaced(ServletContextAttributeEvent srae)
	{
		/*Log the time of replacing the attribute. */
		contx.log("Attribute with name: "  + name + " and value: " + value  + " has been replaced context at: " + new Date());
	}

	public void requestInitialized(ServletRequestEvent e)
	{
		/*Log the time of request initialization. */
		contx.log("A request has been initialized at: " + new Date());
	}

	public void requestDestroyed(ServletRequestEvent e)
	{
		/*Log the time of request destruction. */
		contx.log("A request has been destroyed at: " + new Date());
	}
}
