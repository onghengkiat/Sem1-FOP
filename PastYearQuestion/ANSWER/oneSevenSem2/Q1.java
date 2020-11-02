import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        //first error , no final
        int N;
        //2nd error , out becomes in
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        //3rd error , nextInt()
        N = s.nextInt();
        System.out.println("The first " + N + " triangular numbers");
        //4th error, i++
        for (int i = 1; i < N; i++) {
            System.out.print(getTriangular(i) + " ");
        }
        System.out.println("");
    }

    //5th error ,int n
    //8th error int return data type
    public static int getTriangular(int n) {
        //6th error initialize sum
        int sum = 0;
        for (int i = 1; i <= n; i++) //7th error += i
        {
            sum += i;
        }
        return sum;
    }
}
