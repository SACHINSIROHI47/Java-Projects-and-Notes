import java.awt.*;
import java.applet.*;
/*
<Applet Code = FLayoutMan.class Width = 300 height = 200>
</Applet>
*/
public class FLayoutMan extends Applet
{
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER));
		Button a,b,c;
		a = new Button("Add");
		b = new Button("Update");
		c = new Button("Delete");
		add(a);
		add(b);
		add(c);
	}
}
