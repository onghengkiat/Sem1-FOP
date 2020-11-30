import java.io.*;

public class L7Q5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"));
            int TotalNumberOfRecord = inputStream.readInt();
            System.out.println("The total number of records is " + TotalNumberOfRecord);
            try {
                while (true) {
                    String sentence = inputStream.readUTF();
                    int age = inputStream.readInt();
                    char gender = inputStream.readChar();
                    System.out.println(sentence);
                    System.out.println(gender);
                    System.out.println(age);
                }
            } catch (EOFException e) {
                System.out.println("Finish reading file");
            }

            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
}
