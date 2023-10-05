public class BinarySearch {
    
    public static int binarySearch(int array[], int key){
        int start=0;
        int end = array.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(key==array[mid]){
                return mid;
            } 
            if(array[mid]<key){
                start = mid+1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[]ags){
        int myarr[] = {2,4,6,8,10};
        int key = 10;

        int index = binarySearch(myarr,key);
        System.out.println("The Key was found at index : " + index);
    }
}
