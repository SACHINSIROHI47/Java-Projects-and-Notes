
package empmanagement;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.lang.*;



public class Salarymanagement implements ActionListener
{
JFrame f, frame1;
JPanel p1;
JLabel heading,cemp_id,LDepName,LPerDaySalary,LBonus,LHidden,LBasic,LBenefits,LDesignation,LDeductions,LTotalSalary,LFrom,LTo,LToLdateformate1,LToLdateformate,LAttend;
JTextField temp_id,tDepName,tTotalDays,tPerDaySalary,tBasicSalary,tDesignation,tBonus,tBenefits,tDeductions,tTotalSalary,tFrom,tto;
JComboBox cmb_emp_id,cBonus;
JCheckBox ch1,ch2,ch3,ch4,ch5,ch6;
JButton calSalary,search,clear,TotalDays,BasicSalary;
Statement stmt5;
String eid;
Date fromd,tod;
JScrollPane scroll;
JTable table;
String[] columnNames = {"EMPLOYEE_ID","MONTHLY_SALARY","SALARY_MONTH", "BONUS", "HOUSING_ALLOWANCE","CONVEYANCE_ALLOWANCE", "MEDICAL_ALLOWANCE", "OTHER_ALLOWANCE", "PF_DEDUCTION","INSURANCE_DEDUCTION","TOTAL_SALARY"};

Salarymanagement()
  {
    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection("jdbc:odbc:aa","sa","sqlserver");
        stmt5=con.createStatement();
    }
    catch(Exception e1)
    {
        JOptionPane.showMessageDialog(f,e1);
    }
}

 public void empSal()throws Exception
  {
     f=new JFrame ("SALARY MANAGEMENT");
     f.setLayout(null);
     f.setSize(950,760);
     f.getContentPane().setBackground(Color.DARK_GRAY);

     p1=new JPanel();
     p1.setLayout(null);
     p1.setBounds(40, 40, 850,640);
     p1.setBackground(Color.LIGHT_GRAY);

     heading= new JLabel("SALARY MANAGEMENT SYSTEM");
     heading.setBounds(150, 20, 500, 40);
     heading.setFont(new Font("Cambria",Font.ITALIC,35));
     p1.add(heading);

     cemp_id=new JLabel ("EMPLOYEE ID");
     cemp_id.setBounds(20, 100, 200, 30);
     cemp_id.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(cemp_id);

      try
    {
        ResultSet rs4 = stmt5.executeQuery("select EMPLOYEE_ID from EmpDetails");

            Vector v = new Vector();

            while (rs4.next()) {

                eid = rs4.getString(1);

                v.add(eid);

            }

      cmb_emp_id=new JComboBox(v);
      cmb_emp_id.setBounds(200,100,180,25);
      cmb_emp_id.setEditable(false);
      cmb_emp_id.addActionListener(this);
      p1.add(cmb_emp_id);

            rs4.close();

    }
    catch (Exception ob)
    {
         JOptionPane.showMessageDialog(f, ob);
    }

     LDesignation=new JLabel ("DESIGNATION");
     LDesignation.setBounds(20, 160, 250, 30);
     LDesignation.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LDesignation);

     tDesignation=new JTextField();
     tDesignation.setBounds(200,160,180,25);
     tDesignation.setEditable(false);
     p1.add(tDesignation);

     LDepName=new JLabel ("DEPARTMENT NAME");
     LDepName.setBounds(400, 100, 250, 30);
     LDepName.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LDepName);

     tDepName=new JTextField();
     tDepName.setBounds(650,100,180,25);
     tDepName.setEditable(false);
     p1.add(tDepName);

      LBasic=new JLabel ("BASIC SALARY");
     LBasic.setBounds(400,160, 250, 30);
     LBasic.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LBasic);

      tBasicSalary=new JTextField();
     tBasicSalary.setBounds(650,160,180,25);
     tBasicSalary.setEditable(false);
     p1.add(tBasicSalary);

     LToLdateformate1= new JLabel("(mm/dd/yyyy)");
     LToLdateformate1.setBounds(160,220, 150, 20);
     LToLdateformate1.setFont(new Font("Arial",Font.BOLD,12));
     p1.add(LToLdateformate1);

     LFrom= new JLabel("FROM SALARY");
     LFrom.setBounds(20,240, 250, 20);
     LFrom.setFont(new Font("Times new roman",Font.BOLD,15));
     p1.add(LFrom);

     tFrom=new JTextField();
     tFrom.setBounds(150,240,100,20);
   //  tFrom.setEditable(false);
     p1.add(tFrom);

     LToLdateformate= new JLabel("(mm/dd/yyyy)");
     LToLdateformate.setBounds(390,220, 150, 20);
     LToLdateformate.setFont(new Font("Arial",Font.BOLD,12));
     p1.add(LToLdateformate);
 
     LTo= new JLabel("TO SALARY");
     LTo.setBounds(270,240, 250, 20);
     LTo.setFont(new Font("Times new roman",Font.BOLD,15));
     p1.add(LTo);

     tto=new JTextField();
     tto.setBounds(380,240,100,20);
   //  tto.setEditable(false);
     p1.add(tto);

     TotalDays= new JButton("TOTAL DAYS");
     TotalDays.setBounds(500,240, 150, 20);
     TotalDays.setFont(new Font("Times new roman",Font.BOLD,15));
     TotalDays.addActionListener(this);
     p1.add(TotalDays);

     tTotalDays=new JTextField();
     tTotalDays.setBounds(680,240,150,25);
     tTotalDays.setEditable(false);
     p1.add(tTotalDays);

     BasicSalary= new JButton("MONTHLY SALARY");
     BasicSalary.setBounds(20,300,150, 20);
     BasicSalary.setFont(new Font("Arial",Font.BOLD,12));
     BasicSalary.addActionListener(this);
     p1.add(BasicSalary);

     LAttend= new JLabel("(ACC. TO ATTEND.)");
     LAttend.setBounds(40,320, 150, 20);
     LAttend.setFont(new Font("Arial",Font.BOLD,12));
     p1.add(LAttend);

      tPerDaySalary=new JTextField();
     tPerDaySalary.setBounds(200,300,150,25);
     p1.add(tPerDaySalary);

     LHidden= new JLabel("");
     LHidden.setBounds(400,300,300, 30);
     LHidden.setFont(new Font("Arial",Font.BOLD,12));
     p1.add(LHidden);

     LBonus= new JLabel("BONUS");
     LBonus.setBounds(20,360, 200, 30);
     LBonus.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LBonus);

     cBonus=new JComboBox();
     cBonus.addItem("Diwali Bonus");
     cBonus.addItem("Weekend Bonus");
     cBonus.addItem("Overtime Bonus");
     cBonus.setBounds(200,360,150,25);
     p1.add(cBonus);

     LBenefits= new JLabel("BENEFITS");
     LBenefits.setBounds(20,450, 200, 30);
     LBenefits.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LBenefits);

     ch1=new JCheckBox("HOUSING ALLOWANCE");
     ch1.setBounds(200,450,200,20);
     p1.add(ch1);

     ch2=new JCheckBox("CONVEYANCE ALLOWANCE");
     ch2.setBounds(200,470,200,20);
     p1.add(ch2);

     ch3=new JCheckBox("MEDICAL ALLOWANCE");
     ch3.setBounds(200,490,200,20);
     p1.add(ch3);

     ch4=new JCheckBox("OTHER ALLOWANCE");
     ch4.setBounds(200,510,200,20);
     p1.add(ch4);

     LDeductions= new JLabel("DEDUCTION");
     LDeductions.setBounds(450,450, 200, 30);
     LDeductions.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LDeductions);

     ch5=new JCheckBox("PF DEDUCTON");
     ch5.setBounds(650,450,180,20);
     p1.add(ch5);

     ch6=new JCheckBox("INSURANCE DEDUCTON");
     ch6.setBounds(650,470,180,20);
     p1.add(ch6);

    

     LTotalSalary= new JLabel("TOTAL SALARY");
     LTotalSalary.setBounds(20,560, 250, 30);
     LTotalSalary.setFont(new Font("Times new roman",Font.BOLD,22));
     p1.add(LTotalSalary);

     tTotalSalary=new JTextField();
     tTotalSalary.setBounds(200,560,150,35);
     p1.add(tTotalSalary);

     

     calSalary=new JButton("CALCULATE SALARY");
     calSalary.setBounds(370,560,280,40);
     calSalary.setFont(new Font("Times new roman",Font.BOLD,22));
     calSalary.addActionListener(this);
     p1.add(calSalary);
     
    /* search=new JButton("SEARCH");
     search.setBounds(250,480,150,40);
     search.setFont(new Font("Times new roman",Font.BOLD,22));
     search.addActionListener(this);
     p1.add(search);*/

     clear=new JButton("CLEAR");
     clear.setBounds(700,560,130,40);
     clear.setFont(new Font("Times new roman",Font.BOLD,22));
     clear.addActionListener(this);
     p1.add(clear);

     f.add(p1);
     f.setVisible(true);


}

 public void actionPerformed(ActionEvent e)
    {


      if(e.getSource()==cmb_emp_id)
      {
        String es1;
        es1=cmb_emp_id.getSelectedItem().toString();
       try
       {

          ResultSet rs2=stmt5.executeQuery("select * from EmpDetails where EMPLOYEE_ID='"+es1+"'");
         if(rs2.next())
         {
              tDepName.setText(rs2.getString("DEP_NAME"));
              tDesignation.setText(rs2.getString("DESIGNATION"));
              tBasicSalary.setText(rs2.getString("BASIC_SALARY"));
         }
      }//try

        catch(Exception e5)
         {
            JOptionPane.showMessageDialog(f,e5);
         }
        ////////////////////////////////////////////////

          try
           {

        frame1 = new JFrame("Database Employee Payslip");

      //  frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setLayout(new BorderLayout());


        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

        table = new JTable();

        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);

         scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(

                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(

                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

       // from = (String) c1.getSelectedItem().toString();

//String textvalue = textbox.getText();

        String EMPLOYEE_ID = "";
        String MONTHLY_SALARY = "";
        String SALARY_MONTH = "";
        String BONUS = "";
        String HOUSING_ALLOWANCE = "";
        String CONVEYANCE_ALLOWANCE = "";
        String MEDICAL_ALLOWANCE = "";
        String OTHER_ALLOWANCE = "";
        String PF_DEDUCTION = "";
        String INSURANCE_DEDUCTION = "";
        String TOTAL_SALARY = "";

            String S2=cmb_emp_id.getSelectedItem().toString();
             ResultSet rs = stmt5.executeQuery("select * from Salarymanagement where EMPLOYEE_ID='" +S2+ "'");
            int i = 0;
           while (rs.next()) {
                EMPLOYEE_ID = rs.getString("EMPLOYEE_ID");
                MONTHLY_SALARY = rs.getString("MONTHLY_SALARY");
                SALARY_MONTH = rs.getString("SALARY_MONTH");
                BONUS = rs.getString("BONUS");
                HOUSING_ALLOWANCE = rs.getString("HOUSING_ALLOWANCE");
                CONVEYANCE_ALLOWANCE = rs.getString("CONVEYANCE_ALLOWANCE");
                MEDICAL_ALLOWANCE = rs.getString("MEDICAL_ALLOWANCE");
                OTHER_ALLOWANCE = rs.getString("OTHER_ALLOWANCE");
                PF_DEDUCTION = rs.getString("PF_DEDUCTION");
                INSURANCE_DEDUCTION = rs.getString("INSURANCE_DEDUCTION");
                TOTAL_SALARY = rs.getString("TOTAL_SALARY");


                model.addRow(new Object[]{EMPLOYEE_ID,MONTHLY_SALARY,SALARY_MONTH, BONUS, HOUSING_ALLOWANCE,CONVEYANCE_ALLOWANCE, MEDICAL_ALLOWANCE, OTHER_ALLOWANCE, PF_DEDUCTION,INSURANCE_DEDUCTION,TOTAL_SALARY});

                i++;

            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

        frame1.add(scroll);

        frame1.setVisible(true);

        frame1.setSize(400, 300);

   }//if

      else if(e.getSource()==BasicSalary)
      {
          try
       {
        String sTD1,sPD1;
       // int
        sTD1=tTotalDays.getText();
        sPD1=tBasicSalary.getText();

        float std,spd,basics, oneday, tdays, pdsalary;
        std= Float.parseFloat(sTD1);
        spd=Float.parseFloat(sPD1);

        oneday=spd/30;
        basics=oneday*std;
        String SbaS;

        SbaS=Float.toString(basics);
        tPerDaySalary.setText(SbaS);
       LHidden.setText("from " + tFrom.getText() + " to " +tto.getText());
      }//try

        catch(Exception e5)
         {
            JOptionPane.showMessageDialog(f,e5);
         }
   }//if

      else if(e.getSource()==calSalary)
      {

            try
            {
          String dbBonus =tPerDaySalary.getText();

         // int DBonus=Integer.parseInt(tPerDaySalary.getText())
            double DBonus=Double.parseDouble(dbBonus);//txtbasicsalary....bonus..double
            double allowance = 0;
            if (cBonus.getSelectedIndex()==0)
                allowance = (DBonus * 2) / 100;
            if (cBonus.getSelectedIndex()==1)
                allowance = (DBonus * 4) / 100;
            if (cBonus.getSelectedIndex()==2)
                allowance = (DBonus * 5) / 100;


          double benefit = 0,deducn=0;
         

            if (ch1.isSelected()==true)
            {
                benefit = benefit + 2000;
            }
            if (ch2.isSelected()==true)
            {
                benefit = benefit + 1000;
            }
           if (ch3.isSelected()==true)
            {
                benefit = benefit + 1500;
            }
           if (ch4.isSelected()==true)
            {
                benefit = benefit + 1000;
            }
            if (ch5.isSelected()==true)
            {
                deducn = (DBonus * 2) / 100;
            }
            if (ch6.isSelected()==true)
            {
                deducn += (DBonus * 4) / 100;
            }
int intbonus=(int)DBonus;
int intallowance=(int)allowance;
int intbenefit=(int)benefit;
int intdeducn=(int)deducn;
           int totalSalary = (intbonus + intallowance + intbenefit) - intdeducn;
           String totalS=Integer.toString(totalSalary);
            tTotalSalary.setText(totalS);

            String S1,S2,S3,S4,S5="",S6="",S7="",S8="",S9="",S10="",S11="";
//tBenefits,tDeductions,tTotalSalary;
               S1=cmb_emp_id.getSelectedItem().toString();
               S2=tPerDaySalary.getText();
               S3=LHidden.getText();
               S4=cBonus.getSelectedItem().toString();

       if(ch1.isSelected()==true)
       {
          S5 = "1";
       }
 else
       {
          S5 = "0";
       }
        if(ch2.isSelected()==true)
       {
          S6 = "1";
       }
        else
       {
          S6 = "0";
       }
        if(ch3.isSelected()==true)
       {
          S7 = "1";
       }
        else
       {
          S7 = "0";
       }
       if(ch4.isSelected()==true)
       {
          S8 = "1";
       }
        else
       {
          S8 = "0";
       }
       if(ch5.isSelected()==true)
       {
          S9 = "1";
       }
        else
       {
          S9 = "0";
       }
       if(ch6.isSelected()==true)
       {
          S10 = "1";
       }
        else
       {
          S10 = "0";
       }
       S11=tTotalSalary.getText();

         stmt5.execute("insert into Salarymanagement values('"+S1+"','"+S2+"','"+S3+"','"+S4+"','"+S5+"','"+S6+"','"+S7+"','"+S8+"','"+S9+"','"+S10+"','"+S11+"')");
          JOptionPane.showMessageDialog(f,"Successfully Save");
//cemp_id.removeAllItems();
        


                  JOptionPane.showMessageDialog(f, "PAY SLIP");
  
            }

            catch(Exception obj)
            {
                   JOptionPane.showMessageDialog(f,obj);
            }

             try
           {

        frame1 = new JFrame("Database Employee Payslip");

        //frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setLayout(new BorderLayout());


        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

        table = new JTable();

        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(

                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(

                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

       // from = (String) c1.getSelectedItem().toString();

//String textvalue = textbox.getText();

        String EMPLOYEE_ID = "";
        String MONTHLY_SALARY = "";
        String SALARY_MONTH = "";
        String BONUS = "";
        String HOUSING_ALLOWANCE = "";
        String CONVEYANCE_ALLOWANCE = "";
        String MEDICAL_ALLOWANCE = "";
        String OTHER_ALLOWANCE = "";
        String PF_DEDUCTION = "";
        String INSURANCE_DEDUCTION = "";
        String TOTAL_SALARY = "";

        try {
           
            String S2=cmb_emp_id.getSelectedItem().toString();
             ResultSet rs = stmt5.executeQuery("select * from Salarymanagement where EMPLOYEE_ID='" +S2+ "'");
            int i = 0;
            while (rs.next()) {
                EMPLOYEE_ID = rs.getString("EMPLOYEE_ID");
                MONTHLY_SALARY = rs.getString("MONTHLY_SALARY");
                SALARY_MONTH = rs.getString("SALARY_MONTH");
                BONUS = rs.getString("BONUS");
                HOUSING_ALLOWANCE = rs.getString("HOUSING_ALLOWANCE");
                CONVEYANCE_ALLOWANCE = rs.getString("CONVEYANCE_ALLOWANCE");
                MEDICAL_ALLOWANCE = rs.getString("MEDICAL_ALLOWANCE");
                OTHER_ALLOWANCE = rs.getString("OTHER_ALLOWANCE");
                PF_DEDUCTION = rs.getString("PF_DEDUCTION");
                INSURANCE_DEDUCTION = rs.getString("INSURANCE_DEDUCTION");
                TOTAL_SALARY = rs.getString("TOTAL_SALARY");


                model.addRow(new Object[]{EMPLOYEE_ID,MONTHLY_SALARY,SALARY_MONTH, BONUS, HOUSING_ALLOWANCE,CONVEYANCE_ALLOWANCE, MEDICAL_ALLOWANCE, OTHER_ALLOWANCE, PF_DEDUCTION,INSURANCE_DEDUCTION,TOTAL_SALARY});

                i++;

            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }

        frame1.add(scroll);

        frame1.setVisible(true);

        frame1.setSize(400, 300);

    }
        catch(Exception e3)
        {
          JOptionPane.showMessageDialog(frame1,e3);
        }
      }
  else if(e.getSource()==clear)
    {
       cmb_emp_id.setSelectedIndex(0);
      // tDepName.setText("");
       tFrom.setText("");
       tto.setText("");
       tPerDaySalary.setText("");
       LHidden.setText("");
       tTotalDays.setText("");
       cBonus.setSelectedIndex(0);
       ch1.setSelected(false);
       ch2.setSelected(false);
       ch3.setSelected(false);
       ch4.setSelected(false);
       ch5.setSelected(false);
       ch6.setSelected(false);
       tTotalSalary.setText("");
      

 }
   
 else if(e.getSource()==TotalDays)
      {

String sempid,sfromdate,stodate,sdate,sto;
sempid=cmb_emp_id.getSelectedItem().toString();

int tdays = 0;

 sdate=tFrom.getText();
 sto=tto.getText();
        try {
             fromd =new SimpleDateFormat("mm/dd/yyyy").parse(sdate);
             tod =new SimpleDateFormat("mm/dd/yyyy").parse(sto);
              
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(f,ex);
        }
 sfromdate= new SimpleDateFormat("mm/dd/yyyy").format(fromd);
 stodate= new SimpleDateFormat("mm/dd/yyyy").format(tod);

              
            try
            {
               
                ResultSet rs2=stmt5.executeQuery( "select count(ATTENDANCE) from EmpShift where EMPLOYEE_ID='"+sempid+"' and SHIFT_DATE>='"+sfromdate+"' and SHIFT_DATE<='"+stodate+"' and ATTENDANCE='Present'");
               while(rs2.next())
               {

                     tdays=(rs2.getInt(1));
                     
               }
                String sdays=Integer.toString(tdays);
                tTotalDays.setText(sdays);
               
            }
            catch (Exception obj)
            {
                JOptionPane.showMessageDialog(f,obj);
            }
 }
     
    }
       

   public static void main(String[] args)throws Exception
    {
       
      Salarymanagement obj=new Salarymanagement();
      obj.empSal();

    }
 }