import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree{
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class binaryTree{
        static int idx = -1;

        public Node buildTree(int[] nodes){
            idx++;

            if(idx >= nodes.length || idx == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root == null){
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }
    }

    public static void main(String[]args){
        int[] nodes = {1,2,3,4,5};
        binaryTree b1 = new binaryTree();
        Node n1 = b1.buildTree(nodes);
        b1.preOrder(n1);
        System.out.println();
        b1.postOrder(n1);
        System.out.println();
    }
}