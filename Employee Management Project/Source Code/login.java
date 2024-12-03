import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class login implements ActionListener
{
JFrame f1;
JLabel l1,l2,l3;
JTextField t1;
JPasswordField t2;
JButton b1,b2;
ImageIcon ig;	

	public login()
	{
		f1 = new JFrame("Login");
		f1.setLayout(null);
		
		l1 = new JLabel("Enter ID");
		l1.setBounds(50,20,100,30);
		l1.setFont(new Font("Lucida Handwriting",Font.BOLD,15));
		l2 = new JLabel("Enter Password");
		l2.setFont(new Font("Lucida Handwriting",Font.BOLD,15));
		l2.setBounds(50,80,150,30);		

		ig = new ImageIcon("D:\\project\\images\\login.png");
		l3 = new JLabel(ig);
		l3.setBounds(20,100,150,150);

		t1 = new JTextField();
		t1.setFont(new Font("Lucida Handwriting",Font.BOLD,15));
		t1.setBounds(220,20,150,30);
		t2 = new JPasswordField();
		t2.setBounds(220,80,150,30);

		b1 = new JButton("OK");
		b1.setFont(new Font("Lucida Handwriting",Font.BOLD,15));
		b1.setBounds(170,180,100,30);
		b2 = new JButton("Cancel");
		b2.setFont(new Font("Lucida Handwriting",Font.BOLD,15));
		b2.setBounds(290,180,100,30);
		b1.addActionListener(this);
		b2.addActionListener(this);

		f1.add(l1);
		f1.add(l2);
		f1.add(t1);
		f1.add(t2);
		f1.add(b1);
		f1.add(b2);
		f1.add(l3);

		f1.setBounds(615,375,450,300);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			if(t1.getText().equals("a")&&t2.getText().equals("a"))
			{
			mainform ob = new mainform();
			f1.dispose();
			}
			else
			{
			JOptionPane.showMessageDialog(f1,"Invalid UserId or Password","Alert",JOptionPane.WARNING_MESSAGE);
			}
		}
		if(ae.getSource()==b2)
		{
			System.exit(0);
		}
	}

	public static void main(String args[])
	{
		login ob = new login();
	}
}