/*
 * ConversiiImpliciteBinareCompilare.java
 *
 * Created on September 2, 2004, 6:55 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class ConversiiImpliciteBinareCompilare {
    public static void main (String[] args) {
        int i = 0;
        float f = 1.0f;
        double d = 2.0;
        //Produsul i * f este convertit la compilare in float,apoi testul float este convetit in double
        if (i * f == d)
            System.out.println("Are loc egalitatea.");
        //o expresie char & byte este convertita la int & int
        byte b = 31;  //b are reprezentarea 00011111
        char c = 'G'; //c are reprezentarea 00000000 01000111
        int cSiB = c & b;
        System.out.println(Integer.toBinaryString(cSiB)); 
        //o expresie a operatorului conditional
        // boolean ? int : float este cnvertita
        // la compilare boolean ? float : float
        System.out.println((1 < 2) ? i : 4.0f);
    
        
    }
    
    /** Creates a new instance of ConversiiImpliciteBinareCompilare */
    public ConversiiImpliciteBinareCompilare() {
    }
    
}
