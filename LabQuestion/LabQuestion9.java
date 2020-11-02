package LabQuestion;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class LabQuestion9 {

}

class Shape {

    String name;
    double perimeter, area;

    Shape() {
        name = null;
        perimeter = 1;
        area = 1;
    }

    Shape(String a, double b, double c) {
        name = a;
        perimeter = b;
        area = c;
    }

    void setPerimeter(int a) {
        perimeter = a;
    }

    void setArea(int a) {
        area = a;
    }

    void display() {
        System.out.printf(name + "\n%5.2f \n%5.2f", perimeter, area);
    }
}

class Rectangle extends Shape {

    double length, width;

    Rectangle(double a, double b) {
        length = a;
        width = b;
    }

    void setPerimeter() {
        perimeter = 2 * (length + width);
    }

    void setArea() {
        area = length * width;
    }
}

class Square extends Shape {

    double sideLength;

    Square(double a) {
        sideLength = a;
    }

    void setPerimeter() {
        perimeter = 4 * sideLength;
    }

    void setArea() {
        area = sideLength * sideLength;
    }
}

class Circle extends Shape {

    double diameter;

    Circle(double a) {
        diameter = a;
    }

    void setPerimeter() {
        perimeter = 3.142 * diameter;
    }

    void setArea() {
        area = 3.142 * Math.pow((diameter / 2), 2);
    }
}

class testShape {

    public static void main(String[] args) {
        Shape shape1 = new Shape("shape1", 10, 11);
        shape1.setPerimeter(10);
        shape1.setArea(10);
        shape1.display();
    }
}

//2
class PersonProfile {

    String name, gender, dateOfBirth;

    PersonProfile() {

    }

    PersonProfile(String a, String b, String c) {
        name = a;
        gender = b;
        dateOfBirth = c;
    }

    void display() {
        System.out.println("The name of the person is " + name);
        System.out.println("The gender of the person is " + gender);
        System.out.println("The date of birth of the person is " + dateOfBirth);
    }
}

class Student extends PersonProfile {

    String courseList[][] = new String[5][5];

    Student(String a, String b, String c, String d) {
        super(a, b, c);
        try {
            Scanner inputStream = new Scanner(new FileInputStream(d));
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
    String[] grade = new String[5];

    void getGrade() {
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

    void displayCourseList() {
        for (int j = 0; j < courseList.length; j++) {
            for (int i = 0; i < courseList[j].length; i++) {
                System.out.println(courseList[i][j]);
            }
        }
    }

    void displayGrade() {
        for (String grade1 : grade) {
            System.out.println(grade1);
        }
    }
}

class testStudent {

    public static void main(String[] args) {
        Student a = new Student("Ong Zi Jing", "Female", "12", "course.txt");
        a.getGrade();
        a.display();
        a.displayCourseList();
        a.displayGrade();
    }
}

//3
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

class testLecturer {

    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Lee Hong Yan", "Gay", "10", "lecturer.txt");
        lecturer1.display();
        lecturer1.setCreditHour();
        lecturer1.displayCreditHour();
    }
}

class Player {

    int score = 0;
    String name;

    Player() {
    }

    Player(String a) {
        name = a;
    }

    void display() {
        System.out.println("The score for " + name + " is " + score);
    }
}

class diceGame1 extends Player {

    int dice1, dice2;
    Random rnd = new Random();

    diceGame1(String a) {
        super(a);
    }

    void roll() {
        dice1 = rnd.nextInt(6) + 1;
        score += dice1;
        dice2 = rnd.nextInt(6) + 1;
        score += dice2;
        if (dice1 == dice2) {
            dice1 = rnd.nextInt(6) + 1;
            score += dice1;
        }
    }
}

class diceGame2 extends Player {

    int dice1;
    Random rnd = new Random();

    diceGame2(String a) {
        super(a);
    }

    void roll() {
        dice1 = rnd.nextInt(6) + 1;
        score += dice1;
        if (score > 100) {
            score -= dice1;
        }
        if (dice1 == 6) {
            dice1 = rnd.nextInt(6) + 1;
            if (dice1 != 6) {
                score += dice1;
                if (score > 100) {
                    score -= dice1;
                }
            } else {
                score -= 6;
            }
        }

    }
}

class testDiceGame {

    public static void main(String[] args) {
        diceGame1 player1 = new diceGame1("Ong Heng Kiat");
        diceGame1 player2 = new diceGame1("Lee Hong Yan");
        while (player1.score < 100 && player2.score < 100) {
            player1.roll();
            player1.display();
            if (player1.score >= 100) {
                System.out.println(player1.name + " wins ");
                break;
            }
            player2.roll();
            player2.display();
            if (player2.score >= 100) {
                System.out.println(player2.name + " wins ");
                break;
            }
        }

        diceGame2 player3 = new diceGame2("Ong Heng Kiat");
        diceGame2 player4 = new diceGame2("Ong Zi Jing");
        while (player3.score != 100 && player4.score != 100) {
            player3.roll();
            player3.display();
            if (player3.score == 100){
                System.out.println(player3.name + " wins ");
                break;
            }
            player4.roll();
            player4.display();
            if (player4.score == 100){
                System.out.println(player4.name + " wins ");
                break;
            }
        }
    }
}