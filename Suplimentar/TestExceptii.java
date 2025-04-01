/*
 * TestExceptii.java
 *
 * Created on September 14, 2004, 12:26 PM
 */

/**
 *
 * @author  Fantanaru
 */
public class TestExceptii {
    
    /** Creates a new instance of TestExceptii */
    public TestExceptii() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            try {
                System.out.println("\nTest caz " + i);
                metoda1(i);
                System.out.println("Sfarsit caz" + i);
            }
            catch (Exception e) {
                    System.out.println("Exceptie:" + e.getMessage());
                }
                finally {
                    System.out.println("Executam finally !");
                }
             }
        }
        private static void metoda1(int i) throws Exception {
            System.out.println("Incepe metoda1:");
            if (i != 0) throw new Exception("din metoda1");
            System.out.println("Sfarsit metoda1");
        }
        // TODO code application logic here
    } 
    
 //sfarsitul definitiei clasei TestExceptii
