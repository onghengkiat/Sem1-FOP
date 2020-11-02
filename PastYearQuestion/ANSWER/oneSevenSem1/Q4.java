import java.util.Scanner;

class Q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double real,imaginary;

        System.out.print("First complex number. Enter a number for the real part: ");
        real = input.nextDouble();
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        imaginary = input.nextDouble();
        Complex num1 = new Complex(real,imaginary);

        System.out.print("Second complex number. Enter a number for the real part: ");
        real = input.nextDouble();
        System.out.print("Second complex number. Enter a number for the imaginary part: ");
        imaginary = input.nextDouble();
        Complex num2 = new Complex(real,imaginary);

        System.out.println("First complex number: " + num1.toString());
        System.out.println("Second complex number: " + num2.toString());
        Complex.addComplexNum(num1, num2);
        Complex.substractComplexNum(num1, num2);
    }
}
