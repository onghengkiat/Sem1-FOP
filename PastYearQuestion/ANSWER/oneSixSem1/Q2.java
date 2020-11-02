import java.util.Random;
import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int playerWin = 0;
        int compWin = 0;
        int playerAction = 0;
        int compAction = 0;
        String action[] = {"Paper", "Scisssor", "Rock"};

        while (compWin != 3 && playerWin != 3) {
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            playerAction = input.nextInt();
            compAction = rnd.nextInt(3) + 1;
            System.out.println("Player : " + action[playerAction - 1] + " ----- Computer : " + action[compAction - 1]);

            if (compAction == playerAction) {

            } else if (compAction == playerAction + 1 || (compAction == 1 && playerAction == 3)) {
                compWin++;
                System.out.println("Computer win " + compWin + " time(s)");
            } else {
                playerWin++;
                System.out.println("Player win " + playerWin + " time(s)");
            }
        }

        if (playerWin == 3) {
            System.out.println("Player wins the game.");
        } else {
            System.out.println("Computer wins the game.");
        }
    }
}
