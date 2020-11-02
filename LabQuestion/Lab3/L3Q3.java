package LabQuestion.Lab3;

import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sales volume: ");
        double sales = input.nextDouble();
        double commission = 0;
            if(sales <= 100)
                commission = sales*0.05;
            else if(sales <= 500)
                commission = sales*0.075;
            else if(sales <= 1000)
                commission = sales*0.1;
            else
                commission = sales*0.125;
        System.out.printf("The commission is %.2f" , commission);
    }
}
