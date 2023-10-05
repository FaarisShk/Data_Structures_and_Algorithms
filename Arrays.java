import java.util.*;

public class Arrays{
    static Scanner  sc = new Scanner(System.in);
    static int i,j;

    public static void largestNum(int array[]){
        int largestNum=array[0];
        for(i=0;i<array.length;i++){
            if(array[i]>largestNum){
                largestNum = array[i];
            }
    }
        System.out.println("Largest Number is: " + largestNum);
    }

    public static void possiblePairs(int array[]){
        for(i=0;i<array.length;i++){
             int curr = array[i];
             for(j=i+1;j<array.length;j++){
                 System.out.print("(" + curr + "," + array[j] + ")");
             }
             System.out.println();
        }
     }

     public class ReverseArray {
        static Scanner sc = new Scanner(System.in);
        static int i,j;
    
        public static int[] reverseArray(int array[]){
            int start = 0;
            int end = array.length-1;
    
            while(start<end){
                int temp = array[end];
                array[end] = array[start];
                array[start] = temp;
    
                start++;
                end--;
            }
            return array;
        }
     }

     public static void subArray(int myarr[]){
        for(i=0;i<myarr.length;i++){
            int start = i;
            for(j=1;j<myarr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(myarr[k]+",");
                }System.out.println();
            }System.out.println();  
        }
     }

    public static void sumSubArrays(int myarr[]){
        int current = 0;
        int sum = Integer.MIN_VALUE;

        for(i=0;i<myarr.length;i++){
            int start = i; 
            for(j=i;j<myarr.length;j++){
                int end = j;
                for(int k=start;k<end;k++){
                    current += myarr[k];
                    System.out.print(current+",");
                }System.out.println(); 
                    
                if(sum<current){
                    sum = current;
                }
            }
        }System.out.println(sum);
    }

    public static void main(String[]args){
        int array[] = {2,-4,6,-8,10};
        sumSubArrays(array);   
    }
}