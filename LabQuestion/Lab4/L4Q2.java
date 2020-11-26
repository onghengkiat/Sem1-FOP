
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

        int sum_method2 = 0;
        int cumulative_sum = 0;
        for(int i = 1 ; i <= n ;i ++){
            cumulative_sum += i;
            sum_method2 += cumulative_sum;
        }

        System.out.println("The sum is " + sum);
        System.out.println("The sum using method 2 is " + sum_method2);
    }
}
