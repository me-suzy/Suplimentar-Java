/*
 * InstructiuneSysnchronized.java
 *
 * Created on September 14, 2004, 12:38 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class InstructiuneaSynchronized {
    
    /** Creates a new instance of InstructiuneSysnchronized */
    public InstructiuneaSynchronized() {
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InstructiuneaSynchronized is = new
        InstructiuneaSynchronized();
        synchronized(is) {
            synchronized(is) {
                System.out.println("Acum obiectul is este inchis de 2 ori!");
            }
            System.out.println("Acum obiectul is este inchis o data!");
            }
        System.out.println("Acum obiectul is nu mai este inchis!");
        }
        // TODO code application logic here
    }
    

