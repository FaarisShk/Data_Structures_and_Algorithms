import java.util.*;
public class TwoDimensionalArrays {
    static Scanner sc = new Scanner(System.in);
    static int i,j;

    public static int[][] createArray(){
        System.out.print("Enter the size of your array: ");
        int n = sc.nextInt();

        int myarr1[][] = new int[n][n];

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("Enter element at " + i + "," + j + " : ");
                myarr1[i][j] = sc.nextInt();
            }
        }
    
        System.out.println("Printing the array: ");

        for(i=0;i<myarr1.length;i++){
            for(j=0;j<myarr1.length;j++){
                System.out.print(myarr1[i][j] + ",");
            }System.out.println();
        }

        return myarr1;
    }

    public static void printArray(int myarr[][]){
       for(i=0;i<myarr.length;i++){
            for(j=0;j<myarr.length;j++){
                System.out.print(myarr[i][j] + ",");
            }System.out.println();
        }
    }

    public static void searchElement(int array[][], int n){
        for(i=0;i<array.length;i++){
            for(j=0;j<array.length;j++){
                if(array[i][j] == n){
                    System.out.println("Element found at index (" + i + "," + j + ")");
                } else{
                    System.out.println("Element not found");
                }
            }
        }
    }

    public static int[][] transPose(int array[][]){
        int temp[][] = new int[array.length][array.length];
        for(i=0;i<array.length;i++){
            for(j=0;j<array.length;j++){
                temp[i][j] = array[j][i];
            }
        }
        return temp ;
    }

    public static void main(String[]args){
       int myarr[][] = createArray();
       //searchElement(myarr, 5);
       int newarr[][] = transPose(myarr);
       printArray(newarr);
       
    }
}
