package Pachet;


public class DV {
  public DV(int k) { //constructor
    C2 cDoi = new C2(k);
    System.out.println(cDoi);
    C1 cUnu = new C1(cDoi);
    System.out.println(cUnu);
  }

class C1 {
      /* date membre */
      int x;
      C2 c2;
      /* constructor */
      C1(C2 c2) {
    this.x = c2.x;
    this.c2 = c2;
  }
  /*definirea unei metode */
  public String toString() {
    return "x = " + x + " c2 = " + c2;
  }
 class C2 {
    /* date membre */
    int x;
    C1 c1;
    /* constructor */
    C2(C1 c1) {
  this.x = c1.x;
  this.c1 = c1;
}
/* definirea unei metode */
public String toString() {
  return "x = " + x + "c1 = " + c1;
}
}
}
}
