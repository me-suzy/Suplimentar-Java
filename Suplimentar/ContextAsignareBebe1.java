/*
 * ContextAsignareBebe1.java
 *
 * Created on August 31, 2004, 6:08 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class ContextAsignareBebe1 {
    public static void main(String[] args) {
        //literalul2 de tip int este convertit la asignare la tipul short
        short s = 2;
        //variabila s este convertita la asignare la tipul float
        float f = s;
        System.out.println("f = " + f);
        char c = '\u0123';
        //variabila l este convertita la asignare la tipul long
        long l = c;
        System.out.println("l = " + l);
        f = 3;
        //variabila f este convertita la asignare la tipul float
        double d = f;
        System.out.println("d = " + d);
    }
    
    /** Creates a new instance of ContextAsignareBebe1 */
    public ContextAsignareBebe1() {
    }
    
}
