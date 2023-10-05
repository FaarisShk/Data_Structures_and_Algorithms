public class BackTracking {
    
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        } System.out.println();
    }

    public static void basic(int array[], int i, int val){
        if(i == array.length){
            printArray(array);
            return;
        }

        array[i] = val;
        basic(array, i+1, val+1);
        array[i] = array[i] - 2; /// -> This line defines backtracing
    }

    public static void subSets(String str, int i, String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.print("null");
            } else {
                System.out.println(ans);
            }
            return;
        } 

        //If Yes
        subSets(str, i+1, ans+str.charAt(i));
        //If No
        subSets(str, i+1, ans);
    }   

    public static void permutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            str = str.substring(0, i) + str.substring(i+1);
            permutation(str, ans + curr);
        }
    }

    public static int gridWays(int i, int j, int m, int n){
        
        if(i == m-1 && j == n-1){
            return 1;
        } else if(i == m || j == n){
            return 0;
        }
        

        int w1 = gridWays(i+1, j, m, n);
        int w3 = gridWays(i, j+1, m, n);

        return w1+w3;
    }

    public static void main(String[]args){
        // int myarr[] = new int[5];
        // basic(myarr, 0, 1);
        // printArray(myarr);

        subSets("abc", 0, "");

        // permutation("abc", "");

        // System.out.println(gridWays(0, 0, 4, 4));
    }
}
