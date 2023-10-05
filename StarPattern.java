import java.util.Scanner;

public class StarPattern{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i,j;

        //Triangle
        /*
            for(j=0;j<i;j++){
                System.out.print("*");
            }  System.out.println();
        }*/

        //Inverted Traingle
        /*System.out.println("Enter the size of star patterns: ");
        int x = sc.nextInt();
        for(i=0;i<x;i++){
            for(j=x;j>i;j--){
                System.out.print("*");
            }System.out.println();
        }*/

        //Traingle with Integers
        /*System.out.println("Enter the size of star patterns: ");
        int x = sc.nextInt();
        for(i=1;i<=x;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }System.out.println();
        }*/

        //Triangle with Characters
        char ch = 'A';
        System.out.println("Enter the size of star patterns: ");
        int x = sc.nextInt();
        for(i=1;i<=x;i++){
            for(j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }  System.out.println();
        }
    }
}