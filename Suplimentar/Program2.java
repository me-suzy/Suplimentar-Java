/*
 * Program2.java
 *
 * Created on September 14, 2004, 8:23 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class Program2 {
    static int x = 6;
    public static void main(String[] args) {
        System.out.print("x = " + x);
        int x = (x = 3) * x;
        System.out.print(",x = " + x);
    }
    
    /** Creates a new instance of Program2 */
    public Program2() {
    }
    
}
