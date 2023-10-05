public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int size;
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        // Step 1 - Create a New Node
        Node n1 = new Node(data);

        size++;

        // IMP: If LinkedList is Empty -> Head and tail will point to the same node
        if (head == null) {
            head = tail = n1;
            return;
        }
        // Step 2 - newNode.next = head
        n1.next = head;

        // Step 3 - Head = newNode
        head = n1;

    }

    public static void addLast(int data) {
        // Step - 1 Create New Node
        Node n1 = new Node(data);

        size++;

        // IMP: If LinkedList is Empty -> Head and Tail will point to the same node
        if (tail == null) {
            head = tail = n1;
            return;
        }

        // Step - 2 Tail of Previous node will point to next Node
        tail.next = n1;

        // Step - 3 Assign tail to the new Node
        tail = n1;
    }

    public static void addAtIndex(int index, int data) {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i > index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int removeFirst() {
        if (size == 0) {
            System.out.println("The Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return 1;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int removeLast() {
        if (size == 0) {
            System.out.println("The Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            return val;
        }

        Node temp = head;
        int i = 0;

        while (i < size - 2) {
            temp = temp.next;
            i++;
        }

        int val = temp.data;
        temp.next = null;
        temp = tail;
        return val;
    }

    public static int iteratorSearch(int data) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == data) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }

    public static int helper(Node head, int data) {
        if (head == null) {
            return -1;
        }

        if (head.data == data) {
            return 0;
        }

        int idx = helper(head.next, data);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public static int recursiveSearch(int data) {
        return helper(head, data);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void deleteFromNthNode(int n) {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return false;
        }
    
        // find middle
        Node mid = findMid(head);
    
        //Reverse 2nd Half
        Node prev = null;
        Node curr = mid;
        Node next;
    
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    
        Node right = prev;
        Node left = head;
    
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    private Node findMid(Node head) {
        if (head == null) {
            return null;
        }
        
        Node slow = head;
        Node fast = head.next; // Start fast from head.next to get the first node of the second half
    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
    
        return slow.next; // Return the first node of the second half
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node fast = head;
        Node slow = head;
        boolean exists = false;
    
        // Detect cycle and find the meeting point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
    
            if (slow == fast) {
                exists = true;
                break;
            }
        }
    
        if (!exists) {
            return;
        }
    
        // Reset slow to head and move both slow and fast by one step until they meet
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
    
        // At this point, slow and fast point to the node where the cycle starts
        // If prev is not null, set its next to null to remove the cycle
        if (prev != null) {
            prev.next = null;
        }
    }
    
    Node sortedMerge(Node a, Node b)
    {
        Node result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;
 
        /* Pick either a or b, and recur */
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
 
    Node mergeSort(Node h)
    {
        // Base case : if head is null
        if (h == null || h.next == null) {
            return h;
        }
 
        // get the middle of the list
        Node middle = findMid(h);
        Node nextofmiddle = middle.next;
 
        // set the next of middle node to null
        middle.next = null;
 
        // Apply mergeSort on left list
        Node left = mergeSort(h);
 
        // Apply mergeSort on right list
        Node right = mergeSort(nextofmiddle);
 
        // Merge the left and right lists
        Node sortedlist = sortedMerge(left, right);
        return sortedlist;
    }

    public static void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        // l1.head = new Node(1);
        // l1.head.next = new Node(2);
        l1.addFirst(20);
        print();
        l1.addFirst(30);
        print();
        l1.addLast(50);
        print();
        l1.addLast(10);
        print();
        // System.out.println(l1.checkPalindrome());
        // l1.deleteFromNthNode(3);
        // l1.print();
        // l1.reverse();
        // l1.print();
        // System.out.println(l1.recursiveSearch(40));
        // System.out.print(l1.size);
        // System.out.println(l1.iteratorSearch(40));
        // System.out.println(iteratorSearch(22));
        // l1.removeFirst();
        // l1.print();
        // l1.removeLast();
        // l1.print();

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        l1.mergeSort(head);
    }
}