package oneeightsem2;

import java.io.FileInputStream;
import java.util.Scanner;

public class OneEightSem2 {

    //1st error delete util Scanner 
    public static void main(String[] args) {
        //2nd error "" delte
        int[] num = {66, 15, 20, 27, 74, 33};
        int cnt = 0;

        //3rd error num.length() no need ()
        for (int k = 0; k < num.length; k++) {
            //4th error num become num[k]
            if (isEven(num[k])) {
                cnt++;
            }
        }

        //5th error . behind cnt
        System.out.println("The number of even integers is " + cnt + ".");
        //6th error findMax(num)
        System.out.println("The biggest integer is " + findMax(num));

    }

    //7th error static method
    public static boolean isEven(int a) {
        //8th error redundancy ? wonder consider or not
        return a % 2 == 0;
    }

    //9th error void become int
    public static int findMax(int[] a) {
        int max = a[0];

        //10th error , n = 1
        for (int n = 1; n < a.length; n++) {
            if (a[n] > max) {
                max = a[n];
            }
        }
        return max;

    }
}

class Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int numberOfBags = input.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        int unitWeight = input.nextInt();
        double totalPrice = unitWeight * numberOfBags * 5.99;
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725;
        System.out.println("Price per kilogram:   $5.99");
        System.out.println("Sales tax:             7.25%");
        System.out.printf("Total price:           $ %.2f", totalPriceWithTax);
    }
}

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

class LinearEquation{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public String toString(){
        return a + "x + " + b + "y = " + e +
                "\n" + c + "x + " + d + "y = " + f;
    }
    
    public boolean isSolvable(){
        return a*d-b*c != 0;
    }
    
    public int computeX(){
        return (e*d - b*f) /(a*d - b*c);
    }
    
    public int computeY(){
        return (a*f - e*c)/(a*d - b*c);
    }
    
}

class Q4Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values for a,b,c,d,e and f : ");
        LinearEquation eq1 = new LinearEquation(input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
        
        System.out.println("The equation :");
        System.out.println(eq1.toString());
        
        System.out.println("\nx = " + eq1.computeX() + " ; y = " + eq1.computeY());
    }
}


class GradedActivity{
    protected int score ;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public char getGrade(){
        if(score >= 90){
            return 'A';
        }else if (score >= 80){
            return 'B';
        }else if (score >= 70){
            return 'C';
        }else if (score >= 60){
            return 'D';
        }else {
            return 'F';
        }
    }
    
    public String toString(){
        return "Total score: " + score 
                + "\nEssay grade: " + getGrade(); 
    }
}

class Essay extends GradedActivity{
    private int grammer;
    private int spelling;
    private int length;
    private int content;

    public Essay(int grammer, int spelling, int length, int content) {
        this.grammer = grammer;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        score = grammer + spelling + length + content;
    }
    
    public String toString(){
        return "Essay score: " + 
                "\nGrammer: " + grammer + 
                "\nSpelling: " + spelling + 
                "\nLength: " + length +
                "\nContent: " + content +
                super.toString();
    }
}

class Q5Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks for Grammer (maximum 30 marks): ");
        int grammer = input.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int spelling = input.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int length = input.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = input.nextInt();
        
        System.out.println("\n");
        GradedActivity student1 = new Essay(grammer, spelling, length, content);
        System.out.println(student1.toString());
    }
}