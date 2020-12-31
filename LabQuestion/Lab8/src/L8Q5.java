import java.util.Random;

public class L8Q5 {
    public static void main(String[] args) {
        Game player1 = new Game("Jack Meow");
        Game player2 = new Game("Kiat");
        int round = 1;
        while (true) {
            System.out.println("Round " + round);
            player1.move();
            System.out.println("Current Score for " + player1.getName() +  " is " + player1.getScore());

            if (player1.isWin()) {
                System.out.println(player1.getName() + " wins the game");
                break;
            }

            player2.move();
            System.out.println("Current Score for " + player2.getName() + " is "  + player2.getScore());
            if (player2.isWin()) {
                System.out.println(player2.getName() + " wins the game");
                break;
            }
            System.out.println("");
            round++;
        }
    }
}

class Game {

    private Random rnd = new Random();
    private String name;
    private int score = 0;

    public Game(String playerName) {
        this.name = playerName;
    }

    public void move() {
        //randomly generate a number from 1 to 6
        int dice = rnd.nextInt(6) + 1;
        System.out.println(this.name + " rolls " + dice );
        this.score += dice;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public boolean isWin(){
        return this.score >= 100;
    }
}
