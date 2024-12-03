/*
<APPLET CODE = ”myapplet.class” HEIGHT = 300 WIDTH = 250>
</APPLET>
*/

import java.applet.*; // Importing the applet package
import java.awt.*; // importing the awt package

public class myapplet extends Applet
{
  public void paint(Graphics g)
  {
   g.drawString("Hello, This is my first Java Applet", 50, 100);
  }
}
