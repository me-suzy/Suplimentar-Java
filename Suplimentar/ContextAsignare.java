/*
 * ContextAsignare.java
 *
 * Created on August 31, 2004, 5:56 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class ContextAsignare {
    public static void main(String[] args) {
        //literalul 34 de tip int este convertit la asignare la tipul short
        short s = 34;
        //variabila s este convertita la asignare la tipul float
        float f = s;
        System.out.println("f = " + f);
        char c = '\u0123';
        //variabila l este convertita la asignare la tipul long
        long l = c;
        System.out.println("1 = " + 1);
        f = 4.55f;
        //variabila f este convertita la asignare la tipul float
        double d = f;
        System.out.println("d = " + d);
    }
    
    /** Creates a new instance of ContextAsignare */
    public ContextAsignare() {
    }
    
}
