
package empmanagement;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.sql.*;


public class NewUser extends JFrame implements ActionListener
{

  JFrame f;
  JPanel p;
  JLabel Lempid,Lpwd;
  JTextField tempid;
  JPasswordField tpwd;
  JButton lgn,ext,rst;

    public void user()throws Exception
    {
      f=new JFrame("Employee Login");
      f.setLayout(null);
      f.setSize(520, 560);
      f.getContentPane().setBackground(Color.LIGHT_GRAY);

      p=new JPanel();
      p.setLayout(null);
      p.setBounds(30, 30, 440, 460);
      p.setBackground(Color.CYAN);

      BufferedImage image = ImageIO.read(new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\EmpManagementclg\\IMAGES\\emp\\logo2.jpg"));
      JLabel label = new JLabel (new ImageIcon(image));
      label.setBounds(6,5,440,200);
      p.add(label);

      Color mit=new Color(185,240,240);

      p.setBackground(mit);

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

      lgn=new JButton("SIGN UP");
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
               stmt.execute("insert into login (lgin,lgpwd) values ('"+eid+"','"+epwd+"')");

              JOptionPane.showMessageDialog(f,"Successfully SIGN UP");
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
        NewUser nu=new NewUser();
        nu.user();
    }

}
