import java.io.*;
/*
 * SSwitch.java
 *
 * Created on September 3, 2004, 4:44 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class Switch{
    static void f(int k) {
        switch (k) {
            default: System.out.println("implicit"); break;
            case 1: System.out.println("unu"); break;
            case 2: case 3: System.out.println(" doi sau trei"); break;
            case 4: case 5: System.out.println("patru sau cinci");//break;
        }
    }

    public static void main(String[] args) {
        f(1);
        f(2);
        f(3);
        f(4);
        f(6);
    }

    /** Creates a new instance of SSwitch */
    public Switch() {
    }

}
