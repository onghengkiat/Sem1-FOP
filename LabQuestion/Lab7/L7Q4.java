import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class L7Q4 {
    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("original.txt"));
            int numLine = 0, numWords = 0, numChar = 0;
            while (inputStream.hasNextLine()) {
                String sentence = inputStream.nextLine();
                numLine += 1;
                String[] words = sentence.split(" ");
                numWords += words.length;

                for(int i =0; i <words.length ;i++){
                    numChar += words[i].length();
                }
            }
            System.out.println("The number of lines is " + numLine);
            System.out.println("The number of words is " + numWords);
            System.out.println("The number of characters excluding space is " + numChar);
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
}
