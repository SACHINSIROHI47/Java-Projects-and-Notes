
package lib;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.*;
import javax.swing.border.*;//border
import java.sql.*;
import javax.imageio.ImageIO;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class userlxt extends JFrame implements ActionListener
{

    JFrame    frame1,frame2,f;
    JPanel p;
    JLabel tag,select,mmbrid,hidn;
    JRadioButton indi,sinl;
    JButton search;
    JTextField mmbr;
    ButtonGroup bg;
    ResultSet rs, rs1;
     JMenu book,member,librarian,report,quit,about;
    JMenuItem b_entries,b_issue,b_return,mnew,mdelete,new_librarian,c_password,b_lxt,m_lxt,u_lxt,c_user,close,aboutus;
    Statement st, st1;
    String ids;
    static JTable table,table1;
    String[] columnNames = {"BOOK_ID", "BOOK_NAME", "AUTHOR", "EDITION", "BOOK_SUBJECT", "PAGES", "PRICE", "AVAILABLE"};
    String from;

    userlxt()
    {
          try
        {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection("jdbc:odbc:bb","sa","sqlserver");
	st=con.createStatement();
        st1=con.createStatement();
        }
        catch(Exception e4)
        {
            JOptionPane.showMessageDialog(f,e4);
        }
    }

    public void lxt()throws Exception
    {

       f=new JFrame("LIBRARY MANAGEMENT SYSTEM");
        f.setLayout(null);
        f.setSize(900,700);

        f.setResizable(false);
        f.setLocationRelativeTo(null);
        Color f1=new Color(227,217,234);
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

         Color mnb = new Color(181,154,199);
        mb.setBackground(mnb);

        tag = new JLabel("   BOOK DETAILS");
        tag.setFont(new Font("Serif", Font.BOLD,32));
        tag.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED)));
        tag.setBounds(300,40,300,50);
        f.add(tag);

         BufferedImage ad =ImageIO.read(new File("C:\\Users\\welcome\\Downloads\\Documents\\NetBeansProjects\\lib\\images\\dl10.jpg"));
        JLabel adm=new JLabel(new ImageIcon(ad));
        adm.setBounds(15,5,182,241);
         p.add(adm);

        select = new JLabel("Select one option");
        select.setFont(new Font("Times new roman",Font.ITALIC,24));
        select.setBounds(230,50,250, 40);
        p.add(select);

        hidn= new JLabel("");
        hidn.setFont(new Font("Arials",Font.PLAIN,12));
        hidn.setForeground(Color.red);
        hidn.setBounds(230,180,250,20);
        p.add(hidn);

        indi = new JRadioButton();
        indi.setText("Individual search by BOOK ID");
        indi.setBounds(200,200,300, 25);
        indi.setFont(new Font("Times new roman",Font.PLAIN,18));
        indi.setBackground(p1);
        p.add(indi);

        mmbrid=new JLabel("Book ID");
        mmbrid.setBounds(220,230,100,30);
        mmbrid.setFont(new Font("Times new roman",Font.PLAIN,16));
        p.add(mmbrid);

        mmbr=new JTextField();
        mmbr.setBounds(300,230,150,30);
        mmbr.setFont(new Font("Times new roman",Font.PLAIN,16));
        p.add(mmbr);

        sinl = new JRadioButton();
        sinl.setText("Search all Book ID");
        sinl.setBounds(500,200,200, 25);
        sinl.setFont(new Font("Times new roman",Font.PLAIN,18));
        sinl.setBackground(p1);
        p.add(sinl);

        bg = new ButtonGroup();
	bg.add(indi);
	bg.add(sinl);

        search = new JButton("SEARCH");
        search.setBounds(400,300, 150,30);
        search.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)));
        search.addActionListener(this);
        p.add(search);

        f.setJMenuBar(mb);
        f.add(p);
        f.setVisible(true);

        }


    public void actionPerformed(ActionEvent e)
    {

         if(e.getSource().equals(b_entries))
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
        else if(e.getSource().equals(b_issue))
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

       else if (e.getSource() == search)
        {
            if(indi.isSelected()==true)
            {              JOptionPane.showMessageDialog(f,"indi1");

                if(mmbr.getText().isEmpty())
                {
                hidn.setText("Enter BOOK ID");
                return;
                }
 else
                {
                    try
            {   JOptionPane.showMessageDialog(f,"indi2");

                   frame2 = new JFrame("Book ID Database Search Result");
                   frame2.setLayout(new BorderLayout());
                   DefaultTableModel model1 = new DefaultTableModel();
                   model1.setColumnIdentifiers(columnNames);
                   table1 = new JTable();
                   table1.setModel(model1);
                   table1.setRowHeight(25);
                   table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                   table1.setFillsViewportHeight(true);
                   JScrollPane scroll1 = new JScrollPane(table1);
                   scroll1.setHorizontalScrollBarPolicy(
                   JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                   scroll1.setVerticalScrollBarPolicy(
                   JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        from =mmbr.getText();

    String BOOK_ID="",BOOK_NAME="",AUTHOR="",EDITION="",BOOK_SUBJECT="",PAGES="",PRICE="",AVAILABLE="";

               rs = st.executeQuery("select * from bookentries where BOOK_ID ='"+from+"'");

            int i = 0;

            while (rs.next()) {

                BOOK_ID=(rs.getString("BOOK_ID"));
                BOOK_NAME=(rs.getString("BOOK_NAME"));
                AUTHOR=(rs.getString("AUTHOR"));
                EDITION=(rs.getString("EDITION"));
                BOOK_SUBJECT=(rs.getString("BOOK_SUBJECT"));
                PAGES=(rs.getString("PAGES"));
                PRICE=(rs.getString("PRICE"));
                AVAILABLE=(rs.getString("AVAILABLE"));
                model1.addRow(new Object[]{BOOK_ID, BOOK_NAME, AUTHOR, EDITION,BOOK_SUBJECT,PAGES,PRICE,AVAILABLE});

                i++;
                frame2.add(scroll1);
                 frame2.setVisible(true);
                 frame2.setSize(700,200);

            }

            if (i < 1) {

                JOptionPane.showMessageDialog(null, "No Book record found", "Error", JOptionPane.ERROR_MESSAGE);
                mmbr.setText("");
            }

            else {

                JOptionPane.showMessageDialog(f,i + ":- Book Record Found");

            }

               }//try
           catch(Exception e3)
        {
          JOptionPane.showMessageDialog(frame2,e3);
        }
 }
            }
            if(sinl.isSelected()==true)
            {  JOptionPane.showMessageDialog(f,"jhgjghj");
               try
            {

                   frame1 = new JFrame("Book ID Database Search Result");
                   frame1.setLayout(new BorderLayout());
                   DefaultTableModel model = new DefaultTableModel();
                   model.setColumnIdentifiers(columnNames);
                   table = new JTable();
                   table.setModel(model);
                   table.setRowHeight(25);
                   table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                   table.setFillsViewportHeight(true);
                   JScrollPane scroll = new JScrollPane(table);
                   scroll.setHorizontalScrollBarPolicy(
                   JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                   scroll.setVerticalScrollBarPolicy(
                   JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

      //  from =mmbr.getText();

     String BOOK_ID="",BOOK_NAME="",AUTHOR="",EDITION="",BOOK_SUBJECT="",PAGES="",PRICE="",AVAILABLE="";

               rs1 = st1.executeQuery("select * from bookentries");

            int i = 0;

            while (rs1.next())
            {

                BOOK_ID=(rs1.getString("BOOK_ID"));
                BOOK_NAME=(rs1.getString("BOOK_NAME"));
                AUTHOR=(rs1.getString("AUTHOR"));
                EDITION=(rs1.getString("EDITION"));
                BOOK_SUBJECT=(rs1.getString("BOOK_SUBJECT"));
                PAGES=(rs1.getString("PAGES"));
                PRICE=(rs1.getString("PRICE"));
                AVAILABLE=(rs1.getString("AVAILABLE"));
                model.addRow(new Object[]{BOOK_ID, BOOK_NAME, AUTHOR, EDITION,BOOK_SUBJECT,PAGES,PRICE,AVAILABLE});

                i++;

            }

            if (i < 1) {

                JOptionPane.showMessageDialog(null, "No Book record found", "Error", JOptionPane.ERROR_MESSAGE);

            }

            else {

                JOptionPane.showMessageDialog(f,i + ":- Book Records Found");

            }
                 frame1.add(scroll);
                 frame1.setVisible(true);
                 frame1.setSize(700,200);
               }
           catch(Exception e3)
        {
          JOptionPane.showMessageDialog(frame1,e3);
        }
       }
       if(indi.isSelected()==false && sinl.isSelected()==false)
            {
                JOptionPane.showMessageDialog(f,"Select a option");
            }
 }
}
      public static void main(String args[])throws Exception
    {

        userlxt ul=new userlxt();
        ul.lxt();

    }


}

