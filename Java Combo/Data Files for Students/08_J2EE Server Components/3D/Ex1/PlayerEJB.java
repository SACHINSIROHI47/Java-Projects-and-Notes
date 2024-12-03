package player;

import java.util.*;
import java.io.*;
import java.rmi.*;
import javax.naming.*;
import javax.ejb.*;

public abstract class PlayerEJB implements EntityBean
{
   protected EntityContext ctx;
   public abstract String getPlayerId();
   public abstract void setPlayerId(String pid);
   public abstract String getPlayerName();
   public abstract void setPlayerName(String pname);
   public abstract String getPlayerPosition();
   public abstract void setPlayerPosition(String position);
   public abstract String getClub();
   public abstract void setClub(String pclub);
  
 /* Callback methods */
   public void setEntityContext(EntityContext ctx) {
        this.ctx = ctx;
   }
   public void unsetEntityContext() {
       this.ctx = null;
   }
   public void ejbActivate() {}  
   
   public void ejbPassivate() {}
   
   public void ejbStore() {}
   
   public void ejbLoad() {}
   
   public void ejbRemove() throws RemoveException {}
    
   public String ejbCreate(String pname, String pposition, String pclub) throws CreateException 
{
      String playerid = getUniqueId();
      setPlayerId(playerid);
      setPlayerName(pname);      
      setPlayerPosition(pposition);
      setClub(pclub);
      return null;
   }
   public void ejbPostCreate(String pname, String pposition, String pclub) throws CreateException {
       }

   String getUniqueId(){
      return new Long(System.currentTimeMillis()).toString();
   }
}

