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

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
     }

    public static void main(String[] args) {
        BST obj = new BST();

        Node root = new Node(5);

        obj.insert(root,3);
        obj.insert(root,4);
        obj.insert(root,8);

        obj.traverseInOrder(root);
    }
}