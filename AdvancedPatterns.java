import java.util.*;

public class AdvancedPatterns {
    Scanner sc = new Scanner(System.in);
    static int i;
    static int j;

    public static void hollow_rectangle(int rows, int columns){
        

        for(i=1;i<=rows;i++){
            for(j=1;j<=columns;j++){
                if(i == 1 || i == rows || j == 1 || j == columns){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int size){
        for(i=1;i<=size;i++){
            for(j=1;j<=size-i;j++){
                System.out.print(" ");
            }for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inv_rotated_with_number(int size){
        for(i=1;i<=size;i++){
            for(j=1;j<=size-i;j++){
                System.out.print(" ");
            }for(j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        //hollow_rectangle(10,10);
        //inverted_rotated_half_pyramid(5);
    }
}
