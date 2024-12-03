import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class mouseEventClass extends JFrame implements MouseListener, ActionListener
{
	String str = " ";
	int mX = 0 , mY = 0;
	JLabel l;
	JButton b;
   	public mouseEventClass(String strName)
	{
		super(strName);
		getContentPane().setLayout(new FlowLayout());
		JPanel p =new JPanel();
		p.setLayout(new FlowLayout());
		l = new JLabel(str + mX + mY );
		getContentPane().add(l);
		b = new JButton("Quit");
		p.add(b);
		getContentPane().add(p);
		addMouseListener(this);
		b.addActionListener(this);
	}

   	public void mouseClicked(MouseEvent me)
	{
		mX = me.getX();
		mY = me.getY();
		str = "Mouse clicked at:";
		l.setText(str + mY + "," + mX);
		
	}		
	public void mousePressed(MouseEvent me)
	{
		mX = me.getX();
		mY = me.getY();
		str = "Mouse pressed at : ";
		l.setText(str + mX + "," + mY);
	}
       public void mouseReleased(MouseEvent me)
	{
		mX = me.getX();
		mY = me.getY();
		str = "Mouse Released at : ";
		l.setText(str + mX + "," + mY);
	}
       public void mouseEntered(MouseEvent me)
	{
		mX = me.getX();
		mY = me.getY();
		str = "Mouse entered at : ";
		l.setText(str + mX + "," + mY);
	}	
       public void mouseExited(MouseEvent me)
	{
		mX = me.getX();
		mY = me.getY();
		str = "Mouse Exited at : ";
		l.setText(str + mX + "," + mY);
	}	
       public void actionPerformed(ActionEvent ae)
	{
		String s= ae.getActionCommand();
		if ( "Quit".equals(s))
		{
			System.exit(0);
		}
	} 
    public static void main(String args[])
    {
		mouseEventClass ME = new 
                mouseEventClass("MouseEvents");
		ME.setSize(300,300);
		ME.setVisible(true);
    }
}
