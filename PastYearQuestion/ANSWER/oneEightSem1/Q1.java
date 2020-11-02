package oneEightSem1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        //1st error Random become Scanner
        //2nd error out becomes in
        Scanner a = new Scanner(System.in);
        int num, sum = 0;
        do{
            System.out.print("Enter an integer number, -1 to quit:");
            //3rd error double become int
            num = a.nextInt();
            //4th error = should be ==
            //5th error to break the loop immediately, it should be break instead of continue
            if(num == -1)
                break;
            //6th error for even number it should be == 0
            if(num%2 == 0)
                System.out.println("The number is an even number");
            else
                System.out.println("The number is an odd number");
            //7th error = should be +=
            sum += num;
        }while( num != -1); //8th error == should be != 9th error should put ; at the end
        //10th error + should be ,
        System.out.printf("The sum of all integer number(s) is : %5d\n", sum);
    }
}
