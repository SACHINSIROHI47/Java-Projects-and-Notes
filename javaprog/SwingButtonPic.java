import javax.swing.*;

public class SwingButtonPic
{
	public static void main(String[] args) 
	{
		JFrame myframe1;
		JButton btnShow;
		Icon img1 = new ImageIcon("BANNER.gif");
		btnShow = new JButton("Show",img1);
		btnShow.setToolTipText("This Button shows a Message");
		myframe1 = new JFrame("Welcome to Swing");
		myframe1.getContentPane().add(btnShow);
		myframe1.setSize(250,200);
		myframe1.show();
	}
}
