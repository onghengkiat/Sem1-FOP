import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class L10Q3 {
    public static void main(String[] args) {
        //this will come out with error if product.txt doesnt exist
        //in this case the input is product.txt
        //output is cipher.txt
        //shuffle times is 4
        ShuffleCipher encode = new ShuffleCipher("product.txt", "ShuffleEncrypt.txt", 2);

        //the input is cipher.txt
        //the output is plain.txt
        ShuffleCipher decode = new ShuffleCipher("ShuffleEncrypt.txt", "ShuffleDecrypt.txt", 2);

        //in this case , the product.txt and plain.txt should have the same contents
        encode.readPlainFile();
        decode.readEncryptFile();
    }
}

class ShuffleCipher implements MessageEncoder {

    private String input, output;

    //this means the number of shuffle done
    private int shuffleTime;

    //same concept as question 2
    public ShuffleCipher(String inputFileName, String outputFileName, int N) {
        this.input = inputFileName;
        this.output = outputFileName;
        this.shuffleTime = N;
    }

    public void readPlainFile() {
        try {
            Scanner inputStream = new Scanner(new FileInputStream(this.input));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(this.output));

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();

                //lastly if it reaches the shuffleTime , then the shuffled is storing the shuffled text
                //so just print it out in the output.txt
                outputStream.println(encode(line));
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
    }

    public void readEncryptFile() {
        //alomst same concept as encode
        try {
            Scanner inputStream = new Scanner(new FileInputStream(input));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(output));

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                outputStream.println(decode(line));
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }

    }

    @Override
    public String encode(String plainText) {
        String line = plainText;
        //String shuffled is a variable that is used to store the shuffled text
        String shuffled = "";
        System.out.println(line);
        for (int i = 0; i < this.shuffleTime; i++) {
            //reset the shuffled to an empty string every time before shuffle starts
            shuffled = "";

            //this is the index of the middle of the string
            int mid = line.length() / 2;

            //if String = "1234";
            //then the first half will take (0,2) = "12", last half will take(2,4) = "34"
            //if String = "12345" , mid = (int)5/2 = 2
            //then the first half will take (0,2) = "12", the last half will take (2,5) = "345"
            String firstHalf = line.substring(0, mid);
            String lastHalf = line.substring(mid, line.length());

            // abcde, the cipher text will become acbde
            // ab || cde
            // acbd
            //first character of first half + first character of last half + second character of first half + second character of last half......
            for (int j = 0; j < firstHalf.length(); j++) {
                shuffled = shuffled + firstHalf.charAt(j) + lastHalf.charAt(j);
            }

            //this is the special case if the String.length is an odd number like "12345"
            //after the for loop just now , the result will be "1324" but the 5 is still missing
            //so we have to add the String shuffled , "1324" with the last character of the last part
            //abcde
            if (lastHalf.length() > firstHalf.length()) {
                shuffled = shuffled + lastHalf.charAt(lastHalf.length() - 1);
            }

            //then assign the shuffled string to the line as a new input for the next shuffle
            line = shuffled;

            System.out.println(i);
            System.out.println(line);
        }
        return shuffled;
    }

    @Override
    public String decode(String cipherText) {
        String line = cipherText;
        //variable that stores the unshuffled text
        String unshuffled = "";

        for (int i = 0; i < shuffleTime; i++) {

            //reset the unshuffled before starts to shuffle it back to the plain text
            unshuffled = "";

            //if the length of the input is even number like "1234"
            if (line.length() % 2 == 0) {

                //decoded : abcd -> encoded : acbd
                //this is to get the first half part
                // ab
                // unshuffled = ab
                for (int j = 0; j < line.length(); j += 2) {
                    unshuffled = unshuffled + line.charAt(j);
                }

                // unshuffled = abcd
                //then only you get the last half part and combine them together
                for (int j = 1; j < line.length(); j += 2) {
                    unshuffled = unshuffled + line.charAt(j);
                }
            }

            //if the length of the input is odd number like "123"
            else {

                //decoded : abcd || e -> encoded : acbd || e
                //this is to get the first half part
                for (int j = 0; j < line.length() - 2; j += 2) {
                    unshuffled = unshuffled + line.charAt(j);
                }

                //then only get the last half part and combines them together
                for (int j = 1; j < line.length(); j += 2) {
                    unshuffled = unshuffled + line.charAt(j);
                }

                //special case for odd number , dont forget to add back the last character of the last half part
                //example like "12345"
                //first for loop will get "1" + "3"
                //second for loop will get "2" + "4"
                //"5" is still missing , so we need to add this line to add back the last character "5"
                //then add them together will be "13245"
                unshuffled = unshuffled + line.charAt(line.length() - 1);
            }
            line = unshuffled;
        }
        return unshuffled;
    }
}
