/*
 * AdreseVariabile.java
 *
 * Created on August 29, 2004, 7:40 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class AdreseVariabile {
    public static void main(String args[]) {
        AdreseVariabile x = new AdreseVariabile();
        System.out.println("Tipul lui x = " + x.getClass() .getName()+ ", valoarea lui x = " + x +", adresa lui x = " + x.hashCode());
        byte [] y = new byte[10];
        System.out.println("Tipul lui y = " + y.getClass().getName()+ ", valoarea lui y[0] = " + y[0] + ", adresa y = " + y.hashCode());
    
    }
    
    /** Creates a new instance of AdreseVariabile */
    public AdreseVariabile() {
    }
    
}
