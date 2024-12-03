package player;

import java.rmi.*;
import javax.ejb.*;

public interface Player extends EJBObject 
{
   public String getPlayerId() throws RemoteException;

   public String getPlayerName() throws RemoteException;

   public void setPlayerName(String playername) throws RemoteException;

   public String getPlayerPosition() throws RemoteException;

   public void setPlayerPosition(String playerposition) throws RemoteException;

   public String getClub() throws RemoteException;

   public void setClub(String clubname) throws RemoteException;

}
