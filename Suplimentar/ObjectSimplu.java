/*
 * ObjectSimplu.java
 *
 * Created on October 30, 2004, 9:30 PM
 */

/**
 *
 * @author  Fantanaru
 */

//definirea unei clase simple care perite clonarea
public class ObjectSimplu implements Cloneable {
    //declararea unei date membre
    private String content = "";
    
    public void setContent(String s) {
        content=s;
    }
    public String getContent() {
        return content;
    }
    
    //supradefinarea metodei clone()
    /** Creates a new instance of ObjectSimplu */
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Eroare la clonare!");
            return this;
        }
    }
    
    public class Object3 {
        public void main(String[] args) {
            //crearea unui obiect
            ObiectSimplu ob1 = new ObiectSimplu();
            //clonarea unui obiect
            ObiectSimplu ob2 = (ObiectSimplu) ob1.clone();
            //verificarea celor 2 obiecte
            System.out.println(ob1.equals(ob2));
            System.out.println(ob1.getContent()==ob2.getContent());
            //modificarea originalului
            ob1.setContent("Test");
            //verificarea continutului celor 2 obiecte
            System.out.println(ob1.getContent()==ob2.getContent());
        }
        
    }
    
}


