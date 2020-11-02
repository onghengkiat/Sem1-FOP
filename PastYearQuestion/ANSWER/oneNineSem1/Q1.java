package oneninesem1;

import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        System.out.println("This program shows the number of odd and even number from 10 random numbers."
                + " The random numbers must be from 0 - 100");
        int num, odd = 0, even = 0;

        //1st error Scanner to Random
        Random r = new Random();

        //2nd error i<= 10
        //3rd error , become ; 
        //4th error i-- become i++
        for (int i = 1; i <= 10; i++) {
            //5th error nextInt(101)
            num = r.nextInt(101);
            System.out.print(num + " ");

            //6th error !isEven(num)
            if (!isEven(num)) {
                ++even;
            } else {
                ++odd;
            }
        }

        System.out.println("\nNumber of odd number: " + odd);

        //7th error , becomes +
        System.out.println("Number of even number: " + even);
    }

    //8th error static method
    //9th error int a
    public static boolean isEven(int a) {
        //10th error a%2 == 0 is even
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

