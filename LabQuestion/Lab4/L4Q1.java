
import java.util.Scanner;

public class L4Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = input.nextInt();
        System.out.print("The factors are: ");
        for(int i = 1 ; i <= num ; i++){
            if (i == num) {
                System.out.print(i);
                break;
            }

            if(num % i == 0)
                System.out.print(i + ", ");
        }
    }
}
