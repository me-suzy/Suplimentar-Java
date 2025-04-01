

/*
 * Zaruri.java
 *
 * Created on Au
 gust 27, 2004, 1:22 AM
 */
import java.util.Random;
import java.io.*;
/**
 *
 * @author  Fantanaru
 */
public class Zaruri {
    public static void main(String[] arg) {
        // instantieri
        Random r = new Random();
        int[] zar = new int[2];
        for (int k = 0;k < 10; k++) {
            for(int i = 0; i <2; i++) {
                zar[i] = (int) (r.nextDouble() * 6) + 1;
            }
    System.out.println("\nZarurile sunt: " + zar[0] +""+ zar[1]);
    if (zar[0] == zar[1])
        System.out.println("ati castigat! Zarurile sunt" + "egale!");
    else
        System.out.println("Ati pierdut! Zarurile nu sunt " + "egale!");
    //asteptam apasarea tastei ENTER
    System.out.print("Apasati tasta ENTER pentru a " +"continua...");
    try {
        //citim un caracter de la tastatura
        System.in.read();
        //eliminam celelalte caractere citite
        System.in.skip(System.in.available());
    } catch(IOException e) {
        System.out.println(e);
            }
        }
   System.out.println("Aplicatia s-a terminat!");
    }

    
    /** Creates a new instance of Zaruri */
    public Zaruri() {
    }
    
} //sfarsitul definitiei clasei Zaruri

