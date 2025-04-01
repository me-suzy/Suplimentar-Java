/*
 * Object4.java
 *
 * Created on October 31, 2004, 9:34 PM
 */
public String toString() {
    return "ObiectSimplu:"+ content;
}
/**
 *
 * @author  Fantanaru
 */
public class ObiectSimplu {
    public static void main (String[] args) {
        //crearea unui obiect
        ObiectSimplu ob = new ObiectSimplu ();
        //setarea continutului
        ob.setContent("Test");
        //afisarea mesajului
        //metoda toString() va final apelata implicit
        System.out.println(ob + "t\t[OK]");
    }
    
    /** Creates a new instance of Object4 */
    public ObiectSimplu() {
    }
    
}
