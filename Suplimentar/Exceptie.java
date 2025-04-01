/*
 * Exceptie.java
 *
 * Created on September 14, 2004, 12:55 PM
 */
class ExceptiaNoastra extends Exception {
    ExceptiaNoastra() {}
    ExceptiaNoastra(String s) { super(s); }
}

//Licence : Special

//Copyright (c) 2003-2004
/**
 *
 * @author  Fantanaru
 */
public class Exceptie {
    static void f() throws ExceptiaNoastra {
        throw new ExceptiaNoastra();
    }
    
    /** Creates a new instance of Exceptie */
    public Exceptie() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            f();
        }
    catch (RuntimeException re) {
        System.out.println("S-a aruncat exceptia: " + re);
    }      // TODO code application logic here
    catch (ExceptiaNoastra en) {
        System.out.println("S-a aruncat exceptia : " + en);
         }
    }
} 

