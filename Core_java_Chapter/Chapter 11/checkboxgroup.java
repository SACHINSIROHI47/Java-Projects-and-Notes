import java.awt.*;
import java.applet.Applet;
public class checkboxgroup extends Applet
{
public void init() 
{
CheckboxGroup cbg = new CheckboxGroup();
Checkbox c1 = new Checkbox ("Yes", cbg, true);
Checkbox c2 = new Checkbox ("No", cbg, false);
Label l1=new Label("Option ");
Label l2=new Label("Category ");

CheckboxGroup cbg2 = new CheckboxGroup();
Checkbox cc1 = new Checkbox ("GEN", cbg2, false);
Checkbox cc2 = new Checkbox ("OBC", cbg2, false);
Checkbox cc3 = new Checkbox ("SC", cbg2, false);
Checkbox cc4 = new Checkbox ("ST", cbg2, false);
//cbg.setBounds(50,50,200,200);
add(l1);
add(c1);
add(c2);
add(l2);
add(cc1);
add(cc2);
add(cc3);
add(cc4);



}
}
/*<applet code=checkboxgroup width=500 height=500></applet>*/
