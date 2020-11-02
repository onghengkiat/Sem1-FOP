import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of employee : ");
        int n = input.nextInt();
        String[] name = new String[n];
        double[] salary = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name : ");
            input.nextLine();
            name[i] = input.nextLine();
            System.out.print("Enter salary : ");
            salary[i] = input.nextDouble();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (salary[j + 1] < salary[j]) {
                    double temp = salary[j + 1];
                    salary[j + 1] = salary[j];
                    salary[j] = temp;

                    String temp1 = name[j + 1];
                    name[j + 1] = name[j];
                    name[j] = temp1;
                }
            }
        }

        System.out.println("Name of employees in increasing order of their salaries:  : ");
        for (int i = 0; i < n; i++) {
            System.out.print(name[i]);
            if (i != n - 1) {
                System.out.print("  ");
            }
        }
    }
}
