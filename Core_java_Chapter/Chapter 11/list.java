import java.awt.*;
import java.applet.*;
public class list extends Applet 
{
public void init() 
{
List l = new List (1, true);
l.addItem("Java");
l.addItem("c#");
l.addItem("c++");

TextArea t = new TextArea(10,10);
add(l); 
add(t);
}
}

/*<applet code=list width=200 height=200></applet>*/
