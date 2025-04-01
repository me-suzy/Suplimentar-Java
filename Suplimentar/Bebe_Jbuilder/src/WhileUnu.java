public class WhileUnu {
  public static void main(String[] args) {
    int i = 0;
    while (true) {
      if (i == 1) break;
      i = (int)(Math.random() * 5);
      System.out.println("i = " + i);
    }
  }
  public WhileUnu() {
  }
}
