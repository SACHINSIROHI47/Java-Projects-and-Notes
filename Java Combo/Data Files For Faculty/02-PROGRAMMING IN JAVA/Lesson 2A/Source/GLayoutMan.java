import java.awt.*;
import java.applet.*;
/*
<Applet code = GLayoutMan width = 300 height = 100>
</Applet>
*/
public class GLayoutMan extends Applet 
{
	public void init()
	{
		setLayout(new GridLayout(2,3));	
		add(new Button("Red"));
		add(new Button ("White"));
		add(new Button ("Green"));
		add(new Button ("Blue"));
		add(new Button ("Black"));
		add(new Button ("Cyan"));
	}
}
