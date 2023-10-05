import java.util.LinkedList;
import java.util.Queue;

public class QueueWithCollection {
    /*
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        
        public static boolean isEmpty() {
            return s1.isEmpty();
        }
        
        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            
            s1.push(data);
            
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            
            return s1.pop();
        }
        
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            
            return s1.peek();
        }
    }

     public static void reverse(Queue<Integer> q1){
        Stack<Integer> s1 = new Stack<>();
        
        while(!q1.isEmpty()){
            s1.push(q1.remove());
        }
        
        while(!s1.isEmpty()){
            q1.add(s1.pop());
        }
    }   
    */
    public static void main(String[]args){
        Queue<Integer> q1 = new LinkedList<>();

        q1.add(10);
        q1.add(20);
        q1.add(30);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }

        /*
         * Queue<Integer> q1 = new LinkedList<>();
        
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        
        reverse(q1);
        
        while(!q1.isEmpty()){
            System.out.print(q1.peek()+ " ");
            q1.remove();
        }
    }
         */
    }
}
