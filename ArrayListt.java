
import java.util.ArrayList;
public class ArrayListt {
   public static void main(String[] args) {
      ArrayList<String> langages  = new ArrayList (); 
      langages.add("PHP");
      langages.add("Java");
      langages.add("C++");
      langages.add("Python");
      
      
      for (int i=0; i< langages.size();i++)
      { String s = langages.get(i);
      System.out.println("Langage:" +i+ ":" +s);}

    }
}
 
    
 