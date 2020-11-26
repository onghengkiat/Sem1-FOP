
import java.util.Random;

public class L4Q5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int player1 = 0;
        int player2 = 0;
        int dice = 0;
        game:
        while(player1 <= 100 && player2 <= 100){
            do{
                dice = rnd.nextInt(6) + 1;
                System.out.println("Player 1 rolled " + dice);
                player1 += dice;
                System.out.println("Player 1's score : " + player1);

                if (player1 > 100) {
                    System.out.println("Player 1 WIN!");
                    break game;
                }
            }while(dice == 6);

            do {
                dice = rnd.nextInt(6) + 1;
                System.out.println("Player 2 rolled " + dice);
                player2 += dice;
                System.out.println("Player 2's score : " + player2);
                if (player2 > 100) {
                    System.out.println("Player 2 WIN!");
                    break;
                }
            }while(dice == 6);
        }
    }
}
