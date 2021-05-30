import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListJava {
 public static void main(String[] args) {
     ArrayList<Object> ar = new ArrayList();
     ar.add("sac");
     ar.add(4);
     Iterator it = ar.iterator();

     while(it.hasNext()){
         System.out.println(it.next());
     }
 }   
}
