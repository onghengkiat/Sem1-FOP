import java.util.Scanner;

public class L4Q7 {
    public static void main(String[] args) {
        System.out.print("Enter principal amount: ");
        Scanner input = new Scanner(System.in);
        double principal_amount = input.nextDouble();
        System.out.print("Enter interest in %: ");
        double interest = input.nextDouble();
        while(interest < 0 || interest >100){
            System.out.println("Interest in % couldn't bigger than 100 or smaller than 0");
            System.out.print("Enter interest in %: ");
            interest = input.nextDouble();
        }

        System.out.print("Enter total number of month(s): ");
        int number_of_month = input.nextInt();

        double monthly_payment = (principal_amount * (interest/(12*100)) )/ (1 - Math.pow((1 + interest/ (12*100) ), -number_of_month ) );
        System.out.printf("%-20s%20s%20s%20s%20s%20s\n","Month","Monthly Payment","Principal","Interest","Unpaid Balance","Total Interest");
        double total_interest = 0;
        for (int i = 1; i <= number_of_month ; i++) {
            double principal_portion_due = monthly_payment * Math.pow( (1 + interest/ (12*100) ), -(1+number_of_month-i) );
            double interest_due = monthly_payment - principal_portion_due;
            total_interest += interest_due;
            double remaining_principal_balance_due = (interest_due/ (interest / (12*100)) )  - principal_portion_due;
            System.out.printf("%-20d%20.2f%20.2f%20.2f%20.2f%20.2f\n", i, monthly_payment, principal_portion_due, interest_due,  remaining_principal_balance_due, total_interest);
        }
    }
}
