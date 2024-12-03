
package lib;

import java.io.File;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.awt.image.*;
import javax.swing.border.*;//border
import java.sql.*;
import java.util.*;



public class bookentries extends JFrame implements ActionListener
{
 JFrame f;
 JPanel p;
 JLabel tag,hidden,b_id,b_name,author,edition,sub,pages,price,availability;
 JTextField txtBookName,txtAuthor,txtEdition,txtPrice,txtPages;
 JComboBox cmbBookID,cmbSub;
    JRadioButton avail1,avail2;
    ButtonGroup avail;
    JMenu book,member,librarian,report,quit,about;
    JMenuItem b_entries,b_issue,b_return,mnew,mdelete,new_librarian,c_password,b_lxt,m_lxt,u_lxt,c_user,close,aboutus;
    JButton btnSearch,btnUpdate,btnNew,btnSave;
      Statement stmt;

      String strUid, strUidPart,BookIDlist;
                int intUid;


    bookentries()
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
    
    public void boken()throws Exception
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
  // tag.setBorder(BorderFactory.createCompoundBorder(BorderFacr()));tory.createRaisedBevelBorder(),BorderFactory.createLoweredBevelBorder()));
      //  tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
          tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));

     tag.setBounds(250,40,400,50);
     f.add(tag);

       BufferedImage ad =ImageIO.read(new File("C:\\Users\\welcome\\Downloads\\Documents\\NetBeansProjects\\lib\\images\\jababkn.png"));
         JLabel bken=new JLabel(new ImageIcon(ad));
        bken.setBounds(440,100,350,340);
         p.add(bken);

     ////////////////////////////////////////////////////////////////////////

         hidden = new JLabel("");
          hidden.setFont(new Font("Times new roman",Font.PLAIN,16));
          hidden.setForeground(Color.red);
        hidden.setBounds(50,20,400,20);
        p.add(hidden);

        b_id=new JLabel("Book ID");
        b_id.setFont(new Font("Times new roman",Font.PLAIN,20));
        b_id.setBounds(50,100,200,20);
        p.add(b_id);
        
        b_name=new JLabel("Book Name");
        b_name.setFont(new Font("Times new roman",Font.PLAIN,20));
        b_name.setBounds(50,150,120,20);
        p.add(b_name);

        txtBookName=new JTextField();
        txtBookName.setFont(new Font("Times new roman",Font.PLAIN,14));
        txtBookName.setBounds(200,150,200,30);
        p.add(txtBookName);

        author=new JLabel("Author");
        author.setFont(new Font("Times new roman",Font.PLAIN,20));
        author.setBounds(50,200,120,20);
        p.add(author);

         txtAuthor=new JTextField();
        txtAuthor.setFont(new Font("Times new roman",Font.PLAIN,14));
        txtAuthor.setBounds(200,200,200,30);
        p.add(txtAuthor);

        edition=new JLabel("Edition");
        edition.setFont(new Font("Times new roman",Font.PLAIN,20));
        edition.setBounds(50,250,120,20);
        p.add(edition);

        txtEdition=new JTextField();
        txtEdition.setFont(new Font("Times new roman",Font.PLAIN,18));
        txtEdition.setBounds(200,250,200,30);
        p.add(txtEdition);

         sub=new JLabel("Subject");
        sub.setFont(new Font("Times new roman",Font.PLAIN,20));
        sub.setBounds(50,300,120,20);
        p.add(sub);

        cmbSub=new JComboBox();
         cmbSub.addItem("History");
            cmbSub.addItem("Geography");
            cmbSub.addItem("Politics");
           cmbSub.addItem("Economics");
         cmbSub.addItem("Hindi");
           cmbSub.addItem("English");
            cmbSub.addItem("Mathematics");
           cmbSub.addItem("Biology");
           cmbSub.addItem("Chemistry");
            cmbSub.addItem("Physics");
           cmbSub.addItem("Philosophy");
            cmbSub.addItem("Computer Science");
            cmbSub.addItem("Education");
           cmbSub.addItem("Accounting & Finance");
          cmbSub.addItem("Business & Management Studies");
         cmbSub.addItem("Psychology");
          cmbSub.addItem("Sociology");

         cmbSub.setFont(new Font("Times new roman",Font.PLAIN,18));
        cmbSub.setBounds(200,300,200,30);
        p.add(cmbSub);

         pages=new JLabel("No. of Pages");
        pages.setFont(new Font("Times new roman",Font.PLAIN,20));
        pages.setBounds(50,350,120,20);
        p.add(pages);

        txtPages=new JTextField();
        txtPages.setFont(new Font("Times new roman",Font.PLAIN,18));
        txtPages.setBounds(200,350,200,30);
        p.add(txtPages);

          price=new JLabel("Price");
        price.setFont(new Font("Times new roman",Font.PLAIN,20));
        price.setBounds(50,400,120,20);
        p.add(price);

        txtPrice=new JTextField();
        txtPrice.setFont(new Font("Times new roman",Font.PLAIN,18));
        txtPrice.setBounds(200,400,200,30);
        p.add(txtPrice);

        availability=new JLabel("Availability :");
        availability.setFont(new Font("Times new roman",Font.PLAIN,18));
        availability.setBounds(300,50,90,20);
        p.add(availability);

        avail1=new JRadioButton();
        avail1.setText("Yes");
        avail1.setFont(new Font("Times new roman",Font.PLAIN,16));
        avail1.setBackground(p1);
        avail1.setBounds(400,50,50,25);
        p.add(avail1);

        avail2=new JRadioButton();
        avail2.setText("No");
        avail2.setFont(new Font("Times new roman",Font.PLAIN,16));
        avail2.setBackground(p1);
        avail2.setBounds(450,50,50,25);
        p.add(avail2);

        avail = new ButtonGroup();
	avail.add(avail1);
	avail.add(avail2);

        btnSave=new JButton("SAVE");
        btnSave.setBackground(Color.lightGray);
        btnSave.setFont(new Font("Times new roman",Font.PLAIN,16));
        btnSave.setBounds(20,460,80,30);
        btnSave.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnSave.addActionListener(this);
        p.add(btnSave);

        btnUpdate=new JButton("UPDATE");
        btnUpdate.setBackground(Color.lightGray);
        btnUpdate.setFont(new Font("Times new roman",Font.PLAIN,16));
        btnUpdate.setBounds(130,460,100,30);
        btnUpdate.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnUpdate.addActionListener(this);
        p.add(btnUpdate);

         btnSearch=new JButton("SEARCH");
        btnSearch.setBackground(Color.lightGray);
        btnSearch.setFont(new Font("Times new roman",Font.PLAIN,16));
        btnSearch.setBounds(260,460,100,30);
        btnSearch.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnSearch.addActionListener(this);
        p.add(btnSearch);

         btnNew=new JButton("NEW");
        btnNew.setBackground(Color.lightGray);
        btnNew.setFont(new Font("Times new roman",Font.PLAIN,16));
        btnNew.setBounds(390,460,70,30);
        btnNew.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        btnNew.addActionListener(this);
        p.add(btnNew);

     try
        {
      ResultSet rs = stmt.executeQuery("select BOOK_ID from bookentries order by BOOK_ID asc");

            Vector v = new Vector();

            while (rs.next()) {

                BookIDlist = rs.getString(1);

                v.add(BookIDlist);

            }

          cmbBookID=new JComboBox(v);
       // cmbBookID.setEditable(true);
        cmbBookID.setFont(new Font("Times new roman",Font.PLAIN,18));
        cmbBookID.setBounds(200,100,200,30);
        p.add(cmbBookID);

            rs.close();
            //cmbBookID.setSelectedIndex(-1);
          // String bidB="";
              cmbBookID.requestFocus();
           
          //  cmbBookID.setSelectedItem(bidB);


}//try
catch(Exception tc)
  {
    JOptionPane.showMessageDialog(f,tc);
  }
f.add(p);
        f.setJMenuBar(mb);

        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {

        ///////////////////////////////////////////////////
        String bid,bid1,bidi,b_name1,author2,edition3,b_sub4,b_pages5,b_price6,avail7;
         
      int bidI;
 if(e.getSource().equals(b_issue))
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
        else if(e.getSource().equals(b_return))
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
        else if(e.getSource().equals(mnew))
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
        else if(e.getSource().equals(mdelete))
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
         else if(e.getSource().equals(c_password))
        {
            try
            {
             chngPss cp=new chngPss();
             cp.ChngPx();
          //  f.setVisible(false);
            }
            catch(Exception e1)
            {
              JOptionPane.showMessageDialog(f,e1);
            }
        }
         else if(e.getSource().equals(b_lxt))
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
         else if(e.getSource().equals(m_lxt))
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
         else if(e.getSource().equals(c_user))
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
         else if(e.getSource().equals(close))
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
        else if(e.getSource().equals(aboutus))
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

  ////////////////////////////////////////////////////////////////////////////
        else if(e.getSource() == btnSave)
        {
    try
        {
       //   JOptionPane.showMessageDialog(f,"save");
           bid1= cmbBookID.getSelectedItem().toString();
//   JOptionPane.showMessageDialog(f,bid1);
bidI=cmbBookID.getSelectedIndex();
bidi=Integer.toString(bidI);

      if(bidi.equals("-1") && bid1.equals(""))
      {
          hidden.setText("! Click NEW button for new BookID");
          cmbBookID.requestFocus();
          return;
      }

      else if(txtBookName.getText().isEmpty())
      {
          hidden.setText("! Enter BookName");
          txtBookName.requestFocus();
          return;
      }

 else if(txtAuthor.getText().isEmpty())
      {
          hidden.setText("! Enter Author Name");
          txtAuthor.requestFocus();
          return;
      }

       else if(txtEdition.getText().isEmpty())
      {
          hidden.setText("! Enter Edition");
          txtEdition.requestFocus();
          return;
      }
       else if(txtPages.getText().isEmpty())
      {
          hidden.setText("! Enter No. of Pages");
          txtPages.requestFocus();
          return;
      }
       else if(txtPrice.getText().isEmpty())
      {
          hidden.setText("! Enter the Price of Book");
          txtPrice.requestFocus();
          return;
      }
 else if(avail1.isSelected()==false && avail2.isSelected()==false)
      {
          hidden.setText("! Is Book Available");
          return;
      }
 else
      {
          //validation alphanumeric check
                String strBookID,strAuthor, strEditon, strPrice, strPages,stralpha;
                char ctralpha;
               /// char stralpha;
                int ctr;
/*
                    strBookID = cmbBookID.getSelectedItem().toString();
                    for (ctr = 0; ctr < strBookID.length();ctr++)
                {
                    stralpha = strBookID.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(!Character.isLetterOrDigit(ctralpha) )
                    {
                        hidden.setText("! Book ID contains only digit and letter. SPACE is not allow");
                        cmbBookID.setSelectedItem(null);
                        cmbBookID.requestFocus();
                        return;
                    }//strBookID
                }//strBookID*/


              strAuthor = txtAuthor.getText();
                for (ctr = 0; ctr < strAuthor.length();ctr++)
                { 
                    stralpha = strAuthor.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(!Character.isLetter(ctralpha) && ctralpha != ' ' && ctralpha != '.' )
                    {
                        hidden.setText("! Author Name only contain letter,dot and space.");
                        txtAuthor.setText("");
                        txtAuthor.requestFocus();
                        return;
                    }//strAuthor
                }//strAuthor

              strEditon = txtEdition.getText();
                for (ctr = 0; ctr < strEditon.length(); ctr++)
                {

                  stralpha = strEditon.substring(ctr,ctr+1);
                  ctralpha=stralpha.charAt(0);
             if (!Character.isLetter(ctralpha))
               {                    
                      hidden.setText( "! Book Edition only contain letter.Example:-  First,Second,Fifth,etc...");
                      txtEdition.setText("");
                      txtEdition.requestFocus();
                      return;
               }//strEditon
                }//strAuthor

              strPages = txtPages.getText();
                for (ctr = 0; ctr < strPages.length(); ctr++)
                {
                    stralpha = strPages.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if (!Character.isDigit(ctralpha))
               {                    
                      hidden.setText ("! No. of Pages only contain Digits.");
                      txtPages.setText("");
                        txtPages.requestFocus();
                        return;
                    }//strPages
                }//strPages


              strPrice = txtPrice.getText();
                for (ctr = 0; ctr < strPrice.length(); ctr++)
                {
                    stralpha = strPrice.substring(ctr,ctr+1);
                     ctralpha=stralpha.charAt(0);
                          if (!Character.isDigit(ctralpha)  && ctralpha != '.' )
               {
                      txtPrice.setText ("");
                      hidden.setText( "! Prices only contain Digits & dot.");
                        txtPrice.requestFocus();
                        return;
                    }//strPrice
                }//strPrice


              //validation on limit
                float dbPrices;
                int iPages;

                dbPrices = Float.parseFloat(txtPrice.getText());
                //JOptionPane.showMessageDialog(f,dbPrices);
              
                iPages = Integer.parseInt(txtPages.getText());
                //  JOptionPane.showMessageDialog(f,iPages);return;
                if (iPages <= 0)
                {
                     hidden.setText ( "! No. of Pages cannot be less than ZERO.");
                    txtPages.requestFocus();
                    return;
                }//ipages

                else if (dbPrices <= 0)
                {
                   hidden.setText("! Prices cannot be less than ZERO.");
                    txtPrice.requestFocus();
                    return;
                }//dbPrices

                else
                {
                hidden.setText("");
         bid=cmbBookID.getSelectedItem().toString();
         b_name1=txtBookName.getText();
         author2=txtAuthor.getText();
         edition3=txtEdition.getText();
         b_sub4=cmbSub.getSelectedItem().toString();
         b_pages5=txtPages.getText();
         b_price6=txtPrice.getText();
   
        if(avail1.isSelected()==true)
	{
		avail7 = "available";
	}
 else
         //   (avail2.isSelected() == true)
	{
                avail7 = "unavailable";
	}
 
         
        stmt.execute("insert into bookentries values('"+bid+"','"+b_name1+"','"+author2+"','"+edition3+"','"+b_sub4+"','"+b_pages5+"','"+b_price6+"','"+avail7+"')");
        JOptionPane.showMessageDialog(f, "Successfully Register."+bid);
        }
      }
            }
        catch(Exception e1)
        {
           JOptionPane.showMessageDialog(f,e1);
        }
        
          try
           {
              cmbBookID.removeAllItems();
            ResultSet rs = stmt.executeQuery( "select BOOK_ID from bookentries");
                 while(rs.next())
                      // if(rs.next())
                     {                         
                         cmbBookID.addItem(rs.getString("BOOK_ID"));

                     }
           
           }

              //  MessageBox.Show("Book record has been SAVED", "Message");
             catch(Exception e2)
        {
           JOptionPane.showMessageDialog(f,e2);
        }
        cmbBookID.setSelectedIndex(0);
        txtBookName.setText("");
        txtAuthor.setText("");
        txtEdition.setText("");
        cmbSub.setSelectedIndex(0);
        txtPages.setText("");
        txtPrice.setText("");
        avail.clearSelection();


       }
  
/////////////////////////////////////////////////////////////////////////////
 else if(e.getSource()==btnNew)
 {
       try
            {
          //   JOptionPane.showMessageDialog(f,"new");
            ResultSet rs=stmt.executeQuery("select top 1 BOOK_ID from bookentries order by BOOK_ID desc");
            
                if(rs.next())
                {
                  
                    strUid=(rs.getString("BOOK_ID"));
                    strUidPart = strUid.substring(2,7);
                    intUid = Integer.parseInt(strUidPart);
                    intUid++;
 
                    strUidPart = String.valueOf(intUid);
                       if ((intUid >= 1) && (intUid <= 9))
                    {
                        strUid = "BK0000" + strUidPart;
                    }//if of if
                    else if ((intUid >= 10) && (intUid <= 99))
                    {
                        strUid = "BK000" + strUidPart;
                    }//else if of if
                    else if ((intUid >= 100) && (intUid <= 999))
                    {
                        strUid = "BK00" + strUidPart;
                    }//else if of if
                    else if ((intUid >= 1000) && (intUid <= 9999))
                    {
                        strUid = "BK0" + strUidPart;
                    }//else if of if
                    else
                    {
                        strUid = "BK" + strUidPart;
                    }//else of if
                   
             // cmbBookID.getEditor().setItem(strUid);
                    cmbBookID.setEditable(true);
                    cmbBookID.setSelectedItem(strUid);
                    cmbBookID.setEditable(false);
                }
 else
                {
              strUid = "BK00001";
              cmbBookID.setEditable(true);
              cmbBookID.setSelectedItem(strUid);
              cmbBookID.setEditable(false);
                }

        txtBookName.setText("");
        txtAuthor.setText("");
        txtEdition.setText("");
        cmbSub.setSelectedIndex(0);
        txtPages.setText("");
        txtPrice.setText("");
        avail.clearSelection();

}

//try
            catch(Exception e6)
            {
              JOptionPane.showMessageDialog(f,e6);
            }//catch


 }
        /////////////////////////////////////////////////////////////////////
        else if(e.getSource()==btnUpdate)
        {//JOptionPane.showMessageDialog(f,"update");
         try
         {
              bid1= cmbBookID.getSelectedItem().toString();
   //JOptionPane.showMessageDialog(f,bid1);
bidI=cmbBookID.getSelectedIndex();
bidi=Integer.toString(bidI);

       if(bidi.equals("-1") && bid1.equals(""))
      {
          hidden.setText("! Click NEW button for new BookID");
          cmbBookID.requestFocus();
          return;
      }

      else if(txtBookName.getText().isEmpty())
      {
          hidden.setText("! Enter BookName");
          txtBookName.requestFocus();
          return;
      }

 else if(txtAuthor.getText().isEmpty())
      {
          hidden.setText("! Enter Author Name");
          txtAuthor.requestFocus();
          return;
      }

       else if(txtEdition.getText().isEmpty())
      {
          hidden.setText("! Enter Edition");
          txtEdition.requestFocus();
          return;
      }
       else if(txtPages.getText().isEmpty())
      {
          hidden.setText("! Enter No. of Pages");
          txtPages.requestFocus();
          return;
      }
       else if(txtPrice.getText().isEmpty())
      {
          hidden.setText("! Enter the Price of Book");
          txtPrice.requestFocus();
          return;
      }
 else if(avail1.isSelected()==false && avail2.isSelected()==false)
      {
          hidden.setText("! Is Book Available");
          return;
      }
 else
      {
          //validation alphanumeric check
                String strBookID,strAuthor, strEditon, strPrice, strPages,stralpha;
                char ctralpha;
               /// char stralpha;
                int ctr;

                  /*  strBookID = cmbBookID.getSelectedItem().toString();
                    for (ctr = 0; ctr < strBookID.length();ctr++)
                {
                    stralpha = strBookID.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(!Character.isLetterOrDigit(ctralpha) )
                    {
                        hidden.setText("! Book ID contains only digit and letter. SPACE is not allow");
                        cmbBookID.setSelectedItem(null);
                        cmbBookID.requestFocus();
                        return;
                    }//strBookID
                }//strBookID
*/

              strAuthor = txtAuthor.getText();
                for (ctr = 0; ctr < strAuthor.length();ctr++)
                {
                    stralpha = strAuthor.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if(!Character.isLetter(ctralpha) && ctralpha != ' ' && ctralpha != '.' )
                    {
                        hidden.setText("! Author Name only contain letter,dot and space.");
                        txtAuthor.setText("");
                        txtAuthor.requestFocus();
                        return;
                    }//strAuthor
                }//strAuthor

              strEditon = txtEdition.getText();
                for (ctr = 0; ctr < strEditon.length(); ctr++)
                {

                  stralpha = strEditon.substring(ctr,ctr+1);
                  ctralpha=stralpha.charAt(0);
             if (!Character.isLetter(ctralpha))
               {
                      hidden.setText( "! Book Edition only contain letter.Example:-  First,Second,Fifth,etc...");
                      txtEdition.setText("");
                      txtEdition.requestFocus();
                      return;
               }//strEditon
                }//strAuthor

              strPages = txtPages.getText();
                for (ctr = 0; ctr < strPages.length(); ctr++)
                {
                    stralpha = strPages.substring(ctr,ctr+1);
                    ctralpha=stralpha.charAt(0);
                    if (!Character.isDigit(ctralpha))
               {
                      hidden.setText ("! No. of Pages only contain Digits.");
                      txtPages.setText("");
                        txtPages.requestFocus();
                        return;
                    }//strPages
                }//strPages


              strPrice = txtPrice.getText();
                for (ctr = 0; ctr < strPrice.length(); ctr++)
                {
                    stralpha = strPrice.substring(ctr,ctr+1);
                     ctralpha=stralpha.charAt(0);
                          if (!Character.isDigit(ctralpha)  && ctralpha != '.' )
               {
                      txtPrice.setText ("");
                      hidden.setText( "! Prices only contain Digits & dot.");
                        txtPrice.requestFocus();
                        return;
                    }//strPrice
                }//strPrice


              //validation on limit
                float dbPrices;
                int iPages;

                dbPrices = Float.parseFloat(txtPrice.getText());
                //JOptionPane.showMessageDialog(f,dbPrices);

                iPages = Integer.parseInt(txtPages.getText());
                //  JOptionPane.showMessageDialog(f,iPages);return;
                if (iPages <= 0)
                {
                     hidden.setText ( "! No. of Pages cannot be less than ZERO.");
                    txtPages.requestFocus();
                    return;
                }//ipages

                else if (dbPrices <= 0)
                {
                   hidden.setText("! Prices cannot be less than ZERO.");
                    txtPrice.requestFocus();
                    return;
                }//dbPrices

                else
                {
                 hidden.setText("");
         bid=cmbBookID.getSelectedItem().toString();
         b_name1=txtBookName.getText();
         author2=txtAuthor.getText();
         edition3=txtEdition.getText();
         b_sub4=cmbSub.getSelectedItem().toString();
         b_pages5=txtPages.getText();
         b_price6=txtPrice.getText();

        if(avail1.isSelected()==true)
	{
		avail7 = "available";
	}
 else
         //   (avail2.isSelected() == true)
	{
                avail7 = "unavailable";
	}

      
      
        stmt.executeUpdate("update bookentries set BOOK_NAME='"+b_name1+"',AUTHOR='"+author2+"',EDITION='"+edition3+"',BOOK_SUBJECT='"+b_sub4+"',PAGES='"+b_pages5+"',PRICE='"+b_price6+"',AVAILABLE='"+avail7+"' where BOOK_ID='"+bid+"'");

        JOptionPane.showMessageDialog(f, "Successfully Updated."+bid);
        }}}
        catch(Exception e1)
        {
           JOptionPane.showMessageDialog(f,e1);
        }//catch
          
     }//update



//////////////////////////////////////////////////////////////////////////////
        else if(e.getSource()==btnSearch)
        {
//JOptionPane.showMessageDialog(f,"Search");
     try
        {
                 bid = cmbBookID.getSelectedItem().toString();

                 bid1= cmbBookID.getSelectedItem().toString();
   //JOptionPane.showMessageDialog(f,bid1);
bidI=cmbBookID.getSelectedIndex();
bidi=Integer.toString(bidI);

      if(bidi.equals("-1") && bid1.equals(""))
      {
          hidden.setText("! Click NEW button for new BookID");
          cmbBookID.requestFocus();
          return;
      }

 else
      {
    hidden.setText("");
 
            String strAvail;
              ResultSet rs=stmt.executeQuery("select * from bookentries where BOOK_ID='"+bid+"'");
              if(rs.next())
              {
              txtBookName.setText(rs.getString("BOOK_NAME"));
              txtAuthor.setText(rs.getString("AUTHOR"));
               txtEdition.setText(rs.getString("EDITION"));
              cmbSub.setSelectedItem(rs.getString("BOOK_SUBJECT"));
               txtPages.setText(rs.getString("PAGES"));
              txtPrice.setText(rs.getString("PRICE"));
              strAvail=(rs.getString("AVAILABLE"));
              if (  strAvail.equals("available"))
                        {
                           avail1.setSelected(true);
                        }
              if (  strAvail.equals("unavailable"))
                        {
                            avail2.setSelected(true);
                        }
              }
 else
              {
                  JOptionPane.showMessageDialog(f,bid+" : Record did not FIND ");
                  txtBookName.setText("");
                  txtAuthor.setText("");
                  txtEdition.setText("");
                  cmbSub.setSelectedIndex(0);
                  txtPages.setText("");
                  txtPrice.setText("");
                  avail.clearSelection();
              }
          }//else
            }//try
            catch(Exception e6)
            {
              JOptionPane.showMessageDialog(f,e6);
            }//catch
       
   } //search


    }

    public static void main(String[] args) throws Exception
    {
       bookentries be = new bookentries();
       be.boken();
    }

}
