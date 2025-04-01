/*
 * NumereInVirgulaMobila.java
 *
 * Created on August 27, 2004, 1:08 AM
 */

/**
 *
 * @author  Fantanaru
 */
public class NumereInVirgulaMobila {
    public static void main(String args[]) {
        // depasire a domeniului catre plus infinit
        double infinitMare = 1e308;
        System.out.println(infinitMare * 10);
        // depasire a domeniului catre zero pozitiv
        double infinitMic = 1e-323;
        System.out.println(infinitMic / 10);
        //rotunjire a unui rezultat inexact de tip float
        //matematic,ar final trebuit sa se afiseze 1.0
        float rezultatInexactFloat = 1.0f /41;
        System.out.println(rezultatInexactFloat * 41);
        //rotunjire a unui rezultat inexact de tip double
        //matematic,ar final trebuit sa se afiseze 1.0
        double rezultatInexactDouble = 1.0f / 49;
        System.out.println(rezultatInexactDouble * 49);
    }
    
    /** Creates a new instance of NumereInVirgulaMobila */
    public NumereInVirgulaMobila() {
    }
    
}
