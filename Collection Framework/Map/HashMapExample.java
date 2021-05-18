import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        //put(key, value)
        hmap.put(2, "Chaitanya");
        hmap.put(125, "Rahul");
        hmap.put(3, "Singh");
        hmap.put(43, "Ajeet");
        hmap.put(135, "Anuj");

        System.out.println("the entries are : "+hmap.entrySet());

        //iterate

        //keySet()
        System.out.println("the keys are : ");
        for (int i : hmap.keySet()) {
            System.out.print(i+" ");
          }
        //values
        System.out.println("\nthe values are : ");
        for (String i : hmap.values()) {
            System.out.print(i+" ");
          }


        //entrySet(), returns Set
        Set set = hmap.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry mapEntry = (Map.Entry)it.next();
            System.out.println("\nkey is: "+ mapEntry.getKey() + " & Value is: "+mapEntry.getValue());
        }

        //another way to iterate
        for( Map.Entry entry : hmap.entrySet()){
            System.out.println("\nkey is: "+ entry.getKey() + " & Value is: "+entry.getValue());
        }

        //get
        System.out.println("display using get,  value at key 2 is  :"+hmap.get(2));

        //containsValue
        System.out.println("does entries contains value Anuj"+hmap.containsValue("Anuj"));

        //containsKey
        System.out.println("does entries contains key 20"+hmap.containsKey(20));

        //replace
        hmap.replace(12, "Mani");
        System.out.println("the entries are : "+hmap.entrySet());

        //remove(), returns string
        System.out.println("removed :"+hmap.remove(2));

        //remove(key, value), returns boolean
        System.out.println("removed Ajeet :"+hmap.remove(49, "Ajeet"));

        //putIfAbsent
        hmap.putIfAbsent(5, "Manu");

        System.out.println("the entries are : "+hmap.entrySet());
    }
}
