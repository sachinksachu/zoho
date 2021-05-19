import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetExample {
     public static void main(String args[]) {
         // LinkedHashSet of String Type
         LinkedHashSet<String> lhset = new LinkedHashSet<String>(5,5);

         // Adding elements to the LinkedHashSet
         lhset.add("Z");
         lhset.add("PQ");
         lhset.add("N");
         lhset.add("O");
         lhset.add("KK");
         lhset.add("FGH");
         System.out.println(lhset);

         // LinkedHashSet of Integer Type
         LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

         // Adding elements
         lhset2.add(99);
         lhset2.add(7);
         lhset2.add(0);
         lhset2.add(67);
         lhset2.add(89);
         lhset2.add(66);
         System.out.println(lhset2);

         //cloning
         Set<Integer> set = (Set)lhset.clone();
         System.out.println("Cloned Set : "+set);

         //addAll
         Set<Integer> set2 = new LinkedHashSet<Integer>();
         set2.addAll(lhset2);
         System.out.println("Copied all Set : "+set2);

         //Copying using constructor
         LinkedHashSet<Integer> lhset3 = new LinkedHashSet<Integer>(lhset2);
         System.out.println("Copy Constructor : "+lhset3);
    }
}

//OUTPUT
//follows the order in which it is inserted
// [Z, PQ, N, O, KK, FGH]
// [99, 7, 0, 67, 89, 66]