package oaeg.java;
import java.awt.*;
import javax.swing.*;
public class loginform 
{
    loginform()
    {
        JFrame f=new JFrame("Login Form");
        f.setLayout(null);
        f.setSize(600, 600);       
        f.getContentPane().setBackground(Color.cyan);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    public static void main(String[] args) 
    {
       loginform obj=new loginform();
    }
    
}
