import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class L9Q4 {
    public static void main(String[] args) {
        DiceGame1 player1 = new DiceGame1("Ong Heng Kiat");
        DiceGame1 player2 = new DiceGame1("Lee Hong Yan");
        System.out.println("Dice Game 1");
        int round = 1;
        while (player1.getScore() < 100 && player2.getScore() < 100) {
            System.out.println("Round " + round);
            player1.roll();
            if (player1.getScore() >= 100) {
                System.out.println(player1.getName() + " wins ");
                break;
            }
            player2.roll();
            if (player2.getScore() >= 100) {
                System.out.println(player2.getName() + " wins ");
                break;
            }
            System.out.println();
            round ++;
        }

        System.out.println("\n\n");

        DiceGame2 player3 = new DiceGame2("Ong Heng Kiat");
        DiceGame2 player4 = new DiceGame2("Ong Zi Jing");
        round = 1;
        System.out.println("Dice Game 2");
        while (player3.getScore() != 100 && player4.getScore() != 100) {
            System.out.println("Round " + round);
            player3.roll();
            if (player3.getScore() == 100){
                System.out.println(player3.getName() + " wins ");
                break;
            }
            player4.roll();
            if (player4.getScore() == 100){
                System.out.println(player4.getName() + " wins ");
                break;
            }
            System.out.println();
            round ++;
        }
    }
}

class Player {

    protected int score = 0;
    protected String name;

    public Player() {
    }

    public Player(String a) {
        name = a;
    }

    public void display() {
        System.out.println("The score for " + name + " is " + score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class DiceGame1 extends Player {

    private int dice1, dice2;
    private Random rnd = new Random();

    public DiceGame1(String a) {
        super(a);
    }

    public void roll() {
        this.dice1 = 0;
        this.dice2 = 0;
        while(this.dice1 == this.dice2){
            this.dice1 = this.rnd.nextInt(6) + 1;
            this.score += this.dice1;
            this.dice2 = this.rnd.nextInt(6) + 1;
            this.score += this.dice2;
            System.out.println(this.getName() + " rolls " + this.dice1 + " and " + this.dice2);
            this.display();
        }
    }


}

class DiceGame2 extends Player {

    private int dice1;
    private Random rnd = new Random();

    public DiceGame2(String a) {
        super(a);
    }

    public void roll() {
        this.dice1 = this.rnd.nextInt(6) + 1;
        this.score += this.dice1;
        System.out.println(this.getName() + " rolls " + this.dice1 );
        //score more than 100 not count
        if (this.score > 100) {
            this.score -= this.dice1;
        }
        this.display();

        if (this.dice1 == 6) {
            this.dice1 = this.rnd.nextInt(6) + 1;
            System.out.println(this.getName() + " rolls " + this.dice1 );

            if (this.dice1 != 6) {
                this.score += this.dice1;
                //score more than 100 not count
                if (this.score > 100) {
                    this.score -= this.dice1;
                }
                this.display();
            } else {
                //roll 6 again not count
            }
        }

    }
}
