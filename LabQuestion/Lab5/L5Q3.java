package Lab5;
import java.util.Random;
import java.util.Scanner;

public class L5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("\nEnter the number of workers");
        int n = input.nextInt();
        int totalHour = 0;
        for (int worker=0;worker<n;worker++){
            int [] sevenDay = new int[7];

            //randomly generate the work hours for each day
            for(int i = 0 ; i<7 ; i++){
                sevenDay[i]=rnd.nextInt(8)+1;
                totalHour += sevenDay[i];
            }

            System.out.print("The work hours for worker " + (worker+1) + " is");
            for(int i=0 ; i<7; i++)
                System.out.print(" " + sevenDay[i]);//print out the work hours for the worker for every day in a week
            System.out.println("\nThe total work hours for worker " + (worker+1) + " is " + totalHour);//print out the total hours
            totalHour=0;//reset the totalHour for the next worker

            System.out.println("");//to proceed to a new line after each worker's work hours printed
        }
    }
}
