import java.util.Scanner;

class LinkedList {
    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertAtHead(int d){
        Node new_node = new Node(d);

        Node current = head;
        
        new_node.next = current;
        head = new_node;

        return;
    }

    public void insertInBtwn(int value, int position){
        Node new_node = new Node(value);
        int count =1;
        Node current = head;
        Node prev = current;
        while(current.next!= null && count!= position){
            prev= current;
            current=current.next;
            count++;
        }
        prev.next= new_node;
        new_node.next = current;

        return;

    }

    public void push(int d){
        Node new_node = new Node(d);

        Node current = head;

        while(current.next!=null){  
            current=current.next;
        }
        current.next = new_node;
        return;
        
    }

    public void delete(int position){
        Node current = head;
        Node prev = current;
        int count=1;
        while(current.next !=null && count!= position){
            prev = current;
            current= current.next;
            count++;
        }
        if(current.next == null){
            prev.next = null;
        }
        else{
            prev.next = current.next;
        }
        
        return;
    }

    public void printAll(){
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
        return;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.head = new Node(1);

        int val, pos, ch, yes = 0;
        Scanner sc = new Scanner(System.in);
        try {
            while (yes == 0) {
                System.out.print("Enter your choice:");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("Value:");
                        val = sc.nextInt();
                        System.out.print("Position:");
                        pos = sc.nextInt();
                        list.insertInBtwn(val,pos);
                        list.printAll();
                        break;
                    case 2:
                        System.out.print("Value:");
                        val = sc.nextInt();
                        list.insertAtHead(val);
                        list.printAll();
                        break;
                    case 3:
                        // System.out.println("Number of items:"+mylist.countitem());
                        System.out.print("Value:");
                        val = sc.nextInt();
                        list.push(val);
                        list.printAll();
                        break;
                    case 4:
                        System.out.println("Enter position to delete:");
                        pos=sc.nextInt();
                        list.delete(pos);
                        list.printAll();
                        break;
                    

                    default:
                        System.out.println("Invalid choice!");

                }

                System.out.print("\nContinue? Press 0 to continue:");
                yes = sc.nextInt();

            }

        } catch (Exception e) {
            System.exit(100);
        }

    }
}