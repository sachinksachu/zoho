const readline = require("readline");

const userInput = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});


class Node {
  constructor(element) {
    this.element = element;
    this.next = null;
  }
}

class LinkedList {

  constructor() {
    this.head = null;
    this.size = 0;
  }

  add(element) {

    var node = new Node(element) //create a node

    var current;

    if (this.head == null) {
      this.head = node;
    }
    else {

      current = this.head; //point to head

      while (current.next !== null) {
        current = current.next; //iterate till it reach the end
      }

      current.next = node; // add newly created node at the end
    }
    this.size++; // increment the size
  }

  // prints the list items
printList() {
    var curr = this.head;
    var str = "";
    while (curr) {
      str += curr.element + " -> ";
      curr = curr.next;
    }
    console.log(str);
  }

insert(element,position){
  var node = new Node(element);
  var current,prev;
  var i = 0;
  if (this.head == null) {
    this.head = node;
  }
  else{
    current = this.head;
    while(i< position){
      i++;
      prev = current;
      current= current.next;
    }
    prev.next = node;
    node.next = current
  }
  this.size++;
}

}

var ll = new LinkedList();

ll.add(11);
ll.add(12);
ll.add(13)
ll.printList()
ll.insert(100,1)
ll.printList()

// class Test {

//     constructor(element){
//         this.element = element;
//         this.next = null;
//         userInput.question('What is your favorit number? ', (favNum) => {
//             // let num = favNum;
//             console.log(`Thank you, your favorite number is: ${favNum}`);

//             userInput.close();
//           });
//     }
// }

// let obj = new Test("sachin", 24)

// // var input =readline();