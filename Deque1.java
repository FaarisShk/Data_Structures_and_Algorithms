import java.util.Deque;
import java.util.LinkedList;

public class Deque1{

    static class Stack{
        static Deque<Integer> deque = new LinkedList<>();

        public static void add(int data){
            deque.addLast(data);
        }

        public static int remove(){
            return deque.removeLast();
        }

        public static int peek(){
            return deque.getLast();
        }

        public static boolean isEmpty(){
            return deque.isEmpty();
        }

    }

    static class Queue{
        static Deque<Integer> deque = new LinkedList<>();

        public static void add(int data){
            deque.addFirst(data);
        }

        public static int remove(){
            return deque.removeFirst();
        }

        public static int peek(){
            return deque.getFirst();
        }

        public static boolean isEmpty(){
            return deque.isEmpty();
        }
    }
    public static void main(String[]args){
        // Deque<Integer> deque = new LinkedList<>();

        // deque.addFirst(10);
        // deque.addFirst(20);
        // deque.addLast(30);
        // System.out.println(deque);
        // deque.removeFirst();
        // System.out.println(deque);
        // deque.removeLast();
        // System.out.println(deque);

        // Stack s1 = new Stack();
        // s1.add(10);
        // s1.add(20);
        // s1.add(30);
        
        // while(!s1.isEmpty()){
        //     System.out.println(s1.peek());
        //     s1.remove();
        // }

        Queue q1 = new Queue();
        q1.add(10);
        q1.add(20);
        q1.add(30);

        while(!q1.isEmpty()){
            System.out.println(q1.remove());
        }
    }
}