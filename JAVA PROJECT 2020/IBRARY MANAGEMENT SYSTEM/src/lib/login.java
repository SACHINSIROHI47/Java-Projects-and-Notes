
package lib;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.event.*;
import java.sql.*;


class adimg1 extends JComponent
{
    Image i;

    public adimg1(Image i)
    {
        this.i=i;
    }
    public void paintComponent(Graphics g)
    {
        g.drawImage(i,0,0,null);
    }

}



public class login extends JFrame implements ActionListener
{
    JFrame f;
    JLabel luser,lpwrd,lgn,Hidn,frgtpswd,newuser;
    JTextField tuser;
    JPasswordField pwrd;
    Statement stmt;
    JButton login,bck;
    int ctr;

login()
    {
     try
        {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection("jdbc:odbc:bb","sa","sqlserver");
	stmt=con.createStatement();
        }
        catch(Exception e4)
        {
            JOptionPane.showMessageDialog(f,e4);
        }
}
public void login1()throws Exception
{
    f=new JFrame("LIBRARY MANAGEMENT SYSTEM");
    f.setLayout(null);
    f.setSize(600,400);
   //unable max btn
    f.setResizable(false);
    /* Min Size
    f.pack();  */
    //Set center
    f.setLocationRelativeTo(null);
   // f.getContentPane().setBackground(Color.lightGray);

    BufferedImage f1=ImageIO.read(new File("C:\\Users\\welcome\\Downloads\\Documents\\NetBeansProjects\\lib\\images\\login.png"));
    f.setContentPane(new adimg1(f1));


    BufferedImage ad =ImageIO.read(new File("C:\\Users\\welcome\\Downloads\\Documents\\NetBeansProjects\\lib\\images\\se4_1.jpg"));
         JLabel adm=new JLabel(new ImageIcon(ad));
        adm.setBounds(15,5,180,380);
         f.add(adm);

         
     lgn=new JLabel(" LOGIN ");
     lgn.setFont(new Font("Century Schoolbook",Font.BOLD,32));
     lgn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder()));
     lgn.setBounds(250,20,150,50);
     f.add(lgn);

     newuser=new JLabel("New User");
     newuser.setFont(new Font("Times new roman",Font.PLAIN,12) );
     newuser.setForeground(Color.BLUE.darker());
     newuser.setBounds(520,10,100,50);
     f.add(newuser);

      newuser.addMouseListener(new MouseAdapter()
            {
        public void mouseClicked(MouseEvent e)
                {
            try{

         //   JOptionPane.showMessageDialog(f,"fsdf");
                 ResultSet rs=stmt.executeQuery("select top 1 UserID from jLogin order by UserID desc");

                if(rs.next())
                {
                     login2 ob=new login2();
                     ob.login22();
                }
 else
                {
                JOptionPane.showMessageDialog(f,"No ADMIN record");
                 newuser nu=new newuser();
        nu.newu();
                }

               }
            catch(Exception e1)
                {
                 JOptionPane.showMessageDialog(f,e1);
            }
        }//mouseclicked

         public void mouseExited(MouseEvent e)
                {
            newuser.setText("New User");
        }

        public void mouseEntered(MouseEvent e)
                {
            newuser.setText("SIGN IN");
        }

    });

    luser=new JLabel("USER ID");
    luser.setFont(new Font("Times new roman",Font.BOLD,18) );
    luser.setBounds(300,100,100,50);
    f.add(luser);

    tuser=new JTextField();
    tuser.setFont(new Font("Times new roman",Font.PLAIN,16) );
    tuser.setBounds(420,110,150,30);
    f.add(tuser);


    Hidn=new JLabel("");
    Hidn.setFont(new Font("Times new roman",Font.PLAIN,12));
    Hidn.setForeground(Color.red);
    Hidn.setBounds(420,140,150,20);
    f.add(Hidn);



    lpwrd=new JLabel("PASSWORD");
    lpwrd.setFont(new Font("Times new roman",Font.BOLD,18) );
    lpwrd.setBounds(300,170,150,50);
    f.add(lpwrd);

    pwrd=new JPasswordField();
    pwrd.setFont(new Font("Times new roman",Font.PLAIN,24) );
    pwrd.setBounds(420,180,150,30);
    f.add(pwrd);

    login=new JButton("LOGIN");
    login.setFont(new Font("Times new roman",Font.BOLD,20) );
    login.setBounds(290,280,100,30);
    f.add(login);
    login.addActionListener(this);


    bck=new JButton("BACK");
    bck.setFont(new Font("Times new roman",Font.BOLD,20) );
    bck.setBounds(450,280,100,30);
    f.add(bck);
    bck.addActionListener(this);

    frgtpswd=new JLabel("Forget Password");
    frgtpswd.setFont(new Font("Times new roman",Font.PLAIN,12) );
    frgtpswd.setBounds(500,350,100,20);
    frgtpswd.setForeground(Color.BLUE.darker());
    frgtpswd.setCursor(new Cursor(Cursor.HAND_CURSOR));
  //  frgtpswd.addActionListener(this);
    f.add(frgtpswd);

     frgtpswd.addMouseListener(new MouseAdapter()
            {
        public void mouseClicked(MouseEvent e)
                {
            try{

         //   JOptionPane.showMessageDialog(f,"fsdf");
             forgetpassword ob=new forgetpassword();
             ob.forgetp();
                     
               }
            catch(Exception e1)
                {
                 JOptionPane.showMessageDialog(f,e1);
            }
        }//mouseclicked

        public void mouseExited(MouseEvent e)
                {
            frgtpswd.setText("Forget Password");
        }

        public void mouseEntered(MouseEvent e)
                {
            frgtpswd.setText("Retrieve Password");
        }

    });



    f.setVisible(true);

}//login

public void actionPerformed(ActionEvent e)
    {
    if(e.getSource()==login)
    {
        if(tuser.getText().equals(""))
        {
            Hidn.setText("! Enter User ID");

            return;
        }

 else if (pwrd.getText().equals(""))
        {
            Hidn.setText("! Enter Password");
              Hidn.setBounds(420,210,150,20);
            return;
        }

 else
        {
             Hidn.setText("");
        String suser=tuser.getText();
         suser = suser.toUpperCase();
        String spwrd=pwrd.getText();
        String datid,datpwd;
         try
         {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection con = DriverManager.getConnection("jdbc:odbc:bb","sa","sqlserver");
	Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("select UserID ,User_Password from jLogin where UserID ='"+suser+"'");//
            if(rs.next())
            {
                 datid=rs.getString("UserID");
                 datpwd=rs.getString("User_Password");
                if((suser.equals(datid))&&(spwrd.equals(datpwd)))
                {
                JOptionPane.showMessageDialog(f, "Password Match");
                libMenu lm = new libMenu();
                lm.menup();
                f.setVisible(false);
                return;
                }//if
                else
                {
                  JOptionPane.showMessageDialog(f, "Password Not Match");
                 
                  ctr = ctr+1;
             tuser.setText("");
             pwrd.setText("");
                   
                }//else
             }//while
            else
            {
                JOptionPane.showMessageDialog(f, "User ID does not exist");

                  ctr = ctr+1;
             tuser.setText("");
             pwrd.setText("");
            }

            if(ctr==3)
                   {
                       JOptionPane.showMessageDialog(f,"Oops session out");
                       adenter ad=new adenter();
                       f.setVisible(false);
                       return;
                   }
            
          }//try
         catch(Exception e2)
         {
             JOptionPane.showMessageDialog(f, e2);

         }//catch
        }//else of login
        }//if
    else if(e.getSource()==bck)
        {
         try
          {
              adenter ad=new adenter();
        ad.adenter1();
              f.setVisible(false);
          }//try
           catch(Exception z2)
            {
              JOptionPane.showMessageDialog(f,z2);
            }//catch
         }//else if
}//actionperformed


    public static void main(String[] args)throws Exception
    {
        login ob=new login();
        ob.login1();

    }//main

}//Login
