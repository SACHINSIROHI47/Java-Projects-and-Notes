package empmanagement;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Vector;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpShift implements ActionListener
{

    JFrame f;
    JPanel p1;
    JLabel heading, cemp_id, LEmpName, cShiftType, LShiftDate, LShift_ID, LDep_Id, LDeptName,LDate,dateformate;
    JTextField tEmpName, tShiftType, tShiftDate, tDep_Id, tDeptName;
    JComboBox cmb_emp_id, cmb_shift_type, cShift_ID;
    JButton save, clear, search;
    JRadioButton dt1,dt2;
    ButtonGroup bg2;
    Statement stmt4;
    Date date;
    String eid, esid;

    EmpShift() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:aa", "sa", "sqlserver");
            stmt4 = con.createStatement();
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(f, e1);
        }
    }

    public void empShift() throws Exception {
        f = new JFrame("EMPLOYEE SHIFT SCHEDULE");
        f.setLayout(null);
        f.setSize(690, 730);
        f.getContentPane().setBackground(Color.DARK_GRAY);

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(40, 40, 600, 620);
        p1.setBackground(Color.LIGHT_GRAY);

        heading = new JLabel("EMPLOYEE SHIFT SCHEDULE");
        heading.setBounds(80, 20, 600, 40);
        heading.setFont(new Font("Cambria", Font.ITALIC, 35));
        p1.add(heading);

        cemp_id = new JLabel("EMPLOYEE ID");
        cemp_id.setBounds(40, 100, 200, 30);
        cemp_id.setFont(new Font("Times new roman", Font.BOLD, 22));

        p1.add(cemp_id);


        try {
            ResultSet rs = stmt4.executeQuery("select EMPLOYEE_ID from EmpDetails");

            Vector v = new Vector();

            while (rs.next()) {

                eid = rs.getString(1);

                v.add(eid);

            }

            cmb_emp_id = new JComboBox(v);
            cmb_emp_id.setBounds(350, 100, 200, 25);
            cmb_emp_id.addActionListener(this);
            p1.add(cmb_emp_id);

            rs.close();

        } catch (Exception ob) {
            JOptionPane.showMessageDialog(f, ob);
        }



        LEmpName = new JLabel("EMPLOYEE NAME");
        LEmpName.setBounds(40, 150, 250, 30);
        LEmpName.setFont(new Font("Times new roman", Font.BOLD, 22));
        p1.add(LEmpName);

        tEmpName = new JTextField();
        tEmpName.setBounds(350, 150, 200, 25);
        tEmpName.setEditable(false);
        p1.add(tEmpName);

        cShiftType = new JLabel("SHIFT TYPE");
        cShiftType.setBounds(40, 200, 200, 30);
        cShiftType.setFont(new Font("Times new roman", Font.BOLD, 22));
        p1.add(cShiftType);

        cmb_shift_type = new JComboBox();
        cmb_shift_type.addItem("DAY");
        cmb_shift_type.addItem("NIGHT");
        cmb_shift_type.addItem("DAY AND NIGHT");
        cmb_shift_type.setBounds(350, 200, 200, 25);
        p1.add(cmb_shift_type);

        LShiftDate = new JLabel("SHIFT DATE");
        LShiftDate.setBounds(40, 250, 200, 30);
        LShiftDate.setFont(new Font("Times new roman", Font.BOLD, 22));
        p1.add(LShiftDate);

        dateformate = new JLabel("(mm/dd/yyyy)");
        dateformate.setBounds(190, 250, 200, 30);
        dateformate.setFont(new Font("arial", Font.BOLD,12));
        p1.add(dateformate);

        tShiftDate = new JTextField();
        tShiftDate.setBounds(350, 250, 200, 25);
        p1.add(tShiftDate);

        LShift_ID = new JLabel("SHIFT ID");
        LShift_ID.setBounds(40, 300, 200, 30);
        LShift_ID.setFont(new Font("Times new roman", Font.BOLD, 22));
        p1.add(LShift_ID);

        try {
            ResultSet rs6 = stmt4.executeQuery("select SHIFT_ID from EmpShift");

            Vector a = new Vector();

            while (rs6.next()) {

                esid = rs6.getString(1);

                a.add(esid);

            }

            cShift_ID = new JComboBox(a);
            cShift_ID.setBounds(350, 300, 200, 25);
            cShift_ID.setEditable(true);
            p1.add(cShift_ID);

            rs6.close();

        } catch (Exception ob2) {
            JOptionPane.showMessageDialog(f, ob2);
        }

        LDep_Id = new JLabel("DEPARTMENT ID");
        LDep_Id.setBounds(40, 350, 250, 30);
        LDep_Id.setFont(new Font("Times new roman", Font.BOLD, 22));
        p1.add(LDep_Id);

        tDep_Id = new JTextField();
        tDep_Id.setBounds(350, 350, 200, 25);
        tDep_Id.setEditable(false);
        p1.add(tDep_Id);

        LDeptName = new JLabel("DEPARTMENT NAME");
        LDeptName.setBounds(40, 400, 250, 30);
        LDeptName.setFont(new Font("Times new roman", Font.BOLD, 22));
        p1.add(LDeptName);

        tDeptName = new JTextField();
        tDeptName.setBounds(350, 400, 200, 25);
        tDeptName.setEditable(false);
        p1.add(tDeptName);

       LDate= new JLabel("ATTENDANCE");
       LDate.setBounds(40, 460, 250, 20);
       LDate.setFont(new Font("Times new roman",Font.BOLD,22));
       p1.add(LDate);

     dt1=new JRadioButton();
     dt1.setText("Present");
     dt1.setBounds(300,460,120,20);
     p1.add(dt1);

     dt2=new JRadioButton();
     dt2.setText("Absent");
     dt2.setBounds(450,460,120,20);
     p1.add(dt2);

      bg2=new ButtonGroup();
      bg2.add(dt1);
      bg2.add(dt2);


        save = new JButton("SAVE");
        save.setBounds(40, 520, 120, 40);
        save.setFont(new Font("Times new roman", Font.BOLD, 22));
        save.addActionListener(this);
        p1.add(save);
/*
        search = new JButton("SEARCH");
        search.setBounds(220, 580, 150, 40);
        search.setFont(new Font("Times new roman", Font.BOLD, 22));
        //search.addActionListener(this);
        p1.add(search);*/

        clear = new JButton("CLEAR");
        clear.setBounds(180, 520, 120, 40);
        clear.setFont(new Font("Times new roman", Font.BOLD, 22));
        clear.addActionListener(this);
        p1.add(clear);



        f.add(p1);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String ss1, ss2, ss3, ss4, ss5, ss6, ss7,sdate;
       

        if (e.getSource() == save) {
             sdate=tShiftDate.getText();
        try {
             date = new SimpleDateFormat("mm/dd/yyyy").parse(sdate);

        } 
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(f,ex);
        }

            try {
                //JOptionPane.showMessageDialog(f, cShift_ID.getSelectedItem());
 String strAttendance = "";
                    if(dt1.isSelected()== true)
                    {
                        strAttendance = "Present";
                    }
                    if (dt2.isSelected()== true)
                    {
                        strAttendance = "Absent";
                    }

                ss1 = cmb_emp_id.getSelectedItem().toString();
                ss2 = cmb_shift_type.getSelectedItem().toString();
               ss3= new SimpleDateFormat("mm/dd/yyyy").format(date);
                ss4 = cShift_ID.getSelectedItem().toString();

                stmt4.execute("insert into EmpShift values('" + ss1 + "','" + ss2 + "','" + ss3 + "','" + ss4 + "','"+strAttendance+"')");
                JOptionPane.showMessageDialog(f, "Successfully Save");
                cShift_ID.removeAllItems();
                ResultSet rs = stmt4.executeQuery("select SHIFT_ID from EmpShift");
                while (rs.next()) {

                    cShift_ID.addItem(rs.getString("SHIFT_ID"));

                }

            } catch (Exception e3) {
                JOptionPane.showMessageDialog(f, e3);
            }
        } else if (e.getSource() == clear) {
            cmb_emp_id.setSelectedIndex(0);
            tEmpName.setText("");
            cmb_shift_type.setSelectedIndex(0);
            tShiftDate.setText("");
            cShift_ID.setSelectedIndex(0);
            tDep_Id.setText("");
            tDeptName.setText("");
        } else if (e.getSource() == cmb_emp_id) {
            String es1;
            es1 = cmb_emp_id.getSelectedItem().toString();
            try {

                ResultSet rs = stmt4.executeQuery("select * from EmpDetails where EMPLOYEE_ID='" + es1 + "'");
                if (rs.next()) {
                    tEmpName.setText(rs.getString("EMPLOYEE_NAME"));

                    tDeptName.setText(rs.getString("DEP_NAME"));

                    tDep_Id.setText(rs.getString("DEPARTMENT_ID"));

                }
            } catch (Exception e4) {
                JOptionPane.showMessageDialog(f, e4);
            }
        }

    }

    public static void main(String[] args) throws Exception {
        EmpShift obj = new EmpShift();
        obj.empShift();
    }
}
