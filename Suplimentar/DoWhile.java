/*
 * DoWhile.java
 *
 * Created on September 3, 2004, 7:54 PM
 */
import java.io.*;
/**
 *
 * @author  Fantanaru
 */
public class DoWhile {
    public static void main(String[] args) {
        BufferedReader tastatura = new
        BufferedReader(new InputStreamReader(System.in),1);
        double suma = 0.0, numarCitit = 0.0;
        String linie = "";
        do {
            try {
                System.out.flush();
                System.out.println("Dati un numar in virgula flotanta");
                linie = tastatura.readLine();
                Double tempDouble = Double.valueOf(linie);
                numarCitit = tempDouble.doubleValue();
                System.out.println("numarCitit = " + numarCitit);
                suma += numarCitit;
                System.out.println("Doriti sa continuati (d/n)?");
                System.out.flush();
                linie = tastatura.readLine();
                System.out.println("Ati tastat " + linie);
             }
            catch (IOException e) {
                System.out.println("Intrare de la tastatura" + e.toString());
                System.exit(1);
            }
        }
while (linie.equals("d") || linie.equals ("D"));
        System.out.println("Suma numerelor citite este " + suma);
        try {
            tastatura.close();
        }
    
        catch(IOException e) {
            System.out.println("Eroare inchidere fisier de intrare" + e.toString());
            System.exit(2);
        }
} //sfarsitul metodei main
 //sfarsitul definitie clasei DoWhile
    
    /** Creates a new instance of DoWhile */
    public DoWhile() {
    }
}   

