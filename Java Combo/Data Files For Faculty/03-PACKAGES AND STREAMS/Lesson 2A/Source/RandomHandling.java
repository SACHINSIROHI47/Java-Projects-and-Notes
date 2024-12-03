import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
/* <applet code = "RandomHandling.class" height =200 width = 400>
</applet> */
public class RandomHandling extends JApplet implements ActionListener
{
JTextField tName;
JPasswordField tPassword;
JButton button;
Date date;
GregorianCalendar gCal;
public void init()
{
createApplet();
}
public void createApplet()
{
Container con;
con = getContentPane();
con.setLayout(new FlowLayout());
JLabel luserName;
JLabel lPassword;
luserName = new JLabel("User Name:");
tName = new JTextField(10);
lPassword = new JLabel("Password:");
tPassword = new JPasswordField(10);
button = new JButton("OK");
con.add(luserName);
con.add(tName);
con.add(lPassword);
con.add(tPassword);
con.add(button);
button.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
Object o = e.getSource();
if(o == button)
{
date = new Date();
gCal = new GregorianCalendar();
gCal.setTime(date);
String s = "User" +tName.getText()+ "Logged in:" +gCal.get(Calendar.MINUTE)+ "Date:" +gCal.get(Calendar.MONTH)+ "/" +gCal.get(Calendar.DATE)+ "/" +gCal.get(Calendar.YEAR);
	try
	{
RandomAccessFile lFile = new  RandomAccessFile("userlog.txt","rw");
	lFile.seek(lFile.length());
	lFile.writeBytes(s);
	} catch(IOException ie)
	{
	showStatus("Unable to write in log file" +ie);
	}
	}
	}
}
