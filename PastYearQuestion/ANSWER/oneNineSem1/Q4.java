import java.io.FileInputStream;
import java.util.Scanner;

class Q4 {

    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("myAmbition.txt"));
            int[] characterNum = new int[26];
            int sentence = 0;
            int word = 0;
            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char character = line.charAt(i);
                    if (Character.isLetter(character)) {
                        character = Character.toUpperCase(character);
                        characterNum[character - 'A'] += 1;
                    }

                    if (character == '.') {
                        sentence++;
                    }
                }
                word += line.split(" ").length;
            }

            System.out.println("Number of senteces : " + sentence);
            System.out.println("Number of words : " + word);
            for (int i = 0; i < characterNum.length; i++) {
                System.out.print((char) (i + 'A') + " : " + characterNum[i] + " ");
                if ((i + 1) % 8 == 0) {
                    System.out.println("");
                }

            }

            inputStream.close();
        } catch (Exception e) {
            System.out.println("Some error occur");
        }
    }
}
