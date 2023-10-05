// import java.util.*;


// public class PriorityQueue {
//     static class Student implements Comparable<Student> {
//         int rollNo;
//         String name;

//         Student(int rollNo, String name) {
//             this.rollNo = rollNo; // Assign the parameter to the field correctly
//             this.name = name;
//         }

//         @Override
//         public int compareTo(Student s1) {
//             return this.rollNo - s1.rollNo;
//         }
//     }
    
//     public static void main(String[] args) {
//         PriorityQueue<Student> pq = new PriorityQueue<>();
        
//         pq.add(new Student(10,"Faaris"));
//         pq.add(new Student(2,"Darri"));
//         pq.add(new Student(42,"Nayu"));
        
//         while(!pq.isEmpty()){
//             System.out.println(pq.peek().rollNo + " -> " + pq.peek().name);
//             pq.remove();
//         }
//     }
// }