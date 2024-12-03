
package lib;

import java.util.Calendar;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;//border
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;



public class bookixue extends JFrame implements ActionListener
{

     JFrame f;
     JPanel p,pt;
 JLabel tag,hidden,avail,brw_id,b_id,m_id,b_name,ixue_date,rtn_date,note;
 JTextField txtBorrow,txtBookName,ixuda,rtnda1;
 JComboBox cmbBookID,cmbMemberID;
 JMenu book,member,librarian,report,quit,about;
    JMenuItem b_entries,b_issue,b_return,mnew,mdelete,new_librarian,c_password,b_lxt,m_lxt,u_lxt,c_user,close,aboutus;
    JButton btnCancel,btnReset,btnNew,btnOK;
      Statement stmt;
    static JTable table;
    DefaultTableModel model;
      String strUid, strUidPart,MIDlist,BIDlist;
                int intUid;

   String[] columnNames={"MEMBER_ID", "BOOK_ID", "ISSUE", "B_RETURN", "B_STATUS"} ;


    bookixue()
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

    public void bokix()throws Exception
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
        Color b1 = new Color(252,227,205);
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

         Color b2 = new Color(255,255,213);

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
        Color mnb = new Color(207,165,160);
        mb.setBackground(mnb);
        ////////////////////////////////////////////////////////////////////

        tag=new JLabel(" BOOK INFORMATION");
          tag.setFont(new Font("Century Schoolbook",Font.BOLD,32));
  // tag.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder()));
      //  tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
          tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));

     tag.setBounds(250,40,400,50);
     f.add(tag);

     /////////////////////////////////////////////////////////////////////////

       hidden = new JLabel("");
       hidden.setFont(new Font("Arial",Font.PLAIN,14));
       hidden.setForeground(Color.red);
       hidden.setBounds(30,70,400,20);
       p.add(hidden);

        brw_id=new JLabel("Borrow No.");
        brw_id.setFont(new Font("Times new roman",Font.PLAIN,20));
        brw_id.setBounds(20,20,100,20);
        p.add(brw_id);

        txtBorrow=new JTextField();
        txtBorrow.setFont(new Font("Verdana",Font.BOLD,22));
        txtBorrow.setBounds(170,10,100,35);
        txtBorrow.setEditable(false);
        txtBorrow.setHorizontalAlignment(JTextField.CENTER);
        txtBorrow.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));
        p.add(txtBorrow);

        m_id=new JLabel("Member ID");
        m_id.setFont(new Font("Times new roman",Font.PLAIN,18));
        m_id.setBounds(20,120,100,20);
        p.add(m_id);


        try
        {
      ResultSet rs = stmt.executeQuery("select MEMBER_ID from newmember order by MEMBER_ID asc");

            Vector v = new Vector();

            while (rs.next()) {

                MIDlist = rs.getString(1);

                v.add(MIDlist);

            }

         cmbMemberID=new JComboBox(v);
        cmbMemberID.setFont(new Font("Times new roman",Font.PLAIN,18));
        cmbMemberID.setBounds(170,110,200,35);
        p.add(cmbMemberID);

            rs.close();
          
              cmbMemberID.requestFocus();
              cmbMemberID.setSelectedIndex(-1);
              cmbMemberID.addActionListener(this);
        }//try
catch(Exception tmc)
  {
    JOptionPane.showMessageDialog(f,tmc);
  }

        b_id=new JLabel("Book ID");
        b_id.setFont(new Font("Times new roman",Font.PLAIN,18));
        b_id.setBounds(20,170,100,20);
        p.add(b_id);

        try
        {
      ResultSet rs = stmt.executeQuery("select BOOK_ID from bookentries order by BOOK_ID asc");

            Vector vt = new Vector();

            while (rs.next()) {

                BIDlist = rs.getString(1);

                vt.add(BIDlist);

            }

         cmbBookID=new JComboBox(vt);
        cmbBookID.setFont(new Font("Times new roman",Font.PLAIN,18));
        cmbBookID.setBounds(170,160,200,35);
        p.add(cmbBookID);

            rs.close();

              cmbBookID.requestFocus();
              cmbBookID.setSelectedIndex(-1);
              cmbBookID.addActionListener(this);
        }//try
catch(Exception tbc)
  {
    JOptionPane.showMessageDialog(f,tbc);
  }

         avail = new JLabel("");
          avail.setFont(new Font("Arial",Font.PLAIN,16));
          Color h1=new Color(18,95,41);
          avail.setForeground(h1);
        avail.setBounds(220,200,200,20);
        p.add(avail);

        b_name=new JLabel("Book Name");
        b_name.setFont(new Font("Times new roman",Font.PLAIN,18));
        b_name.setBounds(430,50,100,20);
        p.add(b_name);

        txtBookName=new JTextField();
        txtBookName.setFont(new Font("Arial",Font.PLAIN,14));
        txtBookName.setBounds(580,40,200,35);
        txtBookName.setEditable(false);
        txtBookName.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));
        p.add(txtBookName);

        ixue_date=new JLabel("Issue Date");
        ixue_date.setFont(new Font("Times new roman",Font.PLAIN,18));
        ixue_date.setBounds(430,120,100,20);
        p.add(ixue_date);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date=new Date();
        ixuda=new JTextField(""+ formatter.format(date));
        ixuda.setFont(new Font("Times new roman",Font.PLAIN,18));
        ixuda.setEditable(false);
        ixuda.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        ixuda.setBounds(580,110,200,35);
        p.add(ixuda);
        String ixd8=ixuda.getText();

        rtn_date=new JLabel("Return Date");
        rtn_date.setFont(new Font("Times new roman",Font.PLAIN,18));
        rtn_date.setBounds(430,170,100,20);
        p.add(rtn_date);

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        Date date1=new Date();
        Calendar caldr = Calendar.getInstance();
        caldr.setTime(formatter1.parse(ixd8));
        caldr.add(Calendar.DAY_OF_MONTH,7);
        rtnda1=new JTextField(""+ formatter1.format(caldr.getTime()));
        rtnda1.setFont(new Font("Times new roman",Font.PLAIN,18));
        rtnda1.setEditable(false);
        rtnda1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        rtnda1.setBounds(580,160,200,35);
        p.add(rtnda1);

        note=new JLabel("Note:- Issued for a week.");
        note.setFont(new Font("Arial",Font.PLAIN,12));
        note.setBounds(580,200,200,20);
        p.add(note);

        btnNew=new JButton("NEW");
        btnNew.setBackground(Color.lightGray);
        btnNew.setFont(new Font("Arial",Font.PLAIN,18));
        btnNew.setBounds(670,260,120,40);
        btnNew.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnNew.addActionListener(this);
        p.add(btnNew);

        btnOK=new JButton("OK");
        btnOK.setBackground(Color.lightGray);
        btnOK.setFont(new Font("Arial",Font.PLAIN,18));
        btnOK.setBounds(670,350,120,40);
        btnOK.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnOK.addActionListener(this);
        p.add(btnOK);


        btnReset=new JButton("RESET");
        btnReset.setBackground(Color.lightGray);
        btnReset.setFont(new Font("Arial",Font.PLAIN,18));
        btnReset.setBounds(670,440,120,40);
        btnReset.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnReset.addActionListener(this);
        p.add(btnReset);

        //////////////////////////////////////

        pt=new JPanel();
        pt.setLayout(null);
        Color pt1=new Color(249,243,221);
        pt.setBackground(pt1);
        pt.setBounds(20,260,600,220);
        //pt1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));
                 /*  ps=new JPanel();
        ps.setLayout(null);
        Color ps1=new Color(216,216,177);
        ps.setBackground(ps1);
        ps.setBounds(90,380,560,35);
        f.add(ps);
*/
        JTextField sql2,sql3,sql4,sql5,sql6;
        

        sql2=new JTextField("       MEMBER_ID");
        sql2.setFont(new Font("Arial",Font.PLAIN,12));
        sql2.setBounds(20,20,110,35);
        Color ps1=new Color(216,216,177);
        sql2.setBackground(ps1);
        sql2.setEditable(false);
        pt.add(sql2);

        sql3=new JTextField("       BOOK_ID");
        sql3.setFont(new Font("Arial",Font.PLAIN,12));
        sql3.setBounds(130,20,110,35);
        sql3.setBackground(ps1);
        sql3.setEditable(false);
        pt.add(sql3);

        sql4=new JTextField("          ISSUE");
        sql4.setFont(new Font("Arial",Font.PLAIN,12));
        sql4.setBounds(240,20,110,35);
        sql4.setBackground(ps1);
        sql4.setEditable(false);
        pt.add(sql4);
        
        sql5=new JTextField("       B_RETURN");
        sql5.setFont(new Font("Arial",Font.PLAIN,12));
        sql5.setBounds(350,20,120,35);
        sql5.setBackground(ps1);
        sql5.setEditable(false);
        pt.add(sql5);

        sql6=new JTextField("       B_STATUS");
        sql6.setFont(new Font("Arial",Font.PLAIN,12));
        sql6.setBounds(470,20,110,35);
        sql6.setBackground(ps1);
        sql6.setEditable(false);
        pt.add(sql6);
        /////////////////////////////////////

        try
        {
            ResultSet rsy=stmt.executeQuery( "select * from bookentries");
                    if(rsy.next())
                   {
                      ResultSet rsz=stmt.executeQuery( "select * from newmember");
                    if(rsz.next())
                   {

                   }
                      else
                    {
                JOptionPane.showMessageDialog(f,"No Member record");
                
                    }
                   }
 else
                    {
                JOptionPane.showMessageDialog(f,"No Book record");
                
                    }

        }
        catch(Exception ee)
        {
            JOptionPane.showMessageDialog(f, ee);
        }
        p.add(pt);

        f.setJMenuBar(mb);
        f.add(p);
        f.setVisible(true);


    }
        public void actionPerformed(ActionEvent e1)
       {
            String bid,bidi,bid1,mid,midi,mid1,b_name1,brw,ixu,rtnn;
                int bidI,midI;

                /////////////////////////////////////////////////////////
                 //cmbBookID.setEditable(true);
          // cmbMemberID.setEditable(true);
          // bid1= cmbBookID.getSelectedItem().toString();
           bidI=cmbBookID.getSelectedIndex();
           bidi=Integer.toString(bidI);

         //  mid1= cmbMemberID.getSelectedItem().toString(); JOptionPane.showMessageDialog(f,mid1);
           midI=cmbMemberID.getSelectedIndex(); //JOptionPane.showMessageDialog(f,midI);
           midi=Integer.toString(midI); //JOptionPane.showMessageDialog(f,midi);

 if(e1.getSource().equals(b_entries))
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
        
        else if(e1.getSource().equals(b_return))
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
        else if(e1.getSource().equals(mnew))
        {
            try
            {
             mmbrnew mm=new mmbrnew();
             mm.mmbrn();
            f.setVisible(false);
            }
            catch(Exception e5)
            {
              JOptionPane.showMessageDialog(f,e5);
            }
        }
        else if(e1.getSource().equals(mdelete))
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
         else if(e1.getSource().equals(c_password))
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
         else if(e1.getSource().equals(b_lxt))
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
         else if(e1.getSource().equals(m_lxt))
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
         else if(e1.getSource().equals(c_user))
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
         else if(e1.getSource().equals(close))
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
        else if(e1.getSource().equals(aboutus))
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
/////////////////////////////////////////////////////////////////////////////
           else if(e1.getSource()==btnNew)
              {
                  try
                 {
            // JOptionPane.showMessageDialog(f,"new");
             ResultSet rs=stmt.executeQuery("select top 1 BORROW_NO from b_BRW order by BORROW_NO desc");

                if(rs.next())
                {

                    strUid=(rs.getString("BORROW_NO"));
                    intUid = Integer.parseInt(strUid);
                    intUid++;

                    strUid = String.valueOf(intUid);
                    txtBorrow.setEditable(true);
                    txtBorrow.setText(strUid);
                    txtBorrow.setEditable(false);
                }
        else
                {
              strUid = "1";
              txtBorrow.setEditable(true);
              txtBorrow.setText(strUid);
              txtBorrow.setEditable(false);
                }

        txtBookName.setText("");
        cmbMemberID.setSelectedItem("");
        cmbBookID.setSelectedItem("");
        //avail.setEditable(true);
              avail.setText("");//JOptionPane.showMessageDialog(f,"dcgdxg");
                table.setVisible(false);
        hidden.setText("");

        }//try
            catch(Exception e6)
            {
              JOptionPane.showMessageDialog(f,e6);
            }//catch
   }//new button

            /////////////////////////////////////////////////////////

            else if(e1.getSource()==btnReset)
            {
                try
                {
              txtBorrow.setEditable(true);
              txtBorrow.setText("");
              txtBorrow.setEditable(false);
              txtBookName.setEditable(true);
              txtBookName.setText("");
              txtBookName.setEditable(false);
              cmbMemberID.setSelectedIndex(-1);
              cmbBookID.setSelectedIndex(-1);
              hidden.setText("");
             table.setModel(new DefaultTableModel(null,columnNames) );
                }
                catch(Exception e9)
            {
              JOptionPane.showMessageDialog(f,e9);
            }//catch
            }


                ///////////////////////////////////////////////////////////


             if(e1.getSource()==btnOK)
        {
          try
                {
          // JOptionPane.showMessageDialog(f,"ok");
         /*  //cmbBookID.setEditable(true);
          // cmbMemberID.setEditable(true);
          // bid1= cmbBookID.getSelectedItem().toString();
           bidI=cmbBookID.getSelectedIndex();
           bidi=Integer.toString(bidI);

         //  mid1= cmbMemberID.getSelectedItem().toString(); JOptionPane.showMessageDialog(f,mid1);
           midI=cmbMemberID.getSelectedIndex(); //JOptionPane.showMessageDialog(f,midI);
           midi=Integer.toString(midI); //JOptionPane.showMessageDialog(f,midi);*/

      if(txtBorrow.getText().isEmpty())
      {
          hidden.setText("! Click NEW button for new Borrow no.");
          txtBorrow.requestFocus();
          return;
      }

      else if(midi.equals("-1"))// && mid1.equals(""))
      {
          hidden.setText("! Select MemberID");
          cmbMemberID.requestFocus();
          return;
      }

      else if(bidi.equals("-1"))// && bid1.equals(""))
      {
          hidden.setText("! Select BookID");
          cmbBookID.requestFocus();
          return;
      }

       else
                    {
  
            //chk availability

                    String chkavl;
                    chkavl = avail.getText();
                  //   JOptionPane.showMessageDialog(f,chkavl);
                if (chkavl.equals("unavailable"))
                    {
              JOptionPane.showMessageDialog(f," Sorry! Book is not available right now.");
              txtBookName.setEditable(true);
              txtBookName.setText("");
              txtBookName.setEditable(false);
              cmbMemberID.setSelectedIndex(-1);
              cmbBookID.setSelectedIndex(-1);
              hidden.setText("");
              return;
                    }

                    else
                    {

                        String strStatus = "ISSUED";
  
        
         hidden.setText("");
         brw=txtBorrow.getText();
         mid=cmbMemberID.getSelectedItem().toString();
         bid=cmbBookID.getSelectedItem().toString();
         ixu=ixuda.getText();
         rtnn=rtnda1.getText();
       //  strStatus//B_STATUS
        stmt.execute("insert into b_BRW values('"+brw+"','"+mid+"','"+bid+"','"+ixu+"','"+rtnn+"','"+strStatus+"')");
        JOptionPane.showMessageDialog(f, "Successfully Book has been Issued.");

   //change avalaible book into not available

       stmt.executeUpdate("update bookentries set AVAILABLE='unavailable' where BOOK_ID ='"+bid+"'");
                
       //JOptionPane.showMessageDialog(f,"Availability of Book record has been UPDATED");

        }//else of else
       }//chkavail else
      }//try
       catch(Exception eo)
        {
           JOptionPane.showMessageDialog(f,eo);
        }//catch
     }//ok button
      
///////////////////////////////////////////////////////////////////////////// */
             else if(e1.getSource()==cmbBookID)
             {
                 String stravl="";
             //    JOptionPane.showMessageDialog(f,"cmbBookID");
          try
              {

        if(bidi.equals("-1"))// && bid1.equals(""))
         {

          cmbBookID.requestFocus();
           avail.setText("");
         }
        
         else
         {
                     bid = cmbBookID.getSelectedItem().toString();

                    ResultSet rs=stmt.executeQuery( "select * from bookentries where BOOK_ID='"+bid+"'");
                    if(rs.next())
                   {
                     txtBookName.setText(rs.getString("BOOK_NAME"));
                   }

                    rs.close();

                     ResultSet rsa=stmt.executeQuery( "select AVAILABLE from bookentries where BOOK_ID='"+bid+"'");
                    if(rsa.next())
                   {
                     stravl=(rsa.getString("AVAILABLE"));
                   }
                     rsa.close();
                     
                     if (stravl.equals("available"))
                        {
                           Color h1=new Color(18,95,41);
                           avail.setForeground(h1);
                           avail.setText(stravl);

                        }
                        if (stravl.equals("unavailable"))
                        {
                            avail.setForeground(Color.red);
                             avail.setText(stravl);
                        }


              }
          }//try
            catch (Exception obj)
            {
               JOptionPane.showMessageDialog(f,obj);
            }//catch
         }//cmbbookid */

           ////////////////////////////////////////////////////////////////

             else if (e1.getSource()==cmbMemberID)
             {
                       try
                 {
                       if(midi.equals("-1"))// && bid1.equals(""))
                        {
                     //    JOptionPane.showMessageDialog(f,"if");
                         cmbMemberID.requestFocus();
                         table.setVisible(false);
                         return;
                        }

            else
                  {
                //  JOptionPane.showMessageDialog(f,"else");
                  model = new DefaultTableModel();
                  model.setColumnIdentifiers(columnNames);
                  table = new JTable();
                  table.setModel(model);
                  table.setFont(new Font("Verdana",Font.PLAIN,14));
                  table.setBounds(20,60,560,140);
                  table.setRowHeight(35);
                  table.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));
                  table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                  table.setFillsViewportHeight(true);
                  JScrollPane scroll = new JScrollPane(table);
                  scroll.setHorizontalScrollBarPolicy(
                  JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                  scroll.setVerticalScrollBarPolicy(
                  JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                  pt.add(scroll);
                  pt.add(table);
                    
                  String MEMBER_ID="",BOOK_ID="",ISSUE="",B_RETURN="",B_STATUS="";
                    mid = cmbMemberID.getSelectedItem().toString();
                  ResultSet tb = stmt.executeQuery("select * from b_BRW where B_STATUS = 'ISSUED' AND MEMBER_ID ='"+mid+"'");
                  int i = 0;
               while(tb.next())
               {
                    
                   //   if(tb.next())
                 // {
                    
                 table.setVisible(true);
                     //  BORROW_NO=(tb.getString("BORROW_NO"));
                        MEMBER_ID=(tb.getString("MEMBER_ID"));
                         BOOK_ID=(tb.getString("BOOK_ID"));
                          ISSUE=(tb.getString("ISSUE"));
                           B_RETURN=(tb.getString("B_RETURN"));
                            B_STATUS=(tb.getString("B_STATUS"));

                             model.addRow(new Object[]{MEMBER_ID,BOOK_ID,ISSUE,B_RETURN,B_STATUS});
                             i++;
                //  }//while
               }
                if(i<1)
               {
                     // table.setVisible(false);
                    table.setModel(new DefaultTableModel(null,columnNames) );
                     JOptionPane.showMessageDialog(null, "No Issued Book record found "+ mid, "Record Table", JOptionPane.ERROR_MESSAGE);
               }

                   //limitation on borrow book

                     ResultSet rc=stmt.executeQuery("select COUNT(BORROW_NO) from b_BRW WHERE B_STATUS='ISSUED' AND MEMBER_ID ='"+mid+"'");

                    while(rc.next())
                    {
                       if(rc.getInt(1)==3)
                       {
                           JOptionPane.showMessageDialog(f,"Number of Books ISSUED by " + mid + " is 3. Maximum book issued limit by a member is not more than 3.");
                            txtBorrow.setEditable(true);
              txtBorrow.setText("");
              txtBorrow.setEditable(false);
              txtBookName.setEditable(true);
              txtBookName.setText("");
              txtBookName.setEditable(false);
              cmbMemberID.setSelectedIndex(-1);
              cmbBookID.setSelectedIndex(-1);
              hidden.setText("");
               table.setModel(new DefaultTableModel(null,columnNames) );
                           return;
                       }

                       // rc.getInt(3);
                    }//while

                 }}//try
                 catch(Exception mi)
                 {
                     JOptionPane.showMessageDialog(f,mi);
                 }
            }//btnMemberID
 }
             

    public static void main(String[] args) throws Exception
    {
       bookixue bkix=new bookixue();
       bkix.bokix();
    }

  
}

    