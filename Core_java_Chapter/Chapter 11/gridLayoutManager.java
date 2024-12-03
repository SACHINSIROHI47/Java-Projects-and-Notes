import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class gridLayoutManager extends Applet
 {
 
     Button button1;
     Button button2;
     Button button3; 
     Button button4;
     Button button5;
       public void init()
       {
        
        GridLayout f=new GridLayout(3,2);
        this.setLayout(f);
        button1 = new Button("Button 1");
        button2 = new Button("Button 2");
        button3 = new Button("Button 3");
        button4 = new Button("Button 4");
        button5 = new Button("Button 5");
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        }
 }

        
   /*<applet code=gridLayoutManager.class width=300 height=300></applet>*/
    
