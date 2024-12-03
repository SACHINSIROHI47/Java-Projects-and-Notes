import java.awt.*;

public class AWTButton
{
	public static void main(String[] args) 
	{
		Frame myframe1;
		myframe1 = new Frame("Welcome to AWT");
		Button btnShow;
		btnShow = new Button("Show");
		myframe1.add(btnShow);
		myframe1.setSize(250,200);
		myframe1.setVisible(true);
	}
}
