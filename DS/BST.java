public class BST{

    Node root;

    static class Node{
        int value;
        Node left,right;

        Node(int data){
            value = data;
            left = null;
            right=null;
        }
    }

    public void insert(Node node,int data){
        Node new_node = new Node(data);

        if(node == null || node.value == data){
            return;
        }

        if(data < node.value){
            if(node.left!= null)
                insert(node.left, data);

            else node.left = new_node;
        }
        else if(data > node.value){
            if(node.right!= null)
                insert(node.right, data);

            else node.right = new_node;
        }

        return;

    }

    //inOrder
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
     }

     //preOrder
     public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
     }

     //postOrder
     public void traversePostOrder(Node node) {
       
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }

        return;
     }

     public static Node deleteNode(Node root, int value) {

        if (root == null){
            System.out.println("root == null");
            return root;
        }

        if (root.value > value) {
            System.out.println("root :"+value+"<"+root.value);
            System.out.println("calling deleteNode() with root :"+root.left.value+" & value "+value);
            root.left = deleteNode(root.left, value);
        } else if (root.value < value) {
            System.out.println("root :"+root.value+"<"+value);
            root.right = deleteNode(root.right, value);
 
        } else {
            // if nodeToBeDeleted have both children
            System.out.println("checking child ..");
            if (root.left != null && root.right != null) {
                System.out.println("root:"+root.value+" have two child");
                Node temp = root;

                System.out.println("selecting its rigth sub tree\n calling miniumum left node");
                // Finding minimum element from right
                Node minNodeForRight = minimumElement(temp.right);
                // Replacing current node with minimum node from right subtree
                System.out.println("got the minimum left node & replacing it with node to delete ");
                root.value = minNodeForRight.value;
                // Deleting minimum node from right now

                System.out.println("calling deletenode() again with root "+root.right.value+" and key "+minNodeForRight.value);
                root.right = deleteNode(root.right, minNodeForRight.value);
 
            }
            // if nodeToBeDeleted has only left child
            else if (root.left != null) {
                System.out.println("if only left child for "+root.value+" then setting it as root");
                root = root.left;
            }
            // if nodeToBeDeleted has only right child
            else if (root.right != null) {
                System.out.println("if only right child for "+root.value+" then setting it as root");
                root = root.right;
            }
            // if nodeToBeDeleted do not have child (Leaf node)
            else{
                System.out.println("if the key is the node "+root.value+" then setting it as NULL");
                root = null;
            }
                
        }
        System.out.println("returning last root");
        return root;
    }

    // Get minimum element in binary search tree
    public static Node minimumElement(Node root) {
        System.out.println("inside minimum elemnt function ");
        if (root.left == null){
            System.out.println("returning root"+ root.value);
            return root;
        }
            
        else {
            return minimumElement(root.left);
        }
    }

    public static void main(String[] args) {
        BST obj = new BST();

        Node root = new Node(50); //creating root node

        //inserting nodes
        obj.insert(root,30);
        obj.insert(root,20);
        obj.insert(root,40);
        obj.insert(root,70);
        obj.insert(root,60);
        obj.insert(root,80);

        //traverse
        System.out.println("InOrder\n");
        obj.traverseInOrder(root);//inorder (Left, Root, Right)

        System.out.println("\nPreOrder\n");
        obj.traversePreOrder(root);// preorder (Root, Left, Right)

        System.out.println("\nPostOrder\n");
        obj.traversePostOrder(root);//postorder (Left, Rigth, Root)

        System.out.println("\ndelete node\n");
        deleteNode(root,50);

        System.out.println("InOrder\n");
        obj.traverseInOrder(root);//inorder (Left, Root, Right)

        System.out.println("\nPreOrder\n");
        obj.traversePreOrder(root);// preorder (Root, Left, Right)

        System.out.println("\nPostOrder\n");
        obj.traversePostOrder(root);//postorder (Left, Rigth, Root)
    }
}