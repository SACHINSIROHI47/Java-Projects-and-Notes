import java.awt.*;
import java.applet.*;

public class shapes extends Applet
{
	public void paint(Graphics g)
	{
		Font myFont = new Font("Times New Roman",Font.BOLD+Font.ITALIC,16);
		Color myColor = new Color(250,48,48);
		g.setFont(myFont);
		g.setColor(myColor);
		setBackground(Color.cyan);

		g.drawString("Displaying Images",10,20);
		Color myColor1 = new Color(250,48,200);
		g.setColor(myColor1);
		g.drawLine(15,30,300,30);
		g.setColor(Color.blue);
		g.drawRect(15,40,250,60);
		g.setColor(Color.orange);
		g.fillRect(15,110,250,100);
		g.setColor(Color.red);
		g.drawString("NIIT Mussoorie",20,130);
		g.clearRect(40,150,70,30);
		g.draw3DRect(40,220,150,50,true);
		g.drawRoundRect(300,30,250,100,25,25);
		Color myColor2 = new Color(255,255,185);
		g.setColor(myColor2);
		g.fillRoundRect(300,140,250,100,25,25);
		g.drawOval(20,200,100,100);
		Color myColor3 = new Color(255,15,185);
		g.setColor(myColor3);
		g.drawOval(300,350,150,100);
		Color myColor4 = new Color(50,100,237);
		g.setColor(myColor4);
		g.fillOval(150,200,150,100);

		}

}

