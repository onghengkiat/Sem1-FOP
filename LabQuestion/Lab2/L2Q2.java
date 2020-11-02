package LabQuestion.Lab2;

import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price of the car");
        double p = input.nextDouble();

        System.out.println("Enter down payment");
        double d = input.nextDouble();

        System.out.println("Enter interest rate in %");
        double r = input.nextDouble();

        System.out.println("Enter loan duration in year");
        double y = input.nextDouble();

        double m = (p - d)* (1 + r * y / 100) / (y * 12);
        System.out.printf("The monthly payment is %.2f",m);

    }
}
