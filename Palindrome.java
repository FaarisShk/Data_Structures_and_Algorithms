import java.util.Scanner;

public class Palindrome {
    Scanner sc = new Scanner(System.in);

    public static void isPalindrome(int n){
        int temp = n;
        int rev=0,rem;

        while(temp>0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        } 
        if(n==rev){
            System.out.println("The number is a Palindrome");
        } else{
            System.out.println("The number is not a Palindrome");
        }
    }

    public static void main(String[]args){
        isPalindrome(121);
    }
}
