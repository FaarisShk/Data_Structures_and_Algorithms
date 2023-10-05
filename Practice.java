import java.util.*;
public class Practice{

    public static int findIndex(int[] myarr){
        int largestNum = 0;
        for(int i=0; i<myarr.length; i++){
            largestNum = Math.max(largestNum, myarr[i]);
        }

        for(int i=0 ;i<myarr.length; i++){
            if(largestNum == myarr[i]){
                return i;
            }
        }

        return 0;
    }

    public static void main(String[]args){
        int []myarr = {12,63,23,85,34};
        ArrayList<Integer> a1 = new ArrayList<>();
        int largestNum = Integer.MIN_VALUE;

        // for(int i=0; i<myarr.length; i++){
        //     for(int j=0; j<myarr.length-1; j++){
        //         if(myarr[i] < myarr[j]){
        //             int temp;
        //             temp = myarr[i];
        //             myarr[i] = myarr[j];
        //             myarr[j] = temp;
        //         }
        //     }
        // }

        int x = findIndex(myarr);
        for(int i=0; i<myarr.length; i++){
            if(myarr[i] == myarr[x]){
                myarr[x] = 0;
            }
        }
        System.out.println(myarr[findIndex(myarr)]);
    }
}