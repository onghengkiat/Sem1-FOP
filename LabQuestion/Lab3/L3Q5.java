package Lab3;

import java.util.Scanner;

public class L3Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = input.nextDouble();
        System.out.print("Enter b : ");
        double b = input.nextDouble();
        System.out.print("Enter c : ");
        double c = input.nextDouble();
        System.out.print("Enter d : ");
        double d = input.nextDouble();
        System.out.print("Enter e : ");
        double e = input.nextDouble();
        System.out.print("Enter f : ");
        double f = input.nextDouble();
        if (a*d - b*c == 0)
            System.out.println("The equation has no solution");
        else{
            // 3x + y = 12, a=3,b=1,e=12
            // 2x + y = 11  c=2,d=1,f=11
            // x = 1, y = 9
            double x = (e*d-b*f)/(a*d-b*c);
            double y = (a*f-e*c)/(a*d-b*c);
            System.out.println("Value of x is " + x);
            System.out.println("Value of y is " + y);
        }


    }
}
