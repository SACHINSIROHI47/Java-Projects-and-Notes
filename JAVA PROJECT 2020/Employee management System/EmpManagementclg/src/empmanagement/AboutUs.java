package empmanagement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.*;


class addbkimagem extends JComponent
{
    Image i;
    public addbkimagem(Image i)
    {
        this.i=i;
    }
    public void paintComponent(Graphics g)
    {
        g.drawImage(i, 0, 0, null);
    }
}

public class AboutUs extends JFrame implements ActionListener
{
    JLabel heading;
    JButton back;
    JFrame f;

public void AboutUsa()throws Exception
    {
      f=new JFrame();
      f.setSize(800,700);
      f.setLayout(null);
      f.setTitle("JFrame with BackgroundImage");

       BufferedImage f1 = ImageIO.read(new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\EmpManagementclg\\IMAGES\\emp\\abt.jpg"));
       f.setContentPane(new addbkimagem(f1));

     heading= new JLabel("ABOUT  US");
     heading.setBounds(240,50,500,60);
     heading.setForeground(Color.blue);
     heading.setFont(new Font("Times new roman",Font.BOLD,60));
     f.add(heading);

      back=new JButton ("Back");

      back.setBounds(600,600,98,27);
     back.addActionListener(this);
      f.add(back);

      f.setVisible(true);

  }
  public void actionPerformed(ActionEvent e)
    {
          if(e.getSource()==back)
          {
            try
            {
               
                 f.setVisible(false);
           }
           catch(Exception e5)
         {
            JOptionPane.showMessageDialog(f,e5);
         }
        }
    }



      public static void main(String[]args)throws Exception
    {
          AboutUs ob=new AboutUs();
          ob.AboutUsa();
       
    }
}
