import java.io.FileInputStream;
import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        //assume text file in format Code,Amount in each line
        try {
            Scanner inputStream = new Scanner(new FileInputStream("Q3.txt"));
            while (inputStream.hasNextLine()) {
                String[] line = inputStream.nextLine().split(",");
                String code = line[0];
                double amount = Double.parseDouble(line[1]);
                double amountRM = 0;
                if (code.equalsIgnoreCase("AUD")) {
                    amountRM = amount * 3.25;
                }
                if (code.equalsIgnoreCase("SG")) {
                    amountRM = amount * 2.53;
                }
                if (code.equalsIgnoreCase("EU")) {
                    amountRM = amount * 4.03;
                }
                if (code.equalsIgnoreCase("USD")) {
                    amountRM = amount * 3.11;
                }
                System.out.printf(code + " %.2f" + " = RM %.2f", amount, amountRM);
                System.out.println("");
            }
            inputStream.close();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
