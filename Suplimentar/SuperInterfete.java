/*
 * SuperInterfete.java
 *
 * Created on October 31, 2004, 9:43 PM
 */

/**
 *
 * @author  Fantanaru
 */

//declararea interfatei I1
interface I1{
//declararea unei date membre
int x = 0;
//declararea unei metode (care este abstracta)
public int f();
}

//declararea intefetei I2
//aceasta va mosteni datele si metodele membre din I1
interface I2 extends I1 {
    int y = 1;
    public int g();
}

//declararea clasei C1
class C1 {
    int z = 2; 
    public int h() { return z; );


    //declararea clasei C2 care extinde clasa C1 si implementeaza intefata I2 */
    class C2 extends interface I2 {
        int t = 3;
        public int f() { return x; }
        public int g() { return y; }
    

public class SuperInterfete {
    public static void main(String args[]) {
        //instantierea unui obiect din clasa C2
        C2 obiect = new C2();
        System.out.println("x = " + obiect.f() + ",y = " + obiect.g() + ",z = " + obiect.h() + ",t = " + obiect.t);
    }
}
    
    /** Creates a new instance of SuperInterfete */
   
    
}
}
}
