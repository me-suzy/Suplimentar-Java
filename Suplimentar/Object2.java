/*
 * Object2.java
 *
 * Created on October 4, 2004, 3:39 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class Object2 {
    public static void main(String[] args) {
        //crearea a doua obiecte
        String s = "sir 1";
        Object o = new String("sir 2");
        
        //cele 2 sunt diferite
        if (o.equals(s))
            System.out.println("Egalitate");
        else
            System.out.println("Diferenta");
            
         //acum devin identice
            o = s;
        //ambele sunt referinta la acelasi obiect
        if (o.equals(s))
            System.out.println("Egalitate");
        else
            System.out.println("DIferenta");
        
    }
    
    /** Creates a new instance of Object2 */
    public Object2() {
    }
    
}
