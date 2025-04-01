public class ConversiiImpliciteBinareLaCompilare {
  public static void main (String[] args) {
    int i = 0;
    float f = 1.0f;
    double d = 2.0;
     if (i * f == d)
  System.out.println("Are oc egalitatea.");
  byte b = 31;
  char c = 'G';
  int cSiB = c & b;
  System.out.println(Integer.toBinaryString(cSiB));
  System.out.println((1 < 2) ? i : 4.0f);
  }

  public ConversiiImpliciteBinareLaCompilare() {
  }
}
