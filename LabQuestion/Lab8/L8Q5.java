import java.util.Random;

public class L8Q5 {
    public static void main(String[] args) {
        Game player1 = new Game("Jack Meow");
        Game player2 = new Game("Kiat");
        int round = 1;
        while (true) {
            System.out.println("Round " + round);
            player1.roll();
            if (player1.isWin()) {
                break;
            }
            player2.roll();
            if (player2.isWin()) {
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

    public Game(String a) {
        name = a;
    }

    public void roll() {
        int dice = rnd.nextInt(6) + 1;
        System.out.println(this.name + " rolls " + dice );
        this.score += dice;
        System.out.println("Current Score: " + this.score);
    }

    public boolean isWin(){
        if(this.score >= 100){
            System.out.println(this.name + " wins!");
        }
        return this.score >= 100;
    }
}
