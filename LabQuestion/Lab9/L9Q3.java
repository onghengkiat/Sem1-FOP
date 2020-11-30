import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//not done yet
public class L9Q3 {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Lee Hong Yan", "Gay", "10", "lecturer.txt");
        lecturer1.display();
        lecturer1.setCreditHour();
        lecturer1.displayCreditHour();
    }
}

class Lecturer extends PersonProfile {

    String[] courseName = new String[4], courseCode = new String[4];
    int[] semester = new int[4], session = new int[4], creditHour = new int[4], numOfStudents = new int[4];

    Lecturer(String a, String b, String c, String d) {
        super(a, b, c);
        try {
            Scanner inputStream = new Scanner(new FileInputStream(d));
            int i = 0;
            while (inputStream.hasNextLine()) {
                courseCode[i] = inputStream.nextLine();
                courseName[i] = inputStream.nextLine();
                session[i] = inputStream.nextInt();
                semester[i] = inputStream.nextInt();
                creditHour[i] = inputStream.nextInt();
                numOfStudents[i] = inputStream.nextInt();
                if (!inputStream.hasNextLine()) {
                    break;
                }
                i++;
                inputStream.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
    }

    void setCreditHour() {
        for (int i = 0; i < creditHour.length; i++) {
            if (numOfStudents[i] >= 150) {
                creditHour[i] *= 3;
            } else if (numOfStudents[i] < 150 && numOfStudents[i] >= 100) {
                creditHour[i] *= 2;
            } else if (numOfStudents[i] >= 50 && numOfStudents[i] < 100) {
                creditHour[i] *= 1.5;
            } else {
                creditHour[i] *= 1;
            }
        }
    }

    void displayCreditHour() {
        for (int i = 0; i < creditHour.length; i++) {
            System.out.println("The course code is " + courseCode[i]);
            System.out.println("The course name is " + courseName[i]);
            System.out.println("It is semester  " + semester[i]);
            System.out.println("It is session " + session[i]);
            System.out.println("Its credit hour is  " + creditHour[i]);
            System.out.println("The number of students is " + numOfStudents[i]);
        }
    }
}

