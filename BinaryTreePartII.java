import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePartII {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;

            if (idx == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void LevelOrder(Node root) {
            Queue<Node> q1 = new LinkedList<>();

            q1.add(root);
            q1.add(null);

            while (!q1.isEmpty()) {
                Node curr = q1.poll();
                if (curr == null) {
                    if (!q1.isEmpty()) {
                        q1.add(null);
                        System.out.println();
                    }
                } else {
                    if (curr.left != null) {
                        q1.add(curr.left);
                    }
                    if (curr.right != null) {
                        q1.add(curr.right);
                    }
                    System.out.print(curr.data + " ");
                }
            }
        }

        public int height(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public int totalNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int left = totalNodes(root.left);
            int right = totalNodes(root.right);

            return left + right + 1;
        }

        public int Diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int leftDiameter = Diameter(root.left);
            int leftHeight = height(root.left);
            int rightDiameter = Diameter(root.right);
            int rightHeight = height(root.right);

            int selfDiameter = leftHeight + rightHeight + 1;

            return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));

        }

    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        } 

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private static boolean isIdentical(Node root, Node subRoot) {
        if(root == null && subRoot == null){
            return true;
        } else if(root == null || subRoot == null || root.data != subRoot.data){
            return false;
        }

        if(!isIdentical(root.left, subRoot.left)){
            return false;
        } 
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }

        return true;    
    }

    public static void main(String[]args){
        BinaryTree b1 = new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
        
        // b1.LevelOrder(root);
        // System.out.println();
        // System.out.println("Height of Binary Tree is: " + b1.height(root));
        // System.out.println("The diameter of Binary Tree is: " + b1.Diameter(root));
    }
}
