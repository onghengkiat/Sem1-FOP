package LabQuestion;
import java.util.Scanner;
import java.util.Random;
public class LabQuestion6 {
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        
        //Question2
        for (int i=0 ; i<5 ; i++){ //Printing triangle
            multiPrint (5-i,' ');
            multiPrint(i+1+i , '*');
            System.out.println(""); //Space a line
        }
        
        for (int i=0 ; i<5 ; i++){ //Printing upper and middle part of diamond
            multiPrint (5-i,' ');
            multiPrint(i+1+i , '*');
            System.out.println(""); //Space a line
        }
        for(int i=3;i>-1;i--){//Printing lower part of diamond
            multiPrint (5-i,' ');
            multiPrint(i+1+i , '*');
            System.out.println(""); //Space a line
        }
        
        //Question4
        System.out.println("gcd for 24 and 8 is " + gcd(24,8));
        System.out.println("gcd for 200 and 625 is " + gcd(200,625));
   
        //Question5
        Random rnd = new Random ();
        int answer= 1 , score = 0 , multiple1, multiple2;
        while (answer >=0 ){
            multiple1 = rnd.nextInt(13);
            multiple2 = rnd.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.print(multiple1 + " * " + multiple2 + " = ");
            answer = input.nextInt();
            if (AnsIsCorrect(multiple1, multiple2, answer)){
                score +=1;
            }
        }
        System.out.println(score);
        
        //Question6
        int palindromicCount=1 , emirpCount=1;
        
        for (int i=2;i<2000;i++){
            if(palindromicPrime(i)){
                System.out.println("The number " + palindromicCount + " palindromic prime is " + i);
                palindromicCount++;
                if (palindromicCount > 20)
                    break;
            }
        }
        for (int i=2;i<2000;i++){
            if(emirp(i)){
                System.out.println("The number " + emirpCount + " emirp is " + i);
                emirpCount++;
                if(emirpCount >20)
                    break;
            }
        }
    }
    //Question1
    public static void First20TriangularNumber(){
        int triangleNumber = 0;
        System.out.print("The triangular numbers are " + triangleNumber);
        for (int i=1 ; i<21 ; i ++){
            triangleNumber += i ;
            System.out.print(" ," + triangleNumber);
        }
    }
    
    //Question2
    public static void multiPrint (int n, char c){
        for (int i =0; i<n ; i++){
            System.out.print(c);
        }  
    }
    
    //Question3
    public static void ArrayReversing(int [] array){
        int temp=0;
        int ArrayLength=array.length/2;
        if(array.length%2 !=0){
            ArrayLength = (array.length+1)/2;
        }
        for (int i=0; i<ArrayLength;i++){
            temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    }

    
    //Question4
    public static int gcd(int a, int b){
       if (a>0 || b>0 ) {
            int max=0;
            if (a>b){
                max=a;
            }
            else {
                max = b;
            }
            for (int i = max ; i > 0 ; i--){
                if (a%i == 0 && b%i==0){
                    return i;
                }
            }
        }
        return 0;
    }
    
    //Question5
    public static boolean AnsIsCorrect(int a, int b, int c){
        int product = a*b;
        return c == product;
    }
    
    //Question6
    public static boolean palindromicPrime (int a){
        if (a==2){
            return false;
        }
        int reverse=0;
        int a2=a;
        
        while(a2!=0){
            reverse = reverse*10 + a2%10;
            a2/=10;
        }
        if (a != reverse){
            return false;
        }
        for (int i=2; i< a/2 ; i++){
            if (a%i == 0){
                return false;
            }
        }
        return true;
    }
    //Question6
    public static boolean emirp(int a){
        int reverse=0;
        int a2=a;
        
        while(a2!=0){
            reverse = reverse*10 + a2%10;
            a2/=10;
        }
        if(a == reverse){
            return false;
        }
        for (int i=2; i< a/2 ; i++){
            if (a%i == 0){
                return false;
            }
        }
        for (int i=2; i< reverse/2 ; i++){
            if (reverse%i == 0){
                return false;
            }
        }
        return true;
    }
}
