import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class L10Q2 {
    public static void main(String[] args) {
        //the program will have exception if product.txt does not exist in the project
        //in this case , the input file is product.txt while the output file is cipherText.txt
        //the shift value is 15
        SubstitutionCipher encode = new SubstitutionCipher("product.txt", "SubstitutionEncrypt.txt", 3);

        //in this case , the input file is cipherText.txt while the plainText.txt is the output file
        //the shift value is 15
        SubstitutionCipher decode = new SubstitutionCipher("SubstitutionEncrypt.txt", "SubstitutionDecrypt.txt", 3);

        //then encode and decode
        //the product.txt and SubstitutionDecrypt.txt should have the same contents in this case
        encode.readPlainFile();
        decode.readEncryptFile();
    }
}

class SubstitutionCipher implements MessageEncoder {

    private String input, output;

    //shift means the number added to the characters
    //example if shift = 6 , input = "A" , output will be "G"
    private int shift;

    //A constructor
    public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        //the input is get from the inputFileName.txt
        this.input = inputFileName;

        //the output will be transferred into outputFileName.txt
        this.output = outputFileName;

        //set the number of shift
        this.shift = shift;
    }

    public void readPlainFile() {
        try {
            //get the input from the input.txt
            Scanner inputStream = new Scanner(new FileInputStream(this.input));

            //transfer the output to the output.txt
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(this.output));

            //to make sure we get all the input in the textpad
            while (inputStream.hasNextLine()) {

                //assign the input to the String line
                //assign the input line by line
                String line = inputStream.nextLine();

                //print out a line after you finish printing out a line of characters
                outputStream.println(encode(line));
            }

            //close and save the file
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
    }

    public void readEncryptFile() {
        try {
            //same concept as above
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

    private final int ascii_code_max = 256;
    @Override
    public String encode(String plainText) {
        String encoded = "";
        //example you have a alphabet which is 'A', shift is 1
        //
        //output all the characters in the string one by one, from first character until the last character
        //the output is saved in a output.txt
        for (int i = 0; i < plainText.length(); i++) {
            //at the same time, the character is added by the value of "shift"
            encoded += (char)( (plainText.charAt(i) + shift)% ascii_code_max);
        }
        return encoded;
    }

    @Override
    public String decode(String cipherText) {
        String decoded = "";

        for (int i = 0; i < cipherText.length(); i++) {
            //as
            int ascii_code = cipherText.charAt(i) - shift;
            if(ascii_code < 0){
                ascii_code = ascii_code_max + ascii_code;
            }
            //the different thing is decode method will minus the shift value , and not adding
            decoded += (char)(ascii_code) ;
        }
        return decoded;
    }
}
