package LabQuestion;
import java.util.Scanner;
import java.util.Random;
public class LabQuestion2{

    public static void main(String[] args) {
//Question1


Scanner input=new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
double Fahrenheit=input.nextDouble();
double Celsius= (Fahrenheit-32)/1.8;
        System.out.printf(Fahrenheit +" Fahrenheit=" + "%5.2f Celcius\n", Celsius );
    
//Question2
double P,D,R,Y,M;
System.out.println("Enter the price of the car, down payment, interest rate and loan duration in year");
P=input.nextDouble();
D=input.nextDouble();
R=input.nextDouble();
Y=input.nextDouble();
M=(P-D)*(1+R*Y/100)/(Y*12);
System.out.println("The monthly payment for the car is "+ M);

//Question3
Random ran=new Random();
System.out.println("Now, we will generate 3 numbers");
int num1=ran.nextInt(40)+10;
int num2=ran.nextInt(40)+10;
int num3=ran.nextInt(40)+10;
int sum=num1+num2+num3;
        System.out.println("The three number is "+num1+","+num2+" and "+ num3);
        System.out.println("The sum of the numbers is "+ sum );
   
//Question4
System.out.println("Enter the time in seconds");
int time=input.nextInt();
int sec= time%60;
int min= time/60%60;
int hour= time/3600;
System.out.println(time + " seconds is " + hour + " hours, " + min + " minutes and "+ sec + " seconds");

//Question5
int num=ran.nextInt(10000);
System.out.println("The number is "+num);
int Sum=num/10000+ num%10 + num/1000%10 + num/100%10 +num/10%10;
System.out.println("The sum of all the digits in the numebr is " + Sum);

//Question6
System.out.println("Enter the weight of water in gram, initial temperature and final temperature in Fahrenheit");
double m=input.nextDouble()/1000;
double initemp=input.nextDouble();
double fintemp=input.nextDouble();
double Q= m* (fintemp - initemp)*5/9*4184;
System.out.printf("The energy needed is %e", Q);
    }
}
    


