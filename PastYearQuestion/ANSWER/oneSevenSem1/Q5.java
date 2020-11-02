import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks for Grammer (maximum 30 marks): ");
        int grammer = input.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int spelling = input.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int length = input.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = input.nextInt();

        System.out.println("\n");
        GradedActivity student1 = new Essay(grammer, spelling, length, content);
        System.out.println(student1.toString());
    }
}
