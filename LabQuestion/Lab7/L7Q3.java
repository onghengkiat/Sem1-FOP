import java.io.*;
import java.util.Scanner;

public class L7Q3 {
    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("original.txt"));
            PrintWriter outputStream = new PrintWriter (new FileOutputStream("reverse.txt"));
            while (inputStream.hasNextLine()) {

                String sentence = inputStream.nextLine();
                //print from last character
                for (int i = sentence.length() - 1; i >= 0; i--) {
                    outputStream.print(sentence.charAt(i));
                }

                //print a line
                outputStream.println();
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

    }
}

