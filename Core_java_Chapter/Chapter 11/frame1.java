import java.awt.*;
public class frame1
{
  public static void main(String[] args)
{
    Frame f = new Frame("Welcome to Frame");
    Label l = new Label("This is my first Frame program",Label.CENTER);
    Button b1=new Button("Click");
    f.add(l);
    f.add(b1); 	
    f.setSize(400,400);
    f.setVisible(true);
  }
}
