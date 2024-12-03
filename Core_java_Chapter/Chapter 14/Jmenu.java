import java.awt.*;
import javax.swing.*;
public class Jmenu
{
  public static void main(String[] args) 
  {
    JFrame f = new JFrame("JMenu");
    f.setSize(300, 300);
    Container c = f.getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout()); 
    JMenuBar mb=new JMenuBar();
    JMenu menu=new JMenu();
    JMenuItem m1=new JMenuItem("File");
    JMenuItem m2=new JMenuItem("New");
    menu.add(m1);
    menu.add(m2);
    mb.add(menu);
    c.add(mb);
    f.setVisible(true);
  }
}
