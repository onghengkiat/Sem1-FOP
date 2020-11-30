import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//not done yet
public class L9Q2 {
    public static void main(String[] args) {
        Student a = new Student("Jack Meow", "Male", "20", "course.txt");
        a.getGrade();
        a.display();
        a.displayCourseList();
        a.displayGrade();
    }
}


class Student extends PersonProfile {

    String courseList[][];
    String[] grade;

    public Student(String name, String gender, String dateOfBirth, String filename) {
        super(name, gender, dateOfBirth);
        courseList = new String[countCourse(filename)][5];
        grade = new String[courseList.length];
        try {
            Scanner inputStream = new Scanner(new FileInputStream(filename));
            while (inputStream.hasNextLine()) {
                for (String[] courseList1 : courseList) {
                    for (int j = 0; j < courseList1.length; j++) {
                        courseList1[j] = inputStream.nextLine();
                    }
                }
            }

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
                inputStream.nextLine();
                count++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
        return count;
    }


    public void getGrade() {
        for (int i = 0; i < courseList.length; i++) {
            if (Integer.parseInt(courseList[i][4]) >= 85) {
                grade[i] = "A";
            } else if (Integer.parseInt(courseList[i][4]) >= 75) {
                grade[i] = "A-";
            } else if (Integer.parseInt(courseList[i][4]) >= 70) {
                grade[i] = "B+";
            } else if (Integer.parseInt(courseList[i][4]) >= 65) {
                grade[i] = "B";
            } else if (Integer.parseInt(courseList[i][4]) >= 60) {
                grade[i] = "B-";
            } else if (Integer.parseInt(courseList[i][4]) >= 55) {
                grade[i] = "C+";
            } else if (Integer.parseInt(courseList[i][4]) >= 50) {
                grade[i] = "C";
            } else if (Integer.parseInt(courseList[i][4]) >= 45) {
                grade[i] = "D";
            } else if (Integer.parseInt(courseList[i][4]) >= 35) {
                grade[i] = "E";
            } else {
                grade[i] = "F";
            }
        }
    }

    public void displayCourseList() {
        for (int j = 0; j < courseList.length; j++) {
            for (int i = 0; i < courseList[j].length; i++) {
                System.out.println(courseList[i][j]);
            }
        }
    }

    public void displayGrade() {
        for (String grade1 : grade) {
            System.out.println(grade1);
        }
    }
}
