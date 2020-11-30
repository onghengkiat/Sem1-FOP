import java.io.*;
import java.util.Scanner;

public class L7Q1 {
    public static void main(String[] args) {
        //make a dat file
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
            boolean found = false;
            try {
                //search in the file
                while (true) {
                    String courseCode = inputStream.readUTF();
                    String courseName = inputStream.readUTF();
                    if (courseCode.equals(code)) {
                        found= true;
                        System.out.println("The course name for the code is " + courseName);
                        break;
                    }
                }
            } catch (EOFException e) {
                if(found == false){
                    System.out.println("Couldn't find the course code");
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
}
