package oneNineSem2;

import java.util.Random;
import java.util.Scanner;

//1st error delete util Scanner 
public class Q1 {

    public static void main(String[] args) {
        //2nd error "" delte
        int[] num = {66, 15, 20, 27, 74, 33};
        int cnt = 0;

        //3rd error num.length() no need ()
        for (int k = 0; k < num.length; k++) {
             //4th error num become num[k]
            if (isEven(num[k])) {
                cnt++;
            }
        }

        //5th error . behind cnt
        System.out.println("The number of even integers is " + cnt + ".");
        //6th error findMax(num)
        System.out.println("The biggest integer is " + findMax(num));

    }

    //7th error static method
    public static boolean isEven(int a) {
        //8th error redundancy ? wonder consider or not
        return a % 2 == 0;
    }

    //9th error void become int
    public static int findMax(int[] a) {
        int max = a[0];

        //10th error , n = 1
        for (int n = 1; n < a.length; n++) {
            if (a[n] > max) {
                max = a[n];
            }
        }
        return max;

    }
}

