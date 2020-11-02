import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student name:");
            name[i] = input.nextLine();
        }
        System.out.println("The student name in alphabetical order are: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (name[j + 1].compareToIgnoreCase(name[j]) < 0) {
                    String temp = name[j + 1];
                    name[j + 1] = name[j];
                    name[j] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i]);
        }
    }
}
