import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="ButtonDemo.class" width=250 height=150>
</applet>
*/

public class ButtonDemo extends Applet implements ActionListener
{
	Button b;
	public void init()
	{
		b= new Button("Click here");
		add("Center", b);
		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		Button source = (Button)ae.getSource();
		source.setLabel(" Button clicked ");
	}
}
