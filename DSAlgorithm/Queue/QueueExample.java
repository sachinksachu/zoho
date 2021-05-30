public class QueueExample {

    static int front =0, rear =-1;
    static int capacity = 10;
    static int[] array = new int[capacity];

    public static void enqueue(int value){
        if(!isFull()){
            System.out.println("Queue is full");
            return;
        }
        else{
            rear = (rear + 1)% capacity;
            array[rear] = value;
            return;
        }
    }

    public static void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        else{
            front = (front+1)% capacity;
            return;
        }
    }

    public static boolean isEmpty(){
        if(front == -1)
        return true;

        else
        return false;
    }
    public static boolean isFull(){
        if(rear < capacity -1)
            return true;

        else
        return false;
    }

    public static void display(){
        for (int i=front; i<= rear; i++) {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {
        

        enqueue(4);
        enqueue(3);
        enqueue(2);
        enqueue(1);

        dequeue();

        display();

    }
}
