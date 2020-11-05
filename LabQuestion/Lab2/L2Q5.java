package Lab2;

import java.util.Random;

public class L2Q5 {
    public static void main(String[] args) {
        //A sample to show how it works
        //System.out.println(6/10);

        Random rnd = new Random();
        int rnd_number = rnd.nextInt(10001);
        System.out.println("The random number is " + rnd_number);
        int sum_of_digits = 0;
        while(rnd_number != 0 ){
            sum_of_digits += rnd_number%10;
            rnd_number /= 10;
        }
        System.out.println("The sum of digit is " + sum_of_digits);
    }
}
