import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        //add
        list.add("Java");
        list.add("Ruby");
        list.add("Javascript");
        list.add("Cobol");
        list.add("Php");
        list.add("Java");
        list.add("Php");
        //add(int index, value) add at specific position
        list.add(0,"C++");

        //addFirst
        list.addFirst("C");

        //addLast
        list.addLast("Python");

        //iterating list using 'Iterator'
        Iterator<String> iterate = list.iterator();
        System.out.println("elements ");
        while(iterate.hasNext())
            System.out.print(iterate.next()+ " ");

        
        //iterating in reverse order using descendingIterator
        iterate = list.descendingIterator();
        System.out.println("\ndescending order");
        while(iterate.hasNext())
            System.out.print(iterate.next()+ " ");

        //getFirst(), access first element
        System.out.println("\nFirst Element: " + list.getFirst());

        //getLast(), access last
        System.out.println("Last Element: " + list.getLast());

        //get(Int index)
        System.out.println("Element at index 4: " + list.get(4));

        //indexOf
        System.out.println("index of C++: " + list.indexOf("C++"));

        //contains
        System.out.println("does list contains java: " + list.contains("Java"));

        //poll() , returns and remove first element
        System.out.println("remove first element using poll: " + list.poll());
        //pollFirst()

        //pollLast()
        System.out.println("remove last element using poll: " + list.pollLast());




        //set
        list.set(3, "Dart");
        System.out.println("elements: " + list);

        //remove first
        list.removeFirst(); // or list.remove(0)
        System.out.println("elements: " + list);

        //remove last
        list.removeLast();
        System.out.println("elements: " + list);

        //remove using index
        list.remove(2);
        System.out.println("elements: " + list);

        //removeFirstOccurrence(Object item)
        list.removeLastOccurrence("Php");
        //removeFirstOccurrence(Object item):
        list.removeLastOccurrence("Java");

        System.out.println("type is: " + list.getClass());

    }
}
