
package lib;

import java.io.File;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.awt.image.*;
import javax.swing.border.*;//border

class addbkimageM extends JComponent
{

Image i;

public addbkimageM(Image i) {
this.i = i;
}
public void paintComponent(Graphics g) {

g.drawImage(i, 0, 0, null);
}
}


public class libMenu extends JFrame implements ActionListener
{
     JFrame f;
    JMenu book,member,librarian,report,quit,about;
    JMenuItem b_entries,b_issue,b_return,mnew,mdelete,c_password,b_lxt,m_lxt,c_user,close,aboutus;
    public void menup()throws Exception
    {
        f=new JFrame("Dashboard");
        f.setLayout(null);
        f.setSize(900,700);

        f.setResizable(false);
       
        f.setLocationRelativeTo(null);

        BufferedImage bf = ImageIO.read(new File("C:\\Users\\welcome\\Downloads\\Documents\\NetBeansProjects\\lib\\images\\bigc#.jpg"));

          f.setContentPane(new addbkimageM(bf));

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
        Color mnb = new Color(143,168,205);
        mb.setBackground(mnb);
        f.setJMenuBar(mb);

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

    }






    public static void main(String[] args)throws Exception
    {
       libMenu lm = new libMenu();
       lm.menup();
    }

}
