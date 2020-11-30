import java.util.Random;
import java.util.Scanner;

public class L6Q5 {
    public static void main(String[] args) {
        Random rnd = new Random ();
        Scanner input =new Scanner(System.in);
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
        System.out.println("Score: " +score);
    }

    public static boolean AnsIsCorrect(int a, int b, int c){
        int product = a*b;
        return c == product;
    }
}
