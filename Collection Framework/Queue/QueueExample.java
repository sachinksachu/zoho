import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //isEmpty
        System.out.println("is queue empty " + queue.isEmpty());
        //remove from front or 'poll()'
        System.out.println("The removed the element " + queue.poll()); //returns null

        //add at rear
        queue.add(10);
        queue.add(12);
        queue.add(34);
        queue.add(78);

        // returns the front element or use 'element()''
        System.out.println("The front element is " + queue.peek());

        //remove from front or 'poll()'
        System.out.println("The removed the element " + queue.remove());

        // Returns the total number of elements present in the queue
        System.out.println("The queue size is " + queue.size());


    }
}

// note
// The complexity of enqueue and dequeue operations in a queue using an array is O(1).