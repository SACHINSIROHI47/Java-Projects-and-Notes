
import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Registration2 extends JFrame implements ActionListener,
        WindowFocusListener
{
  
  
JFrame ff;
JLabel heading,lregid,lsname,lsfname,lgender,lqul,ladd,lcat;
Font ft;
JButton back,rst,sav,search,update,delete;
JTextField tregid,tsname,tsfname;
JRadioButton rgender,rgender2; 
JComboBox cqul,caste,csearch;
ButtonGroup bg;
JTextArea tadd;
String str1,str2,str3,str4,str5,str6,str7;
String rgid,sname,sfather,gender,qual,addrs,cat;

Connection con;
PreparedStatement ps;
Statement st;
ResultSet rs;

Registration2()
{
ff=new JFrame();
ff.setLayout(null);
ff.setSize(550,550);
ff.setBackground(Color.pink);

heading=new JLabel("Registraion Form");
heading.setBounds(130,20,200,30);
heading.setFont(new Font("Lucida Handwriting",Font.BOLD,15));

lregid=new JLabel("RegId");
lregid.setBounds(80, 50,100, 30);
lsname=new JLabel("Student Name");
lsname.setBounds(80, 100,100, 30);
lsfname=new JLabel("Student Father's Name");
lsfname.setBounds(80, 150,150, 30);
lgender=new JLabel("Gender");
lgender.setBounds(80, 200,150, 30);
lqul=new JLabel("Qualification");

lqul.setBounds(80, 250,150, 30);
ladd=new JLabel("Address");
ladd.setBounds(80,300,150,30);
lcat=new JLabel("Category");
lcat.setBounds(80,360,150,30);


tregid=new JTextField();
tregid.setBounds(230,50,120,30);
csearch=new JComboBox();
csearch.setBounds(370,50,120,30);

tsname=new JTextField();
tsname.setBounds(230,100,120,30);
tsfname=new JTextField();
tsfname.setBounds(230,150,120,30);
rgender=new JRadioButton("Male");
rgender.setBounds(230,200,70,30);
rgender2=new JRadioButton("Female");
rgender2.setBounds(300,200,100,30);
bg=new ButtonGroup();
bg.add(rgender);
bg.add(rgender2);
cqul=new JComboBox();
cqul.addItem("B.Tech");
cqul.addItem("M.Tech");
cqul.addItem("BCA");
cqul.addItem("MCA");
cqul.addItem("Doploma OAEG");
cqul.setBounds(230,250,120,30);
tadd=new JTextArea();
tadd.setBounds(230,300,120,50);

caste=new JComboBox();
caste.addItem("GEN");
caste.addItem("OBC");
caste.addItem("SC/ST");
caste.addItem("OTHERS");
caste.setBounds(230,360,120,30);

back=new JButton("BACK");
back.setBounds(70,420,80,35);
rst=new JButton("RESET");
rst.setBounds(170,420,80,35);
sav=new JButton("SAVE");
sav.setBounds(270,420,80,35);
search=new JButton("Search");
search.setBounds(370,100,120,30);
update=new JButton("Update");
update.setBounds(120,470,80,35);
delete=new JButton("Delete");
delete.setBounds(230, 470,80,35);



ff.add(heading);
ff.add(lregid);
ff.add(tregid);
ff.add(csearch);
ff.add(lsname);
ff.add(tsname);
ff.add(lsfname);
ff.add(tsfname);
ff.add(lgender);
ff.add(rgender);
ff.add(rgender2);
ff.add(lqul);
ff.add(cqul);
ff.add(ladd);
ff.add(tadd);
ff.add(lcat);
ff.add(caste);

ff.add(back);
ff.add(rst);
ff.add(sav);
ff.add(search);
ff.add(update);
ff.add(delete);
back.addActionListener(this);
rst.addActionListener(this);
sav.addActionListener(this);
search.addActionListener(this);
update.addActionListener(this);
delete.addActionListener(this);
ff.addWindowFocusListener(this);
ff.setVisible(true);
}
        public void windowOpened(WindowEvent we)
        {
        
        }
	public void windowClosing(WindowEvent we) { }
	public void windowIconified(WindowEvent we) { }
	public void windowDeiconified(WindowEvent we) { }
	public void windowClosed(WindowEvent we) { }
	public void windowActivated(WindowEvent we) { }
	public void windowDeactivated(WindowEvent we) { }
        public void windowGainedFocus(WindowEvent e)
        {
         
            
        try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:aa","sa","sqlserver");
			st = con.createStatement();
			rs = st.executeQuery("select regid from registraion");

			while (rs.next())
			{
				String ac = rs.getString("regid");
				csearch.addItem(ac);
			}
			con.close();
		}
		catch (Exception ec)
		{
			System.out.println(ec);
		}
        }
        public void windowLostFocus(WindowEvent e){}

public void actionPerformed(ActionEvent e)
{
   
    
    rgid=tregid.getText();
    sname=tsname.getText();
    sfather=tsfname.getText();
    if(rgender.isSelected()==true)
			{
			gender = "Male";
			}
			else
			{
			gender = "Female";
			}
       
   qual=(String) cqul.getSelectedItem();
   addrs=tadd.getText();
   cat=(String)caste.getSelectedItem();
   
   
   
   
    if(e.getSource()==back)
    {
        MyFrame pw= new MyFrame();
        pw.show();
        ff.dispose();
    }
    if(e.getSource()==rst)
    {
                tregid.setText("");
		tsname.setText("");
		tsfname.setText("");
		tadd.setText("");
		JOptionPane.showMessageDialog(ff, "Record has been clear");
            
    }
    if(e.getSource()==sav)
    {
        try
        {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con = DriverManager.getConnection("jdbc:odbc:aa","sa","sqlserver");
	ps = con.prepareStatement("insert into registraion values(?, ?, ?, ?,?,?,? )");
	
		ps.setString(1, rgid);
		ps.setString(2, sname);
		ps.setString(3, sfather);
		ps.setString(4, gender);
                ps.setString(5, qual);
		ps.setString(6, addrs);
		ps.setString(7, cat);
	ps.executeUpdate();
        
        JOptionPane.showMessageDialog(ff, "Form submit successfully");
        }
        catch(Exception ee)
        {
         JOptionPane.showMessageDialog(ff,"Connection Not Established","Alert",
        JOptionPane.WARNING_MESSAGE); 
        }
    }  
    if(e.getSource()==search)
    {  try
        {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con = DriverManager.getConnection("jdbc:odbc:aa","sa","sqlserver");
       st = con.createStatement();
       rs=st.executeQuery("select s_name from registraion where "
               + "regid='"+csearch.getSelectedItem()+"'");
        while (rs.next())
		{
              str2=rs.getString("s_name");
                }
              tsname.setText(str2);
       
       JOptionPane.showMessageDialog(ff, "Search successfully");  
        }
        catch(Exception e3)
        {
        JOptionPane.showMessageDialog(ff,"Connection Not Established","Alert",
        JOptionPane.WARNING_MESSAGE);     
        }
    }
    if(e.getSource()==update)
    {
         try
        {
          
        String dl,fn,add;
        dl=tregid.getText();
        fn=tsfname.getText();
        add=tadd.getText();
        System.out.println(dl);
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con = DriverManager.getConnection("jdbc:odbc:aa","sa","sqlserver");
       st = con.createStatement();
       st.executeUpdate("update registraion set s_fname='"+fn+"',addres='"+add+"' where regid ='"+dl+"'");
       JOptionPane.showMessageDialog(ff, "Update successfully");   
        }
          catch(Exception e5)
        {
            JOptionPane.showMessageDialog(ff, "Update not successfully");  
        }
    }
    if(e.getSource()==delete)
    {
        
        try
        {
            String dl;
        dl=tregid.getText();
        System.out.println(dl);
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con = DriverManager.getConnection("jdbc:odbc:aa","sa","sqlserver");
       st = con.createStatement();
       st.executeQuery("delete from registraion where regid='"+dl+"'");
       
        }
        catch(Exception e4)
        {
            JOptionPane.showMessageDialog(ff, "Delete successfully");  
        }
      
    }
}
public static void main(String ar[])
{
Registration2 ob=new Registration2();
}
}
