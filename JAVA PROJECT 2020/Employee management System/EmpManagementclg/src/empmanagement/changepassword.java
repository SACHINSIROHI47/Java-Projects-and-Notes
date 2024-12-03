

package empmanagement;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.sql.*;


public class changepassword extends JFrame implements ActionListener
{
  JFrame f;
  JPanel p;
  JLabel Lempid,Lpwd,LCpwd;
  JTextField tempid,tpwd;
  JPasswordField cpwd;
  JButton lgn,ext,rst;
 public void chngp()throws Exception
    {
      f=new JFrame("Employee Login");
      f.setLayout(null);
      f.setSize(520, 560);
      f.getContentPane().setBackground(Color.GRAY);

      p=new JPanel();
      p.setLayout(null);
      p.setBounds(30, 30, 440, 460);
     

      BufferedImage image = ImageIO.read(new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\EmpManagementclg\\IMAGES\\emp\\login3.jpg"));
      JLabel label = new JLabel (new ImageIcon(image));
      Color mit=new Color(120,225,240);
      label.setBounds(6,5,440,200);
      p.add(label);

      p.setBackground(mit);

      Lempid=new JLabel("USER ID :");
      Lempid.setFont(new Font("Times new roman",Font.BOLD,20));
      Lempid.setBounds(20, 200,200, 30);
      p.add(Lempid);

      tempid=new JTextField();
      tempid.setBounds(210,200,200,30);
      p.add(tempid);

      Lpwd=new JLabel("User Pwd :");
      Lpwd.setFont(new Font("Times new roman",Font.BOLD,20));
      Lpwd.setBounds(20, 250,200, 30);
      p.add(Lpwd);

      tpwd=new JTextField();
      tpwd.setBounds(210,250,200,30);
      p.add(tpwd);

      LCpwd=new JLabel("New Password :");
      LCpwd.setFont(new Font("Times new roman",Font.BOLD,20));
      LCpwd.setBounds(20,300,200, 30);
      p.add(LCpwd);

      cpwd=new JPasswordField();
      cpwd.setBounds(210,300,200,30);
      p.add(cpwd);

      lgn=new JButton("OK");
      lgn.setBounds(40,380,100,40);
      p.add(lgn);
      lgn.addActionListener(this);

      ext=new JButton("EXIT");
      ext.setBounds(170,380, 100, 40);
      p.add(ext);
      ext.addActionListener(this);

      rst=new JButton("RESET");
      rst.setBounds(300,380,100,40);
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
            String zpwd=tpwd.getText();
           String epwd=cpwd.getText();
           String datid,datpwd;
           try
           {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection con = DriverManager.getConnection("jdbc:odbc:aa","sa","sqlserver");
               Statement stmt = con .createStatement();
              // stmt.executeQuery("update login set lgpwd='"+epwd+"' where lgin='"+eid+"'");
 ResultSet rs = stmt.executeQuery("select lgin,lgpwd from login");
               while(rs.next())
               {
                   datid=rs.getString("lgin");
                   datpwd=rs.getString("lgpwd");
                   if((eid.equals(datid))&&(zpwd.equals(datpwd)))
                   {
                       JOptionPane.showMessageDialog(f,"Password Match");
                       stmt.executeUpdate("update login set lgpwd='"+epwd+"' where lgin='"+eid+"'");
                        JOptionPane.showMessageDialog(f,"Password has been UPDATED");
                        return;
                   }
                  else
                   {
                       JOptionPane.showMessageDialog(f,"Password Not Match");
                   }

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
               cpwd.setText("");
           }
        else if(e.getSource()== ext)
           {
              f.setVisible(false);
           }

    }


    public static void main(String[] args) throws Exception
    {
        changepassword cp =new changepassword();
        cp.chngp();
    }

}
