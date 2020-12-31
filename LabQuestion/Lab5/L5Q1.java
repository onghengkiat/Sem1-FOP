
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L5Q1 {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);
        Random rnd= new Random();
        System.out.println("Please enter the number of students");
        int N = input.nextInt();
        int [] score = new int [N];
        double sum =0;
        for (int i=0; i<N; i++){
            score [i] = rnd.nextInt(101);
            sum += score[i];
            System.out.println("The score is " + score[i]);
        }
        double average = sum / N;

        //this one is basically sorting the score array to find the min and max value
        //ps: this is made by me 1 year ago, seems like that time I was very lazy :P, sry for that
        Arrays.sort(score);

        System.out.println("The lowest score is " + score[0]);
        System.out.println("The highest score is " + score [N-1]);
        System.out.printf("The average score is %.2f" , average);
    }
}