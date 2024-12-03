
package lib;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;

public class forgetpassword extends JFrame implements ActionListener
{

       JFrame f;
       JPanel p;
    JLabel luser,lpwrd,lgn,Hidn,ques,ans,frgtpswd;
    JTextField tuser,pwrd,tans;
    JComboBox tques;
    JButton login;
     Statement stmt;
    int ctr;

     forgetpassword()
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


public void forgetp()
{
    f=new JFrame("LIBRARY MANAGEMENT SYSTEM");
    f.setLayout(null);
    f.setSize(600,400);
    f.setResizable(false);
   f.setLocationRelativeTo(null);
    Color f1=new Color(0,140,140);
        f.getContentPane().setBackground(f1);
        p=new JPanel();
        p.setLayout(null);
        Color p1=new Color(229,229,229);
        p.setBackground(p1);
        p.setBounds(20,20,555,325);
f.add(p);

     lgn=new JLabel("   FORGET PASSWORD ");
     lgn.setFont(new Font("Century Schoolbook",Font.BOLD,30));
     lgn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder()));
     lgn.setBounds(80,20,400,50);
     p.add(lgn);

    luser=new JLabel("User ID");
    luser.setFont(new Font("Calibri",Font.BOLD,16) );
    luser.setBounds(50,100,100,20);
    p.add(luser);

    tuser=new JTextField();
    tuser.setFont(new Font("Times new roman",Font.PLAIN,16) );
    tuser.setBounds(250,100,250,30);
    p.add(tuser);

    lpwrd=new JLabel("Password");
    lpwrd.setFont(new Font("Calibri",Font.BOLD,16) );
    lpwrd.setBounds(50,220,100,20);
    p.add(lpwrd);

    pwrd=new JTextField();
    pwrd.setFont(new Font("Times new roman",Font.PLAIN,16) );
    pwrd.setBounds(250,220,250,30);
    pwrd.setEditable(false);
    p.add(pwrd);

    Hidn=new JLabel("");
    Hidn.setFont(new Font("Times new roman",Font.PLAIN,14));
    Hidn.setForeground(Color.red);
    Hidn.setBounds(20,280,200,20);
    p.add(Hidn);

    ques=new JLabel("Your Security Question");
    ques.setFont(new Font("Times new roman",Font.BOLD,16) );
    ques.setBounds(50,140,200,20);
    p.add(ques);

    tques=new JComboBox();
    tques.setFont(new Font("Times new roman",Font.PLAIN,12) );
    tques.addItem("What is your favorite book?");
    tques.addItem("Where did you go to high school?");
    tques.addItem("Which phone number do you remember the most?");
    tques.addItem("What is your favorite food?");
    tques.setBounds(250,140,250,30);
    p.add(tques);

    ans=new JLabel("Answer");
    ans.setFont(new Font("Calibri",Font.BOLD,16) );
    ans.setBounds(50,180,100,20);
    p.add(ans);

    tans=new JTextField();
    tans.setFont(new Font("Times new roman",Font.PLAIN,16) );
    tans.setBounds(250,180,250,30);
    p.add(tans);

    login=new JButton("RETRIEVE");
    login.setFont(new Font("Arial",Font.PLAIN,20) );
    login.setBounds(200,280,150,35);
    login.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
    p.add(login);
    login.addActionListener(this);

    f.setVisible(true);

}//login

public void actionPerformed(ActionEvent e)
    {
    if(e.getSource()==login)
    {
        int q1;
        String qi;
        q1=tques.getSelectedIndex();
        qi=Integer.toString(q1);
        try
            {
            if (tuser.getText().equals(""))
            {
                Hidn.setText("Please Enter User_ID");
                tuser.requestFocus();
                 return;
            }//if txtID
            else if (qi.equals("-1"))
            {
                Hidn.setText("Please Choose Question");
                tques.requestFocus();
                return;
            }
            else if (tans.getText().equals(""))
            {
                Hidn.setText("Enter Answer");
                tans.requestFocus();
                return;
            }
             else
                {
                String uid,usq,uas;
                uid = tuser.getText();
                usq = tques.getSelectedItem().toString();
                uas = tans.getText();

                 ResultSet rss=stmt.executeQuery("select * from jLogin where UserID ='"+uid+"' AND U_Security ='"+usq+"' AND U_Anx ='"+uas+"'");
              if(rss.next())
                
              {
           // cmbMemberID.setSelectedItem(rs.getString("MEMBER_ID"));
              pwrd.setText(rss.getString("User_Password"));
              JOptionPane.showMessageDialog(f,"Password of "+uid+" :- "+pwrd.getText());
              }

                    else
                    {
                        JOptionPane.showMessageDialog(f,"Record did not Find in User Table");

                    }
                
                 f.setVisible(false);

                }
            }//try
            catch (Exception obj)
            {
                JOptionPane.showMessageDialog(f, obj);
            }//catch

    }
    }

    public static void main(String[] args)
    {
        forgetpassword ob=new forgetpassword();
        ob.forgetp();

    }//main

}//Login


