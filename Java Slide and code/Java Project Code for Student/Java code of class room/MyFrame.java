import java.awt.* ;
import java.awt.event.* ;
import javax.swing.*;
import java.sql.*;

class MyFrame extends JFrame implements ActionListener
{
JFrame ff;
JButton b;
JTextField t;
JPasswordField t2;
JLabel nm,pwd;
String str1,str2,sstr1,sstr2;

Connection con;
Statement stmt;
ResultSet rs;

MyFrame()
{
ff=new JFrame();
ff.setLayout(null);
ff.setSize(500,500);
ff.setBackground(Color.magenta);

nm=new JLabel("Login Name:");
nm.setBounds(10,50,100,30);

pwd=new JLabel("Password:");
pwd.setBounds(10,100,100,30);

t=new JTextField();
t.setBounds(120,50,150,30);

t2=new JPasswordField();
t2.setBounds(120,100,150,30);

b=new JButton("OK");
b.setBounds(90,170,100,30);

ff.add(nm);
ff.add(t);
ff.add(pwd);
ff.add(t2);
ff.add(b);
b.addActionListener(this);
ff.setVisible(true);
ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{    
    str1=t.getText();
    str2=t2.getText();
if(e.getSource()==b)
{    
    try
{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con = DriverManager.getConnection("jdbc:odbc:aa","sa","sqlserver");
	stmt = con.createStatement();
        rs=stmt.executeQuery("select u_name,u_pwd from login1");
        while (rs.next())
		{
        sstr1=rs.getString("u_name");
        sstr2=rs.getString("u_pwd");
                }
       if(str1.equals(sstr1)&& str2.equals(sstr2))
       {
        JOptionPane.showMessageDialog(ff, "Login Successfully");
        Registration2 ob=new Registration2();
        ob.show();
        this.dispose();
       }
       else
       {
           JOptionPane.showMessageDialog(ff, "Invalid password");
       }
}
catch(Exception ee)
{
JOptionPane.showMessageDialog(ff,"Connection Not Established","Alert",
        JOptionPane.WARNING_MESSAGE);
}   }  
}
public static void main(String[] args)
{
MyFrame pw= new MyFrame();
}
}


