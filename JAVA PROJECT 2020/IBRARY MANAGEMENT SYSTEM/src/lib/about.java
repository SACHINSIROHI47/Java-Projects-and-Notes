
package lib;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;

public class about extends JFrame implements ActionListener
{
     JFrame f;
     JLabel tag;
     TextArea area;
     JButton close;

     public void abtus()throws Exception
    {
          f=new JFrame("LIBRARY MANAGEMENT SYSTEM");
        f.setLayout(null);
        f.setSize(600,620);

        f.setResizable(false);
        f.setLocationRelativeTo(null);
        Color f1=new Color(108,108,108);
        f.getContentPane().setBackground(f1);
       /* p=new JPanel();
        p.setLayout(null);
        Color p1=new Color(229,229,229);
        p.setBackground(p1);
        p.setBounds(20,100,555,350);*/

         tag=new JLabel("   ABOUT LIBRARY MANAGEMENT SYSTEM");
          tag.setFont(new Font("Century Schoolbook",Font.BOLD,22));
          tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));
          tag.setBounds(20,40,550,60);
          f.add(tag);

          BufferedImage ad =ImageIO.read(new File("C:\\Users\\welcome\\Downloads\\Documents\\NetBeansProjects\\lib\\images\\jhlp.png"));
         JLabel adm=new JLabel(new ImageIcon(ad));
        adm.setBounds(50,120,498,422);
         f.add(adm);

        close=new JButton("CLOSE");
        close.setFont(new Font("Times new roman",Font.PLAIN,16));
        close.setBounds(480,550,100,35);
        close.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        close.addActionListener(this);
        f.add(close);

       // f.add(p);
        f.setVisible(true);
     }
 public void actionPerformed(ActionEvent e3)
    {
        if(e3.getSource()==close)
          {
            f.setVisible(false);

          }
    }

    public static void main(String[] args) throws Exception
    {
        about at=new about();
        at.abtus();

    }

}
