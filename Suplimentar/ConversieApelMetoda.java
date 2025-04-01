/*
 * ConversieApelMetoda.java
 *
 * Created on August 31, 2004, 6:13 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class ConversieApelMetoda {
    static int f(byte a, int b) { return a + b; }
    static int f(short a, short b) {return a + b; }
    public static void main(String[] args) {
        System.out.println(f((byte)3 ,7));
    }

    /** Creates a new instance of ConversieApelMetoda */
    public ConversieApelMetoda() {
    }
    
}
