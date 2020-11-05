package Lab2;

import java.util.Random;

public class L2Q3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int random_num1 = rnd.nextInt(41) + 10;
        System.out.println("The random number is " + random_num1);

        int random_num2 = rnd.nextInt(41) + 10;
        System.out.println("The random number is " + random_num2);

        int random_num3 = rnd.nextInt(41) + 10;
        System.out.println("The random number is " + random_num3);

        int sum = random_num1 + random_num2 + random_num3;
        System.out.println("Sum is " + sum);

        double average = sum/3.0;
        System.out.printf("Average is %.2f",average);
    }
}
