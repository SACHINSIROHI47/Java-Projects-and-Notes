package movie;

import java.util.*;
import javax.ejb.*;

public class MovieEJB implements SessionBean {

  Vector selectedMovies;
 

   public void ejbCreate() throws CreateException {

          selectedMovies = new Vector();
  }

  public String addMovieCart(String mname) {	  
	  
	try
	{
	if(!selectedMovies.isEmpty())
	{
    Enumeration menum = selectedMovies.elements();           
    String movietitle="";    
    while(menum.hasMoreElements()) {            	    
	    movietitle = (String)menum.nextElement();
                if(movietitle!=null)                
                {                  	                	          	        
	                if(mname.equals(movietitle))
	                {
		          return "You have already selected this movie";
	                }	                
	            }
            	}               
    selectedMovies.addElement(mname);
	}
    else
    {
	    selectedMovies.addElement(mname);
	}
	}	
	catch(Exception e)
	{
		return "Error in adding movie to cart";	
	}
	return "";
  }

  public Vector getSelectedMovies() {
      return selectedMovies;
   }

   public MovieEJB() {}
   public void ejbRemove() {}
   public void ejbActivate() {}
   public void ejbPassivate() {}
   public void setSessionContext(SessionContext sc) {}

}   
