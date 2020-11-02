import java.io.FileInputStream;
import java.util.Scanner;

class Q3 {

    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("student.txt"));
            String[] names = new String[10];
            double[] marks = new double[10];
            int count = 0;
            int absent = 0 ;

            while (inputStream.hasNextLine()) {
                names[count] = inputStream.next();
                marks[count] = inputStream.nextDouble();
                if(marks[count] == -1){
                    absent ++;
                }
                count++;
            }
            for (int j = 0; j < marks.length - 1; j++) {
                for (int i = 0; i < marks.length - 1; i++) {
                    if (marks[i + 1] < marks[i]) {
                        double temp = marks[i + 1];
                        marks[i + 1] = marks[i];
                        marks[i] = temp;

                        String temp2 = names[i + 1];
                        names[i + 1] = names[i];
                        names[i] = temp2;
                    }
                }
            }

            int lowest = 0;
            for(int i = 0 ; i < marks.length ; i++){
                if(marks[i] != -1){
                    lowest = i;
                    break;
                }
            }

            System.out.println("The student with the highest mark : " + names[names.length-1] + " " + marks[marks.length-1]);
            System.out.println("The student with the lowest mark : " + names[lowest] + " " + marks[lowest]);
            System.out.println("The number of students who were absent from the exam : " + absent);

        } catch (Exception e) {
            System.out.println("Some error");
        }
    }
}
