import java.beans.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.Serializable;
public class LabelProp extends JPanel implements java.io.Serializable
{

/* Declare the variables to create the user-interface of the JavaBean. */
JLabel l1;
private String caption="Send";
/* Define the constructor of the JavaBean*/
public LabelProp ()
{
l1=new JLabel("Send");
add(l1);
}
/* Define the get method to retrieve the value of caption property of the JavaBean*/
public String getCaption ()
{
return caption;
}
/*Define the set method to specify the value of caption property of the JavaBean.*/
public void setCaption(String s)
{
caption=s;
l1.setText(caption);
}

}
