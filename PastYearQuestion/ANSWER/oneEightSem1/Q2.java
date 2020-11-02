package oneEightSem1;

import java.util.Random;
import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N number: ");
        int n = input.nextInt();
        System.out.print("The random numbers are: ");
        int aaa = 0;
        int aa = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            int randomNumber = rnd.nextInt(51) + 50;
            System.out.print(randomNumber + " ");
            if (randomNumber % 10 >= 7) {
                a++;
            } else if (randomNumber % 10 >= 4) {
                aa++;
            } else {
                aaa++;
            }
        }
        System.out.println("\nGroup AAA : " + aaa);
        System.out.println("Group AA : " + aa);
        System.out.println("Group A : " + a);
    }
}
