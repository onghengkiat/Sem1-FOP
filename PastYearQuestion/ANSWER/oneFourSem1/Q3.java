import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Q3 {
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream("player1.dat"));
            ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream("player2.dat"));
            int player1 = 0, player2 = 0;

            try {
                while (true) {
                    //assume the score is stored in double type
                    player1 += inputStream1.readDouble();
                }
            } catch (EOFException f) {
                System.out.println("ERROR");
            }

            try {
                while (true) {
                    //assume the score is stored in double type
                    player2 += inputStream2.readDouble();
                }
            } catch (EOFException f) {
                System.out.println("ERROR");
            }

            System.out.println("Player 1 Score : " + player1);
            System.out.println("Player 2 Score : " + player2);

            if (player1 > player2) {
                System.out.println("Player 1 wins");
            } else if (player1 < player2) {
                System.out.println("Player 2 wins");
            } else {
                System.out.println("Draw");
            }

            inputStream1.close();
            inputStream2.close();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
