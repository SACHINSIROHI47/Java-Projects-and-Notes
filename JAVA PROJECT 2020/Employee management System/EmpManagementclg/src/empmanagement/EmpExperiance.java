
package empmanagement;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Vector;
import java.sql.*;

public class EmpExperiance implements ActionListener
{
JFrame f;
JPanel p1;
JLabel heading,cemp_id,cexp_id,LOrgName,LFrom,LDuration,LDept,LEmpName,LDesignation,LTo;
JTextField tOrgName,tFrom,tDuration,tEmpName,tDesignation,tTo;
JComboBox cmb_emp_id,cDepName,cmb_exp_id;
JButton new1,save,clear,search;
Statement stmt3;
String eid,exid;

EmpExperiance()
            {
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection("jdbc:odbc:aa","sa","sqlserver");
        stmt3=con.createStatement();
     }
    catch(Exception e1)
    {
        JOptionPane.showMessageDialog(f,e1);
    }
}

 public void empExp()throws Exception
  {
     f=new JFrame ("EMPLOYEE EXPERIANCE");
     f.setLayout(null);
     f.setSize(800, 780);
     f.getContentPane().setBackground(Color.DARK_GRAY);

     p1=new JPanel();
     p1.setLayout(null);
     p1.setBounds(40, 40, 700, 660);
     p1.setBackground(Color.LIGHT_GRAY);

     heading= new JLabel("EMPLOYEE EXPERIANCE");
     heading.setBounds(150, 20, 400, 40);
     heading.setFont(new Font("Cambria",Font.ITALIC,35));
     p1.add(heading);

     cemp_id=new JLabel ("EMPLOYEE ID");
     cemp_id.setBounds(60, 100, 200, 30);
     cemp_id.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(cemp_id);

     try
    {
        ResultSet rs = stmt3.executeQuery("select EMPLOYEE_ID from EmpDetails");

            Vector v = new Vector();

            while (rs.next()) {

                eid = rs.getString(1);

                v.add(eid);

            }

           cmb_emp_id=new JComboBox(v);
           cmb_emp_id.setBounds(430,100,200,25);
           p1.add(cmb_emp_id);

            rs.close();

    }
    catch (Exception ob)
    {
         JOptionPane.showMessageDialog(f, ob);
    }


     cexp_id=new JLabel ("EXPERIANCE ID");
     cexp_id.setBounds(60, 150, 200, 30);
     cexp_id.setFont(new Font("Times new roman",Font.BOLD,22));
     

     p1.add(cexp_id);

      try
    {
        ResultSet rs2 = stmt3.executeQuery("select EXPERIANCE_ID from EmpExperiance");

            Vector v = new Vector();

            while (rs2.next()) {

                exid = rs2.getString(1);

                v.add(exid);

            }

           cmb_exp_id=new JComboBox(v);
           cmb_exp_id.setBounds(430,150,200,25);
           cmb_exp_id.setEditable(true);
           p1.add(cmb_exp_id);

            rs2.close();

    }
    catch (Exception ob)
    {
         JOptionPane.showMessageDialog(f, ob);
    }

    

     LOrgName= new JLabel("ORGANIZATION NAME");
     LOrgName.setBounds(60, 200, 250, 30);
     LOrgName.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LOrgName);

     tOrgName=new JTextField();
     tOrgName.setBounds(430,205,200,25);
     p1.add(tOrgName);

     LFrom= new JLabel("FROM");
     LFrom.setBounds(60, 250, 200, 30);
     LFrom.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LFrom);

     tFrom=new JTextField();
     tFrom.setBounds(430,250,200,25);
     p1.add(tFrom);

     LDuration= new JLabel("DURATION");
     LDuration.setBounds(60, 300, 200, 30);
     LDuration.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LDuration);

     tDuration=new JTextField();
     tDuration.setBounds(430,300,200,25);
     p1.add(tDuration);

     LDept= new JLabel("DEPARTMENT");
     LDept.setBounds(60, 350, 200, 30);
     LDept.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LDept);

     cDepName=new JComboBox();
     cDepName.addItem("ACCOUNTING");
     cDepName.addItem("INCMOTAX");
     cDepName.addItem("MANAGEMENT");
     cDepName.addItem("SALES");
     cDepName.addItem("FINANCE");
     cDepName.addItem("MARKETING");
     cDepName.addItem("PAYROLL");
     cDepName.addItem("OPERATIONS");
     cDepName.setBounds(430,350,200,25);
     p1.add(cDepName);

     LEmpName= new JLabel("EMPLOYEE NAME");
     LEmpName.setBounds(60, 400, 250, 30);
     LEmpName.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LEmpName);

     tEmpName=new JTextField();
     tEmpName.setBounds(430,400,200,25);
     p1.add(tEmpName);

     LDesignation= new JLabel("DESIGNATION");
     LDesignation.setBounds(60, 450, 200, 30);
     LDesignation.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LDesignation);

     tDesignation=new JTextField();
     tDesignation.setBounds(430,450,200,25);
     p1.add(tDesignation);

     LTo= new JLabel("TO");
     LTo.setBounds(60, 500, 200, 30);
     LTo.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LTo);

     tTo=new JTextField();
     tTo.setBounds(430,500,200,25);
     p1.add(tTo);

    

     save=new JButton("SAVE");
     save.setBounds(200,570,130,40);
     save.setFont(new Font("Times new roman",Font.BOLD,22));
     save.addActionListener(this);
     p1.add(save);

     clear=new JButton("CLEAR");
     clear.setBounds(350,570,130,40);
     clear.setFont(new Font("Times new roman",Font.BOLD,22));
     clear.addActionListener(this);
     p1.add(clear);

     search=new JButton("SEARCH");
     search.setBounds(500,570,130,40);
     search.setFont(new Font("Times new roman",Font.BOLD,22));
     search.addActionListener(this);
     p1.add(search);

     f.add(p1);
     f.setVisible(true);
   }
     public void actionPerformed(ActionEvent e)
    {
      String se1,se2,se3,se4,se5,se6,se7,se8,se9;
      if(e.getSource()==save)
      {
       se1=cmb_emp_id.getSelectedItem().toString();
       se2=cmb_exp_id.getSelectedItem().toString();
       se3=tOrgName.getText();
       se4=tFrom.getText();
       se5=tDuration.getText();
       se6=cDepName.getSelectedItem().toString();
       se7=tDesignation.getText();
       se8=tTo.getText();

       try
       {
         stmt3.execute("insert into EmpExperiance values('"+se1+"','"+se2+"','"+se3+"','"+se4+"','"+se5+"','"+se6+"','"+se7+"','"+se8+"')");
          JOptionPane.showMessageDialog(f,"Successfully Save");
            ResultSet rs = stmt3.executeQuery("select EXPERIANCE_ID from EmpExperiance");
            cmb_exp_id.removeAllItems();
 while (rs.next())
            {
               cmb_exp_id.addItem(rs.getString("EXPERIANCE_ID"));

            }
       }
       catch(Exception e2)
       {
           JOptionPane.showMessageDialog(f,e2);
       }
      }

      else if(e.getSource()==clear)
    {
          try{
       cmb_emp_id.setSelectedIndex(0);
       cmb_exp_id.setSelectedIndex(0);
       tOrgName.setText("");
       tFrom.setText("");
       tDuration .setText("");
       cDepName.setSelectedIndex(0);
       tEmpName.setText("");
       tDesignation.setText("");
       tTo.setText("");
   }
 catch(Exception e3)
       {
           JOptionPane.showMessageDialog(f,e3);
       }
      }
      else if(e.getSource()==search)
    {
        String ss1;
        ss1=cmb_emp_id.getSelectedItem().toString();
       try
       {
         JOptionPane.showMessageDialog(f,"SEARCH");
         ResultSet rs=stmt3.executeQuery("select * from EmpDetails where EMPLOYEE_ID='"+ss1+"'");
         while(rs.next())
           {
             
             tEmpName.setText(rs.getString("EMPLOYEE_NAME"));
             
             
         }
       }
       catch(Exception e4)
       {
         JOptionPane.showMessageDialog(f,e4);
       }
     }
   }
      public static void main(String[] args)throws Exception
    {
      EmpExperiance obj=new EmpExperiance();
      obj.empExp();
   }

}
