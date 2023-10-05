public class BinarySearchTree {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(val > root.data){
            root.right = insert(root.right, val);
        } else{
            root.left = insert(root.left, val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        } else if(key < root.data){
            return search(root.left, key);
        } else{
            return search(root.right, key);
        }
    }

    public static void main(String[]args){
        Node root = null;
        int values[] = {1,6,4,9,3,5};

        for(int i=0; i<values.length ; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);

        if(search(root, 1   )){
            System.out.println("\nFound ");
        } else{
            System.out.println("Not Found");
        }
    }
}
