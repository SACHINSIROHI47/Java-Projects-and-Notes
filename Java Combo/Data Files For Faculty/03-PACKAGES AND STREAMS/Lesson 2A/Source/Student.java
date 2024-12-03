import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
/* <applet code = "Student.class" height =200 width = 400>
</applet> */
public class Student extends JApplet implements ActionListener
{
JTextField tName;
JTextField tCourse;
JTextField tSubject;
JPasswordField tPassword;
JButton button;
public void init()
{
createApplet();
}
public void createApplet()
{
Container con;
con = getContentPane();
con.setLayout(new FlowLayout());
JLabel lName;
JLabel lPassword;
JLabel lCourse;
JLabel lSubject;
lName = new JLabel("Student Name:");
tName = new JTextField(10);
lCourse = new JLabel("Course:");
tCourse = new JTextField(10);
lSubject = new JLabel("Subject:");
tSubject = new JTextField(10);
lPassword = new JLabel("Password:");
tPassword = new JPasswordField(10);
button = new JButton("Submit");
con.add(lName);
con.add(tName);
con.add(lPassword);
con.add(tPassword);
con.add(lCourse);
con.add(tCourse);
con.add(lSubject);
con.add(tSubject);
con.add(button);
button.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
Object o = e.getSource();
if(o == button)
{
String s = "Student " +tName.getText()+ "Course" +tCourse.getText()+ "Subject" +tSubject.getText();
	try
	{
RandomAccessFile lFile = new RandomAccessFile("stud.txt","rw");
	lFile.seek(lFile.length());
	lFile.writeBytes(s);
	} catch(IOException ie)
	{
	showStatus("Unable to write in log file" +ie);
	}
	}
	}
}
