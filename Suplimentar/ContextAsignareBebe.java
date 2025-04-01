/*
 * ContextAsignareBebe.java
 *
 * Created on August 31, 2004, 6:01 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class ContextAsignareBebe {
    public static void main(String[] args) {
        //literalul 3 de tip int este convertit la asignare la tipul short
        short s = 3;
        //variabila este convertita la asignare la tipul float
        float f = s;
        System.out.println("f = " + f);
        char c = '\u0123'; 
        //variabila l este convertita la asignare in tipul long
        long l = c;
        System.out.println("l = " + l); 
        f = 4.55f;
        //variabila f este convertita la asignare la tipul float
        double d = f;
        System.out.println("d = " + d);
    }
    
    /** Creates a new instance of ContextAsignareBebe */
    public ContextAsignareBebe() {
    }
    
}
