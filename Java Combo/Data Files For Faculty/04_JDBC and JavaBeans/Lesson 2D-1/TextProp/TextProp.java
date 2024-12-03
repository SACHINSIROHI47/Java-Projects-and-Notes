import java.beans.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.Serializable;

public class TextProp extends JPanel implements java.io.Serializable
{
	JTextField TxtField;
	JLabel TxtBean;
	String Str;
	/*Declare the private variables for the JavaBean properties*/
	private String TxtValue="Hello";
	private Font FontValue=new Font("Arial",Font.BOLD,12);
	private Color BackgroundColor=new Color(20,0,255);
	private Color ForegroundColor=new Color(20,0,255);
	/*Define the accessor and mutator methods to change the text of the JavaBean*/
	public String getTxtValue()
	{
		return TxtValue;
	}
	public void setTxtValue(String Str)
	{
		TxtValue=Str;	
		TxtField.setText(TxtValue);
	}
	/*Define the accessor and mutator methods to change the font of the JavaBean*/
	public Font getFontValue()
	{
		return FontValue;
	}
	public void setFontValue(Font NewFont)
	{
		FontValue=NewFont;
		TxtField.setFont(FontValue);
	}
	/*Define the accessor and mutator methods to change the background color of the JavaBean*/
	public Color getBackgroundColor()
	{
		return BackgroundColor;
	}
	public void setBackgroundColor(Color NewColor)
	{
		BackgroundColor=NewColor;
		TxtField.setBackground(BackgroundColor);
	}
	/*Define the accessor and mutator methods to change the foreground color of the JavaBean*/
	public Color getForegroundColor()
	{
		return ForegroundColor;
	}
	public void setForegroundColor(Color NewColor)
	{
		ForegroundColor=NewColor;
		TxtField.setForeground(ForegroundColor);
	}
	/*Define the constructor for the user-defined JavaBean*/
	public TextProp()
	{
		TxtBean=new JLabel("Text Bean");
		TxtField =new JTextField(15);
		add(TxtBean);
		add(TxtField);
	}
}
