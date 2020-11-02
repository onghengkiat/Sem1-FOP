import java.util.Random;
import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of random integer: ");
        int n = input.nextInt();
        int[] integer = new int[n];
        for (int i = 0; i < n; i++) {
            integer[i] = rnd.nextInt(1001);
        }
        displayInteger(integer);
        System.out.println("");

        displayMaxNum(integer);
        System.out.println("");

        displayRoundNum(integer);
        System.out.println("");

        reverseInteger(integer);
        System.out.println("");
    }

    public static void displayInteger(int[] integer) {
        System.out.print("The random integer : ");
        for (int i = 0; i < integer.length; i++) {
            System.out.print(integer[i] + " ");
        }
    }

    public static void displayMaxNum(int[] integer) {
        int max = integer[0];
        for (int i = 1; i < integer.length; i++) {
            if (integer[i] > max) {
                max = integer[i];
            }
        }
        System.out.print("Maximum Number : " + max);
    }

    public static void displayRoundNum(int[] integer) {
        System.out.print("The approximation of the integer to the nearest tenth : ");
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 10 <= 4) {
                System.out.print(integer[i] - integer[i] % 10 + " ");
            } else {
                System.out.print(integer[i] + (10 - integer[i] % 10) + " ");
            }
        }
    }

    public static void reverseInteger(int[] integer) {
        System.out.print("The random integer in reverse order: ");
        for (int i = 0; i < integer.length; i++) {
            String num = Integer.toString(integer[i]);
            for (int j = num.length() - 1; j >= 0; j--) {
                System.out.print(num.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
