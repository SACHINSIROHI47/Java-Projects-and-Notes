import java.awt.*;
import java.applet.*;

public class myrepaint extends Applet
{
	int initCounter =0;
	int startCounter =0;
	int stopCounter =0;
	int destroyCounter =0;
	
	public void init()
	{	
		initCounter++;
		repaint();
	}
	public void start()
	{
		startCounter++;
		repaint();
	}
	public void stop()
	{
		stopCounter++;
		repaint();
	}
	public void destroy()
	{
		destroyCounter++;
		repaint();
	}
	public void paint(Graphics g)
	{
		Font myFont = new Font("Times New Roman",Font.BOLD+Font.ITALIC,16);
		Color myColor = new Color(247,219,23);
		Color myColor2 = new Color(196,51,9);
		//g.setColor(Color.red);
		g.setColor(myColor);
		g.setFont(myFont);
		setBackground(myColor2);
		
		g.drawString(" init has been invoked " + String.valueOf(initCounter) +"times",20,20);
		g.drawString(" start has been invoked " + String.valueOf(startCounter) +"times",20,40);
		g.drawString(" stop has been invoked " + String.valueOf(stopCounter) +"times",20,60);
		g.drawString(" destroy has been invoked " + String.valueOf(destroyCounter) +"times",20,80);
	}
}

