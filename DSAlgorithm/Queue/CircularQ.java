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
        if(FRONT == REAR){
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
            if(FRONT == REAR){
                FRONT =-1;
                REAR =-1;
            }
            return;
        }
        
    }

    public void display() {
        int curr = FRONT;
        System.out.print("Queue state: ");
        if (curr == REAR) { System.out.print("[empty]"); }
        else while (curr != REAR) {
          curr = (curr + 1) % array.length;
          System.out.print(array[curr] + " ");
        }
        System.out.println();
      }
    public static void main(String[] args) {
        
        CircularQ cQueue = new CircularQ();

        cQueue.enqueue(100);
        cQueue.enqueue(200);
        cQueue.enqueue(300);
        cQueue.enqueue(400);
        cQueue.enqueue(500);
        cQueue.enqueue(600);
        cQueue.enqueue(700);
        cQueue.enqueue(800);
        cQueue.enqueue(900);
        cQueue.enqueue(1780);

        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.dequeue();
        System.out.println("complete");
        cQueue.dequeue();
        cQueue.enqueue(898);

        

        
    }
}
