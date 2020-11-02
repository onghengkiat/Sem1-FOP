package onesixsem1;
import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;
public class Q1 {
    //1st error delete import Scanner
    public static void main(String[] args) {
        //2nd error no ""
        int [] num = {34,15,12,27,74,23};
        int cnt = 0;
        //3rd error num.length
        for(int i = 0 ; i < num.length ; i++)
            //6th error num[i]
            if(isEven(num[i]))
                cnt++;
        System.out.println("The number of even number is " + cnt);
        //7th error num[0] becomes num
        System.out.println("The sum of the array is " + getTotal(num));
    }
    
    //4th error static
    public static boolean isEven(int a){
        //5th error == 
        if(a%2 == 0)
            return true;
        else
            return false;
    }
    
    //8th error void becomes int
    public static int getTotal(int[]a){
        int total = 0;
        for(int i = 0 ; i< a.length; i ++)
            //9th error +=
            total += a[i];
        return total;
    }
}


