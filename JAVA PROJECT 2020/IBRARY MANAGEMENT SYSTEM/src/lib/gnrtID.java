
package lib;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;//border
import java.sql.*;

public class gnrtID extends JFrame implements ActionListener
{
     JFrame f;
     JPanel p;
     JLabel tag,hidden,u_id,u_conpss,u_anx,u_pxwrd,u_sq,hiddenName;
     JTextField txtUID,txtAnx;
     JPasswordField txtConpax,txtPxwrd;
     JComboBox cmbSQ;
     JButton btnOK,btnBack;
     Statement stmt;
     String UIDlist,strUid, strUidPart;
     int intUid;

     public static String usr;
     public static String usrN;

      gnrtID()
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

      public void gId()
    {
           f=new JFrame("LIBRARY MANAGEMENT SYSTEM");
        f.setLayout(null);
        f.setSize(600,500);

        f.setResizable(false);
        f.setLocationRelativeTo(null);
        Color f1=new Color(74,162,149);
        f.getContentPane().setBackground(f1);
        p=new JPanel();
        p.setLayout(null);
        Color p1=new Color(229,229,229);
        p.setBackground(p1);
        p.setBounds(30,140,530,300);

          tag=new JLabel("  GENERATE USER ID");
          tag.setFont(new Font("Century Schoolbook",Font.BOLD,32));
          tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));

          tag.setBounds(100,70,400,50);
          f.add(tag);

          hidden = new JLabel("");
          hidden.setFont(new Font("Arial",Font.PLAIN,12));
          hidden.setForeground(Color.red);
          hidden.setBounds(150,5,400,20);
          p.add(hidden);

         hiddenName = new JLabel("ghjhjhjhjhjghg");
         hiddenName.setFont(new Font("Arial",Font.BOLD,14));
         hiddenName.setBounds(500,20,100,20);
         f.add(hiddenName);

        u_id=new JLabel("User ID");
        u_id.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_id.setBounds(50,30,120,25);
        p.add(u_id);

        txtUID=new JTextField();
        txtUID.setFont(new Font("Arial",Font.PLAIN,16));
        txtUID.setEditable(false);
        txtUID.setBounds(250,30,270,30);
        p.add(txtUID);

        txtUID.setText(newuser.usr);
        hiddenName.setText(newuser.usrN);

         u_pxwrd=new JLabel("Enter your Password");
        u_pxwrd.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_pxwrd.setBounds(50,70,200,25);
        p.add(u_pxwrd);

        txtPxwrd=new JPasswordField();
        txtPxwrd.setFont(new Font("Arial",Font.PLAIN,16));
        txtPxwrd.setBounds(250,70,270,30);
        p.add(txtPxwrd);

        u_conpss=new JLabel("Confirm Password");
        u_conpss.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_conpss.setBounds(50,110,200,25);
        p.add(u_conpss);

        txtConpax=new JPasswordField();
        txtConpax.setFont(new Font("Arial",Font.PLAIN,16));
        txtConpax.setBounds(250,110,270,30);
        p.add(txtConpax);

        u_sq=new JLabel("Security question");
        u_sq.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_sq.setBounds(50,150,200,25);
        p.add(u_sq);

        cmbSQ=new JComboBox();
        cmbSQ.setFont(new Font("Times new roman",Font.PLAIN,12));
        cmbSQ.setBounds(250,150,270,25);
        cmbSQ.addItem("What is your favorite book?");
        cmbSQ.addItem("Where did you go to high school?");
        cmbSQ.addItem("Which phone number do you remember the most?");
        cmbSQ.addItem("What is your favorite food?");
        p.add(cmbSQ);

        u_anx=new JLabel("Answer");
        u_anx.setFont(new Font("Times new roman",Font.PLAIN,18));
        u_anx.setBounds(50,190,200,25);
        p.add(u_anx);

        txtAnx=new JTextField();
        txtAnx.setFont(new Font("Arial",Font.PLAIN,16));
        txtAnx.setBounds(250,190,270,30);
        p.add(txtAnx);

        btnOK=new JButton("OK");
        btnOK.setFont(new Font("Times new roman",Font.PLAIN,16));
        btnOK.setBounds(100,250,120,30);
        btnOK.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnOK.addActionListener(this);
        p.add(btnOK);

        btnBack=new JButton("BACK");
        btnBack.setFont(new Font("Times new roman",Font.PLAIN,16));
        btnBack.setBounds(300,250,120,30);
        btnBack.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnBack.addActionListener(this);
        p.add(btnBack);

        f.add(p);
        f.setVisible(true);
      }

      public void actionPerformed(ActionEvent e3)
    {
          if(e3.getSource()==btnOK)
          {
              String strUser;
            strUser = txtUID.getText();
            String strPassword, strConfirmPassword;
            strPassword = txtPxwrd.getText();
            strConfirmPassword = txtConpax.getText();

            //validation empty box

            if(txtUID.getText().isEmpty())
            {
                hidden.setText("! Click Back Button. User ID and Password already generated.");
                txtUID.requestFocus();
            }//if txtUserId

              else if(txtPxwrd.getText().isEmpty())
            {
                hidden.setText("! Enter Password");
                txtPxwrd.requestFocus();
            }//if txtUserId
            else if (txtConpax.getText().isEmpty())
            {
                 hidden.setText( "! Enter User Password");
                 txtConpax.requestFocus();
            }//if txtPassword

            else if (txtAnx.getText().isEmpty())
            {
                hidden.setText("! Enter Your answer");
                txtAnx.requestFocus();
            }//else if txtAnx

            else if(!(strPassword.equals(strConfirmPassword)))
            {
              JOptionPane.showMessageDialog(f,"Password and Confirm Password do not MATCH");
              txtPxwrd.setText("");
              txtConpax.setText("");
              txtPxwrd.requestFocus();
            }


            else
            {
                hidden.setText("");

                //validation alphanumeric check
                String strPS, strCPS,stralpha;
                 char ctralpha;

                int ctr;
                
                strPS = txtPxwrd.getText();
                for (ctr = 0; ctr < strPS.length();ctr++)
                {
                    stralpha = strPS.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(!Character.isLetterOrDigit(ctralpha) && ctralpha != '$' && ctralpha != '-' && ctralpha != '#' && ctralpha != '.' )
                    {
                        hidden.setText("! Password only contain letter ,digits,dollar,hypen,Hashtag & dot.");
                        txtPxwrd.setText("");
                        txtPxwrd.requestFocus();
                        return;
                    }//txtPassword
                }//txtPassword

                strCPS = txtConpax.getText();
                for (ctr = 0; ctr < strCPS.length();ctr++)
                {
                    stralpha = strCPS.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(!Character.isLetterOrDigit(ctralpha) && ctralpha != '$' && ctralpha != '-' && ctralpha != '#' && ctralpha != '.' )
                    {
                        hidden.setText("! Password only contain letter ,digits,dollar,hypen,Hashtag & dot.");
                        txtConpax.setText("");
                        txtConpax.requestFocus();
                        return;
                    }//txtConfirmPassword
                }//txtConfirmPassword



                try
                {
                    String USQ=cmbSQ.getSelectedItem().toString();
                    String Uans=txtAnx.getText();

                    //to make SQL Server Connection

                     stmt.executeUpdate("update jLogin set User_Password='"+strPS+"',U_Security='"+USQ+"',U_Anx='"+Uans+"' WHERE UserID='"+strUser+"'");
                   
                    JOptionPane.showMessageDialog(f,"User ID and Password Generated");

                    txtUID.setText("");
                    txtPxwrd.setText("");
                    txtConpax.setText("");
                    txtAnx.setText("");
                    

                }//try
                catch (Exception c4)
                {
                 JOptionPane.showMessageDialog(f,c4);

                }//catch

            }//else alpha
          }//btnOK
          else if(e3.getSource()==btnBack)
          {
            f.setVisible(false);

          }
      }
    public static void main(String[] args)
    {
        gnrtID nu=new gnrtID();
        nu.gId();
       
    }

}
