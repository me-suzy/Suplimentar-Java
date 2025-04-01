/*
 * InitializatorStatic.java
 *
 * Created on September 14, 2004, 12:18 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class InitializatorStatic {
    static int i = 6;
    static {
        System.out.println("Cod static: i = " + i++);
       // return i;
    }
public static void main(String[] args) {
    System.out.println("Cod in main() : i = " + i++);
}
    /** Creates a new instance of InitializatorStatic */
    public InitializatorStatic() {
    }
}  

