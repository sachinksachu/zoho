import java.io.Console;

class ReverseList {

    Node head,prev = null;
    
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next=null;
        }
    }

    public void push(int d){

        Node new_node = new Node(d);
        
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;

        return;
    }

    public void display(){
        Node tnode = head;
        while(tnode!=null){
            System.out.print(tnode.data+"\t");
            tnode = tnode.next;
        }

        return;
    }

    public void reverseDislay(){
        System.out.println("in");
        Node current = head;
        Node temp;
        while(current !=null){
            // System.out.print(current.data+"\t");
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
            
        }
        head= prev;
        return;
    }

    public static void main(String[] args) {
        ReverseList obj = new ReverseList();

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);

        obj.display();

        obj.reverseDislay();
        obj.display();
    }
    
}
