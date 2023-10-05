public class QueueWIthLinkedList {
    
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head==null;
        }

        public static void add(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            } else{
                int val = head.data;
                head = head.next;
                return val;
            }
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            } else {
                return head.data;
            }
        }
    }

    public static void main(String[]args){
        Queue q1 = new Queue();
        q1.add(10);
        q1.add(20);
        q1.add(30);

        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}


