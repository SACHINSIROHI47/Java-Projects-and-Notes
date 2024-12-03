import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CardExample implements ActionListener 
{
	private JFrame f;
	JPanel panel1;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	CardLayout card1;

	public CardExample() 
	{
		f = new JFrame("GUI example");
		panel1 = new JPanel();
		card1 = new CardLayout();
		panel1.setLayout(card1);
		b1 = new JButton("Button 1");
		b2 = new JButton("Button 2");
		b3 = new JButton("Button 3");
		b4 = new JButton("Button 4");
		b5 = new JButton("Button 5");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
	}

	public void launchFrame() 
	{
		
		panel1.add(b1,"bt1");
		panel1.add(b2,"bt2");
		panel1.add(b3,"bt3");
		panel1.add(b4,"bt4");
		panel1.add(b5,"bt5");

		f.add(panel1);
		
		f.pack();
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
 	{
		card1.next(panel1);
		//card1.previous(panel1);
		//card1.show(panel1,"bt3");

	}

	public static void main(String args[]) 
	{
		CardExample guiWindow = new CardExample();
		guiWindow.launchFrame();
	}

 } // end of FlowExample class
