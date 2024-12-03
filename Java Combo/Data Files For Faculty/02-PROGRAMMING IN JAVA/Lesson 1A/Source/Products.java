interface ItemCount //Defining the interface.
{
//Defining abstract methods in the Billing interface. 
public void noOfItems();
}

class SoftwareProducts implements ItemCount
{
// Defining the data members. 
int os= 60;
int oracle = 20;
int jav = 15;
int tot;
//Defining the methods. 
public void calculate()
{
tot = os + oracle + jav;
}
public void noOfItems() // Method declared publicly in the interface.
{
System.out.println();
System.out.println("  "+"Total number of software products purchased is : "+ tot);} 
}
class HardwareProducts implements ItemCount
{
// Defining the data members. 
int printer = 20;
int speaker = 12;
int harddisk =  25;
int htot;
public void calculate1()
{
htot = printer + speaker + harddisk;
}
public void noOfItems()// The method is declared publicly in the interface, Billing.
{
System.out.println();
System.out.println("  "+"Total number of hardware items purchased is : " +htot);
} 
}

class Products
{
public static void main(String args[])
{
//Creating an object of the class, Hardware.
SoftwareProducts s = new SoftwareProducts();
HardwareProducts h = new HardwareProducts();
s.calculate();
h.calculate1();
s.noOfItems();
h.noOfItems();
}
}
