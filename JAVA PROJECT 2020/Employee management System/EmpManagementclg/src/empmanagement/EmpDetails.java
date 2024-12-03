package empmanagement;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
//import java.awt.image.BufferedImage;
import java.io.*;
//import javax.imageio.ImageIO;
import java.util.Vector;
import java.sql.*;



public class EmpDetails extends JFrame implements ActionListener
{
JFrame f;
JPanel p1;
JLabel heading,Lemp_id,LEmpName,LAge,LDob,LDepName,LJoinDate,LAddress,LMobNo,LDepId,LDesignation,LEmail_Id,LBasicSal,LGend;
JTextField tEmpName,tAge,tDob,tDepName,tJoinDate,tMobNo,tDepId,tDesignation,tEmail_Id,tBasicSal,tGend;
JComboBox cDepName,cemp_id;
JRadioButton gender1,gender2;
JTextArea tAddress;
JButton reset,save,update,find,delete;
ButtonGroup bg;
Statement stmt;
String eid;
EmpDetails()
  {
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection("jdbc:odbc:aa","sa","sqlserver");
        stmt=con.createStatement();
     }
    catch(Exception e1)
    {
        JOptionPane.showMessageDialog(f,e1);
    }
  }

 public void empDetl()throws Exception
  {
     f=new JFrame ("EMPLOYEE DETAILS");
     f.setLayout(null);
     f.setSize(800, 760);
     f.getContentPane().setBackground(Color.DARK_GRAY);

     p1=new JPanel();
     p1.setLayout(null);
     p1.setBounds(30, 30, 720, 660);
     p1.setBackground(Color.LIGHT_GRAY);



     heading= new JLabel("EMPLOYEE DETAILS");
     heading.setBounds(220, 20, 350, 40);
     heading.setFont(new Font("Cambria",Font.ITALIC,35));
     p1.add(heading);

     Lemp_id=new JLabel ("EMPLOYEE ID");
     Lemp_id.setBounds(30, 80, 250, 25);
     Lemp_id.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(Lemp_id);

       try
    {
        ResultSet rs4 = stmt.executeQuery("select EMPLOYEE_ID from EmpDetails");

            Vector v = new Vector();

            while (rs4.next()) {

                eid = rs4.getString(1);

                v.add(eid);

            }

      cemp_id=new JComboBox(v);
      cemp_id.setBounds(240,80,150,25);
      cemp_id.setEditable(true);
      p1.add(cemp_id);

            rs4.close();

    }
    catch (Exception ob)
    {
         JOptionPane.showMessageDialog(f, ob);
    }


    

     LEmpName= new JLabel("EMPLOYEE NAME");
     LEmpName.setBounds(30, 130, 250, 30);
     LEmpName.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LEmpName);

     tEmpName=new JTextField();
     tEmpName.setBounds(240,130,150,25);
     p1.add(tEmpName);

     LAge= new JLabel("AGE");
     LAge.setBounds(30, 170, 250, 30);
     LAge.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LAge);

     tAge=new JTextField();
     tAge.setBounds(240,170,150,25);
     p1.add(tAge);

     LDob= new JLabel("DOB");
     LDob.setBounds(30, 220, 250, 30);
     LDob.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LDob);

     tDob=new JTextField();
     tDob.setBounds(240,220,150,25);
     p1.add(tDob);

     LDepName= new JLabel("DEP_NAME");
     LDepName.setBounds(30, 270, 250, 30);
     LDepName.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LDepName);

     cDepName=new JComboBox();
     cDepName.addItem("ACCOUNTING");
     cDepName.addItem("INCMOTAX");
     cDepName.addItem("MANAGEMENT");
     cDepName.addItem("SALES");
     cDepName.addItem("FINANCE");
     cDepName.addItem("MARKETING");
     cDepName.addItem("PAYROLL");
     cDepName.addItem("OPERATIONS");
     cDepName.setBounds(240,270,150,25);
     p1.add(cDepName);

     LDesignation= new JLabel("DESIGNATION");
     LDesignation.setBounds(30, 320, 250, 30);
     LDesignation.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LDesignation);

     tDesignation=new JTextField();
     tDesignation.setBounds(240,320,150,25);
     p1.add(tDesignation);

     LJoinDate= new JLabel("JOINING DATE");
     LJoinDate.setBounds(30, 360, 250, 30);
     LJoinDate.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LJoinDate);

     tJoinDate=new JTextField();
     tJoinDate.setBounds(240,360,150,25);
     p1.add(tJoinDate);

     LAddress= new JLabel("ADDRESS");
     LAddress.setBounds(30, 400, 250, 30);
     LAddress.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LAddress);

     tAddress=new JTextArea();
     tAddress.setBounds(240,400,150,40);
     p1.add(tAddress);

     LMobNo= new JLabel("MOBILE NO");
     LMobNo.setBounds(30, 460, 250, 30);
     LMobNo.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LMobNo);

     tMobNo=new JTextField();
     tMobNo.setBounds(240,460,150,25);
     p1.add(tMobNo);

     LDepId= new JLabel("DEPARTMENT ID");
     LDepId.setBounds(30, 500, 250, 30);
     LDepId.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LDepId);

     tDepId=new JTextField();
     tDepId.setBounds(240,500,150,25);
     p1.add(tDepId);

     LEmail_Id= new JLabel("EMAIL ID");
     LEmail_Id.setBounds(30, 550, 250, 30);
     LEmail_Id.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LEmail_Id);

     tEmail_Id=new JTextField();
     tEmail_Id.setBounds(240,550,150,25);
     p1.add(tEmail_Id);

     LBasicSal= new JLabel("BASIC SALARY");
     LBasicSal.setBounds(30, 600, 250, 30);
     LBasicSal.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LBasicSal);

     tBasicSal=new JTextField();
     tBasicSal.setBounds(240,600,150,25);
     p1.add(tBasicSal);

    /* BufferedImage image = ImageIO.read(new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\EmpManagementclg\\IMAGES\\emp\\PAINT2.png"));
      JLabel label = new JLabel (new ImageIcon(image));
      label.setBounds(540,100,100,110);
      p1.add(label);*/

     LGend= new JLabel("GENDER");
     LGend.setBounds(500, 280, 250, 20);
     LGend.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LGend);

     gender1=new JRadioButton();
     gender1.setText("Male");
     gender1.setBounds(500,300,150,60);
     p1.add(gender1);

     gender2=new JRadioButton();
     gender2.setText("Female");
     gender2.setBounds(500,340,150,60);
     p1.add(gender2);

      bg=new ButtonGroup();
      bg.add(gender1);
      bg.add(gender2);

     reset=new JButton("RESET");
     reset.setBounds(500,430,150,30);
     reset.setFont(new Font("Times new roman",Font.BOLD,22));
     reset.addActionListener(this);
     p1.add(reset);
     

     save=new JButton("SAVE");
     save.setBounds(500,470,150,30);
     save.setFont(new Font("Times new roman",Font.BOLD,22));
     save.addActionListener(this);
     p1.add(save);

     update=new JButton("UPDATE");
     update.setBounds(500,510,150,30);
     update.setFont(new Font("Times new roman",Font.BOLD,22));
     update.addActionListener(this);
     p1.add(update);

     find=new JButton("FIND");
     find.setBounds(500,550,150,30);
     find.setFont(new Font("Times new roman",Font.BOLD,22));
     find.addActionListener(this);
     p1.add(find);

     delete=new JButton("DELETE");
     delete.setBounds(500,590,150,40);
     delete.setFont(new Font("Times new roman",Font.BOLD,22));
     delete.addActionListener(this);
     p1.add(delete);

     f.add(p1);
     f.setVisible(true);
    }
public void actionPerformed(ActionEvent e)
{
    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
    if(e.getSource()==save)
    {
        try
       {
       s1=cemp_id.getSelectedItem().toString();
       s2=tEmpName.getText();
       s3=tAge.getText();
       s4=tDob.getText();
       s5=cDepName.getSelectedItem().toString();
       s6=tJoinDate.getText();
       s7=tAddress.getText();
       s8=tMobNo.getText();
       s9=tDepId.getText();
       s10=tDesignation.getText();
       s11=tEmail_Id.getText();
       s12=tBasicSal.getText();
    

       if(gender1.isSelected()==true)
       {
          s13 = "Male";
       }
       else
       {
          s13 = "Female";
       }
       
          stmt.execute("insert into EmpDetails values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"')");
          JOptionPane.showMessageDialog(f,"Successfully Save");
          cemp_id.removeAllItems();
           ResultSet rs = stmt.executeQuery("select EMPLOYEE_ID from EmpDetails");
 while (rs.next())
            {
               cemp_id.addItem(rs.getString("EMPLOYEE_ID"));

            }

       }
       catch(Exception e1)
       {
           JOptionPane.showMessageDialog(f,e1);
       }
    }
    else if(e.getSource()==update)
    {
          try
         {
       String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13;
       a1=cemp_id.getSelectedItem().toString();
       a2=tEmpName.getText();
       a3=tAge.getText();
       a4=tDob.getText();
       a5=cDepName.getSelectedItem().toString();
       a6=tJoinDate.getText();
       a7=tAddress.getText();
       a8=tMobNo.getText();
       a9=tDepId.getText();
       a10=tDesignation.getText();
       a11=tEmail_Id.getText();
       a12=tBasicSal.getText();
      if(gender1.isSelected()==true)
       {
          a13 = "Male";
       }
       else
       {
          a13 = "Female";
       }

     
           stmt.executeUpdate("update EmpDetails set EMPLOYEE_NAME='"+a2+"',AGE='"+a3+"',DOB='"+a4+"',DEP_NAME='"+a5+"',JOINING_DATE='"+a6+"',E_ADDRESS='"+a7+"',MOBILE_NO='"+a8+"',DEPARTMENT_ID='"+a9+"',DESIGNATION='"+a10+"',EMAIL_ID='"+a11+"',BASIC_SALARY='"+a12+"',GENDER='"+a13+"' where EMPLOYEE_ID='"+a1+"'");
           JOptionPane.showMessageDialog(f,"Update");
         }
       catch(Exception e2)
       {
          JOptionPane.showMessageDialog(f,e2);
       }
    }
    else if(e.getSource()==find)
    {
        String ss1,strGender;
        ss1=cemp_id.getSelectedItem().toString();
       try
       {
         JOptionPane.showMessageDialog(f,"Find");
         ResultSet rs=stmt.executeQuery("select * from EmpDetails where EMPLOYEE_ID='"+ss1+"'");
         if(rs.next())
           {
             tEmpName.setText(rs.getString("EMPLOYEE_NAME"));
             tAge.setText(rs.getString("AGE"));
             tDob.setText(rs.getString("DOB"));
             cDepName.setSelectedItem(rs.getString("DEP_NAME"));
             tJoinDate.setText(rs.getString("JOINING_DATE"));
             tAddress.setText(rs.getString("E_ADDRESS"));
             tMobNo.setText(rs.getString("MOBILE_NO"));
             tDepId.setText(rs.getString("DEPARTMENT_ID"));
             tDesignation.setText(rs.getString("DESIGNATION"));
             tEmail_Id.setText(rs.getString("EMAIL_ID"));
             tBasicSal.setText(rs.getString("BASIC_SALARY"));
             strGender=(rs.getString("GENDER"));

             if(strGender.equals("Male"))
             {
                 gender1.setSelected(true);
             }
             if(strGender.equals("Female"))
             {
                 gender2.setSelected(true);
             }

         }
       }
       catch(Exception e3)
       {
         JOptionPane.showMessageDialog(f,e3);
       }
     }
    else if(e.getSource()==delete)
     {
        String d1;
        d1=cemp_id.getSelectedItem().toString();
        try
         {
            stmt.executeUpdate("delete from EmpDetails where EMPLOYEE_ID='"+d1+"'");
            JOptionPane.showMessageDialog(f,"Delete");
             ResultSet rs = stmt.executeQuery("select EMPLOYEE_ID from EmpDetails");
              cemp_id.removeAllItems();
 while (rs.next())
            {
               cemp_id.addItem(rs.getString("EMPLOYEE_ID"));

            }

         }
        catch(Exception e4)
         {
            JOptionPane.showMessageDialog(f,e4);
         }
    }
 else if(e.getSource()==reset)
    {
     try{
       cemp_id.setSelectedIndex(0);
       tEmpName.setText("");
       tAge.setText("");
       tDob.setText("");
       cDepName.setSelectedIndex(0);
       tJoinDate.setText("");
       tAddress.setText("");
       tMobNo.setText("");
       tDepId.setText("");
       tDesignation.setText("");
       tEmail_Id.setText("");
       tBasicSal.setText("");
      gender1.setSelected(false);
      gender2.setSelected(false);
        }
      catch(Exception e5)
         {
            JOptionPane.showMessageDialog(f,e5);
         }
 }
  }



    public static void main(String[] args)throws Exception
    {
      EmpDetails obj=new EmpDetails();
      obj.empDetl();
 
    }
  }




