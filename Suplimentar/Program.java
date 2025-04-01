/*
 * Program.java
 *
 * Created on September 14, 2004, 8:17 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class Program {
    
    /** Creates a new instance of Program */
    public Program() {
        static void f(int k) {
            switch (k) {
                default: System.out.print("i ");break;
                case 1: System.out.print("1 ");break;
                case 2: case 3: System.out.print("23 ");break;
                case 4: case 5: System.out.print("45 ");
            }
        }
    
    /**}
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++);
            f(k);
        // TODO code application logic here
    }
    }
}            //Program cu eroare
