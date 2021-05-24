import java.io.*;

class Node {
  public Object item;
  public Node next;
}

class LinkedList {
  private int size;
  private Node head;

  public LinkedList() {
    this.size = 0;
    this.head = null;
  }

  public void insertNode(String item) {
		Node node = new Node();
		node.item = item;
		Node current = this.head;

		if (this.head == null) {
			this.head = node;
			this.head.next = null;
			this.size = 1;
			System.out.println(this.head.toString());
		} else {

			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			node.next = null;
			this.size += 1;
		}
	}

  void printNodes() {
		if (this.size < 1)
			System.out.println("There are no nodes in the linked list");
		else {
			Node current = this.head;
			for (int i = 0; i < this.size; i++) {
				System.out.println("Node " + current.item + " is at location " + i);
				current = current.next;
			}
		}
	}

}

class Main{
  public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		// System.out.println("Current Size of the list is: "+list.getListSize());
		
		list.insertNode("test1");
		list.insertNode("test2");
		list.insertNode("test3");
		list.insertNode("test4");
		list.insertNode("test5");
		list.insertNode("test6");
		list.insertNode("test7");
    list.printNodes();
  }
}