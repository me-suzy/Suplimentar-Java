/*
 * CitiriIntregi.java
 *
 * Created on August 28, 2004, 5:13 PM
 */
import java.io.*;
/**
 *
 * @author  Fantanaru
 */
public class CitiriIntregi {
    public static void main(String args[]) {
        int numar = 0;
        BufferedReader in;
        String linie;
        try {
            in = new BufferedReader(new InputStreamReader(System.in),1);
            while (true) {
                System.out.println("Dati numar " + 
                Radical.numarDeNumere);
                linie = in.readLine();
        try {
            numar = Integer.parseInt(linie);
        }
        catch (NumberFormatException f) {
            System.out.println("Nu ati tastat numar intreg");
            }
                Radical obiect = new Radical (numar);
                System.out.println("Radical din "+ numar + " este " + obiect.radacinaPatrata());
                System.out.println("Continuam ? (tastati s pentru stop)");
                linie = in.readLine();
                if (linie.equals("s") || linie.equals("s"))
                    break;
        }
            in.close();
   }
        catch (IOException e) {
            System.out.println("Citire gresita de la tastatura" + e);
        }
    } // de la metoda main()
} //sfarsitul definitiei clasei CitiriIntregi


    
    /** Creates a new instance of CitiriIntregi */

    
    


