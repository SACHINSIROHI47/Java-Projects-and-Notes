package book;

import java.util.*;
import java.io.*;
import java.rmi.*;
import javax.naming.*;
import javax.ejb.*;

public abstract class BookEJB implements EntityBean
{
   protected EntityContext ctx;

   public abstract String getBookId();
   public abstract void setBookId(String bookid);
   public abstract String getBookName();
   public abstract void setBookName(String bkName);
   public abstract String getBookCategory();
   public abstract void setBookCategory(String bkCatg);
  
  /* Callback methods. */

   public void setEntityContext(EntityContext ctx) 
   {
      print("setEntityContext called");
      this.ctx = ctx;
   }

   public void unsetEntityContext() 
   {
      print("unsetEntityContext called.\n");
      this.ctx = null;
   }

   public void ejbActivate() {
      print("ejbActivate() called.\n");
   }

   public void ejbPassivate() {
      print("ejbPassivate() called.\n");
   }

   public void ejbStore() {
      print("ejbStore() called.\n");
   }

   public void ejbLoad() {
      print("ejbLoad() called.\n");
   }

   public void ejbRemove() throws RemoveException 
   {
      print("ejbRemove() called.\n");
   }

   public String ejbCreate( String bkid,String bkName, String bkCatg) throws CreateException 
   {
      print("ejbCreate() called.\n");

      setBookId(bkid);      
      setBookName(bkName);
      setBookCategory(bkCatg);
      return null;
   }

   public void ejbPostCreate(String custid,String cname, String account) throws CreateException 
   {
      print("ejbPostCreate() called.\n");
   }

   void print(String s) 
   {
      System.out.println(s);
   }
}
