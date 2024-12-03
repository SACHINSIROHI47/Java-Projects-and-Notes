import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class WindowWithEvents extends Frame
{
 
	WindowWithEvents(String title)
	{
                               super(title);  
               
                //add window event adapter
                addWindowListener(new MyWindowAdapter());
               
                //set window size using setSize method
                this.setSize(300,300);
               
                //show window using setVisible method
                this.setVisible(true);
        }
       
        //extend WindowAdapter
        class MyWindowAdapter extends WindowAdapter
{
                                        
                //implement windowClosing method
                public void windowClosing(WindowEvent e) 
	{
                         JOptionPane.showMessageDialog(null,"Window is Closing");
                        System.exit(0);                    
                }
	  
	
        }
       
        public static void main(String[] args) 
{
               WindowWithEvents myWindow = new WindowWithEvents("Window with event Example");
        }
}
