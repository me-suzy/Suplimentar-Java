/*
 * ConversiiExpliciteFlotante.java
 *
 * Created on August 30, 2004, 4:15 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class ConversiiExpliciteFlotante {
    public static void main(String[] args) {
        float min = Float.NEGATIVE_INFINITY;
        float max = Float.POSITIVE_INFINITY;
       System.out.println("long: " + (long)min + "" + (long)max);
       System.out.println("int: " + (int)min + "(int)max");
       System.out.println("char: "+ (int)(char)min + "" +(int) (char)max);
       System.out.println("short:" + (short)min + "" + (short)max);
       System.out.println("byte: " + (byte)min + "" + (byte)max);
    }
    
    
    /** Creates a new instance of ConversiiExpliciteFlotante */
    public ConversiiExpliciteFlotante() {
    }
}
    

