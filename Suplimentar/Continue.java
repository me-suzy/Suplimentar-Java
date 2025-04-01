/*
 * Continue.java
 *
 * Created on September 12, 2004, 11:12 AM
 */

/**
 *
 * @author  Fantanaru
 */
public class Continue {
    public static void main(String args[]) {
    // m - nr de linii,n nr de coloane
    int m = 3,n = 4;
    //i,j sunt variabile de lucru
    int i,j;
    //a este o matrice cu 3 linii si 4 coloane cu elemente de tip double
    double [][] a = { {2.45, -5.67, 0.001, 5.32},{5.65, 2.28, 4.01, 0.002},{-0.005, 6.39, 8.13, -7.89}
    };
    //suma este o variabila de tip double care tine suma elementelor mai mari in modul decat 0.01
    double suma = 0;
    unu: for (i = 0; i < m; i++) {
        doi: for (j = 0; j < n; j++) {
            if (Math.abs(a[i][j]) < 0.01)
                if (j < n -1) continue doi;
                else continue unu;
            suma += a[i][j];
        }
        System.out.println("Suma elementelor mai mari de 0.01" +" este" + suma);
        }
        
    }
    /** Creates a new instance of Continue */
    public Continue() {
    };
 }
