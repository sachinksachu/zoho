import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        //put(key, value)
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        System.out.println("the entries are : "+hmap.entrySet());

        //iterate
        //entrySet(), returns Set
        Set set = hmap.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry mapEntry = (Map.Entry)it.next();
            System.out.println("key is: "+ mapEntry.getKey() + " & Value is: "+mapEntry.getValue());
        }
    }
}
