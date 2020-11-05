package Lab2;

import java.util.Scanner;

public class L2Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double water = input.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initial_t = (input.nextDouble() - 32)/1.8;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double final_t = (input.nextDouble() - 32)/1.8;

        //water/1000 need to be double value
        //remember to convert fahrenheit to celcius
        //and also gram to kilogram
        double q = water/1000 * (final_t - initial_t) * 4184;
        System.out.printf("The energy need is %.6e" , q);

    }
}
