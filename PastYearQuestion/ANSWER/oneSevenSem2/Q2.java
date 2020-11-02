import java.util.Scanner;

class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of teams: ");
        int numTeam = input.nextInt();
        String[] name = new String[numTeam];
        int[] score = new int[numTeam];
        for (int i = 0; i < numTeam; i++) {
            input.nextLine();
            System.out.print("Enter team " + (i + 1) + " sname: ");
            name[i] = input.nextLine();
            System.out.print("Enter team " + (i + 1) + " score: ");
            score[i] = input.nextInt();
        }

        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - 1; j++) {
                if (score[j + 1] > score[j]) {
                    int temp = score[j + 1];
                    score[j + 1] = score[j];
                    score[j] = temp;

                    String temp2 = name[j + 1];
                    name[j + 1] = name[j];
                    name[j] = temp2;
                }
            }
        }

        System.out.println("List of team with the highest team score first");
        for (int i = 0; i < numTeam; i++) {
            System.out.print(name[i] + " (" + score[i] + ") | ");
        }
    }
}
