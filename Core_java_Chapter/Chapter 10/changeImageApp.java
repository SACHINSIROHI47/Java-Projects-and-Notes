import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
public class changeImageApp extends Applet
{
	int i=1;
	public void init()
	{
		Button b1=new Button("Next>>");
		Button b2=new Button("<<Back");
		this.add(b1);
                this.add(b2);
		b1.addActionListener(new ActionListener()
              {
         public void actionPerformed(ActionEvent e){
		b1_Click();}
			});
                b2.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e){b2_Click();}});
	}
	void b1_Click()
	{
		i=i+1;
		if(i==8) i=1;
		repaint();

	}
             void b2_Click()
	{
		i=i-1;
		if(i==9) i=7;
		repaint();

	}
	public void paint(Graphics g)
	{
		try{
		URL u1=getCodeBase();
		String s1=u1.toString();
		URL u2=new URL(s1+"t" + i + ".jpg");
		Image img=getImage(u2);
		g.drawImage(img,10,10,this);
		showStatus("Displaying image " + i);
	}catch(Exception ee){}
	}

}/*<applet code="changeImageApp.class" width=400 height=400></applet>*/