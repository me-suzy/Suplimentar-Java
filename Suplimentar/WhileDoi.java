/*
 * WhileDoi.java
 *
 * Created on September 3, 2004, 5:12 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class WhileDoi {
    public static int f(int n) {
        return (int)(Math.random() * n);
    }
    
public static void main(String args[]) {
    int i = 0;
    while (f(5) != 1) i++; 
    System.out.println(" Au fost "  + i + " iteratii.");
}

    /** Creates a new instance of WhileDoi */
    public WhileDoi() {
    }
    
}
