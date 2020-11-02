package onesevensem1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class OneSevenSem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0, number2 = 0, number3 = 0, number4 = 0,number5 = 0;
        int inputNumber ; //number entered by user
        int value = 0; //number of starts to print
        //1st error int
        int counter = 1;//counter for current number
        
        //2nd error no int
        while(counter <= 5){
            System.out.print("Enter number: ");
            inputNumber = input.nextInt();
            //define appropriate num if input is between 1-30
            if(inputNumber >= 1 && inputNumber <= 30){
                //3rd error inputNumber should be counter
                switch(counter){
                    case 1: number1 = inputNumber; break;
                    case 2: number2 = inputNumber; break;
                    case 3: number3 = inputNumber; break;
                    case 4: number4 = inputNumber; break;
                    case 5: number5 = inputNumber; break;
                }
                //4th error } is missing 
                counter++;
            }// end if
            else
                System.out.println( "Invalid Input\nNumber should be between 1 and 30" );
        }//end while
        // print histograms
        //5th error first , should be ;
        //6th error second , should be ;
        //7th error counter <= 5
        for(counter = 1 ; counter <= 5 ; counter++){
            //8th error switch(counter)
            switch(counter){
                case 1: value = number1; break;
                case 2: value = number2; break;
                case 3: value = number3; break;
                case 4: value = number4; break;
                case 5: value = number5; break;
            }//switch 
            //9th and 10th error int one time only
            for(int j = 1; j <= value ; j++)
                System.out.print("*");
            System.out.println("");
        }//end for loop
    }//end main
}//end class


class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial tuition fee (i.e year 1): ");
        double tuitionFee = input.nextDouble();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double rateOfIncrement = input.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = input.nextInt();
        System.out.println("\nComputed tuition fee for year " + year + " is: " + computeFee(tuitionFee, rateOfIncrement, year));
    }
    
    //question output macam salah ?
    public static double computeFee(double initialTuitionFee , double rateOfIncrement, int year){
        double tuitionFee = initialTuitionFee;
        for(int i = 1 ; i < year ; i++){
            tuitionFee += tuitionFee * (rateOfIncrement/100);
        }
        return tuitionFee;
    }
}

class Q3{
    public static void main(String[] args) {
        try{
            PrintWriter outputStream = new PrintWriter(new FileOutputStream ("data.txt"));
            String character = generateCharacter();
            System.out.println("The string generated is: " + character);
            outputStream.println(character);
            outputStream.close();
            Scanner inputStream = new Scanner(new FileInputStream("data.txt"));
            
            while(inputStream.hasNextLine()){
                character = inputStream.nextLine();
                char [] characterArray = new char [character.length()];
                for(int i = 0 ; i < character.length(); i++){
                    characterArray[i] = character.charAt(i);
                }
                System.out.println("String sorted in ascending order: "  + arrangeCharacter(characterArray, '>'));
                System.out.println("String sorted in descending order: " + arrangeCharacter(characterArray, '<'));
                System.out.println("OriginalString from file: " + character);
            }
            
            inputStream.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
    
    public static String generateCharacter(){
        Random rnd = new Random();
        String characters = "";
        int bigOrSmall;
        for(int i = 0 ; i < 6 ; i ++){
            bigOrSmall = rnd.nextInt(2);
            if(bigOrSmall == 0){
                characters += (char)(rnd.nextInt(26)+65);
            }else{
                characters += (char)(rnd.nextInt(26)+97);
            }
        }
        return characters;
    }
    
    public static String arrangeCharacter(char [] character , char direction){
        String orderedCharacter = "";
        if(direction == '<'){
            for(int i = 0 ; i < character.length ; i++){
                for(int j = 0 ; j < character.length-1 ; j++){
                    if(character[j+1] > character[j]){
                        char temp = character[j+1];
                        character[j+1] = character[j];
                        character[j] = temp;
                    }
                }
            }
        }else if(direction == '>'){
            for(int i = 0 ; i < character.length-1; i++){
                for(int j = 0 ; j < character.length-1 ; j++){
                    if(character[j+1] < character[j]){
                        char temp = character[j+1];
                        character[j+1] = character[j];
                        character[j] = temp;
                    }
                }
            }
        }else{
            return "not a valid direction";
        }
        for(int i = 0 ; i < character.length ; i++){
            orderedCharacter += character[i];
        }
        return orderedCharacter;
    }
}

class Complex{
    private double real,imaginary;
    
    public Complex(){
    
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    
    public static void addComplexNum(Complex num1 , Complex num2){
        double newReal = num1.getReal()+num2.getReal();
        double newImaginary = num1.getImaginary() + num2.getImaginary();
        System.out.println("Addition of the two complex numbers: (" + newReal + " + " + newImaginary + "i)");
    }
    
    public static void substractComplexNum(Complex num1 , Complex num2){
        double newReal = num1.getReal()-num2.getReal();
        double newImaginary = num1.getImaginary() - num2.getImaginary();
        System.out.println("Substraction of the two complex numbers: (" + newReal + " + " + newImaginary + "i)");
    }
    
    public String toString(){
        return "(" + real + " + " + imaginary + "i)";
    }
}

class Q4Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double real,imaginary;
        
        System.out.print("First complex number. Enter a number for the real part: ");
        real = input.nextDouble();
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        imaginary = input.nextDouble();
        Complex num1 = new Complex(real,imaginary);
        
        System.out.print("Second complex number. Enter a number for the real part: ");
        real = input.nextDouble();
        System.out.print("Second complex number. Enter a number for the imaginary part: ");
        imaginary = input.nextDouble();
        Complex num2 = new Complex(real,imaginary);
        
        System.out.println("First complex number: " + num1.toString());
        System.out.println("Second complex number: " + num2.toString());
        Complex.addComplexNum(num1, num2);
        Complex.substractComplexNum(num1, num2);
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

