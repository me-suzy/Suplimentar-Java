/*
 * ExceptiiNumerice.java
 *
 * Created on August 27, 2004, 6:46 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class ExceptiiNumerice {
    public static void main(String args[]) {
        int a = 3, b = 0;
        try {
        System.out.println("a / b = " + a / b);
    }
    catch (ArithmeticException e) {
        System.out.println("Nu este permisa impartirea la zero:" + e.getMessage());
    }
}
    
    /** Creates a new instance of ExceptiiNumerice */
    public ExceptiiNumerice() {
    }
    
}

 // Sfarsitul definitiei clasei ExceptiiNumerice