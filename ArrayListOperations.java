import java.util.*;
public class ArrayListOperations{
	static Scanner sc = new Scanner(System.in);
	
	public static void findMax(ArrayList<Integer> a1) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<a1.size();i++) {
			if(a1.get(i)>max) {
				max = a1.get(i);
			}
		}
		
		System.out.println("The highest value in the arraylist is: "+max);
	}
	public static void reverseArrayList(ArrayList<Integer> a1) {
		System.out.println("Printing the array in reverse ");
		for(int i=a1.size()-1;i>=0;i--) {
			System.out.print(a1.get(i)+ " ");
		}
	}
	public static void ArrayListOperations(ArrayList<Integer> a1, int choice) {


		switch(choice) {
		case 1:
			System.out.print("Adding more elements");
			System.out.println("How many more elements do you want to add: ");
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				System.out.println("Enter elements at index " + (a1.size()+1) + ": ");
				int n1 = sc.nextInt();
				a1.add(n1);
			}
			printArrayList(a1);
			break;
		case 2: 
			System.out.println("Removing Elements");
			System.out.println("Enter the index whose element you want remove");
			int index = sc.nextInt();
			a1.remove(index);
			printArrayList(a1);
			break;
		case 3:
			System.out.println("Updating Elements");
			System.out.println("Enter the index whose element you want to update");
			int n1 = sc.nextInt();
			System.out.println("Enter the new element: ");
			int n2 = sc.nextInt();
			a1.remove(n1);
			a1.add(n1, n2);
			printArrayList(a1);
			break;			
			}
		}
	
		public static void swapNumbers(ArrayList<Integer> a1, int idx1, int idx2) {
			int temp = 0;
			
			temp = a1.get(idx1);
			a1.set(idx1, a1.get(idx2));
			a1.set(idx2, temp);
			
			printArrayList(a1);
		}
		
		public static void targetSum(ArrayList<Integer> a1, int target) {
			int sum = 0;
			for(int i=0; i<a1.size(); i++) {
				for(int j=0; j<a1.size(); j++) {
					if((a1.get(i) + a1.get(j)) == target) {
						System.out.println("The sum of " + a1.get(i) + " & sum of " + a1.get(j) + " is equal to " + target);
					} 
				}
			}
		}

		public static void printArrayList(ArrayList<Integer> a1) {
			System.out.println("Displaying the ArrayList");
			for(int i=0;i<a1.size();i++) {
				System.out.print(a1.get(i) + " ");
			}System.out.println();
		}
		

		public static void main(String []args) {

			System.out.print("Enter the size of your array: ");
			int n = sc.nextInt();
			
//			Creating an ArrayList
			ArrayList<Integer> a1 = new ArrayList<>();
			for(int i=1;i<=5;i++) {
				a1.add(i);
			}
//			Random r1 = new Random();
//			
//			for(int i=0;i<n;i++) {
//				int n1 = r1.nextInt(10, 99);
//				a1.add(n1);
//			}
			
//			Creating a Nested ArrayList
//			ArrayList<ArrayList<Integer>> mainArrayList = new ArrayList<>();
//			ArrayList<Integer> a1 = new ArrayList<>();
//			a1.add(10); a1.add(20);
//			ArrayList<Integer> a2 = new ArrayList<>();
//			a2.add(30); a2.add(40);
//			
//			mainArrayList.add(a1);
//			mainArrayList.add(a2);
//			
//			for(int i=0; i<mainArrayList.size();i++) {
//				ArrayList<Integer> a3 = mainArrayList.get(i);
//				for(int j=0; j<a3.size(); j++) {
//					System.out.print(a3.get(j) + " ");
//				}System.out.println();
//			}
			
//			Collections.sort(a1);
//			printArrayList(a1);
//			Collections.sort(a1, Collections.reverseOrder());
//			printArrayList(a1);
//			reverseArrayList(a1);
//			ArrayListOperations(a1,1);
//			ArrayListOperations(a1,2);
//			ArrayListOperations(a1,3);
//			findMax(a1);
//			swapNumbers(a1,0,4);
			targetSum(a1, 5);
		}
	}