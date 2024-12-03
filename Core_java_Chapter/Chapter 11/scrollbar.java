import java.awt.*; 
import java.applet.Applet; 
 
public class scrollbar extends Applet 
{ 
  public void init() 
{ 
   Label l1=new Label("user");
   TextField t1=new TextField(20);

   Scrollbar sb1 =  new Scrollbar(Scrollbar.HORIZONTAL,10,10,50,100); 
   Scrollbar sb2 =  new Scrollbar(Scrollbar.VERTICAL,70,50,90,150); 
    add(sb1); 
    add(l1);
    add(t1);
    add(sb2);
	
  } 
} 

/*<applet code=scrollbar width=200 height=200></applet>*/
