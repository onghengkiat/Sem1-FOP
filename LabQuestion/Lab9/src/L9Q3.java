import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//not done yet
public class L9Q3 {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Yan Yan", "Male", "10/10/2020", "lecturer.txt");
        lecturer1.display();
        lecturer1.displayCreditHour();
    }
}

class Lecturer extends PersonProfile {

    private String[] courseName, courseCode;
    private int[] semester, session, creditHour, numOfStudents;

    public Lecturer(String name, String gender, String dateOfBirth, String filename) {
        super(name, gender, dateOfBirth);
        this.inputCourse(filename);
        this.computeCreditHour();
    }

    private void inputCourse(String filename){
        int numberOfCourse = this.countCourse(filename);
        courseName = new String[numberOfCourse];
        courseCode = new String[numberOfCourse];
        semester = new int[numberOfCourse];
        session = new int[numberOfCourse];
        creditHour = new int[numberOfCourse];
        numOfStudents = new int[numberOfCourse];

        try {
            Scanner inputStream = new Scanner(new FileInputStream(filename));
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
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
    }

    private int countCourse(String filename){
        int count = 0;
        try {
            Scanner inputStream = new Scanner(new FileInputStream(filename));
            while (inputStream.hasNextLine()) {
                for(int i = 0 ; i < 6 ; i++) {
                    inputStream.nextLine();
                }
                count++;
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
        return count;
    }

    private void computeCreditHour() {
        for (int i = 0; i < creditHour.length; i++) {
            if (numOfStudents[i] >= 150) {
                creditHour[i] *= 3;
            } else if (numOfStudents[i] < 150 && numOfStudents[i] >= 100) {
                creditHour[i] *= 2;
            } else if (numOfStudents[i] >= 50 && numOfStudents[i] < 100) {
                creditHour[i] *= 1.5;
            }
        }
    }

    public void displayCreditHour() {
        for (int i = 0; i < creditHour.length; i++) {
            System.out.println("The course code is " + courseCode[i]);
            System.out.println("The course name is " + courseName[i]);
            System.out.println("It is semester  " + semester[i]);
            System.out.println("It is session " + session[i]);
            System.out.println("Its credit hour is " + creditHour[i]);
            System.out.println("The number of students is " + numOfStudents[i]);
        }
    }
}

