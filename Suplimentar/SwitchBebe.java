/*
 * SwitchBebe.java
 *
 * Created on September 3, 2004, 4:52 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class SwitchBebe {
    static void g(int k) {
        switch (k) {
            default: System.out.println("implicit"); break;
            case 1: System.out.println("Unu"); break;
            case 2: case 3: case 4: System.out.println("Doi sau Trei sau Patru"); break;
            case 5: case 6 :case 7: System.out.println("Cinci sau Sase sau Sapte");break;
        }
    }
    
         public static void main (String[] args) {
            g(1);
            g(2);
            g(3);
            g(4);
            g(5);
            g(6);
            g(7);
            g(8);
            g(9);
         }


    /** Creates a new instance of SwitchBebe */
    public SwitchBebe() {
      }
       
}
      

  
