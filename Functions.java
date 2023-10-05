import java.util.Scanner;


public class Functions {
    
    static Scanner sc = new Scanner(System.in);

    public static int average(int n1, int n2, int n3){
        int avg = (n1+n2+n3)/3;
        return avg;
    }

    public static int factorial(int n){
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact = fact * i;
        } 
        return fact;
    }

    public static int binomialCoeff(int n, int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int n_r = factorial(n-r);

        int result = nfact/(rfact*n_r);
        return result;
    }
    public static boolean isPrime(int n){
        int i;
        boolean bool=false;
        for(i=1;i<=n;i++){
            if(n%i==0){
                bool = false;
            } else 
            bool = true;
        }
        return bool;
    }

    public static void Palindrome(int n){
        int rem,rev=0;
        int temp = n;

        while(n>0){
            rem = n%10;
            rev = rev*10+rem;
        }
    }
    public static void main(String[]args){

      //System.out.println(average(10,10,10););

      //System.out.println(factorial(5));

      //System.out.println(binomialCoeff(5,2));

      //System.out.println(isPrime(27));
    
    }
}
