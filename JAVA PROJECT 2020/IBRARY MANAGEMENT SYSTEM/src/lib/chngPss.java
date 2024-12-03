
package lib;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;//border
import java.sql.*;

public class chngPss extends JFrame implements ActionListener
{
     JFrame f;
     JPanel p;
 JLabel tag,hidden,u_id,u_conpwrd,u_newpswrd,u_pass,nSQ,nAns;
 JTextField txtUID,txtpswrd,tanx;
 JPasswordField txtnewp,tconp;
 JMenu book,member,librarian,report,quit,about;
    JMenuItem b_entries,b_issue,b_return,mnew,mdelete,c_password,b_lxt,m_lxt,c_user,close,aboutus;
 JComboBox cmbSQ;
   JButton btnCANCEL,btnOK;
      Statement stmt;
       String UIDlist,strUid, strUidPart;
                int intUid;

      chngPss()
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

       public void ChngPx()
    {
        f=new JFrame("LIBRARY MANAGEMENT SYSTEM");
        f.setLayout(null);
        f.setSize(700,500);

        f.setResizable(false);
        f.setLocationRelativeTo(null);
        Color f1=new Color(203,245,234);
        f.getContentPane().setBackground(f1);
        p=new JPanel();
        p.setLayout(null);
        Color p1=new Color(229,229,229);
        p.setBackground(p1);
        p.setBounds(30,100,630,330);

        JMenuBar mb=new JMenuBar();

        book=new JMenu("BOOK");
        book.setFont(new Font("Times new roman",Font.PLAIN,20));
        book.setBorder(new EmptyBorder(4,10,4,10));
        b_entries=new JMenuItem("Book Entries");
        b_entries.setFont(new Font("Times new roman",Font.PLAIN,18));
       // b_entries.setForeground(Color.MAGENTA);
        Color b1 = new Color(183,228,240);
        b_entries.setBackground(b1);

        book.add(b_entries);
        b_entries.addActionListener(this);

        b_issue=new JMenuItem("Book Issue");
         b_issue.setFont(new Font("Times new roman",Font.PLAIN,18));
        b_issue.setBackground(b1);
        b_issue.add(new JSeparator());//add separator
        b_issue.addActionListener(this);
       book.add(b_issue);

       // b_issue.addActionListener(this);
        b_return=new JMenuItem("Book Return");
          b_return.setFont(new Font("Times new roman",Font.PLAIN,18));
        b_return.setBackground(b1);
        b_return.add(new JSeparator());//add separator
        b_return.addActionListener(this);
        book.add(b_return);
        mb.add(book);

        member=new JMenu("MEMBER");
        member.setFont(new Font("Times new roman",Font.PLAIN,20));
        member.setBorder(new EmptyBorder(0,10,0,10));
      //  member.setForeground(Color.red);

         Color b2 = new Color(208,208,232);

        mnew=new JMenuItem("New Member");
        mnew.setFont(new Font("Times new roman",Font.PLAIN,18));
        mnew.setBackground(b2);
        mnew.addActionListener(this);

        mdelete=new JMenuItem("Delete");
        mdelete.setFont(new Font("Times new roman",Font.PLAIN,18));
        mdelete.setBackground(b2);
        mdelete.add(new JSeparator());//add separator
        mdelete.addActionListener(this);

        member.add(mnew);
        member.add(mdelete);
        mb.add(member);

        librarian=new JMenu("LIBRARIAN");
        librarian.setFont(new Font("Times new roman",Font.PLAIN,20));
     //   librarian.setForeground(Color.BLUE);
        librarian.setBorder(new EmptyBorder(0,10,0,10));

         c_password=new JMenuItem("Change Password");
          c_password.setFont(new Font("Times new roman",Font.PLAIN,18));
        c_password.setBackground(b1);
        c_password.add(new JSeparator());//add separator
        c_password.addActionListener(this);

         librarian.add(c_password);
        mb.add(librarian);

        report=new JMenu("REPORT");
        report.setFont(new Font("Times new roman",Font.PLAIN,20));
        report.setBorder(new EmptyBorder(0,10,0,10));
        b_lxt= new JMenuItem("Book List");
         b_lxt.setFont(new Font("Times new roman",Font.PLAIN,18));
        b_lxt.setBackground(b2);
        b_lxt.addActionListener(this);

        m_lxt=new JMenuItem("Member list");
         m_lxt.setFont(new Font("Times new roman",Font.PLAIN,18));
        m_lxt.setBackground(b2);
        m_lxt.add(new JSeparator());//add separator
        m_lxt.addActionListener(this);

        report.add(b_lxt);
        report.add(m_lxt);
        mb.add(report);

        quit=new JMenu("QUIT");
        quit.setFont(new Font("Times new roman",Font.PLAIN,20));
        quit.setBorder(new EmptyBorder(0,10,0,10));
        c_user=new JMenuItem("Change User");
          c_user.setFont(new Font("Times new roman",Font.PLAIN,18));
        c_user.setBackground(b1);
        c_user.addActionListener(this);

        quit.add(c_user);
        close=new JMenuItem("Close");
          close.setFont(new Font("Times new roman",Font.PLAIN,18));
        close.setBackground(b1);
        close.add(new JSeparator());//add separator
        close.addActionListener(this);

        quit.add(close);
        mb.add(quit);

        about=new JMenu("ABOUT");
        about.setFont(new Font("Times new roman",Font.PLAIN,20));
        about.setBorder(new EmptyBorder(0,10,0,10));
        aboutus=new JMenuItem("About system");
        aboutus.setFont(new Font("Times new roman",Font.PLAIN,18));
        aboutus.setBackground(b2);
        aboutus.add(new JSeparator());//add separator
        aboutus.addActionListener(this);

        about.add(aboutus);
        mb.add(about);


        //to set color
        Color mnb = new Color(86,163,134);
        mb.setBackground(mnb);
        f.setJMenuBar(mb);

          tag=new JLabel(" CHANGE PASSWORD");
          tag.setFont(new Font("Century Schoolbook",Font.BOLD,32));
          tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));

          tag.setBounds(170,40,400,50);
          f.add(tag);

          hidden = new JLabel("");
          hidden.setFont(new Font("Arial",Font.PLAIN,12));
          hidden.setForeground(Color.red);
        hidden.setBounds(20,250,400,20);
        p.add(hidden);

        u_id=new JLabel("User ID");
        u_id.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_id.setBounds(30,10,100,35);
        p.add(u_id);

        txtUID=new JTextField();
        txtUID.setFont(new Font("Arial",Font.PLAIN,16));
        txtUID.setBounds(250,10,270,30);
        p.add(txtUID);

        u_pass=new JLabel("Password");
        u_pass.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_pass.setBounds(30,50,200,25);
        p.add(u_pass);

        txtpswrd=new JTextField();
        txtpswrd.setFont(new Font("Arial",Font.PLAIN,16));
        txtpswrd.setBounds(250,50,270,30);
        p.add(txtpswrd);

        u_newpswrd=new JLabel("New Password");
        u_newpswrd.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_newpswrd.setBounds(30,90,200,25);
        p.add(u_newpswrd);

        txtnewp=new JPasswordField();
        txtnewp.setFont(new Font("Arial",Font.PLAIN,34));
        txtnewp.setBounds(250,90,270,30);
        p.add(txtnewp);

        u_conpwrd=new JLabel("Confirm New Password");
        u_conpwrd.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_conpwrd.setBounds(30,130,200,25);
        p.add(u_conpwrd);

        tconp=new JPasswordField();
        tconp.setFont(new Font("Arial",Font.PLAIN,34));
        tconp.setBounds(250,130,270,30);
        p.add(tconp);

        nSQ=new JLabel("Your Security Question");
        nSQ.setFont(new Font("Times new roman",Font.PLAIN,18));
        nSQ.setBounds(30,170,200,25);
        p.add(nSQ);

        cmbSQ=new JComboBox();
        cmbSQ.setFont(new Font("Times new roman",Font.PLAIN,12));
        cmbSQ.setBounds(250,170,270,25);
        cmbSQ.addItem("What is your favorite book?");
        cmbSQ.addItem("Where did you go to high school?");
        cmbSQ.addItem("Which phone number do you remember the most?");
        cmbSQ.addItem("What is your favorite food?");
         p.add(cmbSQ);

        nAns=new JLabel("Answer");
        nAns.setFont(new Font("Times new roman",Font.PLAIN,18));
        nAns.setBounds(30,210,200,25);
        p.add(nAns);

        tanx=new JTextField();
        tanx.setFont(new Font("Arial",Font.PLAIN,16));
        tanx.setBounds(250,210,270,30);
        p.add(tanx);

        btnOK=new JButton("OK");
        btnOK.setFont(new Font("Times new roman",Font.PLAIN,18));
        btnOK.setBounds(100,290,120,30);
        btnOK.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnOK.addActionListener(this);
        p.add(btnOK);

        btnCANCEL=new JButton("CANCEL");
        btnCANCEL.setFont(new Font("Times new roman",Font.PLAIN,18));
        btnCANCEL.setBounds(300,290,120,30);
        btnCANCEL.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnCANCEL.addActionListener(this);
        p.add(btnCANCEL);

        f.add(p);
        f.setVisible(true);
    }

       public void actionPerformed(ActionEvent e3)
    {
            if(e3.getSource().equals(b_entries))
        {
            try
            {
             bookentries be = new bookentries();
             be.boken();
              f.setVisible(false);
            }
            catch (Exception ex)
            {
               JOptionPane.showMessageDialog(f,ex);
            }
        }
        else if(e3.getSource().equals(b_issue))
        {
            try
            {
             bookixue bkix=new bookixue();
       bkix.bokix();
        f.setVisible(false);
            }
            catch (Exception ex)
            {
               JOptionPane.showMessageDialog(f,ex);
            }
        }
        else if(e3.getSource().equals(b_return))
        {
            try
            {
              bkrtn rtn = new bkrtn();
              rtn.bokrtn();
            f.setVisible(false);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(f,e1);
            }
        }
        else if(e3.getSource().equals(mnew))
        {
            try
            {
             mmbrnew mm=new mmbrnew();
             mm.mmbrn();
            f.setVisible(false);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(f,e1);
            }
        }
        else if(e3.getSource().equals(mdelete))
        {
            try
            {
             login2 ob=new login2();
             ob.login22();
          //  f.setVisible(false);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(f,e1);
            }
        }

         else if(e3.getSource().equals(b_lxt))
        {
            try
            {
             userlxt ul=new userlxt();
             ul.lxt();
            f.setVisible(false);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(f,e1);
            }
        }
         else if(e3.getSource().equals(m_lxt))
        {
            try
            {
            list ob=new list();
            ob.member();
            f.setVisible(false);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(f,e1);
            }
        }
         else if(e3.getSource().equals(c_user))
        {
            try
            {
              login ob=new login();
              ob.login1();
            f.setVisible(false);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(f,e1);
            }
        }
         else if(e3.getSource().equals(close))
        {
            try
            {
             f.setVisible(false);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(f,e1);
            }
        }
        else if(e3.getSource().equals(aboutus))
        {
            try
            {
             about at=new about();
             at.abtus();
           // f.setVisible(false);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(f,e1);
            }
        }


           /////////////////////////////////////////////////
         else if (e3.getSource()==btnOK)
          {
               try
                {
              String strUser;
            strUser = txtUID.getText();
            strUser= strUser.toUpperCase();
            String strPassword,strNewP ,strConfirmPassword;
            strPassword = txtpswrd.getText();
            strNewP = txtnewp.getText();
            strConfirmPassword = tconp.getText();

            //validation empty box

            if(txtUID.getText().isEmpty())
            {
                hidden.setText("! Enter USER ID.");
                txtUID.requestFocus();
            }//if txtUserId

              else if(txtpswrd.getText().isEmpty())
            {
                hidden.setText("! Enter Password");
                txtpswrd.requestFocus();
            }//if txtUserId
            else if (txtnewp.getText().isEmpty())
            {
                 hidden.setText( "! Enter New Password");
                 txtnewp.requestFocus();
            }//if txtPassword

            else if (tconp.getText().isEmpty())
            {
                 hidden.setText( "! Confirm new Password");
                 tconp.requestFocus();
            }//if txtPassword

            else if (tanx.getText().isEmpty())
            {
                hidden.setText("! Enter Your answer");
                tanx.requestFocus();
            }//else if txtAnx

            else if(!(strNewP.equals(strConfirmPassword)))
            {
              JOptionPane.showMessageDialog(f,"New Password and Confirm Password do not MATCH");
              txtnewp.setText("");
              tconp.setText("");
              txtnewp.requestFocus();
            }


            else
            {
                hidden.setText("");

                //validation alphanumeric check
                String strPS, strCPS,stralpha;
                 char ctralpha;

                int ctr;

                strPS = txtnewp.getText();
                for (ctr = 0; ctr < strPS.length();ctr++)
                {
                    stralpha = strPS.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                   if(!Character.isLetterOrDigit(ctralpha) && ctralpha != '$' && ctralpha != '-' && ctralpha != '#' && ctralpha != '.' )
                    {
                        hidden.setText("! Password only contain letter ,digits,dollar,hypen,Hashtag & dot.");
                        txtnewp.setText("");
                        txtnewp.requestFocus();
                        return;
                    }//txtPassword
                }//txtPassword

                strCPS = tconp.getText();
                for (ctr = 0; ctr < strCPS.length();ctr++)
                {
                    stralpha = strCPS.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(!Character.isLetterOrDigit(ctralpha) && ctralpha != '$' && ctralpha != '-' && ctralpha != '#' && ctralpha != '.' )
                    {
                        hidden.setText("! Password only contain letter ,digits,dollar,hypen,Hashtag & dot.");
                        txtnewp.setText("");
                        tconp.requestFocus();
                        return;
                    }//txtConfirmPassword
                }//txtConfirmPassword


      String datid,datpwd;
	    ResultSet rs = stmt.executeQuery("select UserID ,User_Password from jLogin where UserID ='"+strUser+"'");
            while(rs.next())
            {
                 datid=rs.getString("UserID");
                 datpwd=rs.getString("User_Password");
                if((strUser.equals(datid))&&(strPassword.equals(datpwd)))
                {
                JOptionPane.showMessageDialog(f, "Password Match");


                    String USQ=cmbSQ.getSelectedItem().toString();
                    String Uans=tanx.getText();

                    //to make SQL Server Connection

                     stmt.executeUpdate("update jLogin set User_Password='"+strNewP+"',U_Security='"+USQ+"',U_Anx='"+Uans+"' WHERE UserID='"+strUser+"'");

                    JOptionPane.showMessageDialog(f,"User ID and Password have benn UPDATED");

                    txtUID.setText("");
                    txtpswrd.setText("");
                    txtnewp.setText("");
                    tconp.setText("");
                    tanx.setText("");

                return;
                }//if
                else
                {
                  JOptionPane.showMessageDialog(f, "User ID and Password does not exist");

             txtUID.setText("");
             txtpswrd.setText("");

                }//else
             }//while
           }//else
              }//try
               catch (Exception c4)
                {
                 JOptionPane.showMessageDialog(f,c4);
                }//catch
           
          }//btnOK
          else if(e3.getSource()==btnCANCEL)
          {
              try
              {
                  
            f.setVisible(false);
              }
             catch (Exception c4)
                {
                 JOptionPane.showMessageDialog(f,c4);
                }//catch

          }
      }


    public static void main(String[] args)
    {
    chngPss cp=new chngPss();
    cp.ChngPx();

    }

}
