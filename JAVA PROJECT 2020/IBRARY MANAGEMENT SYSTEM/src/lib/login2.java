
package lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class login2 extends JFrame implements ActionListener
{
    JFrame f;
    JLabel luser,lpwrd,lgn,Hidn;
    JTextField tuser;
    JPasswordField pwrd;
    JRadioButton nu,dl;
    JButton login;
    int ctr;


public void login22()throws Exception
{
    f=new JFrame("LIBRARY MANAGEMENT SYSTEM");
    f.setLayout(null);
    f.setSize(500,350);
   //unable max btn
    f.setResizable(false);
    /* Min Size
    f.pack();  */
    //Set center
    f.setLocationRelativeTo(null);
   // f.getContentPane().setBackground(Color.lightGray);


     lgn=new JLabel("  ADMIN LOGIN");
     lgn.setFont(new Font("Century Schoolbook",Font.BOLD,32));
     lgn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder()));
     lgn.setBounds(100,20,300,50);
     f.add(lgn);

    
    luser=new JLabel("USER ID");
    luser.setFont(new Font("Times new roman",Font.BOLD,20) );
    luser.setBounds(50,100,100,30);
    f.add(luser);

    tuser=new JTextField("AD00001");
    tuser.setFont(new Font("Times new roman",Font.PLAIN,16) );
    tuser.setEditable(false);
    tuser.setBounds(200,90,250,40);
    f.add(tuser);

    Hidn=new JLabel("");
    Hidn.setFont(new Font("Arial",Font.PLAIN,12));
    Hidn.setForeground(Color.red);
    Hidn.setBounds(70,180,350,20);
    f.add(Hidn);

    lpwrd=new JLabel("PASSWORD");
    lpwrd.setFont(new Font("Times new roman",Font.BOLD,18) );
    lpwrd.setBounds(50,150,150,30);
    f.add(lpwrd);

    pwrd=new JPasswordField();
    pwrd.setFont(new Font("Times new roman",Font.PLAIN,34) );
    pwrd.setBounds(200,140,250,40);
    f.add(pwrd);

        nu=new JRadioButton();
        nu.setText("New user Sign up");
        nu.setBounds(100,240,150,25);
        nu.setFont(new Font("Times new roman",Font.PLAIN,12));
        f.add(nu);

        dl=new JRadioButton();
        dl.setText("Delete member record and ID");
        dl.setBounds(250,240,200,25);
        dl.setFont(new Font("Times new roman",Font.PLAIN,12));
        f.add(dl);

    login=new JButton("LOGIN");
    login.setFont(new Font("Times new roman",Font.BOLD,20) );
    login.setBounds(200,280,100,30);
    f.add(login);
    login.addActionListener(this);

    f.setVisible(true);

}//login

public void actionPerformed(ActionEvent e)
    {
    if(e.getSource()==login)
    {
        if (pwrd.getText().equals(""))
        {
            Hidn.setText("! Enter Password");
            return;
        }

 else if(nu.isSelected()==false && dl.isSelected()==false)
      {
        Hidn.setText("Select one option from NEW USER or DELETE MEMBER.");
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

                            if (nu.isSelected()==true)
                            {
                                newuser nu=new newuser();
                                nu.newu();
                                f.setVisible(false);
                                return;
                            }
                            if (dl.isSelected()==true)
                            {
                                mmdlt md=new mmdlt();
                                md.mmbrdlt();
                                f.setVisible(false);
                                return;
                            }
                        
               
                }//if
                  else
                {
                  JOptionPane.showMessageDialog(f, "Password Not Match");
                  f.setVisible(false);

                  // JOptionPane.showMessageDialog(f,ctr);S

                }//else
                           
             }//while
            
          }//try
         catch(Exception e2)
         {
             JOptionPane.showMessageDialog(f, e2);

         }//catch
        }//else of login
        }//if
  
}//actionperformed


    public static void main(String[] args)throws Exception
    {
        login2 ob=new login2();
        ob.login22();

    }//main

}//Login
