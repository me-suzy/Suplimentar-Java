/*
 * SumaNumerePozitive.java
 *
 * Created on September 3, 2004, 9:06 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class SumaNumerePozitive {
    public static void main(String[] args) {
        int v[] = {3, 5, -3, 6, 2, -1, 8, 9, -4, 1}, i = 0, suma = 0;
        for (i = 0; i < 10; ++i) {
            if (v[i] < 0) continue;
            suma += v[1];
        }
      System.out.println("suma = " + suma);
    }
    
    /** Creates a new instance of SumaNumerePozitive */
    public SumaNumerePozitive() {
      }
   }

