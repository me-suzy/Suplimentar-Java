/*
 * Asignare.java
 *
 * Created on September 14, 2004, 7:55 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class Asignare {
    
    /** Creates a new instance of Asignare */
    public Asignare() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3;
        int b = (a = 2) * a;
        int c = b * (b = 5);
        System.out.println("a = " + a + ",b = " + b +", c = " + c);
        // TODO code application logic here
    }
    
}
