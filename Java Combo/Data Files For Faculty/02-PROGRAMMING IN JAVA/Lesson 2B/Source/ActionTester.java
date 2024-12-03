import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionTester extends JFrame implements ActionListener
{	
	JButton b1, b2;
	JLabel lbl;
	int clicked;
	final String str = " Number of times button clicked = ";

 	public ActionTester(String strName)
    	{	
		super(strName);
        	getContentPane().setLayout(new FlowLayout());
		JPanel p = new JPanel();		
		b1 = new JButton("Click Me");
		b2 = new JButton("Quit");
		p.setLayout( new FlowLayout() );
		p.add(b1);
		p.add(b2);
		lbl = new JLabel(str + clicked, JLabel.CENTER);
		getContentPane().add(p);
		getContentPane().add(lbl);
		b1.addActionListener(this);
		b2.addActionListener(this);
   	}

 	public void actionPerformed(ActionEvent ae)
       {
		String s = ae.getActionCommand();
		if("Click Me".equals(s))
	  	{
			clicked++;
			lbl.setText(str + clicked);
	  	}
		if("Quit".equals(s) )
		{
			System.exit(0);
        	}
     	}

  	public static void main(String args[])
    	{
		ActionTester t = new ActionTester("Action Events");
		t.setSize(300,300);
		t.setVisible(true);
    	}
}
