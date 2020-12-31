import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//not done yet
public class L9Q2 {
    public static void main(String[] args) {
        Student a = new Student("Jack Meow", "Male", "20/20/2020", "course.txt");
        a.display();
        a.displayCourseList();
        a.displayGrade();
    }
}


class Student extends PersonProfile {

    private String courseList[][];
    private String filename ;
    public Student(String name, String gender, String dateOfBirth, String filename) {
        super(name, gender, dateOfBirth);
        this.filename = filename;
        courseList = new String[countCourse(filename)][5];
        this.getCourse(filename);
    }

    private void getCourse(String filename){
        try {
            Scanner inputStream = new Scanner(new FileInputStream(filename));
            while (inputStream.hasNextLine()) {
                for (String[] course : courseList) {
                    for (int j = 0; j < course.length; j++) {
                        course[j] = inputStream.nextLine();
                    }
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }

    private int countCourse(String filename){
        int count = 0;
        try {
            Scanner inputStream = new Scanner(new FileInputStream(filename));
            while (inputStream.hasNextLine()) {
                for(int i = 0 ; i < 5 ; i++) {
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


    public void displayCourseList() {
        System.out.println("--- COURSE LIST ---");
        for (int i = 0; i < courseList.length; i++) {
            System.out.println("Course " + (i + 1) + "  : ");
            for (int j = 0; j < courseList[i].length; j++) {
                System.out.println(courseList[i][j]);
            }
        }
    }

    public void displayGrade() {
        System.out.println("--- GRADE --- ");
        for (int i = 0; i < courseList.length; i++) {
            String grade = "";
            if (Integer.parseInt(courseList[i][4]) >= 85) {
                grade = "A";
            } else if (Integer.parseInt(courseList[i][4]) >= 75) {
                grade = "A-";
            } else if (Integer.parseInt(courseList[i][4]) >= 70) {
                grade = "B+";
            } else if (Integer.parseInt(courseList[i][4]) >= 65) {
                grade = "B";
            } else if (Integer.parseInt(courseList[i][4]) >= 60) {
                grade = "B-";
            } else if (Integer.parseInt(courseList[i][4]) >= 55) {
                grade = "C+";
            } else if (Integer.parseInt(courseList[i][4]) >= 50) {
                grade = "C";
            } else if (Integer.parseInt(courseList[i][4]) >= 45) {
                grade = "D";
            } else if (Integer.parseInt(courseList[i][4]) >= 35) {
                grade = "E";
            } else {
                grade = "F";
            }
            System.out.println("The grade for " + courseList[i][1] + " is " + grade);
        }
    }
}
