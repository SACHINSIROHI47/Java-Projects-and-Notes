package movie;

import java.util.*;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface Movie extends EJBObject {
 
   public String addMovieCart(String movie_name) throws RemoteException;
   public Vector getSelectedMovies() throws RemoteException;
}
