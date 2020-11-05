package Lab2;

import java.util.Scanner;

public class L2Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = input.nextInt();
        int s = seconds % 60;
        int minutes = (seconds - s )/60;
        int m = minutes % 60;
        int hours = (minutes - m )/60;
        System.out.println(seconds  + " seconds is " + hours + " hours, " + m + " minutes and " +s + " seconds");
    }
}
