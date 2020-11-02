package LabQuestion.Lab3;

import java.util.Random;

public class L3Q4 {
    public static void main(String[] args) {
        Random rnd =new Random();
        int player1 = 0;
        int player2 = 0;
        for(int i = 0; i < 2 ; i++){
            System.out.println("Round " + (i+1));
            int dice = rnd.nextInt(6) + 1;
            System.out.println("Player 1 rolled " + dice);
            player1 += dice;
            dice = rnd.nextInt(6) + 1;
            System.out.println("Player 2 rolled " + dice);
            player2 += dice;
            System.out.println();
        }
        System.out.println("Player 1 score : " + player1);
        System.out.println("Player 2 score : " + player2);
        if (player1 == player2)
            System.out.println("DRAW!");
        else if (player1 > player2)
            System.out.println("\nPlayer 1 WIN!");
        else
            System.out.println("\nPlayer 2 WIN!");

    }
}
