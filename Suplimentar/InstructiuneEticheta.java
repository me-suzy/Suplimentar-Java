/*
 * InstructiuneEticheta.java
 *
 * Created on September 2, 2004, 8:42 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class InstructiuneEticheta {
    public static void main (String[] args) {
        int max = 5;
        for (int i = 0; 1 < max; i ++) {
            unu: {i--;
            System.out.println("i (unu) = " + 1);
            for (int j = 0; j < max; j++)
                if (j == i) break unu;
            System.out.println("S-a exectutat instructiunea" +"for (unu)");
            }
            doi: {i += 2;
            System.out.println("i (doi) = " + i);
            for (int j = 0; j < max; j++)
                if (j == i) break doi;
            System.out.println("S-a exectutat instructiunea" + " for (doi)");
            }
            System.out.println("i = " + i);
    }
        }
    /** Creates a new instance of InstructiuneEticheta */
    public InstructiuneEticheta() {
    }
}
    
        

