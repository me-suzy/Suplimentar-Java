/*
 * DeclaratiiVariabileLocale.java
 *
 * Created on August 29, 2004, 7:49 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class DeclaratiiVariabileLocale {
    public static void main(String[] args) {
        int a,b,c = (a = 1 + (b = 2)) + 1;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
    
    /** Creates a new instance of DeclaratiiVariabileLocale */
    public DeclaratiiVariabileLocale() {
    }
    
}
