package onesevensem2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Random;
import java.util.Scanner;

public class OneSevenSem2 {

    public static void main(String[] args) {
        //first error , no final
        int N;
        //2nd error , out becomes in
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        //3rd error , nextInt()
        N = s.nextInt();
        System.out.println("The first " + N + " triangular numbers");
        //4th error, i++
        for (int i = 1; i < N; i++) {
            System.out.print(getTriangular(i) + " ");
        }
        System.out.println("");
    }

    //5th error ,int n
    //8th error int return data type
    public static int getTriangular(int n) {
        //6th error initialize sum
        int sum = 0;
        for (int i = 1; i <= n; i++) //7th error += i
        {
            sum += i;
        }
        return sum;
    }
}

class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of teams: ");
        int numTeam = input.nextInt();
        String[] name = new String[numTeam];
        int[] score = new int[numTeam];
        for (int i = 0; i < numTeam; i++) {
            input.nextLine();
            System.out.print("Enter team " + (i + 1) + " sname: ");
            name[i] = input.nextLine();
            System.out.print("Enter team " + (i + 1) + " score: ");
            score[i] = input.nextInt();
        }

        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - 1; j++) {
                if (score[j + 1] > score[j]) {
                    int temp = score[j + 1];
                    score[j + 1] = score[j];
                    score[j] = temp;

                    String temp2 = name[j + 1];
                    name[j + 1] = name[j];
                    name[j] = temp2;
                }
            }
        }

        System.out.println("List of team with the highest team score first");
        for (int i = 0; i < numTeam; i++) {
            System.out.print(name[i] + " (" + score[i] + ") | ");
        }
    }
}

class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Enter the number of random integer: ");
        int n = input.nextInt();
        int[] integer = new int[5];
        System.out.print("The random integer : ");
        for (int i = 0; i < n; i++) {
            integer[i] = rnd.nextInt(10001);
            System.out.print(integer[i] + " ");
        }
        
        int min = integer[0];
        for (int i = 0; i < integer.length; i++) {
            if (min > integer[i]) {
                min = integer[i];
            }
        }
        System.out.println("\nMinimum Number : " + min);
        System.out.print("The approximation of the integer to the nearest hundred  : ");
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 100 >= 50) {
                System.out.print(integer[i] - ((100 - integer[i] % 100)) + " " );
            } else {
                System.out.print(integer[i] - (integer[i]%100 ) + " ");
            }
        }
        
        System.out.print("\nThe random integer in reverse order: ");
        for(int i = 0 ; i< integer.length ; i++){
            String num = Integer.toString(integer[i]);
            for(int j = num.length()-1 ; j >=0; j --){
                System.out.print(num.charAt(j));
            }
            System.out.print(" ");
        }
    }
}

class DayOfTheWeek{
    private int h, q,m,y,j,k ;
    
    public DayOfTheWeek(int q, int m , int y){
        this.q = q;
        this.m = m;
        this.y = y;
        j = y/100;
        k = y%100;
        if(m == 1 || m == 2){
            y --;
            j = y/100;
            k = y%100;
            h = (int)(( q + Math.floor(13*(m+1 + 12)/5) + k + Math.floor(k/4) + Math.floor(j/4) + 5*j)%7);
        }else{
            h = (int)(( q + Math.floor(13*(m+1)/5) + k + Math.floor(k/4) + Math.floor(j/4) + 5*j)%7);
        }
    }
    public boolean validDay(){
        switch(m){
            case 1 : if(q > 31)
                        return false;
                     break;
            case 2 : if(q > 29)
                        return false;
                     if(q == 29 && !leapYear() )
                         return false;
                     break;
            case 3 : if(q > 31)
                        return false;
                     break;
            case 4 : if(q > 30)
                        return false;
                     break;
            case 5 : if(q > 31)
                        return false;
                     break;
            case 6 : if(q > 30)
                        return false;
                     break;
            case 7 : if(q > 31)
                        return false;
                     break;
            case 8 : if(q > 31)
                        return false;
                     break;
            case 9 : if(q > 30)
                        return false;
                     break;
            case 10 : if(q > 31)
                        return false;
                     break;
            case 11 : if(q > 30)
                        return false;
                     break;
            case 12 : if(q > 31)
                        return false;
                     break;
            default : return false;
        }
        
        if(h < 0 || h > 6){
            return false;
        }
        
        return true;
    }
    
    public boolean leapYear(){
        if(y % 400 == 0){
            return true;
        }
        if(y % 4 == 0 && y % 100 != 0){
            return true;
        }
        return false;
    }
    
    public void displayDay(){
        System.out.print(q + "/" + m + "/" + y +" is ");
        if(validDay()){
            System.out.print("on ");
            switch(h){
                case 0 : System.out.println("Saturday");
                         break;
                case 1 : System.out.println("Sunday");
                         break;
                case 2 : System.out.println("Monday");
                         break;
                case 3 : System.out.println("Tuesday");
                         break;
                case 4 : System.out.println("Wednesday");
                         break;
                case 5 : System.out.println("Thursday");
                         break;
                case 6 : System.out.println("Friday");
                         break;
            }
        }else{
            System.out.println("invalid Input");
        }
    }
}

class Q4{
    public static void main(String[] args) {
        try{
            ObjectInputStream inputStream = new ObjectInputStream (new FileInputStream("Q4.dat"));
            try{
                while(true){
                    String line = inputStream.readUTF();
                    int q = Integer.parseInt(line.substring(0,2));
                    int m = Integer.parseInt(line.substring(2,4));
                    int y = Integer.parseInt(line.substring(4,8));
                    DayOfTheWeek day1 = new DayOfTheWeek(q,m,y);
                    day1.displayDay();
                }
            }catch(EOFException f){
            }
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
}

class Staff{
    protected String name ;
    protected String ic;

    public Staff(String name, String ic) {
        this.name = name;
        this.ic = ic;
    }
    
    public String toString(){
        return "Full Name: " + name +
                "\nIC: " + ic + "\n";
    }
}

class PermanentStaff extends Staff{
    private String grade;
    
    public PermanentStaff(String name, String ic, String grade) {
        super(name, ic);
        this.grade = grade;
    }
    
    public int getSalary(){
        if(grade.equalsIgnoreCase("EM01")){
            return 7000;
        }else if(grade.equalsIgnoreCase("EM02")){
            return 5000;
        }else if(grade.equalsIgnoreCase("EM03")){
            return 3000;
        }else if(grade.equalsIgnoreCase("EM04")){
            return 1000;
        }else{
            return 0;
        }
    }
    
    public String toString(){
        return super.toString() + "Grade: " + grade +
                "\nSalary: RM " + getSalary() + "\n";
    }

}

class PartTimeStaff extends Staff{
    private int workingHour;

    public PartTimeStaff(String name, String ic, int workingHour) {
        super(name, ic);
        this.workingHour = workingHour;
    }
    
    public int getSalary(){
        return 40*workingHour;
    }
    
    public String toString(){
        return super.toString() + "Number of working hours: " + workingHour
                + "\nSalary: RM " + getSalary() + "\n";
    }
    
}

class Main{
    public static void main(String[] args) {
        PermanentStaff p1 = new PermanentStaff("Abdul Razak", "871001-14-1765", "EM02");
        PartTimeStaff p2 = new PartTimeStaff("Tengku Ali", "911223-08-3301",35);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}