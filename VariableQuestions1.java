import java.util.Scanner;

public class VariableQuestions1{
    public static void main(String[]args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);

        //Question - 1
        /*
        System.out.println("Enter 3 Numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int avg = (A+B+C)/3;
        System.out.println("Average of 3 Numbers is: " + avg);
         */

        
        //Question - 2
        /*
        System.out.println("Enter side of a square: ");
        int size = sc.nextInt();

        int area = size*size;
        System.out.println("The area of a square is: " + area);
         */
    
        //Question - 3
        /*
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pencil+pen+eraser;
        System.out.println("Bill is : "+total);
        //Add on - with 18% tax
        float newTotal=total+ (0.18f*total);
        System.out.println("Bill with 18% tax : "+newTotal);
         */

        //Question - 4
        int x, y, z;
        x = y = z = 2;
        x += y;
        System.out.println(x);
        y -= z;
        System.out.println(y);
        z /= (x + y);
        System.out.println(z);
       
    }
}