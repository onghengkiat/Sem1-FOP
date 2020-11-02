import java.util.Scanner;


class testQuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter values for a,b and c : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        QuadraticEquation equation1 = new QuadraticEquation(a, b, c);
        System.out.println("The equation is : " + a + "x(^2) + " + "(" + b + ")x + " + "(" + c + ")");
        System.out.println("Discriminant : " + equation1.Discriminant());
        if (equation1.Discriminant() == 0) {
            System.out.println("Same roots : " + equation1.calcRoot1());
        } else if (equation1.Discriminant() < 0) {
            System.out.println("The equation has no roots");
        } else {
            System.out.println("The roots : " + equation1.calcRoot1() + " and " + equation1.calcRoot2());
        }
    }
}

