import java.util.Random;
import java.util.Scanner;

class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Enter the number of random integer: ");
        int n = input.nextInt();
        int[] integer = new int[5];
        System.out.print("The random integer : ");
        for (int i = 0; i < n; i++) {
            integer[i] = rnd.nextInt(10001);
            System.out.print(integer[i] + " ");
        }

        int min = integer[0];
        for (int i = 0; i < integer.length; i++) {
            if (min > integer[i]) {
                min = integer[i];
            }
        }
        System.out.println("\nMinimum Number : " + min);
        System.out.print("The approximation of the integer to the nearest hundred  : ");
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 100 >= 50) {
                System.out.print(integer[i] - ((100 - integer[i] % 100)) + " ");
            } else {
                System.out.print(integer[i] - (integer[i] % 100) + " ");
            }
        }

        System.out.print("\nThe random integer in reverse order: ");
        for (int i = 0; i < integer.length; i++) {
            String num = Integer.toString(integer[i]);
            for (int j = num.length() - 1; j >= 0; j--) {
                System.out.print(num.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
