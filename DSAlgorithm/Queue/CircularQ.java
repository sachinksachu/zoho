public class CircularQ {

    int FRONT, REAR, SIZE=10;
    int[] array = new int[SIZE];

    CircularQ(){
        FRONT = -1;
        REAR =-1;
    }

    public boolean isFull(){
        if((FRONT == 0 && REAR == SIZE -1) || (REAR == FRONT-1)){
            System.out.print("Queue is full");
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(FRONT == -1 && REAR ==-1){
            System.out.print("Queue is Empty");
            return true;
        }
        else{
            return false;
        }
    }

    public void enqueue(int value){
        // System.out.println("enqueue called");
        if(isFull()){
            return;
        }
        else if(isEmpty()){
            FRONT=0;
            REAR = 0;
            array[REAR] = value;
            display();
            return;
        }
        // else if(REAR == SIZE-1 && FRONT !=0){
        //     REAR=(REAR+1)%SIZE;
        //     array[REAR] = value;
        //     return;
        // }
        else{
            REAR=(REAR+1)%SIZE;
            array[REAR] = value;
            display();
            return;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            return;
        }
        else{
            FRONT = (FRONT + 1)%SIZE;
            display();
            return;
        }
        
    }

    void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
          System.out.println("Empty * Queue");
        } else {
          System.out.println("Front -> " + FRONT);
          System.out.print("Items -> ");
          for (i = FRONT; i != REAR; i = (i + 1) % SIZE)
            System.out.print(array[i] + " ");
          System.out.println(array[i]);
          System.out.println("Rear -> " + REAR);
        }
        return;
      }
    public static void main(String[] args) {
        
        CircularQ cQueue = new CircularQ();

        cQueue.enqueue(1);
        cQueue.enqueue(2);
        cQueue.enqueue(3);
        cQueue.enqueue(4);
        cQueue.enqueue(5);
        cQueue.enqueue(6);
        cQueue.enqueue(7);
        cQueue.enqueue(8);
        cQueue.enqueue(9);
        cQueue.enqueue(10);

        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.dequeue();

        cQueue.enqueue(100);
        cQueue.enqueue(101);
        cQueue.enqueue(102);
        cQueue.enqueue(103);
        cQueue.enqueue(104);

        
    }
}
