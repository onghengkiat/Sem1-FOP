package LabQuestion.Lab4;

import java.util.Scanner;

public class L4Q4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year: ");
        int first_day = input.nextInt();
        int days = 0;
        //february only 29 days
        if (year % 4 ==0 && year % 100 != 0)
            days = 31 + 29 + 31 + 30 ;
        else
            days = 31+28+31+30;

        first_day += days;
        first_day %= 7;
        //May
        System.out.printf("|%12s%13s%13s%13s%13s%13s%13s\n", "Sunday|","Monday|","Tuesday|","Wednesday|","Thursday|","Friday|","Saturday|");
        for(int i = 0 ; i < first_day ; i++){
            System.out.printf("%13s"," ");
        }
        for(int i = 1 ; i <= 31 ; i ++){
            System.out.printf("%13d",i);
            first_day++;
            if(first_day % 7 == 0)
                System.out.println();
        }

        System.out.println("\n\n");

        //June
        System.out.printf("|%12s%13s%13s%13s%13s%13s%13s\n", "Sunday|","Monday|","Tuesday|","Wednesday|","Thursday|","Friday|","Saturday|");

        first_day %= 7;
        for(int i = 0 ; i < first_day ; i++){
            System.out.printf("%13s"," ");
        }
        for(int i = 1 ; i <= 30 ; i ++) {
            System.out.printf("%13d", i);
            first_day++;
            if (first_day % 7 == 0)
                System.out.println();
        }
    }
}
