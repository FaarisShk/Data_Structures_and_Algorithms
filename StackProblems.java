public class StackProblems {

    /*
     * public static void pushAtBottom(Stack<Integer> s1, int data){
     * if(s1.isEmpty()){
     * s1.push(data);
     * return;
     * }
     * int top = s1.pop();
     * pushAtBottom(s1,data);
     * s1.push(top);
     * }
     * 
     * public static void reverseStack(Stack<Integer> s1){
     * if(s1.isEmpty()){
     * return;
     * }
     * int top = s1.pop();
     * reverseStack(s1);
     * pushAtBottom(s1,top);
     * }
     * 
     * public static void main(String[] args) {
     * Stack<Integer> s1 = new Stack<>();
     * 
     * s1.push(10);
     * s1.push(20);
     * s1.push(30);
     * System.out.println(s1);
     * // System.out.println(s1.pop());
     * // System.out.println(s1.peek());
     * pushAtBottom(s1,5);
     * System.out.println(s1);
     * reverseStack(s1);
     * System.out.println(s1);
     * 
     * }
     * }
     * 
     * public static boolean isValid(String str) {
     * Stack<Character> s1 = new Stack<>();
     * 
     * for (int i = 0; i < str.length(); i++) {
     * char ch = str.charAt(i);
     * 
     * if (ch == '{' || ch == '(' || ch == '[') {
     * s1.push(ch);
     * } else {
     * if (s1.isEmpty()) {
     * return false;
     * }
     * if ((s1.peek() == '{' && ch == '}')
     * || (s1.peek() == '[' && ch == ']')
     * || (s1.peek() == '(' && ch == ')')) {
     * s1.pop();
     * } else {
     * return false;
     * }
     * }
     * }
     * 
     * return s1.isEmpty(); // Added this line to check if the stack is empty
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println("Hello, World!");
     * String str = "([{}])";
     * System.out.println(isValid(str));
     */

}