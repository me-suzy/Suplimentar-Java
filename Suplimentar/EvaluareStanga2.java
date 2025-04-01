/*
 * EvaluareStanga2.java
 *
 * Created on August 27, 2004, 6:42 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class EvaluareStanga2 {
    public static void main(String[] args) {
        int a = 7;
        int b = (a = 6) * a;
        System.out.println(b);
    }
    
    /** Creates a new instance of EvaluareStanga2 */
    public EvaluareStanga2() {
    }
    
}
 //se calculeaza astfel numai partea a 2 adica     int b = (a = 6) * a;