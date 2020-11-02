package LabQuestion;

import java.util.Scanner;
import java.util.Random;

public class LabQuestion4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Question1
        System.out.println("Enter the value to find its factor");
        
        int integer = input.nextInt();
        System.out.print("The factors are:");
        for (int i = 1; i <= integer; i++) {
            if (integer % i == 0) {
                System.out.print(i + ", ");
            }
        }
        //Question2
        System.out.println("\nEnter the number of n");
        int n = input.nextInt();
        int sum = 0, ong = 0;
        for (int i = 1; i <= n; i++) {
            ong = ong + i;
            sum = sum + ong;
        }
        System.out.println(sum);

        //Question3
        System.out.println("Enter a score");
        int x = input.nextInt();
        double Sum = 0, s;
        double SumSquare = 0;
        int N = 0;
        int max = x;
        int min = x;
        do {
            Sum = Sum + x;
            SumSquare = SumSquare + Math.pow(x, 2);
            N += 1;
            System.out.println("Enter a score (negative score to quit:)");
            x = input.nextInt();
            max = Math.max(max,x);
            min = Math.min (min,x);
        } while (x >= 0);
        double squareOfSum = Math.pow(Sum, 2);
        if (N > 1) {
            s = Math.pow((SumSquare - squareOfSum / N) / (N - 1), 0.5);
            System.out.println("The square of sum is " + squareOfSum);
            System.out.println("The minimum score is " + min);
            System.out.println("The maximum score is " + max);
            System.out.printf("The average score is %5.2f\n", (Sum) / N);
            System.out.printf("The value of s is %5.2f", s);
        } else {
            System.out.println("Please Enter more than 1 number");
        }

        //Question4
        System.out.println("Enter the year");
        int year = input.nextInt();
        System.out.println("Enter the first day of the year");
        int day = input.nextInt();
        int dayOfMonth = 31;
        int b;
        for (int month = 1; month <= 12;) { //to loop 12 times for 12 months
            System.out.println("");
            if (month == 1) {
                System.out.println("\t\t\t\tJANUARY");
            }
            if (month == 2) {
                System.out.println("\t\t\t\tFEBRUARY");
                if ( (year % 4 == 0 && year % 100 == 0 ) || year % 400 == 0) {
                    dayOfMonth = 29;
                }//if it is leap year
                else{
                    dayOfMonth = 28;
                }
            }
            if (month == 3) {
                System.out.println("\t\t\t\tMARCH");
                dayOfMonth = 31;
            }
            if (month == 4) {
                System.out.println("\t\t\t\tAPRIL");
                dayOfMonth = 30;
            }
            if (month == 5) {
                System.out.println("\t\t\t\tMAY");
                dayOfMonth = 31;
            }
            if (month == 6) {
                System.out.println("\t\t\t\tJUNE");
                dayOfMonth = 30;
            }
            if (month == 7) {
                System.out.println("\t\t\t\tJULY");
                dayOfMonth = 31;
            }
            if (month == 8) {
                System.out.println("\t\t\t\tAUGUST");
                dayOfMonth = 31;
            }
            if (month == 9) {
                System.out.println("\t\t\t\tSEPTEMBER");
                dayOfMonth = 30;
            }
            if (month == 10) {
                System.out.println("\t\t\t\tOCTOBER");
                dayOfMonth = 31;
            }
            if (month == 11) {
                System.out.println("\t\t\t\tNOVEMBER");
                dayOfMonth = 30;
            }
            if (month == 12) {
                System.out.println("\t\t\t\tDECEMBER");
                dayOfMonth = 31;
            }
            month++;
            System.out.println("     Sunday    Monday    Tuesday   Wednesday Thursday  Friday   Saturday");
            for (int a = 0; a < (day % 7); a++) {
                System.out.print("          ");
            }//to space the numbers to the middle under day
            for (b = 0; b < day % 7;) {
                System.out.printf("%10d", b + 1);
                b++;
                day++;
            }//print out the first line

            System.out.println("");
            for (int a = day % 7 + b; a < dayOfMonth;) { //to make loop to print out the numerous columns
                for (int c = day % 7; c < 7; c++) { // to make loop to print out the rows
                    a++;
                    System.out.printf("%10d", (a));
                    if (a >= (dayOfMonth)) {
                        break;//to stop the loop after printing out the day of month
                    }
                    day++; //to make it as a count 

                }
                System.out.println("");
                if (a >= (dayOfMonth)) {
                    break; //to prevent it from printing an extra line
                }
            }
            day++;

        }
        
        //Question5
        Random rnd = new Random();
        int player1, player2;
        int sum1 = 0, sum2 = 0;
        String enter;
        while (sum1 < 100 && sum2 < 100) { //to make a loop when no one exceeds 100 marks
            System.out.println("Click enter to continue");
            enter=input.nextLine();
            player1 = rnd.nextInt(6) + 1; //generate a random number between 1 and 6
            sum1 += player1; // add the number generate into the score
            System.out.println("Player1 hits " + player1 + "\nPlayer 1 score: " + sum1);
            while (player1 == 6) {
                System.out.println("Click enter to continue");
                enter=input.nextLine();
                player1 = rnd.nextInt(6) + 1;
                sum1 += player1;
                System.out.println("Player1 hits " + player1 + "\nPlayer 1 score: " + sum1);
            } //roll once more if player1 gets number 6
            if (sum1 >= 100) {
                break;//to stop the game if first player have exceed 100 marks
            }
            System.out.println("Click enter to continue");
            enter=input.nextLine();
            player2 = rnd.nextInt(6) + 1; //generate a random number between 1 and 6
            sum2 += player2; // add the number generated into the score
            System.out.println("Player2 hits " + player2 + "\nPlayer 2 score: " + sum2);
            while (player2 == 6) {
                System.out.println("Click enter to continue");
                enter=input.nextLine();
                player2 = rnd.nextInt(6) + 1;
                sum2 += player2;
                System.out.println("Player2 hits " + player2 + "\nPlayer 2 score: " + sum2);
            } // roll once more if player2 gets number 6
        }
        if (sum2 > sum1) {
            System.out.println("Player 2 wins");
        } else {
            System.out.println("Player 1 wins");
        }

        //Question6
        int integer2 = rnd.nextInt();
        int length = (int) (Math.log10(Math.abs(integer2)) + 1);//becauuse log10 will simply help us to get to know it is the multiple of how many 10
        if (integer2 == 0) //because log 0 is undefined
        {
            System.out.println("The integer is " + integer2 + " while the number of digits is " + 0);
        } else {
            System.out.println("The integer is " + integer2 + " while the number of digits is " + length);
        }
        
        //Question7
        System.out.println("Enter principal amount:");
        double P = input.nextDouble();//Principal
        System.out.println("Enter interest in %");
        double I = input.nextDouble();//yearly interest rate in%
        System.out.println("Enter total number of month(s)");
        double NN = input.nextDouble();//total number of months
        double M = (P * I / (12 * 100)) / (1 - Math.pow((1 + I / (12 * 100)), -NN));
        double C, L, R, totalInterest=0;
        System.out.println("Month     Monthly payment           Principal            Interest      Unpaid Balance      Total Interest");
        for (int nn = 1; nn < NN+1; nn++) {//number of month
            C = M * Math.pow((1 + I / (12 * 100)), -(1 + NN - nn));//Principal portion due
            L = M - C; //interest due
            R = L / (I / (12 * 100)) - C;//remaining principal balance due
            totalInterest +=L;
            System.out.printf("%2d   %20.2f%20.2f%20.2f%20.2f%20.2f\n",nn,M,C,L,R,totalInterest);
        }

        //Question8
        int xyz = 100;
        int count = 0; //initialise a counter to count the number of prime number printed
        System.out.println("The number of prime number shown is " + xyz);
        for (int i = 2; i < 20000; i++) { //simply build a huge data for looping where it will break in the midway
            boolean prime = true;
            for (int j = 2; j <= i / 2; j++) { //this is to build a set of value as a divisor
                if (i % j == 0) {
                    prime = false;
                    break; //to break the loop when we found that it is not prime number
                }
            }
            if (prime == true) {
                count++; //add 1 to count for every prime number printed
                System.out.println("The number " + count + " prime number is " + i);
            }
            if (count == xyz) {
                break; //to break the loop when it meets the condition
            }
        }
    }
}
