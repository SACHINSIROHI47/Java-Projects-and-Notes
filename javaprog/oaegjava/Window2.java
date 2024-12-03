import javax.swing.*;
class Window2
{
	public static void main(String args[])
	{
		JFrame obj = new JFrame("Welcome To RGPG");
		JButton btn1 = new JButton("OK");
		obj.getContentPane().add(btn1);
		obj.setSize(300,250);
		obj.setVisible(true);
	}
}
	