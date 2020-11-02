package TutorialQuestion;
import java.util.Scanner;
public class Tutorial2 {
    public static void main(String[] args) {
        /* Question 1 */
        System.out.print("Faculty ");
        System.out.print("of ");
        System.out.print("Computer ");
        System.out.print("Science ");
        System.out.print("and ");
        System.out.print("Information");
        System.out.print("Technology \n");
        
        System.out.println(" Faculty \n of \n Computer \n Science \n and \n Information \n Technology");
        
        /* Question 2*/
        System.out.println("\"SDN\" - Software-defined networking");
        Scanner input=new Scanner(System.in);
        
        /* Question 3*/
        System.out.println("Java Programming");
        System.out.println("Introduction to Java!");
        System.out.println("\t is the horizontal tab character");
        System.out.println("Java is case sensitive!");
        
        /* Question 4*/
        int variable;
        double pi;
        boolean M=false;
        long P = 8800000000L;
        char letter='U';
        final String PRO="JAVA";
        
        /* Question 5*/
        double AMOUNT=32.5;
        AMOUNT+=10;
        System.out.println("The amount is " + AMOUNT);
        
        String chapter="Summary";
        System.out.println("chapter");
        
        int num=0;
        ++num;
        num++;
        int num1=num;
        
        int NUM = 3000;
        System.out.printf("%4d\n",NUM);
        
        Scanner keyboard = new Scanner(System.in);
        String contact;
        contact= keyboard.nextLine();
        
        /* Question 6*/
        System.out.println("Enter the value of diameter");
        double diameter=keyboard.nextDouble();
        final double pie=3.142;
        double circumference= 2*pie*diameter/2;
        System.out.printf("The circumference of the circle is: %4.3f\n" , circumference);
        
        /* Question 7*/
        double metre, inch;
        System.out.println("Enter the value of inch");
        inch=keyboard.nextDouble();
        metre =0.0254*inch;
        System.out.printf( inch + " inch=%5.2f" + " metres ",metre);

    }
}