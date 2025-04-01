/*
 * DeclaratiiVariabileLocale1.java
 *
 * Created on August 29, 2004, 7:52 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class DeclaratiiVariabileLocale1 {
    static int x = 6;
    public static void main(String[] args) {
        System.out.println("x = " + x);
        int x = (x = 3) * 4;
        System.out.println("x = " + x);
    }
    
    /** Creates a new instance of DeclaratiiVariabileLocale1 */
    public DeclaratiiVariabileLocale1() {
    }
    
}
