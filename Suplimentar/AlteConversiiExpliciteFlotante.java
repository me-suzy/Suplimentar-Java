/*
 * Class.java
 *
 * Created on August 30, 2004, 4:29 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class AlteConversiiExpliciteFlotante {
    public static void main(String[] args) {  
        System.out.println("Valoare prea mare float:"+"(int)1e15f==" + (int)1e15f);
        System.out.println("Float.NaN:(int)NaN" == "+" + (int)Float.NaN);
        System.out.println("Valoare prea mare double:"+"(float)-1e40" + (float)-1e40);
        System.out.println("Valoare prea mica double:"+"(float)1e-50==" + (float)1e-50);
    }


    /** Creates a new instance of Class */
    public AlteConversiiExpliciteFlotante() {
    }
    
}
