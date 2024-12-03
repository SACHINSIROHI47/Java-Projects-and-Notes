
package lib;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;//border
import java.sql.*;


public class newuser extends JFrame implements ActionListener
{

     JFrame f;
     JPanel p;
 JLabel tag,hidden,u_name,u_add,u_email,u_con,nDeclr;
 JTextField txtUName,tAdd,tEMail,tCon,u_id;
JCheckBox declr;
   JButton btnGID,btnNext;
      Statement stmt;
       String UIDlist,strUid, strUidPart;
                int intUid;

                public static String usr;
        public static String usrN;

      newuser()
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

       public void newu()
    {
        f=new JFrame("LIBRARY MANAGEMENT SYSTEM");
        f.setLayout(null);
        f.setSize(600,500);

        f.setResizable(false);
        f.setLocationRelativeTo(null);
        Color f1=new Color(241,232,188);
        f.getContentPane().setBackground(f1);
        p=new JPanel();
        p.setLayout(null);
        Color p1=new Color(229,229,229);
        p.setBackground(p1);
        p.setBounds(30,140,530,300);

          tag=new JLabel("  LIBRARY CONSOLE");
          tag.setFont(new Font("Century Schoolbook",Font.BOLD,32));
          tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));

          tag.setBounds(100,70,400,50);
          f.add(tag);

          hidden = new JLabel("");
          hidden.setFont(new Font("Arial",Font.PLAIN,12));
          hidden.setForeground(Color.red);
        hidden.setBounds(200,180,400,20);
        p.add(hidden);

        btnGID=new JButton("Generate ID");
        btnGID.setFont(new Font("Times new roman",Font.PLAIN,14));
        btnGID.setBounds(20,80,120,20);
        btnGID.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnGID.addActionListener(this);
        p.add(btnGID);

        u_id=new JTextField();
        u_id.setFont(new Font("Verdana",Font.BOLD,14));
        u_id.setBounds(30,30,100,35);
        u_id.setEditable(false);
        u_id.setHorizontalAlignment(JTextField.CENTER);
        u_id.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));
        p.add(u_id);

        u_name=new JLabel("User Name");
        u_name.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_name.setBounds(170,30,120,25);
        p.add(u_name);

        txtUName=new JTextField();
        txtUName.setFont(new Font("Arial",Font.PLAIN,16));
        txtUName.setBounds(300,30,200,30);
        p.add(txtUName);

         u_email=new JLabel("Email");
        u_email.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_email.setBounds(170,70,120,25);
        p.add(u_email);

        tEMail=new JTextField();
        tEMail.setFont(new Font("Arial",Font.PLAIN,16));
        tEMail.setBounds(300,70,200,30);
        p.add(tEMail);

         u_add=new JLabel("Address");
        u_add.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_add.setBounds(170,110,120,25);
        p.add(u_add);

        tAdd=new JTextField();
        tAdd.setFont(new Font("Arial",Font.PLAIN,16));
        tAdd.setBounds(300,110,200,30);
        p.add(tAdd);

         u_con=new JLabel("Contact");
        u_con.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_con.setBounds(170,150,120,25);
        p.add(u_con);

        tCon=new JTextField();
        tCon.setFont(new Font("Arial",Font.PLAIN,16));
        tCon.setBounds(300,150,200,30);
        p.add(tCon);

        declr=new JCheckBox();
        declr.setText("I hereby confirm that the information provided by me on my tenancy application form");
        declr.setFont(new Font("Times new roman",Font.PLAIN,12));
        declr.setBackground(p1);
        declr.setBounds(5,210,500,15);
        p.add(declr);
        JLabel cDeclr=new JLabel(" regarding my details is to the best of my knowledge true. ");
        cDeclr.setFont(new Font("Times new roman",Font.PLAIN,12));
        cDeclr.setBounds(22,225,400,15);
        p.add(cDeclr);

        btnNext=new JButton("NEXT");
        btnNext.setFont(new Font("Times new roman",Font.PLAIN,16));
        btnNext.setBounds(210,250,120,30);
        btnNext.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnNext.addActionListener(this);
        p.add(btnNext);

        nDeclr=new JLabel("Note :-Before Press NEXT button, Please Recheck it. No Correction!");
        nDeclr.setFont(new Font("Times new roman",Font.PLAIN,12));
        nDeclr.setBounds(140,450,400,25);
        f.add(nDeclr);

        f.add(p);
        f.setVisible(true);
    }

        public void actionPerformed(ActionEvent e3)
    {
             String m_id,m_name1,gender3,email2,f_name4,con5,addrx6;
            if(e3.getSource()==btnGID)
 {
       try
            {
            // JOptionPane.showMessageDialog(f,"GID");
            ResultSet rs=stmt.executeQuery("select top 1 UserID from jLogin order by UserID desc");

                if(rs.next())
                {

                    strUid=(rs.getString("UserID"));
                    strUidPart = strUid.substring(2,7);
                    intUid = Integer.parseInt(strUidPart);
                    intUid++;

                    strUidPart = String.valueOf(intUid);
                       if ((intUid >= 1) && (intUid <= 9))
                    {
                        strUid = "UR0000" + strUidPart;
                    }//if of if
                    else if ((intUid >= 10) && (intUid <= 99))
                    {
                        strUid = "UR000" + strUidPart;
                    }//else if of if
                    else if ((intUid >= 100) && (intUid <= 999))
                    {
                        strUid = "UR00" + strUidPart;
                    }//else if of if
                    else if ((intUid >= 1000) && (intUid <= 9999))
                    {
                        strUid = "UR0" + strUidPart;
                    }//else if of if
                    else
                    {
                        strUid = "UR" + strUidPart;
                    }//else of if
                    u_id.setEditable(true);
             // cmbBookID.getEditor().setItem(strUid);
                    u_id.setText(strUid);
                    u_id.setEditable(false);
                }
 else
                {
              strUid = "AD00001";
              u_id.setEditable(true);
              u_id.setText(strUid);
              u_id.setEditable(false);
              JOptionPane.showMessageDialog(f,"No User Record AD00001 :- admin id");
                }

}//try
            catch(Exception e6)
            {
              JOptionPane.showMessageDialog(f,e6);
            }//catch

        }//btnGID
            else if(e3.getSource()==btnNext)
            {
      try
                {

                //validation empty box
            if (u_id.getText().equals(""))
            {
                hidden.setText("! Click Generate ID");
                btnGID.requestFocus();
                return;
            }//if cmbMemberID
            else if (txtUName.getText().isEmpty())
            {
                hidden.setText("! Enter user name");
                txtUName.requestFocus();
                return;
            }//if cmbMemberID

           
            else if (tEMail.getText().isEmpty())
            {
               hidden.setText("! Enter Email");
                tEMail.requestFocus();
                return;
            }//else if txtEmail

             else if (tAdd.getText().isEmpty())
            {
               hidden.setText("! Enter Address");
                tAdd.requestFocus();
                return;
            }//else if txtName

            else if (tCon.getText().isEmpty())
            {
                hidden.setText("! Enter Contact No.");
                tCon.requestFocus();
                return;
            }//else if txtContact

            else if (tCon.getText().length() != 10)
            {
                 hidden.setText( "! Phone Number must be for Ten Digits");
                tCon.requestFocus();
                return;
            }//else if txtContact

            else
            {
                hidden.setText("");
 //validation alphanumeric check
                String strMID,strMail,strCon,strSpind,stralpha;
                char ctralpha;
               /// char stralpha;
                int ctr;

             strMail = tEMail.getText();
                for (ctr = 0; ctr < strMail.length();ctr++)
                {
                    stralpha = strMail.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(!Character.isLetterOrDigit(ctralpha) && ctralpha != '@' && ctralpha != '.' )
                    {
                        hidden.setText("! Email_ID only contain letter ,digits, '@' sign & dot.");
                        tEMail.setText("");
                        tEMail.requestFocus();
                        return;
                    }//strMail
                }//strMail

                 strCon = tCon.getText();
                for (ctr = 0; ctr < strCon.length(); ctr++)
                {

                  stralpha = strCon.substring(ctr,ctr+1);
                  ctralpha=stralpha.charAt(0);
             if (!Character.isDigit(ctralpha) && ctralpha != '-' )
               {
                      hidden.setText( "! Phone Number can contains Digits [0-9] and Hyphen only");
                      tCon.setText("");
                      tCon.requestFocus();
                      return;
               }//strCon
                }//strCon
            if(declr.isSelected()==false)
                {
                     JOptionPane.showMessageDialog(f, "Please check the checkbox statement");
                }
             else
                 {
                     hidden.setText("");

                    usr = u_id.getText();
                    usrN = txtUName.getText();

                    //to make SQL Server Connection
                    m_id=u_id.getText();
                     m_name1=txtUName.getText();
                     addrx6=tAdd.getText();
         email2=tEMail.getText();
         con5=tCon.getText();
         

        stmt.execute("insert into jLogin(UserID,U_Name,Addrx,U_Mail,U_con) values('"+m_id+"','"+m_name1+"','"+addrx6+"','"+email2+"','"+con5+"')");
        JOptionPane.showMessageDialog(f, "Successfully Register."+m_id);

                   JOptionPane.showMessageDialog(f, "User ID Generated");

                    gnrtID nu=new gnrtID();
                    nu.gId();
                    f.setVisible(false);
               
                 }//ELSE
    }//else
          }//try
                catch (Exception c1)
                {
                   JOptionPane.showMessageDialog(f,c1);
                }//catch

           
        }//btnNext
    }
        

    public static void main(String[] args)
    {
        newuser nu=new newuser();
        nu.newu();
    }

}
