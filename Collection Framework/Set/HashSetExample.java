import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<String>(); 

        //boolean add)()
        set.add("JavaTpoint");
        set.add("Google");
        set.add("Hindi100");
        set.add("101");
        set.add("Facebook");
        
        System.out.println("HashSet elements: " + set);  

        //contains
        System.out.println("does HashSet contains Google: " + set.contains("Google"));

        //iterate
        for (String x : set) {
            System.out.print(x+" ");
        }

        // Iterator it = set.iterator();
        // while(it.hasNext())
        //     System.out.print(it.next());

        //adding duplicate
        System.out.println("\nadd Google again: " + set.add("Google"));
        System.out.println("HashSet elements: " + set); 

        //remove
        System.out.println("\nremoved Google: " + set.remove("Google"));
    }
}
