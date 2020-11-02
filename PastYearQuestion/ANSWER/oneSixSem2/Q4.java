import java.util.Scanner;

class Q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int n = input.nextInt();
        System.out.print("Enter the length of a particular side of the regular polygon (in meter), s: ");
        int s = input.nextInt();

        System.out.printf("The area is: %.2f squared meters." , area(n,s) );
    }

    public static double area(int n, double s){
        return (n*Math.pow(s,2)/(4*Math.tan(Math.toRadians(180/n))));
    }
}
