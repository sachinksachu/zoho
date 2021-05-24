import java.util.Hashtable;
import java.util.Map;

public class HashTableJava {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();

        //put
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        System.out.println("Mappings of ht1 : " + ht1);

        // creates a hash table that is initialized with the elements in ht1.
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(ht1);
        System.out.println("Mappings of ht1 : " + ht2);

        //update using put
        ht1.put(3,"four");
        System.out.println("value in key 3 updated with value : " + ht1.get(3));

        //iterating
        for (Map.Entry<Integer, String> e : ht1.entrySet())
            System.out.println(e.getKey() + " "
                               + e.getValue());

    }
}
