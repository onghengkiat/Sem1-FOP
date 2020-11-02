package onesevensem1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0, number2 = 0, number3 = 0, number4 = 0,number5 = 0;
        int inputNumber ; //number entered by user
        int value = 0; //number of starts to print
        //1st error int
        int counter = 1;//counter for current number
        
        //2nd error no int
        while(counter <= 5){
            System.out.print("Enter number: ");
            inputNumber = input.nextInt();
            //define appropriate num if input is between 1-30
            if(inputNumber >= 1 && inputNumber <= 30){
                //3rd error inputNumber should be counter
                switch(counter){
                    case 1: number1 = inputNumber; break;
                    case 2: number2 = inputNumber; break;
                    case 3: number3 = inputNumber; break;
                    case 4: number4 = inputNumber; break;
                    case 5: number5 = inputNumber; break;
                }
                //4th error } is missing 
                counter++;
            }// end if
            else
                System.out.println( "Invalid Input\nNumber should be between 1 and 30" );
        }//end while
        // print histograms
        //5th error first , should be ;
        //6th error second , should be ;
        //7th error counter <= 5
        for(counter = 1 ; counter <= 5 ; counter++){
            //8th error switch(counter)
            switch(counter){
                case 1: value = number1; break;
                case 2: value = number2; break;
                case 3: value = number3; break;
                case 4: value = number4; break;
                case 5: value = number5; break;
            }//switch 
            //9th and 10th error int one time only
            for(int j = 1; j <= value ; j++)
                System.out.print("*");
            System.out.println("");
        }//end for loop
    }//end main
}//end class


