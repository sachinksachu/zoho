public class Stack {
    private int arr[];

    private int size;
    
    private int top;

    Stack(int size){
        this.size = size;
        arr = new int[size];
        top=-1;
    }
    public void push(int data){

        if(top != size-1){
            top=top+1;
            arr[top] = data;
        }
    }

    public void displayStack(){
        for(int i=0; i<= top;i++){
            System.out.print(arr[i]);
        }
        System.out.print("\n");
    }

    public int pop(){
        return arr[top--];
    }

    public static void main(String[] args){
        Stack obj = new Stack(10);
        obj.push(1);
        obj.push(2);
        obj.push(3);

        obj.displayStack();

        obj.pop();

        obj.displayStack();
    }
}
