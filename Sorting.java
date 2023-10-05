public class Sorting {
    static int i,j,temp;

    public static void printArray(int array[]){
        System.out.print("{");
        for(i=0;i<array.length;i++){
            System.out.print(" " + array[i] + " ");
        } System.out.print("}");
    }
    public static void bubbleSort(int array[]){        
        for(i=0;i<array.length;i++){
            for(j=0;j<array.length-1;j++){
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int array[]){
        int size = array.length;

    for (i=0;i<array.length-1;i++) {
      int min_idx = i;
        for (j=i+1;j<size;j++) {
        if (array[j] < array[min_idx]) {
          min_idx = j;
        }
      }

      int temp = array[i];
      array[i] = array[min_idx];
      array[min_idx] = temp;
    }
}
    public static void insertionSort(int array[]){
        for(i=1;i<array.length;i++){
            int currentValue = array[i];
            int j = i-1;
            while(j>=0 && array[j]>currentValue){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = currentValue;
        }
    }
    public static void main(String[]args){
        int myarr[] = {5,4,1,3,2};
        //bubbleSort(myarr);
        //selectionSort(myarr);
        insertionSort(myarr);
        printArray(myarr);
    }    
}
