import java.awt.*;
import java.applet.Applet;
public class AppParam extends Applet
{
	Font f; 
String s;
public void init()
{
f= new Font("Arial",Font.BOLD,24);
//s= getParameter("Hello");
if(s==null)
s="Hello";
}

public void paint(Graphics g) 
{
g.setFont(f);
g.setColor(Color.BLUE);
g.drawString(s,100,50);
}
}

/*<applet code="AppParam.class" width=300 height=100>
<param name=s value="sachin sirohi">
</applet>*/

