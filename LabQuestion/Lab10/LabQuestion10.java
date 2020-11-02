package LabQuestion.Lab10;

import java.io.*;
import java.util.Scanner;

public class LabQuestion10 {
}

//1
abstract class Employee {

    String name;
    double salary;

    Employee(String a) {
        name = a;
    }

    abstract void display();
}

class permanentEmployee extends Employee {

    permanentEmployee(String a, char b) {
        super(a);
        if (b == 'A') {
            salary = 4000;
        }
        if (b == 'B') {
            salary = 3000;
        }
        if (b == 'C') {
            salary = 2000;
        }
    }

    @Override
    void display() {
        System.out.println("The worker " + name + " has a salary of " + salary + " for this month");
    }
}

class contractStaff extends Employee {

    contractStaff(String a, double sales) {
        super(a);
        salary = 500 + sales * 0.5;
    }

    @Override
    void display() {
        System.out.println("The worker " + name + " has a salary of " + salary + " for this month");
    }
}

class temporaryStaff extends Employee {

    temporaryStaff(String a, int hour) {
        super(a);
        salary = 15 * hour;
    }

    @Override
    void display() {
        System.out.println("The worker " + name + " has a salary of " + salary + " for this month");
    }
}

class testEmployee {

    public static void main(String[] args) {
        Employee worker1 = new permanentEmployee("Ong Heng Kiat", 'B');
        Employee worker2 = new contractStaff("Lee Hong Yan", 1000);
        Employee worker3 = new temporaryStaff("Ong Zi Jing ", 10);
        worker1.display();
        worker2.display();
        worker3.display();
    }
}


//Question 2
//an interface that consists of encode and decode method to be implemented inside the other class
interface MessageEncoder {
    //encrypty the plain text
    void encode();

    //decode the encrypted text
    void decode();
}

class SubstitutionCipher implements MessageEncoder {
    
    String input, output;
    
    //shift means the number added to the characters 
    //example if shift = 6 , input = "A" , output will be "G"
    int shift;

    //A constructor 
    SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        //the input is get from the inputFileName.txt
        input = inputFileName;
        
        //the output will be transferred into outputFileName.txt
        output = outputFileName;
        
        //set the number of shift
        this.shift = shift;
    }

    @Override
    public void encode() {
        try {
            //get the input from the input.txt
            Scanner inputStream = new Scanner(new FileInputStream(input));
            
            //transfer the output to the output.txt
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(output));

            //to make sure we get all the input in the textpad
            while (inputStream.hasNextLine()) {
                
                //assign the input to the String line 
                //assign the input line by line
                String line = inputStream.nextLine();
                
                //output all the characters in the string one by one, from first character until the last character
                //the output is saved in a output.txt
                for (int i = 0; i < line.length(); i++) {
                    //at the same time, the character is added by the value of "shift"
                    outputStream.print((char) (line.charAt(i) + shift));
                }
                
                //print out a line after you finish printing out a line of characters
                outputStream.println();
            }
            
            //close and save the file
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
    }

    @Override
    public void decode() {
        try {
            //same concept as above
            Scanner inputStream = new Scanner(new FileInputStream(input));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(output));

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    
                    //the different thing is decode method will minus the shift value , and not adding 
                    outputStream.print((char) (line.charAt(i) - shift));
                }
                outputStream.println();
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
    }

}

class testSubstitutionCipher {

    public static void main(String[] args) {
        //the program will have exception if product.txt does not exist in the project 
        //in this case , the input fill is product.txt while the output file is cipherText.txt
        //the shift value is 15
        SubstitutionCipher encode = new SubstitutionCipher("product.txt", "cipherText.txt", 15);
        
        //in this case , the input file is cipherText.txt while the plainText.txt is the output file
        //the shift value is 15
        SubstitutionCipher decode = new SubstitutionCipher("cipherText.txt", "plainText.txt", 15);
        
        //then encode and decode
        //the produxt.txt and plainText.txt should have the same contents in this case
        encode.encode();
        decode.decode();
    }
}

//3
class ShuffleCipher implements MessageEncoder {

    String input, output;
    
    //this means the number of shuffle done 
    int shuffleTime;

    //same concept as question 2
    ShuffleCipher(String inputFileName, String outputFileName, int N) {
        input = inputFileName;
        output = outputFileName;
        shuffleTime = N;
    }

    @Override
    public void encode() {
        try {
            Scanner inputStream = new Scanner(new FileInputStream(input));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(output));

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                
                //String shuffled is a variable that is used to store the shuffled text
                String shuffled = "";
                
                for (int i = 0; i < shuffleTime; i++) {
                    //reset the shuffled to an empty string every time before shuffle starts
                    shuffled = "";
                    
                    //this is the index of the middle of the string
                    int mid = line.length() / 2;
                    
                    //if String = "1234";
                    //then the first half will take (0,2) = "12", last half will take(2,4) = "34"
                    //if String = "12345" , mid = (int)5/2 = 2 
                    //then the first half will take (0,2) = "12", the last half will take (2,5) = "345"
                    String firstHalf = line.substring(0, mid);
                    String lastHalf = line.substring(mid, line.length());
                    
                    //first character of first half + first character of last half + second character of first half + second character of last half......
                    for (int j = 0; j < firstHalf.length(); j++) {
                        shuffled = shuffled + firstHalf.charAt(j) + lastHalf.charAt(j);
                    }
                    
                    //this is the special case if the String.length is an odd number like "12345"
                    //after the for loop just now , the result will be "1324" but the 5 is still missing
                    //so we have to add the String shuffled , "1324" with the last character of the last part
                    if (lastHalf.length() > firstHalf.length()) {
                        shuffled = shuffled + lastHalf.charAt(lastHalf.length() - 1);
                    }
                    
                    //then assign the shuffled string to the line as a new input for the next shuffle 
                    line = shuffled;
                }
                
                //lastly if it reaches the shuffleTime , then the shuffled is storing the shuffled text
                //so just print it out in the output.txt
                outputStream.println(shuffled);
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
    }

    @Override
    public void decode() {
        //alomst same concept as encode
        try {
            Scanner inputStream = new Scanner(new FileInputStream(input));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(output));

            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                
                //variable that stores the unshuffled text
                String unshuffled = "";
                
                for (int i = 0; i < shuffleTime; i++) {
                    
                    //reset the unshuffled before starts to shuffle it back to the plain text
                    unshuffled = "";
                    
                    //if the length of the input is even number like "1234"
                    if (line.length() % 2 == 0) {
                        
                        //this is to get the first half part
                        for (int j = 0; j < line.length(); j += 2) {
                            unshuffled = unshuffled + line.charAt(j);
                        }
                        
                        //then only you get the last half part and combine them together
                        for (int j = 1; j < line.length(); j += 2) {
                            unshuffled = unshuffled + line.charAt(j);
                        }
                    }
                    
                    //if the length of the input is odd number like "123"
                    else {
                        
                        //this is to get the first half part
                        for (int j = 0; j < line.length() - 2; j += 2) {
                            unshuffled = unshuffled + line.charAt(j);
                        }
                        
                        //then only get the last half part and combines them together
                        for (int j = 1; j < line.length(); j += 2) {
                            unshuffled = unshuffled + line.charAt(j);
                        }
                        
                        //special case for odd number , dont forget to add back the last character of the last half part
                        //example like "12345" 
                        //first for loop will get "1" + "3" 
                        //second for loop will get "2" + "4" 
                        //"5" is still missing , so we need to add this line to add back the last character "5"
                        //then add them together will be "13245"
                        unshuffled = unshuffled + line.charAt(line.length() - 1);
                    }
                    line = unshuffled;
                }
                outputStream.println(unshuffled);
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }

    }
}

class testShuffleCipher {

    public static void main(String[] args) {
        //this will come out with error if product.txt doesnt exist
        //in this case the input is product.txt
        //output is cipher.txt
        //shuffle times is 4
        ShuffleCipher encode = new ShuffleCipher("product.txt", "cipher.txt", 4);
        
        //the input is cipher.txt
        //the output is plain.txt
        ShuffleCipher decode = new ShuffleCipher("cipher.txt", "plain.txt", 4);
        
        //in this case , the product.txt and plain.txt should have the same contents
        encode.encode();
        decode.decode();
    }

}

//4
//an interface that consists of method search that can be implemented by the other classes
interface Searchable {

    boolean search(int dateStartTime, int dateEndTime);
}

class Appointment implements Searchable {
    //start time and end time mean which hours like 1000 or 1200 or 1350 in 24hours format
    int day, month, year, startTime, endTime;
    
    //dateStartTime and dateEndTime combines the day,month,year and (start time / end time)
    //in the format day+month+year+start/end time
    int dateStartTime,  dateEndTime;
    
    Appointment(int a, int b, int c, int d, int z) {
        day = a;
        month = b;
        year = c;
        startTime = d;
        endTime = z;
        String classTime = "" + day + "/" + month + "/" + year + ", " + startTime + " - " + endTime ;
    }

    void saveAppointment() {
        try {
            Scanner inputStream =new Scanner (new FileInputStream ("appointment.txt"));
            
            //the "true" is to make sure that when it doesn't rewrite the textpad, it appends to the textpad 
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("appointment.txt" ,true));
            
            //store the apoointment in the textpad
            outputStream.println(day);
            outputStream.println(month);
            outputStream.println(year);
            outputStream.println(startTime);
            outputStream.println(endTime);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }

    @Override
    public boolean search(int dateStartTime, int dateEndTime) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("appointment.txt"));
            
            //to get the input from the textpad which is the old appointments that have been done before
            while (inputStream.hasNextLine()) {
                
                //getting the input according to the sequence on how we output them just now
                int day1= inputStream.nextInt();
                int month1= inputStream.nextInt();
                int year1= inputStream.nextInt();
                int startTime1= inputStream.nextInt();
                int endTime1= inputStream.nextInt();
                
                //to clean the line so that it will enter the next line
                //example: 15 , after endTime1 = inputStream.nextInt();  it will become "" in that line 
                //this is to end the while loop because the last line if you didn't put this , means that there is still a "" there
                //so it will continue int day1 = ..nextInt(); int month1= ..nextInt(); and so on which will cause error 
                //because there is actually no input that can suits the int datatype as input
                inputStream.nextLine();
                
                //only compare them if day , month and year also the same which means at the same day
                if (day1== day && month1 == month && year1 == year){
                    
                    //if start time is start before the saved appointment but end after the start time of the saved appointment, then it is false
                    if(startTime1 <= startTime && endTime1 > startTime){
                        return false;
                    }
                    
                    //if the start time is start in between the time of the saved appointment ,then it is false
                    else if(startTime1 <= endTime && startTime1 >= startTime){
                        return false;
                    }
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
        return true;
    }
}

class testAppointment{
    public static void main(String[] args) {
        //set the time
        Appointment app1 = new Appointment(1,1,2000,1000,1200);
        
        //if search method returns true which means the slot is empty
        if(app1.search(app1.dateStartTime , app1.dateEndTime)){
            //then save the appointment
            app1.saveAppointment();
        }else{
            //else dont save
            System.out.println("Please choose another date, the date is not available");
        }
        
        //same as above
        Appointment app2 = new Appointment(1,1,2000,1000,1200);
        if(app2.search(app2.dateStartTime , app2.dateEndTime)){
            app2.saveAppointment();
        }else{
            System.out.println("Please choose another date, the date is not available");
        }
        
        //apointment 3
        Appointment app3 = new Appointment(1,1,2000,1000,1100);
        if(app3.search(app3.dateStartTime , app3.dateEndTime)){
            app3.saveAppointment();
        }else{
            System.out.println("Please choose another date, the date is not available");
        }
        
        //appointment 4
        Appointment app4 = new Appointment(1,1,2000,1300,1400);
        if(app4.search(app4.dateStartTime , app4.dateEndTime)){
            app4.saveAppointment();
        }else{
            System.out.println("Please choose another date, the date is not available");
        }
        
        //appointment 5 
        Appointment app5 = new Appointment(4,1,2000,1000,1200);
        if(app5.search(app5.dateStartTime , app5.dateEndTime)){
            app5.saveAppointment();
        }else{
            System.out.println("Please choose another date, the date is not available");
        }
        
        //in this case supposingly the appointment 2and 3 will return false 
    }
}
