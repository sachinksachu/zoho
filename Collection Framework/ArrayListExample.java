import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample
{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();//creating ArrayList of type Integer
		ArrayList<Integer> list2 = new ArrayList<Integer>();
        

		//add
		list.add(10);
		list.add(1);
		list.add(8);
		list.add(2);

        list2.add(100);
		System.out.println(list);//display elements
		
		//add at specific index
		list.add(3,3);
	    System.out.println(list);
	    
	    //set
	    list.set(4,4);
	    System.out.println(list);
	    
	    //remove
	    list.remove(0);// inedx as parameter
        System.out.println(list);
        
        //to remove by value
        list.remove((Integer)8);

        //size
        System.out.println("Array list size now : "+list.size());

        //addAll() adding all the elements of an arraylist to another arraylist
        list2.addAll(list);
        System.out.println("list 2 : "+list2);
        //addAll(int index, Collection) to add all elements from specific index
        

        //iterate
        for(int x: list){
            System.out.println(x);
        }

        //sort method in 'Collections' class
        Collections.sort(list);
        System.out.println("Sorted array"+list);

        //sort in reverse order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("reversed array"+list);

        //int indexOf()
        System.out.println("index of 4 is "+list.indexOf(4));

        //Object get(int index)
        System.out.println("value at index 1 is :"+list.get(1));

        //boolean contains(Object)
        System.out.println("is 10 contains in array : "+list.contains(10));

        //clear
        list.clear();
        System.out.println("cleared the list");

        //subList subList(int fromIndex, int toIndex)
        //subList is method of "ArrayList" return a 'List'
        List<Integer> list3 = list2.subList(0, 4);
        System.out.println("list 3 :"+ list3);

	}
	
}


// list.remove(Integer.valueOf(2)); // removes the first occurrence of 2
// list.remove(list.indexOf(2)); // also removes the first occurrence of 2
// list.removeAll(Arrays.asList(2)); // removes all occurrences of 2
