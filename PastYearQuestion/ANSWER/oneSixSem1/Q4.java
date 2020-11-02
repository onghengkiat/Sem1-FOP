import java.io.FileInputStream;
import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("Q4.txt"));
            while (inputStream.hasNextLine()) {
                String password = inputStream.nextLine();
                boolean upperCase = false;
                boolean lowerCase = false;
                boolean digit = false;
                boolean nonAlphabet = false;

                for (int i = 0; i < password.length(); i++) {
                    if (Character.isUpperCase(password.charAt(i))) {
                        upperCase = true;
                    }
                    if (Character.isLowerCase(password.charAt(i))) {
                        lowerCase = true;
                    }
                    if (Character.isDigit(password.charAt(i))) {
                        digit = true;
                    }

                    if (!Character.isSpaceChar(password.charAt(i)) && !Character.isLetterOrDigit(password.charAt(i))) {
                        nonAlphabet = true;
                    }
                }
                if (password.length() >= 8 && upperCase && lowerCase && digit && nonAlphabet) {
                    System.out.println("Strong password.");
                } else {
                    System.out.println("Not a strong password.");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
