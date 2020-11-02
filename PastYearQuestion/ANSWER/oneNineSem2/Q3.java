package oneNineSem2;

import java.util.Random;
import java.util.Scanner;

class Q3 {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        char retry = 'y';
        boolean first = true;
        while (retry == 'y') {
            if (first == false) {
                System.out.println("");
            }
            first = false;
            int number1 = rnd.nextInt(10);
            int number2 = rnd.nextInt(10);
            System.out.print("What is " + number1 + " + " + number2 + " ?");
            int answer = input.nextInt();
            boolean correct = true;

            System.out.println(number1 + " + " + number2 + " = " + answer + " is " + correct);
            System.out.print("Do you want to try another question (y/n) ? : ");

            if (answer == number1 + number2) {
                correct = true;
            } else {
                correct = false;
            }
            retry = input.next().charAt(0);

        }
        System.out.println("Program ends");
    }
}
