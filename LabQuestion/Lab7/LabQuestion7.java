package LabQuestion.Lab7;

import java.util.*;
import java.io.*;
import java.net.*;

public class LabQuestion7 {

    public static void main(String[] args) {
        //Question1
        try {
            String[][] array = {{"WXES1116", "Programming I"}, {"WXES1115", "Data Structure"}, {"WXES1110", "Operating System"}, {"WXES1112", "Computing Mathematics I"}};
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("course.dat"));
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    outputStream.writeUTF(array[i][j]);
                }
            }
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("course.dat"));
            System.out.println("Enter the course code");
            Scanner input = new Scanner(System.in);
            String code = input.nextLine();
            try {
                while (true) {
                    String courseCode = inputStream.readUTF();
                    String courseName = inputStream.readUTF();
                    if (courseCode.equals(code)) {
                        System.out.println("The course name for the code is " + courseName);
                    }
                }
            } catch (EOFException e) {
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        //Question2
        try {
            URL u = new URL("http://www.fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
        //Question3
        try {
            Scanner inputStream = new Scanner(new FileInputStream("reverseUsingText.txt"));
            PrintWriter outputStream = new PrintWriter (new FileOutputStream ("reverse.txt"));
            while (inputStream.hasNextLine()) {
                String sentence = inputStream.nextLine();
                for (int i = sentence.length() - 1; i >= 0; i--) {
                    outputStream.print(sentence.charAt(i));
                }
                outputStream.println();
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        //Question4
        try {
            Scanner inputStream = new Scanner(new FileInputStream("reverseUsingText.txt"));
            int numLine = 0, numWords = 0, numChar = 0;
            while (inputStream.hasNextLine()) {
                String sentence = inputStream.nextLine();
                numLine += 1;
                numChar += sentence.length();
                String[] words = sentence.split(" ");
                numWords += words.length;
            }
            System.out.println("The number of lines is " + numLine);
            System.out.println("The number of words is " + numWords);
            System.out.println("The number of characters including space is " + numChar);
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        //Question5
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
            }

            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        //Question6
        try {
            System.out.println("ProductID     ProductName         Quantity    PricePerUnit     Total");
            Scanner input = new Scanner(new FileInputStream("order.txt"));
            Scanner inputStream = new Scanner(new FileInputStream("product.txt"));
            String[][] product = new String[7][];
            for (int i = 0; i < 7; i++) {
                product[i] = inputStream.nextLine().split(",");
            }
            while (input.hasNextLine()) {
                String[] order = input.nextLine().split(",");
                for (int i = 0; i < product.length; i++) {
                    if (order[1].equalsIgnoreCase(product[i][0])) {
                        double price = Integer.parseInt(order[2])*Double.parseDouble(product[i][2]);
                        System.out.printf(product[i][0]+"     %-20s%10s%15s%13.2f\n",product[i][1],order[2],product[i][2],price);
                    }
                }
            }
            inputStream.close();
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}
