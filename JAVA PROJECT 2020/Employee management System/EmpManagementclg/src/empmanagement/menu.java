
package empmanagement;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;

class addbkimage3 extends JComponent
{
    Image i;
    public addbkimage3 (Image i)
    {
        this.i=i;
    }
    public void paintComponent(Graphics g)
    {
        g.drawImage(i, 0, 0, null);
    }
  }
public class menu extends JFrame implements ActionListener
{
    JFrame f;
    JMenu det,shi,user,abo;
    JMenuItem details,exp,shift,salary,about,changeUser,Quit,changeP,newuser;

    public void menuup()throws Exception
    {
        f=new JFrame("Dashboard");
        f.setLayout(null);
        f.setSize(1030,703);

        BufferedImage bf = ImageIO.read(new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\EmpManagementclg\\IMAGES\\emp\\emp1.jpg"));
        f.setContentPane(new addbkimage3(bf));

        JMenuBar mb=new JMenuBar();
        Color mit=new Color(183,228,240);
        
        det=new JMenu("Details");
        det.setFont(new Font("Times new roman",Font.BOLD,26));
        
        details=new JMenuItem("Employee Details");
        details.setFont(new Font("Times new roman",Font.PLAIN,20));
        details.setForeground(Color.blue);
        details.setBackground(mit);
        det.add(details);
        details.addActionListener(this);
        
        exp=new JMenuItem("Experience");
        exp.setFont(new Font("Times new roman",Font.PLAIN,20));
        exp.setForeground(Color.blue);
        exp.setBackground(mit);
        det.add(exp);
        exp.addActionListener(this);
       
        mb.add(det);
        ////////////////////////////////////////////////shi
        shi=new JMenu("Payroll");
        shi.setFont(new Font("Times new roman",Font.BOLD,26));

        shift=new JMenuItem("Employee Shift");
        shift.setFont(new Font("Times new roman",Font.PLAIN,20));
        shift.setForeground(Color.blue);
        shift.setBackground(mit);
        shi.add(shift);
        shift.addActionListener(this);

        salary=new JMenuItem("Salary");
        salary.setFont(new Font("Times new roman",Font.PLAIN,20));
        salary.setForeground(Color.blue);
        salary.setBackground(mit);
        shi.add(salary);
        salary.addActionListener(this);

        mb.add(shi);
         ////////////////////////////////////////////////chn
         user=new JMenu("Login");
        user.setFont(new Font("Times new roman",Font.BOLD,26));

        changeUser=new JMenuItem("Change User");
        changeUser.setFont(new Font("Times new roman",Font.PLAIN,20));
        changeUser.setForeground(Color.blue);
        changeUser.setBackground(mit);
        user.add(changeUser);
        changeUser.addActionListener(this);

        changeP=new JMenuItem("Change Password");
        changeP.setFont(new Font("Times new roman",Font.PLAIN,20));
        changeP.setForeground(Color.blue);
        changeP.setBackground(mit);
        user.add(changeP);
        changeP.addActionListener(this);

        newuser=new JMenuItem("New User");
        newuser.setFont(new Font("Times new roman",Font.PLAIN,20));
        newuser.setForeground(Color.blue);
        newuser.setBackground(mit);
        user.add(newuser);
        newuser.addActionListener(this);

        Quit=new JMenuItem("Quit");
        Quit.setFont(new Font("Times new roman",Font.PLAIN,20));
        Quit.setForeground(Color.blue);
        Quit.setBackground(mit);
        user.add(Quit);
        Quit.addActionListener(this);

        mb.add(user);
        /////////////////////////////////////////////////////////////abt
        abo=new JMenu("About");
        abo.setFont(new Font("Times new roman",Font.BOLD,26));

        about=new JMenuItem("About System");
        about.setFont(new Font("Times new roman",Font.PLAIN,20));
        about.setForeground(Color.blue);
        about.setBackground(mit);
        abo.add(about);
        mb.add(abo);
       about.addActionListener(this);

        Color mbc=new Color(143,168,205);
        mb.setBackground(mbc);
        f.setJMenuBar(mb);
        f.setVisible(true);
    }


    public void actionPerformed(ActionEvent e)
    {
       try
       {
           if(e.getSource()==details)
           {
                EmpDetails obj=new EmpDetails();
                obj.empDetl();
           }
 else  if(e.getSource()==exp)
           {
                EmpExperiance obj=new EmpExperiance();
      obj.empExp();
           }
           else  if(e.getSource()==shift)
           {
                EmpShift obj = new EmpShift();
        obj.empShift();
           }
            else  if(e.getSource()==salary)
           {
                Salarymanagement obj=new Salarymanagement();
      obj.empSal();
           }
           else  if(e.getSource()==changeUser)
           {
                 login lg=new login();
           lg.logn();
           f.setVisible(false);
           }
            else  if(e.getSource()==changeP)
           {
                changepassword cp =new changepassword();
                cp.chngp();
           }
           else  if(e.getSource()==newuser)
           {
               NewUser nu=new NewUser();
        nu.user();
           }
             else  if(e.getSource()==Quit)
           {
                f.setVisible(false);
           }
            else  if(e.getSource()==about)
           {
                 AboutUs ob=new AboutUs();
             ob.AboutUsa();
           }

       }catch(Exception mm)
       {
           JOptionPane.showMessageDialog(f, mm);
       }

    }
  public static void main(String[] args)throws Exception
    {
        
                menu ob=new menu();
                ob.menuup();
          
        }
    }



