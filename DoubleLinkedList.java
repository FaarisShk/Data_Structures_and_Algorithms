
public class DoubleLinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return; 
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public static int removeFirst(){
        if(head == null){
            System.out.println("Linked List is Emmpty");
            return Integer.MIN_VALUE;
        }

        size--;
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public static int removeLast(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        int val = temp.data;
        temp.prev.next = null;
        return val;
    }

    public static void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void print(){
        Node temp = head;
        size++;

        while(temp!=null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }System.out.println("null");
    }

    public static void main(String[]args){
        DoubleLinkedList d1 = new DoubleLinkedList();
        d1.addFirst(30);
        d1.addFirst(20);
        d1.addFirst(10);
        d1.addLast(40);
        // d1.print();
        // d1.removeFirst();
        // d1.removeLast();
        d1.print();
        d1.reverse();
        d1.print();

    }
}
