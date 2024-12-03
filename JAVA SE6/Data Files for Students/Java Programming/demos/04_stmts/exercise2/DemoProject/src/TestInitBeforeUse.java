public class TestInitBeforeUse {    
    public void doComputation() {
        int x = (int)(Math.random() * 100);
        int y;
        int z;
        if (x > 50) {
            y = 9;
        }
        z = y + x;  // Possible use before initialization
        System.out.println(z);
    }
    
    public static void main(String[] args) {
        new TestInitBeforeUse().doComputation();
    }
}
