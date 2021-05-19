import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        // 1. Create TreeSet
        TreeSet<String> TreeSet = new TreeSet<>();

        // 2. Add elements to TreeSet
        TreeSet.add("A");
        TreeSet.add("Z");
        TreeSet.add("X");
        TreeSet.add("J");
        TreeSet.add("C");

        System.out.println(TreeSet);

        // 3. Check if element exists
        boolean found = TreeSet.contains("A"); // true
        System.out.println(found);

        System.out.println("lowest element : "+TreeSet.first());
        System.out.println("highest element : "+TreeSet.last());

        //reverse order
        //1. descendingSet
        NavigableSet<String> reverseTree = TreeSet.descendingSet();
        Iterator it = reverseTree.iterator();

        System.out.println("\nValues using descendingSet:");
        while (it.hasNext()) {
            System.out.println("Value : " + it.next());
        }

        //2. descendingIterator
        System.out.println("\nValues using descendingIterator:");
        Iterator it2 = TreeSet.descendingIterator();
        while (it2.hasNext()) {
            System.out.println("Value : " + it2.next());
        }

        // 4. Remove an element
        TreeSet.remove("X");
        System.out.println(TreeSet);
    }
}
