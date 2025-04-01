/*
 * ConversiiImpliciteUnareLaCompilare.java
 *
 * Created on August 31, 2004, 6:20 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class ConversiiImpliciteUnareLaCompilare {
    public static void main(String[] args) {
        byte b = 2;
        //urmeaza o conversie la compilare pt dimensiunea unui tablou
        int v[] = new int[b];
        //caracterul c va avea codul 1
        char c = '\u0001';
        //urmeaza o conversie la compilare pt indexul unui tablou
        v[0] = 1;
        //urmeaza o conversie la compilare pt minus unar
        v[0] = -c;
        System.out.println("v[0] = " + v[0] + ",v[1] = " + v[1]);
        //asignam b cu -1.Reprezentarea acestuia in memorie este cu toti bitii 1
        b = -1;
        //urmeaza o conversie la compilare pt operatorul complement fata de 2
        int i = ~b;
        System.out.println("~0x" + Integer.toBinaryString (b) + " = 0x" + Integer.toBinaryString(i));
        //urmeaza o conversie la compilare pt operatorul de deplasare stanga
        i = b << 4L;
        System.out.println("ox" + Integer.toBinaryString(b) + " <<4L = ox" + Integer.toBinaryString(i));
    }
    
    /** Creates a new instance of ConversiiImpliciteUnareLaCompilare */
    public ConversiiImpliciteUnareLaCompilare() {
    }
    
}
