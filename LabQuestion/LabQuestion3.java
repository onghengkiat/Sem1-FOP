package LabQuestion;
import java.util.Scanner;
import java.util.Random;
public class LabQuestion3 {
    public static void main(String[] args) {
        //Question1
        Scanner in=new Scanner(System.in);
       
        System.out.println("Enter two numbers");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println("Enter the operand");
        char operand=in.next().charAt(0);
        int ans=0;
        if (operand=='-')
            ans= num1 - num2 ;
        if (operand == '+')
            ans = num1 + num2;
        if (operand == '/')
            ans= num1 / num2;
        if (operand == '*')
            ans = num1 * num2;
        if (operand == '%')
            ans = num1 % num2;
        System.out.println(num1 +" "+ operand +" "+ num2 + " = " + ans);
         
        //Question2
        Random ran=new Random();
        int z= ran.nextInt(5);
        if (z == 0)
            System.out.println(z + " is zero ");
        if (z == 1) 
            System.out.println(z+ " is one ");
        if (z == 2)
            System.out.println(z + " is two ");
        if (z == 3) 
            System.out.println(z + " is three ");
        if (z == 4) 
            System.out.println(z + " is four ");
        if (z == 5)
            System.out.println(z + " is five ");
        else
            System.out.println("Something is wrong");
        
        /*Alternative choice which is better by using array
        String [] array={"zero" , "one " , "two", "three", "four" ,"five"}
        int z= ran.nextInt(6);
        System.out.println(z+ " is " + array[z])
        */
                    
        //Question3
        double sales= in.nextDouble();
        double commission=0;
        if (sales <= 100)
            commission = sales*0.05;
        else if (sales >100 && sales<=500)
            commission = sales*0.075;
        else if (sales >500 && sales <= 1000)
            commission = sales*0.1;
        else if (sales>1000)
            commission = sales*0.125;
        System.out.printf("The commission is %5.2f \n", commission);
        
        //Question4
        System.out.println("It is a simple dice game");
        int dice1=ran.nextInt(6)+1;
        int dice2=ran.nextInt(6)+1;
        int dice3=ran.nextInt(6)+1;
        int dice4=ran.nextInt(6)+1;
        int player1 = dice1 + dice2;
        int player2 = dice3 + dice4;
        if (player1 > player2)
            System.out.println("Player 1 win");
        else if (player2 > player1)
            System.out.println("Player 2 win");
        else 
            System.out.println("Draw");
        
        //Question5
        System.out.println("Enter the value a,b,c,d,e and f");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        int e=in.nextInt();
        int f=in.nextInt();
        if (a*d-b*c == 0)
            System.out.println("The equation has no solution");
        else{
            int x=(e*d - b*f)/(a*d - b*c);
            int y=(a*f - e*c)/ (a*d - b*c);
            System.out.println("x is " + x + " and the y is "+ y);
        }
       
        //Question6
        System.out.println("Enter the value of radius, x and y coordinate for the point");
        double radius=in.nextDouble();
        double xpoint=in.nextDouble();
        double ypoint=in.nextDouble();
        double distance= Math.pow((Math.pow(xpoint,2)+Math.pow(ypoint,2)),0.5);
        System.out.println(distance);
        if (distance > radius)
            System.out.println("The point is outside the circle");
        else 
            System.out.println("The point is inside the circle");
        
        }
    }    

