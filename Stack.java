import java.util.ArrayList;

public class Stack {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        public static Node head;
        public static Node tail;

        public static void addFirst(int data){
            Node newNode = new Node(data);

            while(head != null){
                head = tail = newNode; 
            }

            newNode.next = head;
            head = newNode;
        }
    }
    
    public static class StackB{
        static ArrayList<Integer> lst = new ArrayList<>();

        public static void push(int data){
            lst.add(data);
        }

        public static int pop(){
            int val = lst.size() - 1;
            lst.remove(lst.size()-1);

            return val;
        }

        public static int peek(){
            return lst.size()-1;
        }

        public static void print(){
            for(int i = 0; i<lst.size();i++){
                System.out.print(lst.get(i) + " ");
            }
        }
    }

    public static void main(String[]args){
        // StackB s1 = new StackB();
        // s1.push(10);
        // s1.push(20);
        // s1.push(30);
        // s1.print();
        // s1.peek();
        // s1.pop();
        // s1.print();

        
    }
}
