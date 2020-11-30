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
        int sum =0;
        for (int i=0; i<N; i++){
            score [i] = rnd.nextInt(101);
            sum += score[i];
            System.out.println("The score is " + score[i]);
        }
        int average = sum / N;

        //this one is basically sorting the score array
        Arrays.sort(score);

        System.out.println("The lowest score is " + score[0]);
        System.out.println("The highest score is " + score [N-1]);
        System.out.println("The average score is " + average);
    }
}
