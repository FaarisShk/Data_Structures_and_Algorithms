public class NumberCoversion {

    public static void binToDec(int n){
        int myNum = n;
        int pow = 0;
        int decNum = 0;

        while(n>0){
            int lastDigit = n % 10;
            decNum = decNum + (lastDigit *(int) Math.pow(2,pow));
            
            pow++;
            n = n/10;
        }
        System.out.println("decimal of " + myNum +" is: " + decNum);
     }

     public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int bin = 0;

        while(n>0){
            int rem = n%2;
            bin = bin + (rem*(int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println(myNum + " = " + bin);
     }

     public static void main(String[]args){
        //binToDec(111);
        decToBin(50);
     }

}
