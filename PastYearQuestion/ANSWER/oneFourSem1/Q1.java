package onefoursem1;
//1st error import
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Random;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        //2nd error no System.in
        Random r = new Random();
        int count = 0 ;
        int num;
        //3rd error nextInt(20)
        num = r.nextInt(20) + 1;
        
        while(true){
            //4th error num%2
            //5th error ==
            //6th error {}
            if(num%2 == 0){
                System.out.println("Even Number: Exit While Loop");
                break;
            }
            else{
                //7th error count++
                count ++;
                System.out.print(num + " ");
            }
        }
        //8th error + should be , 
        System.out.printf("\nThe total number of random odd number from 1 - 20 is : %f" , count);
    }
}

