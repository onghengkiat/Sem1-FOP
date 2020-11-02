import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Q4 {
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Q4.dat"));
            try {
                while (true) {
                    String line = inputStream.readUTF();
                    int q = Integer.parseInt(line.substring(0, 2));
                    int m = Integer.parseInt(line.substring(2, 4));
                    int y = Integer.parseInt(line.substring(4, 8));
                    DayOfTheWeek day1 = new DayOfTheWeek(q, m, y);
                    day1.displayDay();
                }
            } catch (EOFException f) {
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
