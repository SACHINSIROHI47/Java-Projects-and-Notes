import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Imagedemo.class" width=300 height=300>
</applet>
*/

public class Imagedemo extends JApplet
{
	JPanel p1;
	JLabel l1;
	GridBagLayout g1;
	GridBagConstraints gbc;
	
	public void init()
	{
		g1=new GridBagLayout();
		gbc=new GridBagConstraints();
		p1=(JPanel)getContentPane();
		p1.setLayout(g1);
Icon LogoImage = new ImageIcon("c:/java/getstart.gif");
//You will mention the path of your GIF file
		l1 = new JLabel(LogoImage);
		gbc.anchor = GridBagConstraints.NORTHEAST;
		gbc.gridx = 3;
		gbc.gridy = 3;
		g1.setConstraints(l1,gbc);
		p1.add(l1);
	}

}