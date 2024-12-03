import java.awt.*;
import java.applet.*;
public class ParaApplet extends Applet
{
	String n;
	String a; 
        public void init()
	{
		n= getParameter("name");
		if (n==null)
			n = " ";
              	a = getParameter("age");
	}
	public void paint(Graphics g)
	{
          g.drawString(n +" is a student pursuing graduation in engineering.", 20, 20);
	  g.drawString(n + " is " + a + " years old. ", 20, 60);
	}
} 
