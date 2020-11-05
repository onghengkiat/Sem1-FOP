package Lab3;

import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter coordinate x:");
        double x = input.nextDouble();
        System.out.print("Enter coordinate y:");
        double y = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        if(distance > radius)
            System.out.println("Outside the circle");
        else
            System.out.println("Inside the circle");
    }
}
