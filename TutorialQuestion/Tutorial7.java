package TutorialQuestion;

import java.util.*;
import java.io.PrintWriter;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.EOFException;

public class Tutorial7 {

    public static void main(String[] args) {
        //Question1a
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("integer.txt"));
            Random rnd = new Random();
            int[] randomNumber = new int[10];
            outputStream.println("The random numbers for question 1a are ");
            for (int i = 0; i < 10; i++) {
                randomNumber[i] = rnd.nextInt(1001);
                outputStream.println(randomNumber[i]);
            }

            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        //Question1b
        try {
            Scanner inputStream = new Scanner(new FileInputStream("integer.txt"));
            System.out.println(inputStream.nextLine());
            int[] randomNumber = new int[10];
            int max = 0;
            for (int i = 0; i < 10; i++) {
                randomNumber[i] = inputStream.nextInt();
                System.out.println(randomNumber[i]);
                if (randomNumber[i] > max) {
                    max = randomNumber[i];
                }
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }

        //Question1c
        try {
            ObjectOutputStream outputStream= new ObjectOutputStream (new FileOutputStream ("integer.dat"));
            outputStream.writeUTF("The random numbers for question 1c are ");
            Random rnd = new Random();
            int[] randomNumber = new int[10];
            for (int i = 0; i < 10; i++) {
                randomNumber[i] = rnd.nextInt(1001);
                outputStream.writeInt(randomNumber[i]);
            }
            outputStream.close();
        }catch (IOException e){
            System.out.println("Problem with file output");   
        }
        
        //Question1d
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream ("integer.dat"));
            System.out.println(inputStream.readUTF());
            System.out.println(inputStream.readInt());
            int Sum=0,count=0;
            int integer;
            try{
                while(true){
                    integer=inputStream.readInt();
                    System.out.println(integer);
                    Sum+=integer;
                    count+=1;
                }
            }catch(EOFException e){}
            int average= Sum/count;
            System.out.println("The average number is " + average);
            inputStream.close();
            
        }catch (FileNotFoundException e){
            System.out.println("The file is not found");
        }catch (IOException e){
            System.out.println("Problem with file output");
        }
        
        /*
        Question2a
        PrintWriter out = new PrintWriter(new FileOutputStream("d://data/matrix.txt"));
        
        Question2b
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        
        Question2c
        int num;
        try{
            ObjectInputStream a = new ObjectInputStream(new FileInputStream("data.dat"));
            num = a.readInt();
            a.close();
        } catch(IOException e){}
        
        Question2d
        try{
        ObjectOutputStream o= new ObjectOutputStream (new FileOutputStream("data.dat"));
        o.writeChar('A');
        o.close();
        }catch(IOException e){}
        */
        
        //Question3
        try{
            Scanner input= new Scanner(System.in);
            System.out.println("Enter a sentence ");
            String sentence = input.nextLine();
            PrintWriter outputStream = new PrintWriter( new FileOutputStream("data.txt"));
            for (int i=0; i<sentence.length();i++){
                int ASCIIdecimal = (int) sentence.charAt(i);
                int []binary = new int [8];
                for(int bit=0;bit<8;bit++){
                    if (ASCIIdecimal %2 ==0){
                    binary[bit] = 0;
                    }
                    else{
                    binary[bit] = 1;
                    }
                    ASCIIdecimal /= 2;
                }
                for (int bit=7;bit>=0;bit--){
                outputStream.print(binary[bit]);
                }
                outputStream.println();
            }
            outputStream.close();
        }catch(IOException e){
            System.out.println("Problem with file input");
        }
        
        try {
            Scanner inputStream = new Scanner (new FileInputStream ("data.txt"));
            int bit , decimal , power;
            while(inputStream.hasNext()){
                bit = inputStream.nextInt();
                decimal = 0;
                power = 0;
                while (bit != 0){
                    decimal +=( bit % 10 )*Math.pow(2,power);
                    power+=1;
                    bit/= 10;
                }
                System.out.print((char)decimal);
            }
        }catch (FileNotFoundException e){
            System.out.println("File is not found");
        }catch (IOException e){
            System.out.println("Problem with file output");
        }
    }
}
