import java.util.Random;
import java.util.Scanner;

class Q2{
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first player's name: ");
        String firstPlayerName = input.nextLine();
        System.out.print("Enter the second player's name: ");
        String secondPlayerName = input.nextLine();
        System.out.println("");

        int turn;
        int dice;
        int firstScore , secondScore;

        //player 1
        System.out.print(firstPlayerName + ", press enter to roll your dice!");
        input.nextLine();
        turn = rnd.nextInt(6) + 1;
        firstScore = turn;
        System.out.println("You obtained " + turn + " roll(s)!");
        System.out.println("You have to roll " + (turn - 1) + " more time(s)");

        for(int i = 1 ; i < turn ; i++){
            System.out.print(firstPlayerName + ", press enter to roll your dice!");
            input.nextLine();
            dice = rnd.nextInt(6)+1;
            System.out.println("You obtained " + dice);
            firstScore += dice;
        }
        System.out.println("Player 1, " + firstPlayerName + " obtained a score of: " + firstScore);
        System.out.println("");

        //player 2
        System.out.print(secondPlayerName + ", press enter to roll your dice!");
        input.nextLine();
        turn = rnd.nextInt(6) + 1;
        secondScore = turn;
        System.out.println("You obtained " + turn + " roll(s)!");
        System.out.println("You have to roll " + (turn - 1) + " more time(s)");

        for(int i = 1 ; i < turn ; i++){
            System.out.print(secondPlayerName + ", press enter to roll your dice!");
            input.nextLine();
            dice = rnd.nextInt(6)+1;
            System.out.println("You obtained " + dice);
            secondScore += dice;
        }
        System.out.println("Player 1, " + secondPlayerName + " obtained a score of: " + secondScore);

        System.out.println("");
        if(firstScore > secondScore){
            System.out.println("Player 1," + firstPlayerName + " wins!");
        }else if(secondScore > firstScore){
            System.out.println("Player 2," + secondPlayerName + " wins!");
        }else{
            System.out.println("DRAW !");
        }
    }
}
