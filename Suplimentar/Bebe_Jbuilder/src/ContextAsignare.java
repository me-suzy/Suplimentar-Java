public class ContextAsignare {
  public static void main(String[] args) {
    //literalul 34 este de tip int convertit la asignare
    short s = 34;
    //variabila este convertita la asignare la tipul float
    float f = s;
    System.out.println("f = " + f);
    char c = '\u0123';
    //variabila este convertita la tipul long
    long l = c;
    System.out.println("l = " + l);
    f = 4.55f;
    //variabila este convertita la tipul float
    double d = f;
    System.out.println("d = " + d);
      }
  public ContextAsignare() {
  }
}
