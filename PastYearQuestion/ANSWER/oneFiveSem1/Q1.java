package onefivesem1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        //1st error Scanner
        Scanner in = new Scanner(System.in);
        //2nd error String
        String reverse="" ;
        System.out.print("Enter a word: ");
        //3rd error in.next()
        String word = in.next();
        
        //4th error word.length();
        //5th error i --
        for(int i = word.length() - 1 ; i >= 0 ; i--){
            //6th error word.charAt(i)
            reverse = reverse + word.charAt(i);
        }
        
        //7th error word.equals(reverse)
        if(word.equals(reverse))
            System.out.println("The word is a palindrome");
        //8th error no if
        else 
            System.out.println("The word is not a palindrome");
    }
}

