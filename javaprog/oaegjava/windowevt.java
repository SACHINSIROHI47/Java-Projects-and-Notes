import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class windowevt  extends Frame 
{
public windowevt(String title)
{
	super(title);
}

	public static void main(String args[])
	{
		windowevt frame1;
		frame1 = new windowevt("Welcome");
		frame1.setSize(200,200);
		frame1.setVisible(true);
		MyWindowListener W1;
		W1 = new MyWindowListener();
		frame1.addWindowListener(W1);
		
	}
	}

	class  MyWindowListener implements WindowListener
	{	
	public void windowClosing(WindowEvent w)
	{
		JOptionPane.showMessageDialog(null,"Window is Closing");
		System.exit(0);
	}
	public void windowClosed(WindowEvent w)
	{
	JOptionPane.showMessageDialog(null,"Window is Closed");
	}
	public void windowOpened(WindowEvent w)
	{
	JOptionPane.showMessageDialog(null,"Window is Opened");
	}
	public void windowIconified(WindowEvent w)
	{
		JOptionPane.showMessageDialog(null,"Window is Iconified");
	}
	public void windowDeiconified(WindowEvent w)
	{
	JOptionPane.showMessageDialog(null,"Window is Deiconified");
	}
	public void windowActivated(WindowEvent w)
	{
	//JOptionPane.showMessageDialog(null,"Window is Activated");
	}
	public void windowDeactivated(WindowEvent w)
	{
	JOptionPane.showMessageDialog(null,"Window is Deactivated");
	}
}

	
