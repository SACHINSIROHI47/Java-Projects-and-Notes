import java.awt.*;

class flow2 extends Frame 
{
	Panel p1;
	Button b1,b2,b3,b4,b5;
	FlowLayout fLayout;
		
	flow2()
	{
		super("My window");
		p1 = new Panel();
		p1.setBackground(Color.green);
		b1 = new Button("OK");
		b2 = new Button("HELP");
		b3 = new Button("EXIT");
		b4 = new Button("CLOSE");
		b5 = new Button("SAVE");
		fLayout = new FlowLayout(FlowLayout.LEFT,30,30);	
		p1.setLayout(fLayout); 	
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		add(p1);
		setSize(606,606);
		setVisible(true);

	}
	public static void main(String args[])
	{
		flow2 f2 = new flow2();
	}

}