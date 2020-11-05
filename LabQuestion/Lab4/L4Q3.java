package Lab4;

import java.util.Scanner;

public class L4Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0 ;
        int n = 0 ;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum_square = 0;
        while(true) {
            System.out.print("Enter a score [negative score to quit]:");
            score = input.nextInt();
            if(score < 0)
                break;

            sum += score;
            sum_square += Math.pow(score,2);
            if (score < min)
                min = score;
            if (score > max)
                max = score;
            n++;
        }
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        double average = sum/n;
        System.out.printf("Average Score: %.2f \n" ,average);
        double std = Math.sqrt( (sum_square- Math.pow(sum,2)/n )/(n-1));
        System.out.printf("Standard Deviation: %.2f",std);

    }
}
