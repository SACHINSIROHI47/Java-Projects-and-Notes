
package empmanagement;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.sql.*;



public class login extends JFrame implements ActionListener
{
  JFrame f;
  JPanel p;
  JLabel Lempid,Lpwd;
  JTextField tempid;
  JPasswordField tpwd;
  JButton lgn,ext,rst;

  public void logn()throws Exception
    {
      f=new JFrame("Employee Login");
      f.setLayout(null);
      f.setSize(520, 560);
      f.getContentPane().setBackground(Color.LIGHT_GRAY);

      p=new JPanel();
      p.setLayout(null);
      p.setBounds(30, 30, 440, 460);
      p.setBackground(Color.CYAN);

      BufferedImage image = ImageIO.read(new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\EmpManagementclg\\IMAGES\\emp\\login1.jpg"));
      JLabel label = new JLabel (new ImageIcon(image));
      label.setBounds(6,5,440,200);
      p.add(label);

      p.setBackground(Color.cyan);

      Lempid=new JLabel("USER ID :");
      Lempid.setFont(new Font("Times new roman",Font.BOLD,24));
      Lempid.setBounds(50, 200, 150, 30);
      p.add(Lempid);

      tempid=new JTextField();
      tempid.setBounds(210,200,150,30);
      p.add(tempid);

      Lpwd=new JLabel("User Pwd :");
      Lpwd.setFont(new Font("Times new roman",Font.BOLD,24));
      Lpwd.setBounds(50, 260, 150, 30);
      p.add(Lpwd);

      tpwd=new JPasswordField();
      tpwd.setBounds(210,260,150,30);
      p.add(tpwd);

      lgn=new JButton("LOGIN");
      lgn.setBounds(40,350,100,40);
      p.add(lgn);
      lgn.addActionListener(this);

      ext=new JButton("EXIT");
      ext.setBounds(170, 350, 100, 40);
      p.add(ext);
      ext.addActionListener(this);

      rst=new JButton("RESET");
      rst.setBounds(300,350,100,40);
      p.add(rst);
      rst.addActionListener(this);

      f.add(p);
      f.setVisible(true);

    }
   public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()== lgn)
       {
           String eid=tempid.getText();
           String epwd=tpwd.getText();
           String datid,datpwd;
           try
           {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection con = DriverManager.getConnection("jdbc:odbc:aa","sa","sqlserver");
               Statement stmt = con .createStatement();
               ResultSet rs = stmt.executeQuery("select * from login where lgin='"+eid+"'");
               if(rs.next())
               {
                   datid=rs.getString("lgin");
                   datpwd=rs.getString("lgpwd");
                   if((eid.equals(datid))&&(epwd.equals(datpwd)))
                   {
                       JOptionPane.showMessageDialog(f,"Password Match");
                       menu obj=new menu();
                       obj.menuup();
                       f.setVisible(false);
                       return;
                   }
                  else 
                   {
                       JOptionPane.showMessageDialog(f,"Password Not Match");
                   }

               }
               else
                   {
                       JOptionPane.showMessageDialog(f,"User does not exist");
                   }
           }
            catch(Exception e2)
           {
                JOptionPane.showMessageDialog(f,e2);
            }
        
        }
          else if(e.getSource()== rst)
           {
               tempid.setText("");
               tpwd.setText("");
           }
        else if(e.getSource()== ext)
           {
              f.setVisible(false);
           }

    }

       public static void main(String[] args)throws Exception
       {
           login lg=new login();
           lg.logn();

       }
}


