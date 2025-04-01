/*
 * ExceptiaFinally.java
 *
 * Created on September 14, 2004, 8:04 PM
 */
class ExceptiaNoastra extends Exception {
    ExceptiaNoastra() { }
    ExceptiaNoastra(String s) { super(s); }
}
/**
 *
 * @author  Fantanaru
 */
public class ExceptiaFinally {
    static void f() throws ExceptiaNoastra {
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        try {
          f();  
        }
        catch (ExceptiaNoastra re) {
            System.out.println("S-a aruncat exceptia: " + re);
        }
    finally {
        System.out.println("Exceptie neprinsa.");
          }
    }
    
    
    /** Creates a new instance of ExceptiaFinally */
    public ExceptiaFinally() {
    }
    
}
