
package lib;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;//border
import java.sql.*;
import java.util.Vector;
import javax.swing.JSpinner;



public class mmbrnew extends JFrame implements ActionListener
{

     JFrame f;
     JPanel p;
 JLabel tag,hidden,ldate,m_id,m_name,m_gndr,m_dob,m_mail,m_con,m_fname,m_addrx,spi1,spi2,spi;
 JTextField txtMName,txtGndr,txtDob,txtMail,txtCon,txtFname,mAddrx;
 JRadioButton gender1,gender2;
 JComboBox cmbMemberID;
 ButtonGroup bg;
 //JCalender cdate;
   JMenu book,member,librarian,report,quit,about;
    JMenuItem b_entries,b_issue,b_return,mnew,mdelete,new_librarian,c_password,b_lxt,m_lxt,u_lxt,c_user,close,aboutus;
    JButton btnUpdate,btnReset,btnNew,btnAdd,btnSearch;
      Statement stmt;
      static JSpinner sd,sm,sy;
String MIDlist,strMid, strMidPart,MBIDlist;
                int intMid;
      mmbrnew()
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

       public void mmbrn()throws Exception
    { 
      f=new JFrame("Dashboard");
        f.setLayout(null);
        f.setSize(900,700);

        f.setResizable(false);
        f.setLocationRelativeTo(null);
        Color f1=new Color(174,174,174);
f.getContentPane().setBackground(f1);
       p=new JPanel();
        p.setLayout(null);
        Color p1=new Color(229,229,229);
        p.setBackground(p1);
        p.setBounds(50,100,800,500);


        JMenuBar mb=new JMenuBar();

        book=new JMenu("BOOK");
        book.setFont(new Font("Times new roman",Font.PLAIN,20));
        book.setBorder(new EmptyBorder(4,10,4,10));
        b_entries=new JMenuItem("Book Entries");
        b_entries.setFont(new Font("Times new roman",Font.PLAIN,18));
       // b_entries.setForeground(Color.MAGENTA);
        Color b1 = new Color(241,222,218);
        b_entries.setBackground(b1);
        b_entries.addActionListener(this);

        book.add(b_entries);
      //  b_entries.addActionListener(this);

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

         Color b2 = new Color(225,255,233);

        mnew=new JMenuItem("New Member");
        mnew.setFont(new Font("Times new roman",Font.PLAIN,18));
        mnew.setBackground(b2);
        mnew.addActionListener(this);

        mdelete=new JMenuItem("Delete");
        mdelete.setFont(new Font("Times new roman",Font.PLAIN,18));
        mdelete.setBackground(b2);
        mdelete.addActionListener(this);
        mdelete.add(new JSeparator());//add separator

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

        btnAdd=new JButton("ADD");
        btnAdd.setBackground(Color.lightGray);
        btnAdd.setFont(new Font("Arial",Font.PLAIN,18));
        btnAdd.setBounds(50,400,120,40);
        btnAdd.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnAdd.addActionListener(this);
        p.add(btnAdd);

        btnUpdate=new JButton("UPDATE");
        btnUpdate.setBackground(Color.lightGray);
        btnUpdate.setFont(new Font("Arial",Font.PLAIN,18));
        btnUpdate.setBounds(250,400,120,40);
        btnUpdate.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnUpdate.addActionListener(this);
        p.add(btnUpdate);

         btnSearch=new JButton("SEARCH");
        btnSearch.setBackground(Color.lightGray);
        btnSearch.setFont(new Font("Arial",Font.PLAIN,18));
        btnSearch.setBounds(450,400,120,40);
        btnSearch.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnSearch.addActionListener( this);
        p.add(btnSearch);

         btnNew=new JButton("NEW");
        btnNew.setBackground(Color.lightGray);
        btnNew.setFont(new Font("Arial",Font.PLAIN,18));
        btnNew.setBounds(650,400,120,40);
        btnNew.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnNew.addActionListener(this);
        p.add(btnNew);

       /* btnReset=new JButton("RESET");
        btnReset.setBackground(Color.lightGray);
        btnReset.setFont(new Font("Times new roman",Font.PLAIN,16));
        btnReset.setBounds(640,400,100,30);
        btnReset.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        p.add(btnReset);*/

//
         /*  String ww="dfdsf";
           cmbMemberID.setSelectedItem(ww);*/
           //to set color
        Color mnb = new Color(0,132,132);
        mb.setBackground(mnb);
        ////////////////////////////////////////////////////////////////////

        tag=new JLabel(" BOOK INFORMATION");
          tag.setFont(new Font("Century Schoolbook",Font.BOLD,32));
  // tag.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder()));
      //  tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
          tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));

     tag.setBounds(250,40,400,50);
     f.add(tag);
     
     //////////////////////////////////////////////////////////////////////////
     
     
        m_id=new JLabel("Member ID");
        m_id.setFont(new Font("Times new roman",Font.PLAIN,18));
        m_id.setBounds(10,80,120,25);
        p.add(m_id);

       
  try
        {
      ResultSet rs = stmt.executeQuery("select MEMBER_ID from newmember");

            Vector v = new Vector();

            while (rs.next()) {

                MIDlist = rs.getString(1);

                v.add(MIDlist);

            }

          cmbMemberID=new JComboBox(v);
      //  cmbMemberID.setEditable(true);
        cmbMemberID.setFont(new Font("Times new roman",Font.PLAIN,18));
        cmbMemberID.setBounds(160,80,200,30);
        p.add(cmbMemberID);

            rs.close();
            //cmbMemberID.setSelectedIndex(0);
           // String bidM="";
              cmbMemberID.requestFocus();

          // cmbMemberID.setSelectedItem(bidM);
 

}//try
catch(Exception tc)
  {
    JOptionPane.showMessageDialog(f,tc);
  }

          hidden = new JLabel("");
          hidden.setFont(new Font("Times new roman",Font.PLAIN,16));
          hidden.setForeground(Color.red);
        hidden.setBounds(20,20,400,20);
        p.add(hidden);

        m_name=new JLabel("Member Name");
        m_name.setFont(new Font("Times new roman",Font.PLAIN,18));
        m_name.setBounds(10,130,120,25);
        p.add(m_name);

        txtMName=new JTextField();
        txtMName.setFont(new Font("Times new roman",Font.PLAIN,18));
        txtMName.setBounds(160,130,200,30);
        p.add(txtMName);


        m_gndr=new JLabel("Gender");
        m_gndr.setBounds(10,180,120,25);
        m_gndr.setFont(new Font("Times new roman",Font.PLAIN,18));
        p.add(m_gndr);

        gender1=new JRadioButton();
        gender1.setText("Male");
        gender1.setBounds(160,180,100,25);
        gender1.setFont(new Font("Times new roman",Font.PLAIN,16));
        gender1.setBackground(p1);
        p.add(gender1);
       // gender1.setSelected(true);

        gender2=new JRadioButton();
        gender2.setText("Female");
        gender2.setBounds(260,180,100,25);
        gender2.setFont(new Font("Times new roman",Font.PLAIN,16));
        gender2.setBackground(p1);
        p.add(gender2);

        bg = new ButtonGroup();
	bg.add(gender1);
	bg.add(gender2);

        ////////////////////////////////////////////////////////////////////


        m_dob=new JLabel("Date of Birth");
        m_dob.setBounds(10,230,1200,20);
        m_dob.setFont(new Font("Times new roman",Font.PLAIN,18));
        p.add(m_dob);

        sd= new JSpinner(new SpinnerNumberModel(1,1,31,1));
        sd.setFont(new Font("Times new roman",Font.PLAIN,14));
        sd.setBounds(160,230,40,30);
        p.add(sd);

      //  String months[] = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        sm= new JSpinner(new SpinnerNumberModel(1,1,12,1));
        sm.setFont(new Font("Times new roman",Font.PLAIN,14));
        sm.setBounds(210,230,80,30);
        p.add(sm);


        sy = new JSpinner(new SpinnerNumberModel(1900,1900,3000,1));
        sy.setValue(1900);
        sy.setFont(new Font("Times new roman",Font.PLAIN,14));
        sy.setBounds(300,230,60,30);
        p.add(sy);


spi=new JLabel("");//year
spi.setBounds(220,260,50,50);
p.add(spi);

spi1=new JLabel("");//date
spi1.setBounds(180,260,20,50);
p.add(spi1);

spi2=new JLabel("");//month
spi2.setBounds(200,260,20,50);
p.add(spi2);

ldate=new JLabel("Note :- Please select Date of Birth");
ldate.setBounds(160,290,200,50);
p.add(ldate);

try
{
     sy.addChangeListener(new ChangeListener()

     {

    public void stateChanged(ChangeEvent e)
    {

        spi.setText("/"+((JSpinner)e.getSource()).getValue());
    }});

     sd.addChangeListener(new ChangeListener()

     {

    public void stateChanged(ChangeEvent e1)
    {

        spi1.setText(""+((JSpinner)e1.getSource()).getValue());
    }});

     sm.addChangeListener(new ChangeListener()

     {

    public void stateChanged(ChangeEvent e2)
    {

        spi2.setText("/"+((JSpinner)e2.getSource()).getValue());
    }});

        }//try
catch(Exception cl)
    {
        JOptionPane.showMessageDialog(f,cl);
    }

   m_mail=new JLabel("E-mail");
   m_mail.setBounds(460,80, 100,20);
   m_mail.setFont(new Font("Times new roman",Font.PLAIN,18));
   p.add(m_mail);

   txtMail=new JTextField();
   txtMail.setFont(new Font("Times new roman",Font.PLAIN,18));
   txtMail.setBounds(590,80,200,30);
   p.add(txtMail);


   m_con=new JLabel("Contact");
   m_con.setBounds(460,130,100,25);
   m_con.setFont(new Font("Times new roman",Font.PLAIN,18));
   p.add(m_con);

   txtCon=new JTextField();
   txtCon.setFont(new Font("Times new roman",Font.PLAIN,18));
   txtCon.setBounds(590,130,200,30);
   p.add(txtCon);

   m_fname=new JLabel("Father`s Name");
   m_fname.setBounds(460,180,120,25);
   m_fname.setFont(new Font("Times new roman",Font.PLAIN,18));
   p.add(m_fname);

   txtFname=new JTextField();
   txtFname.setFont(new Font("Times new roman",Font.PLAIN,18));
   txtFname.setBounds(590,180,200,30);
   p.add(txtFname);

   m_addrx=new JLabel("Address");
   m_addrx.setBounds(460,230,100,20);
   m_addrx.setFont(new Font("Times new roman",Font.PLAIN,18));
   p.add(m_addrx);

   mAddrx=new JTextField();
   mAddrx.setFont(new Font("Times new roman",Font.PLAIN,18));
   mAddrx.setBounds(590,230,200,30);
   p.add(mAddrx);

     f.setJMenuBar(mb);
     f.add(p);
     f.setVisible(true);


     /////////////////////////////////////////////////////////////////////////

    }
      public void actionPerformed(ActionEvent e3)
    {
        String mid,mid1,midi,m_name1,gender3,email2,f_name4,con5,addrx6;
         String strDate=spi1.getText()+spi2.getText()+spi.getText();
      int midI;

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
            catch(Exception e5)
            {
              JOptionPane.showMessageDialog(f,e5);
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
            catch(Exception e5)
            {
              JOptionPane.showMessageDialog(f,e5);
            }
        }
         else if(e3.getSource().equals(c_password))
        {
            try
            {
             chngPss cp=new chngPss();
             cp.ChngPx();
          //  f.setVisible(false);
            }
            catch(Exception e5)
            {
              JOptionPane.showMessageDialog(f,e5);
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
            catch(Exception e5)
            {
              JOptionPane.showMessageDialog(f,e5);
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
           catch(Exception e5)
            {
              JOptionPane.showMessageDialog(f,e5);
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
            catch(Exception e5)
            {
              JOptionPane.showMessageDialog(f,e5);
            }
        }
         else if(e3.getSource().equals(close))
        {
            try
            {
             f.setVisible(false);
            }
            catch(Exception e5)
            {
              JOptionPane.showMessageDialog(f,e5);
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
            catch(Exception e5)
            {
              JOptionPane.showMessageDialog(f,e5);
            }
        }

 ////////////////////////////////////////////////////////////////////////////
        else if(e3.getSource() == btnAdd)
        {
            try
        {
         /// JOptionPane.showMessageDialog(f,"save");
         
          mid1= cmbMemberID.getSelectedItem().toString();//return;
  //JOptionPane.showMessageDialog(f,mid1);
midI=cmbMemberID.getSelectedIndex();//JOptionPane.showMessageDialog(f,midI);

midi=Integer.toString(midI);//JOptionPane.showMessageDialog(f,midi);return;

      if(midi.equals("-1") && mid1.equals(""))
      {
          hidden.setText("! Click NEW button for new Member ID");
          cmbMemberID.requestFocus();
          return;
      }

      else if(txtMName.getText().isEmpty())
      {
          hidden.setText("! Enter Member Name");
          txtMName.requestFocus();
          return;
      }

 else if(txtMail.getText().isEmpty())
      {
          hidden.setText("! Enter E-mail");
          txtMail.requestFocus();
          return;
      }

       else if(txtCon.getText().isEmpty())
      {
          hidden.setText("! Enter contact number");
          txtCon.requestFocus();
          return;
      }

       else if(txtCon.getText().length() != 10)
      {
          hidden.setText("! Contact number must be for Ten Digits");
          txtCon.requestFocus();
          return;
      }

       else if(txtFname.getText().isEmpty())
      {
          hidden.setText("! Enter Father`name");
          txtFname.requestFocus();
          return;
      }
       else if(mAddrx.getText().isEmpty())
      {
          hidden.setText("! Enter Address");
          mAddrx.requestFocus();
          return;
      }

else if(spi1.getText().isEmpty())
      {
          hidden.setText("! Select Valid Date");
          sd.requestFocus();
          return;
      }
else if(spi2.getText().isEmpty())
      {
          hidden.setText("! Select Valid Month");
          sm.requestFocus();
          return;
      }
else if(spi.getText().isEmpty())
      {
          hidden.setText("! Select Valid Year");
          sy.requestFocus();
          return;
      }
 else if(gender1.isSelected()==false && gender2.isSelected()==false)
      {
          hidden.setText("! Select gender");
          return;
      }
 else
      {
        //validation alphanumeric check 
                String strMID,strMail,strCon,strSpind,stralpha;
                char ctralpha;
               /// char stralpha;
                int ctr;

                  /*  strMID = cmbMemberID.getSelectedItem().toString();
                    for (ctr = 0; ctr < strMID.length();ctr++)
                {
                    stralpha = strMID.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(!Character.isLetterOrDigit(ctralpha) )
                    {
                        hidden.setText("! Member ID contains only digit and letter. SPACE is not allow");
                        cmbMemberID.setSelectedItem(null);
                        cmbMemberID.requestFocus();
                        return;
                    }//strMID
                }//strMID*/
      

             strMail = txtMail.getText();
                for (ctr = 0; ctr < strMail.length();ctr++)
                {
                    stralpha = strMail.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(!Character.isLetterOrDigit(ctralpha) && ctralpha != '@' && ctralpha != '.' )
                    {
                        hidden.setText("! Email_ID only contain letter ,digits, '@' sign & dot.");
                        txtMail.setText("");
                        txtMail.requestFocus();
                        return;
                    }//strMail
                }//strMail

                 strCon = txtCon.getText();
                for (ctr = 0; ctr < strCon.length(); ctr++)
                {

                  stralpha = strCon.substring(ctr,ctr+1);
                  ctralpha=stralpha.charAt(0);
             if (!Character.isDigit(ctralpha) && ctralpha != '-' )
               {
                      hidden.setText( "! Phone Number can contains Digits [0-9] and Hyphen only");
                      txtCon.setText("");
                      txtCon.requestFocus();
                      return;
               }//strCon
                }//strCon
         hidden.setText("");
         mid=cmbMemberID.getSelectedItem().toString();
         m_name1=txtMName.getText();
         email2=txtMail.getText();
         con5=txtCon.getText();
         addrx6=mAddrx.getText();
         f_name4=txtFname.getText();

 if(gender1.isSelected()==true)
	{
		gender3 = "male";
	}
 else
        
	{
                gender3 = "female";
	}

       /* JOptionPane.showMessageDialog(f,mid+"mid");
           JOptionPane.showMessageDialog(f,m_name1+"sname");
           JOptionPane.showMessageDialog(f,email2+"mail");
           JOptionPane.showMessageDialog(f,con5+"con");
           JOptionPane.showMessageDialog(f,addrx6+"addrx");
           JOptionPane.showMessageDialog(f,f_name4+"fname");
           JOptionPane.showMessageDialog(f,gender3+"gender");
           JOptionPane.showMessageDialog(f,strDate+"date");*/
        stmt.execute("insert into newmember values('"+mid+"','"+m_name1+"','"+gender3+"','"+strDate+"','"+email2+"','"+con5+"','"+f_name4+"','"+addrx6+"')");
        JOptionPane.showMessageDialog(f, "Successfully Register."+mid);
        }
            }
        catch(Exception e1)
        {
           JOptionPane.showMessageDialog(f,e1);
        }

          try
           {
              cmbMemberID.removeAllItems();
            ResultSet rs = stmt.executeQuery( "select MEMBER_ID from newmember");
                 while(rs.next())
                      // if(rs.next())
                     {
                         cmbMemberID.addItem(rs.getString("MEMBER_ID"));

                     }

           }

              //  MessageBox.Show("Book record has been SAVED", "Message");
             catch(Exception e2)
        {
           JOptionPane.showMessageDialog(f,e2);
        }
              cmbMemberID.setSelectedIndex(0);
              //String bidM="";
              cmbMemberID.requestFocus();
              //cmbMemberID.setSelectedItem(bidM);

               txtMName.setText("");
        txtMail.setText("");
        txtCon.setText("");
        txtFname.setText("");
        mAddrx.setText("");
        bg.clearSelection();
        spi.setText("");
        spi1.setText("");
        spi2.setText("");
        strDate="";
       
        
       }
////////////////////////////////////////////////////////////////////////////
       else if(e3.getSource()==btnSearch)
        {
//JOptionPane.showMessageDialog(f,"Search");
     try
        {
                 mid = cmbMemberID.getSelectedItem().toString();

                 mid1= cmbMemberID.getSelectedItem().toString();//return;
 // JOptionPane.showMessageDialog(f,mid1);
midI=cmbMemberID.getSelectedIndex();//JOptionPane.showMessageDialog(f,midI);

midi=Integer.toString(midI);//JOptionPane.showMessageDialog(f,midi);return;

      if(midi.equals("-1") && mid1.equals(""))
      {
          hidden.setText("! Click NEW button for new Member ID");
          cmbMemberID.requestFocus();
          return;
      }


 else
      {
    hidden.setText("");
 
            String strGender,strDSql;
              ResultSet rss=stmt.executeQuery("select * from newmember where MEMBER_ID='"+mid+"'");
              if(rss.next())
                
              {
           // cmbMemberID.setSelectedItem(rs.getString("MEMBER_ID"));
              txtMName.setText(rss.getString("NAME"));
              strGender=(rss.getString("GENDER"));
              if (  strGender.equals("male"))
                        {
                           gender1.setSelected(true);
                        }
              if (  strGender.equals("female"))
                        {
                           gender2.setSelected(true);
                        }
              strDSql=(rss.getString("DATE_OF_BIRTH"));
              int j=0,ctr,ctralpha,str=0,dj=0,mj=0;
              String stralpha,stdat="",stmnth="";
              String[] stryar=new String[4];
               String[] strdat=new String[2];
                String[] strmnth=new String[2];

                for (ctr = 0; ctr < strDSql.length();ctr++)
                {
                    stralpha = strDSql.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(ctralpha == '/' )
                    {
                      str=str+1;
                    }//slash
                    else
                    {
                      if(str==0)
                       {
                        for(int d=1;d<=1;d++)
                              {
                               strdat[dj]=stralpha;
                              // JOptionPane.showMessageDialog(f,strdat[dj]);
                               dj=dj+1;
                              }
                       }//date
                        if(str==1)
                       {
                            for(int m=1;m<=1;m++)
                              {
                               strmnth[mj]=stralpha;
                              // JOptionPane.showMessageDialog(f,strmnth[mj]);
                               mj=mj+1;
                              }
                       }//month
                        if(str==2)
                        {
                           for(int i=1;i<=1;i++)
                              {
                               stryar[j]=stralpha;
                               j=j+1;
                              }
                          }//year
                    }
           }//strDSql
               if(      strdat[1] != null)
               {
                   stdat=strdat[0]+strdat[1];
               }
                if(      strdat[1] == null)
               {
                   stdat=strdat[0];
               }
              sd.setValue(Integer.parseInt(stdat));
               if(      strmnth[1] != null)
               {
                   stmnth=strmnth[0]+strmnth[1];
               }
                if(      strmnth[1] == null)
               {
                   stmnth=strmnth[0];
               }
              sm.setValue(Integer.parseInt(stmnth));
              String systr=stryar[0]+stryar[1]+stryar[2]+stryar[3];
              sy.setValue(Integer.parseInt(systr));
              txtMail.setText(rss.getString("EMAIL_ID"));
              txtCon.setText(rss.getString("CONTACT"));
              txtFname.setText(rss.getString("FATHER_NAME"));
              mAddrx.setText(rss.getString("M_ADDRESS"));
              }

 else
              {
                  JOptionPane.showMessageDialog(f,mid+" : Record did not FIND ");
                   cmbMemberID.setSelectedIndex(0);
                   txtMName.setText("");
        txtMail.setText("");
        txtCon.setText("");
        txtFname.setText("");
        mAddrx.setText("");
        bg.clearSelection();
        spi.setText("");
        spi1.setText("");
        spi2.setText("");
        strDate="";
              }
          }//else
            }//try
            catch(Exception e6)
            {
              JOptionPane.showMessageDialog(f,e6);
            }//catch

   } //search
/////////////////////////////////////////////////////////////////////////////
      else if(e3.getSource()==btnNew)
 {
       try
            {
             //JOptionPane.showMessageDialog(f,"new");
            ResultSet rs=stmt.executeQuery("select top 1 MEMBER_ID from newmember order by MEMBER_ID desc");

                if(rs.next())
                {

                    strMid=(rs.getString("MEMBER_ID"));
                    strMidPart = strMid.substring(2,7);
                    intMid = Integer.parseInt(strMidPart);
                    intMid++;

                    strMidPart = String.valueOf(intMid);
                       if ((intMid >= 1) && (intMid <= 9))
                    {
                        strMid = "MB0000" + strMidPart;
                    }//if of if
                    else if ((intMid >= 10) && (intMid <= 99))
                    {
                        strMid = "MB000" + strMidPart;
                    }//else if of if
                    else if ((intMid >= 100) && (intMid <= 999))
                    {
                        strMid = "MB00" + strMidPart;
                    }//else if of if
                    else if ((intMid >= 1000) && (intMid <= 9999))
                    {
                        strMid = "MB0" + strMidPart;
                    }//else if of if
                    else
                    {
                        strMid = "MB" + strMidPart;
                    }//else of if
                    cmbMemberID.setEditable(true);
             // cmbBookID.getEditor().setItem(strUid);
                    cmbMemberID.setSelectedItem(strMid);
                    cmbMemberID.setEditable(false);
                }
 else
                {
              strMid = "MB00001";
              cmbMemberID.setEditable(true);
              cmbMemberID.setSelectedItem(strMid);
              cmbMemberID.setEditable(false);
                }

        txtMName.setText("");
        txtMail.setText("");
        txtCon.setText("");
        txtFname.setText("");
        mAddrx.setText("");
        bg.clearSelection();
        spi.setText("");
        spi1.setText("");
        spi2.setText("");
        strDate="";
}

//try
            catch(Exception e6)
            {
              JOptionPane.showMessageDialog(f,e6);
            }//catch


 }//btnNew
        /////////////////////////////////////////////////////////////////////

       else if(e3.getSource()==btnUpdate)
        {
           try
           {
             mid1= cmbMemberID.getSelectedItem().toString();//return;
 // JOptionPane.showMessageDialog(f,mid1);
midI=cmbMemberID.getSelectedIndex();//JOptionPane.showMessageDialog(f,midI);

midi=Integer.toString(midI);//JOptionPane.showMessageDialog(f,midi);return;

      if(midi.equals("-1") && mid1.equals(""))
      {
          hidden.setText("! Click NEW button for new Member ID");
          cmbMemberID.requestFocus();
          return;
      }

      else if(txtMName.getText().isEmpty())
      {
          hidden.setText("! Enter Member Name");
          txtMName.requestFocus();
          return;
      }

 else if(txtMail.getText().isEmpty())
      {
          hidden.setText("! Enter E-mail");
          txtMail.requestFocus();
          return;
      }

       else if(txtCon.getText().isEmpty())
      {
          hidden.setText("! Enter contact number");
          txtCon.requestFocus();
          return;
      }

       else if(txtCon.getText().length() != 10)
      {
          hidden.setText("! Contact number must be for Ten Digits");
          txtCon.requestFocus();
          return;
      }

       else if(txtFname.getText().isEmpty())
      {
          hidden.setText("! Enter Father`name");
          txtFname.requestFocus();
          return;
      }
       else if(mAddrx.getText().isEmpty())
      {
          hidden.setText("! Enter Address");
          mAddrx.requestFocus();
          return;
      }

else if(spi1.getText().isEmpty())
      {
          hidden.setText("! Select Valid Date");
          sd.requestFocus();
          return;
      }
else if(spi2.getText().isEmpty())
      {
          hidden.setText("! Select Valid Month");
          sm.requestFocus();
          return;
      }
else if(spi.getText().isEmpty())
      {
          hidden.setText("! Select Valid Year");
          sy.requestFocus();
          return;
      }
 else if(gender1.isSelected()==false && gender2.isSelected()==false)
      {
          hidden.setText("! Select gender");
          return;
      }
 else
      {
        //validation alphanumeric check
                String strMID,strMail,strCon,strSpind,stralpha;
                char ctralpha;
               /// char stralpha;
                int ctr;

                  /*  strMID = cmbMemberID.getSelectedItem().toString();
                    for (ctr = 0; ctr < strMID.length();ctr++)
                {
                    stralpha = strMID.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(!Character.isLetterOrDigit(ctralpha) )
                    {
                        hidden.setText("! Member ID contains only digit and letter. SPACE is not allow");
                        cmbMemberID.setSelectedItem(null);
                        cmbMemberID.requestFocus();
                        return;
                    }//strMID
                }//strMID*/


             strMail = txtMail.getText();
                for (ctr = 0; ctr < strMail.length();ctr++)
                {
                    stralpha = strMail.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(!Character.isLetterOrDigit(ctralpha) && ctralpha != '@' && ctralpha != '.' )
                    {
                        hidden.setText("! Email_ID only contain letter ,digits, '@' sign & dot.");
                        txtMail.setText("");
                        txtMail.requestFocus();
                        return;
                    }//strMail
                }//strMail

                 strCon = txtCon.getText();
                for (ctr = 0; ctr < strCon.length(); ctr++)
                {

                  stralpha = strCon.substring(ctr,ctr+1);
                  ctralpha=stralpha.charAt(0);
             if (!Character.isDigit(ctralpha) && ctralpha != '-' )
               {
                      hidden.setText( "! Phone Number can contains Digits [0-9] and Hyphen only");
                      txtCon.setText("");
                      txtCon.requestFocus();
                      return;
               }//strCon
                }//strCon
         hidden.setText("");
         mid=cmbMemberID.getSelectedItem().toString();
         m_name1=txtMName.getText();
         email2=txtMail.getText();
         con5=txtCon.getText();
         addrx6=mAddrx.getText();
         f_name4=txtFname.getText();

 if(gender1.isSelected()==true)
	{
		gender3 = "male";
	}
 else

	{
                gender3 = "female";
	}




        stmt.executeUpdate("update newmember set NAME='"+m_name1+"',GENDER='"+gender3+"',DATE_OF_BIRTH='"+strDate+"',EMAIL_ID='"+email2+"',CONTACT='"+con5+"',FATHER_NAME='"+f_name4+"',M_ADDRESS='"+addrx6+"' where MEMBER_ID='"+mid+"'");

        JOptionPane.showMessageDialog(f, "Successfully Update."+mid);
        }}
        catch(Exception e9)
        {
           JOptionPane.showMessageDialog(f,e9);
        }//catch

     }//update



      }

 
///////////////////////////////////////////////////////////////////////////// */


    


    public static void main(String[] args) throws Exception
    {
        mmbrnew mm=new mmbrnew();
        mm.mmbrn();
     
    }

    public void stateChanged(ChangeEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
