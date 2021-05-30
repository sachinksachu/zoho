import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("efg");
        queue.add("abc");
        queue.add("opq");
        queue.add("xyz");
        
        System.out.println("priority element"+queue.peek()); 
        System.out.println("element removed "+queue.poll()); 

        //iterate
        while (!queue.isEmpty()) {
            System.out.print(queue.poll()+" ");
        }
    }
}

//https://www.freecodecamp.org/news/priority-queue-implementation-in-java/