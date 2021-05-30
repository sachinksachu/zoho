public class BinaryTree2 {
    // first node
    private Node root;
    BinaryTree2(){
      root = null;
    }
    // Class representing tree nodes
    static class Node{
      int value;
      Node left;
      Node right;
      Node(int value){
        this.value = value;
        left = null;
        right = null;        
      }
      public void displayData(){
        System.out.print(value + " ");
      }
    }
      
    public void insert(int i){
      root = insert(root, i);
    }
      
    //Inserting node - recursive method
    public Node insert(Node node, int value){
      if(node == null){
        return new Node(value);
      }
      // Move to the left if passed value is 
      // less than the current node
      if(value < node.value){
        node.left = insert(node.left, value);
      }
      // Move to the right if passed value is 
      // greater than the current node
      else if(value > node.value){
        node.right = insert(node.right, value);
      }
      return node;
    }

    // Search node in binary search tree
    public Node find(int searchedValue){
      Node current = root;
      while(current.value != searchedValue){
        if(searchedValue < current.value)
          // Move to the left if searched value is less
          current = current.left;
        else
          // Move to the right if searched value is >=
          current = current.right;

        if(current == null){
          return null;
        }
      }
      return current;
    }
      
    // For traversing in order
    public void inOrder(Node node){
      if(node != null){
        inOrder(node.left);
        node.displayData();
        inOrder(node.right);
      }
    }
    // Preorder traversal
    public void preOrder(Node node){
      if(node != null){
        node.displayData();
        preOrder(node.left);           
        preOrder(node.right);
      }
    }
    // Postorder traversal
    public void postOrder(Node node){
      if(node != null){
        postOrder(node.left);
        postOrder(node.right);
        node.displayData();          
      }
    }
      
    public static void main(String[] args) {
      BinaryTree2 bst = new BinaryTree2();
      bst.insert(50);
      bst.insert(70);
      bst.insert(15);
      bst.insert(35);
      bst.insert(30);
      bst.insert(31);

      System.out.println("Inorder traversal of binary tree");
      bst.inOrder(bst.root);
      System.out.println();

      Node node = bst.find(15);
      System.out.println((node == null)? "Node not found" : String.valueOf(node.value));

      System.out.println("Preorder traversal of binary tree");
      bst.preOrder(bst.root);
      System.out.println();

      System.out.println("Postorder traversal of binary tree");
      bst.postOrder(bst.root);
      System.out.println();
    }
  }