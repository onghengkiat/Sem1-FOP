package TutorialQuestion;
import java.util.Scanner;
public class Tutorial3 {
    public static void main(String[] args) {
   // Question 1
   //a
   /*
   if (3*8==27)
       System.out.println("Yes,it is");
   else
       System.out.println("Nope, it is not");
   //b
   Scanner input=new Scanner(System.in);
   System.out.println("Enter a number");
   int a=input.nextInt();
   if (a%2==0)
       System.out.println("It is even number");
   else 
       System.out.println("It is odd number");
   //c
   System.out.println("Enter a character");
   char b=input.next().charAt(0);
   char[]array= new char[26];
   array[0]='A';
   for (int c=1;c<26;c++){
       array[c] = (char)(array[(c-1)]+1);
   
   if (b==array[c])
           System.out.println("It is a capital letter");
   else 
           System.out.println("It is not a capital letter");
   }
      */
   //d
   Scanner input =new Scanner(System.in);
   System.out.println("Enter two strings");
   String e=input.next();
   String f=input.next();
   if (e.compareToIgnoreCase(f)>0){
            System.out.println(e.compareToIgnoreCase(f));
            System.out.println("The strings are " + f +" and followed by "+ e);
   }
   else 
            System.out.println("The strings are " + e + " and followed by " + f);
   
   //e
   int g=input.nextInt();
   switch (g){
       case 0: 
           System.out.println("Sunday");
                  break;
       case 1:
           System.out.println("Monday");
       case 2:
           System.out.println("Tuesday");
       case 3:
           System.out.println("Wednesday");
       case 4:
           System.out.println("Thursday");
       case 5:
           System.out.println("Friday");
       case 6:
           System.out.println("Saturday");
       default:
           System.out.println("Please enter an integer between 0 and 6");
   }
   
   //Question2
   //a
        System.out.println("Enter num1 and num2");
   int num1=input.nextInt();
   int num2=input.nextInt();
   if (num1==num2)
       System.out.println("Number 1 is equal to number 2.");
   
   //b
        System.out.println("Enter x , y and z");
   int x=input.nextInt();
   int y=input.nextInt();
   int z=input.nextInt();
   if(x>y && x>z)
            System.out.println("X is the largest number");
       
   //c
   String s1=input.next(),s2=input.next();
   if (s1.equals(s2))
            System.out.println("They are equal strings.");
   else
            System.out.println("They are not equal strings");
   
   //Question 3
   //a
   //Run time error
           
   //b
   //##### and $$$$$
   
   //c
   //$$$$$
   
   //d
   //nothing
  
   //Question 4
    x=input.nextInt();
    y=input.nextInt();
    z=input.nextInt();
   int max=0;
   if (x>y){
       max=x;
       if (x<z)
           max=z;
   }
   if(x<y){
       max=y;
       if(z>y)
           max=z;
   }
   System.out.println(max);
   
   //Question5
   int leap=input.nextInt();
   if (leap%4==0 && leap%100!=0 || leap%400==0)
            System.out.println(leap + " is a leap year.");
   else
            System.out.println(leap+ " is not a leap year");
    }
}
