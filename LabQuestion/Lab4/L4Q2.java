package LabQuestion.Lab4;

import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                sum += j;
            }
        }

        System.out.println("The sum is " + sum);
    }
}
