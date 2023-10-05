import java.util.ArrayList;

public class Heap{

    static class Heap1{
        ArrayList<Integer> a1 = new ArrayList<>();

        public void add(int data){
            a1.add(data);

            int x = a1.size()-1;
            int par = (x-1)/2;

            while(a1.get(x) < a1.get(par)){
                int temp = a1.get(x);
                a1.set(x, a1.get(par));
                a1.set(par, temp);

            }
        }

        public int peek(){
            return a1.get(0);
        }
    }

    public static void main(String[]args){
        Heap1 h1 = new Heap1();
        h1.add(10);
        h1.add(20);
        h1.add(23);
        h1.add(5);
         
        System.out.println(h1.peek());

    }
}