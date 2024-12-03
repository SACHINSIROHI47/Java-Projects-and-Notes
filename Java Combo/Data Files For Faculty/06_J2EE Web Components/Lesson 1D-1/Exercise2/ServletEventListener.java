import java.io.*;
import java.util.*;
import javax.servlet.*;

	/*
	You are only required to impliement the ServletRequestListenere interface to provide the 	

	functionality. But, as there is a bug in the J2EE1.4 server, It is not indentifying the 		

	ServletRequest Interface, therefore we have also implemented the ServletContextListener 	

	interface.
	*/

public class ServletEventListener implements ServletRequestListener,  ServletContextListener 
{	
	ServletContext contx ;
	long startTime, stopTime, elapsedTime;

	public void requestInitialized(ServletRequestEvent e)
	{
		contx = e.getServletContext();
		startTime = System.currentTimeMillis();
		//Interger stTime = (Integer)startTime.getTime();
	}

	public void requestDestroyed(ServletRequestEvent e)
	{
		stopTime = System.currentTimeMillis();
		calculateTime();
	}
	
	void calculateTime()
	{
		elapsedTime = (stopTime -  startTime) / 1000;
		contx.log("Time taken to service the client request :" + elapsedTime + " seconds");
	}

	public void contextInitialized(ServletContextEvent e) { }

	public void contextDestroyed(ServletContextEvent e){ }
}
