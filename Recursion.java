public class Recursion {
    
    public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        } 
        System.out.print(n + ",");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n+",");
            return;
        }
        printInc(n-1);
        System.out.print(n + ",");
    }

    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int fact = n * Factorial(n-1);
        return fact;
    }

    public static int sumOfN(int n){
        if(n==0){
            return n;
        }
        int n1 = n + sumOfN(n-1);
        return n1;

    }

    public static int fiboNacci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int fib1 = fiboNacci(n-1);
        int fib2 = fiboNacci(n-2);
        return fib1+fib2;
    }

    public static boolean isSorted(int array[], int i){
        if(i==array.length-1){
            return true;
        }

        if(array[i]>array[i+1]){
            return false;
        }

        return isSorted(array,i+1);
    }

    public static int firstOccurence(int array[], int key, int i){
        if(i==array.length){
            return -1;
        }
        if(array[i]==key){
            return i;
        } 

        return firstOccurence(array, key, i+1);
    }

    public static int lastOccurence(int array[], int key, int i){
        if(i == array.length){
            return -1;
        }

        int isFound = lastOccurence(array, key, i+1);
        if(isFound ==-1 && array[i]==key){
            return i;
        }

        return isFound;
    }

    public static int powerOf(int n, int pow){
        if(pow==0){
            return 1;
        }

        return n * powerOf(n, pow-1);
    }

    public static void main(String[]args){
        //printDec(10);
        //printInc(10);
        //int fact = Factorial(5);
        //System.out.print(fact);
        //int sum = sumOfN(5);
        //System.out.println(sum);
        //int fibo = fiboNacci(5);
        //System.out.print(fibo);
        //int myarr[] = {1,2,5,4,5};
        //System.out.print(isSorted(myarr, 0));
        //int myarr[] = {1,5,1,8,3,5,4,6,9,2};
        //System.out.println(firstOccurence(myarr, 6, 0));
        //int myarr[] = {1,2,5,7,2,4,7,9,4,6,3};
        //System.out.print(lastOccurence(myarr, 2, 0));
        System.out.println(powerOf(2, 5));
    }
}
