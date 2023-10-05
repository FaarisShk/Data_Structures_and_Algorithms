public class ComplexNumbers {
    int real;
    int img;

    ComplexNumbers(int real, int img){
        this.real = real;
        this.img = img;
    }

    public void display(ComplexNumbers c1){
        System.out.println(real + " + " + " i" + img);
    }

    public static ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2){
        ComplexNumbers temp = new ComplexNumbers(0, 0);
        temp.img = c1.img+c2.img;
        temp.real = c1.real+c2.real;

        return temp;
    }

    public static ComplexNumbers sub(ComplexNumbers c1, ComplexNumbers c2){
        ComplexNumbers temp = new ComplexNumbers(0, 0);
        temp.img = c1.img-c2.img;
        temp.real = c1.real-c2.real;

        return temp;
    }

    public static ComplexNumbers mul(ComplexNumbers c1, ComplexNumbers c2){
        ComplexNumbers temp = new ComplexNumbers(0, 0);
        temp.img = c1.img*c2.img;
        temp.real = c1.real*c2.real;
        return temp;
    }

    public static ComplexNumbers div(ComplexNumbers c1, ComplexNumbers c2){
        ComplexNumbers temp = new ComplexNumbers(0, 0);
        temp.img = c1.img/c2.img;
        temp.real = c1.real/c2.real;

        return temp;
    }

    public static void main(String[]args){
        ComplexNumbers c1 = new ComplexNumbers(10, 5);
        ComplexNumbers c2 = new ComplexNumbers(12, 4);

        c1.display(c1);
        c2.display(c2);

        ComplexNumbers c3 = add(c1, c2);
        c3.display(c3);
    }
}
