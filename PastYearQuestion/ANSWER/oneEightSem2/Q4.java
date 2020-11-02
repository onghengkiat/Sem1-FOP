import java.util.Scanner;

class Q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values for a,b,c,d,e and f : ");
        LinearEquation eq1 = new LinearEquation(input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());

        System.out.println("The equation :");
        System.out.println(eq1.toString());

        System.out.println("\nx = " + eq1.computeX() + " ; y = " + eq1.computeY());
    }
}
