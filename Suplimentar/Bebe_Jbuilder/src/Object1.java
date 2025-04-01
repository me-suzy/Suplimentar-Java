public class Object1 {
  public static void main(String[] args) {
    //crearea unui obiect de tip String
    String s = "Sir";
    //crearea unei referinte Object
    Object o = s;
    //afisarea numelui clasei din momentul executiei
    System.out.println(o.getClass().getName());
  }
  public Object1() {
  }
}
