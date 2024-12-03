import java.awt.*;
import java.applet.*;

public class shapes1 extends Applet
{
	public void paint(Graphics g)
	{
		Font myFont = new Font("Times New Roman",Font.BOLD+Font.ITALIC,16);
		Color myColor = new Color(250,48,48);
		g.setFont(myFont);
		g.setColor(myColor);
		setBackground(Color.cyan);

		Color myColor1 = new Color(250,48,200);
		g.setColor(myColor1);
	
		g.setColor(Color.blue);
		int x[] ={40,70,60,30,20};
		int y[] ={40,50,80,70,50};
		g.fillPolygon(x,y,5);
		
	}
}

