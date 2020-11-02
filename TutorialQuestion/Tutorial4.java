package TutorialQuestion;

import java.util.Scanner;
import java.util.Random;

public class Tutorial4 {

    public static void main(String[] args) {
        //Question1
        
        //a
        System.out.println((int)(Math.pow(2000, 1 / 3.0)));

        //b
        for (int i = 1; i < 13; i++) {
            double ans = Math.pow(i, 2);
            System.out.println("the square of " + i + " is " + ans);
        }

        //c
        Random ong = new Random();
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 5; column++) {
                int a = ong.nextInt(101);
                System.out.printf("%5d", a);
            }
        }
        //d
        System.out.println("\nEnter the value");
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        int sum = 0;
        for (int i = 1; i < c; i++) {
            sum += i;
        }
        System.out.println("The sum of the numbers is " + sum);

        //e
        double ans = 0;
        for (int i = 1; i < 26; i++) {
            ans += i / (26.0 - i);
        }
        System.out.printf("The sum of the series is %5.2f", ans);
/*
        //Question2
        //a
        for (x = 10; x > 0; x--) {
            sum +=x; 
        }

        //b
        do {
            int x+=2;
            int y+=x;
            System.out.println(x + " and " + y);
        } while (x < 100);

        //c
        for (int x = 1, y = 1; x < y; x++, y -= 2) {
            System.out.println(x + " " + y);
        }

        //不确定
        int i = 1;
        while (i < 10) {
            i++;
            if (i == 10) {
                System.out.println("Program End");
            }
        }
*/
        //Question3
        int f = 1; //f1
        int g = 1; //f2
        int value = 0;
        System.out.print("\nThe first ten values of Fibonacci sequence is " + f + ", " + g);
        for (int i = 0; i < 9; i++) { // in this loop , f is used to be a new number 
            f = f + g;//fn = fn-1 + fn-2
            System.out.print(", " + f);//print out fn
            value = f;//if we are using this value without changing the sequence for next loop,  
            f = g;
            g = value;//to change the g to fn-2 and f to fn-1 for the new loop
        }

        String space = input.nextLine();
        //Question4
        System.out.println("\nEnter the string");
        String h = input.nextLine();
        char l;
        for (int i = h.length() - 1; i >= 0; i--) {
            l = h.charAt(i);
            System.out.print(l);
        }
    }
}
