

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

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
