package finalfop;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        System.out.println("This program changes all the odd numbers in the array into even numbers.");
        //1st error System.in
        Scanner s = new Scanner(System.in);
        int size = 5;
        //2nd error int [] num
        int [] num = new int[size];
        System.out.print("Enter five integer numbers : ");
        //3rd error int i = 0;
        for (int i = 0; i < size; i++) {
            //4th error nextInt();
            num[i] = s.nextInt();
        }
        //5th error num
        convert(num);
        System.out.print("The numbers are : ");
        for (int i = 0; i < size ; i++) {
            //10th error num[i]
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    
    //6th error static
    public static void convert(int [] a){
        //7th error a.length
        for (int i = 0; i < a.length; i++) {
            //8th error a[i]
            if(a[i]%2 == 1){
                //9th error +=1 
                a[i] += 1;
            }
            
        }
    }
    
}
