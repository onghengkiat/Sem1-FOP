package Lab3;

import java.util.Scanner;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.print("Enter the operand: ");
        char operand = input.next().charAt(0);
        double result = 0;

        if (operand == '/') {
            result = num1 / num2;
        }else if(operand == '+') {
            result = num1 + num2;
        }else if(operand == '-') {
            result = num1 - num2;
        }else if(operand == '*') {
            result = num1 * num2;

        }else if(operand == '%') {
            result = num1 % num2;
        }else {
            System.out.println("Invalid operand");
        }

        System.out.println(num1 + " " + operand + " " + num2 + " = " + result);
    }
}
