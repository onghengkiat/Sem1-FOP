import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number in pounds: ");
        double pound = input.nextDouble();
        double kilo = pound * 0.454;
        System.out.println(pound + " pounds is " + kilo + " kilograms");
    }
}
