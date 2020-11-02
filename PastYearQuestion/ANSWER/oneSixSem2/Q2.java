import java.util.Scanner;

class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        String num = input.nextLine();
        int sum = 0 ;
        for(int i = 0 ; i < num.length(); i ++){
            sum += (num.charAt(i)-'0');
        }
        System.out.println("The sum of the digits is " + sum);

    }
}
