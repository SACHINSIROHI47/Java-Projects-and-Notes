/*
 * Greeting.java
 *
 * Created on November 26, 2005, 1:31 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Greeting {
    
    public String message;
    
    /** Creates a new instance of Greeting */
    public Greeting(String msg) {
        message = msg;
    }

    public Greeting() {
        message = "Hello";
    }
    
    public void greet() {
        System.out.println(message);
    }
}
