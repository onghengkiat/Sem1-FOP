package onethreesem1;
//1st error
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        //2nd error System.in
        Scanner s = new Scanner(System.in);
        char letter;
        String temp;
        //3rd error = 0
        int count = 0;
        do{
            System.out.print("Enter a letter (Q to quit): ");
            //4rd error next().charAt(0)
            letter = s.next().charAt(0);
            //5th error == 
            if(letter == 'Q')
                break;
            else
                //6th error count++
                count++;
        }while(letter != 'Q'); //7th error missing ;
        //8th error &d
        System.out.printf("The total of number of character you enter is : %d", count);
    }
}

