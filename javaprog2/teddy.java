 import java.awt.*;
import javax.swing.*;

	public class teddy extends JApplet
	{
		Image image1;
		public void init()
		{
			image1=getImage(getDocumentBase(),"magnify.gif");
		}

		public void paint(Graphics g)
		{
			setBackground(Color.orange);
			g.drawImage(image1,50,50,this);
		}
	}//end of teddy class
