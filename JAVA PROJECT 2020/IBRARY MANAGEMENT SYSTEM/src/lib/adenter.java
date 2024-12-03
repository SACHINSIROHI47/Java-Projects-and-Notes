
package lib;

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.event.*;


import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

class adimg extends JComponent
{
    Image i;

    public adimg(Image i)
    {
        this.i=i;
    }
    public void paintComponent(Graphics g)
    {
        g.drawImage(i,0,0,null);
    }
}

public class adenter extends JFrame implements ActionListener
{

    JButton enter;
    JFrame f;
    ImageIcon images;
    JLabel ll;

    public void adenter1() throws IOException
    {
        f=new JFrame("LIBRARY MANAGEMENT SYSTEM");
        f.setLayout(null);
        f.setResizable(false);
        f.setSize(400,480);
        f.setLocationRelativeTo(null);

        BufferedImage f1=ImageIO.read(new File("C:\\Users\\welcome\\Downloads\\Documents\\NetBeansProjects\\lib\\images\\lr8.jpg"));
        f.setContentPane(new adimg(f1));

        JLabel tag2=new JLabel("MEERUT");
        tag2.setFont(new Font("Times new roman",Font.BOLD,28));
        tag2.setBounds(140,50,380,30);
        f.add(tag2);

        JLabel tag=new JLabel("LIBRARY MANAGEMENT");
        tag.setFont(new Font("Times new roman",Font.BOLD,28));
        tag.setBounds(20,100,360,30);
        f.add(tag);

         JLabel tag1=new JLabel("SYSTEM");
        tag1.setFont(new Font("Times new roman",Font.BOLD,28));
        tag1.setBounds(140,150,150,30);
        f.add(tag1);
   
         enter=new JButton("LOGIN");
         enter.setFont(new Font("Times new roman",Font.BOLD,16) );
         enter.setBounds(140,250,120,40);
         enter.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
          enter.addActionListener(this);
         f.add(enter);
        
         f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {

    if(e.getSource()==enter)
      {
         try
            {
               login ob=new login();
               ob.login1();
               f.setVisible(false);
            }
         catch(Exception y)
            {
              JOptionPane.showMessageDialog(f,y);
            }
        }



    }

    public static void main(String[] args)throws IOException
    {
        adenter ad=new adenter();
        ad.adenter1();

    }

}

