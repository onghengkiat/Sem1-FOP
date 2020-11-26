import java.util.Random;

public class L4Q6 {
    public static void main(String[] args) {
        Random rnd = new Random();

        int random_number = rnd.nextInt(Integer.MAX_VALUE);
        System.out.println("Random number is " + random_number);
        String random_number_string = Integer.toString(random_number);
        System.out.println("The number of digit is " + random_number_string.length());
    }
}
