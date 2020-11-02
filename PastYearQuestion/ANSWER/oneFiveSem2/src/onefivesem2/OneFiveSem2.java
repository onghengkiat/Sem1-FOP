package onefivesem2;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OneFiveSem2 {
    public static void main(String[] args) {
        byte zero = 0;
        char alphabetW = 'W';
        char H = 'H';
        byte three = 3;
        byte one = 1;
        char r = 'r';
        char d = 'd';
        double twoPointZero = 2.0;
        
        String output = "" + H + three + one + one + zero + " " + Character.toLowerCase(alphabetW) + zero + r + one + d + " " + twoPointZero; //concatenating
        System.out.println(output);
    }
}

class Q2{
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first player's name: ");
        String firstPlayerName = input.nextLine();
        System.out.print("Enter the second player's name: ");
        String secondPlayerName = input.nextLine();
        System.out.println("");
        
        int turn;
        int dice;
        int firstScore , secondScore;
        
        //player 1
        System.out.print(firstPlayerName + ", press enter to roll your dice!");
        input.nextLine();
        turn = rnd.nextInt(6) + 1;
        firstScore = turn;
        System.out.println("You obtained " + turn + " roll(s)!");
        System.out.println("You have to roll " + (turn - 1) + " more time(s)");
        
        for(int i = 1 ; i < turn ; i++){
            System.out.print(firstPlayerName + ", press enter to roll your dice!");
            input.nextLine();
            dice = rnd.nextInt(6)+1;
            System.out.println("You obtained " + dice);
            firstScore += dice;
        }
        System.out.println("Player 1, " + firstPlayerName + " obtained a score of: " + firstScore);
        System.out.println("");
        
        //player 2
        System.out.print(secondPlayerName + ", press enter to roll your dice!");
        input.nextLine();
        turn = rnd.nextInt(6) + 1;
        secondScore = turn;
        System.out.println("You obtained " + turn + " roll(s)!");
        System.out.println("You have to roll " + (turn - 1) + " more time(s)");
        
        for(int i = 1 ; i < turn ; i++){
            System.out.print(secondPlayerName + ", press enter to roll your dice!");
            input.nextLine();
            dice = rnd.nextInt(6)+1;
            System.out.println("You obtained " + dice);
            secondScore += dice;
        }
        System.out.println("Player 1, " + secondPlayerName + " obtained a score of: " + secondScore);
        
        System.out.println("");
        if(firstScore > secondScore){
            System.out.println("Player 1," + firstPlayerName + " wins!");
        }else if(secondScore > firstScore){
            System.out.println("Player 2," + secondPlayerName + " wins!");
        }else{
            System.out.println("DRAW !");
        }
    }
}

class Q3{
    public static void main(String[] args) {
        try{
            PrintWriter outputStream = new PrintWriter(new FileOutputStream ("Q3.txt"));
            Random rnd = new Random();
            Scanner input = new Scanner(System.in);
            
            int [] integer = new int[10];
            System.out.println("The following is the 10 random numbers generated that is stored in an array:");
            
            for(int i = 0 ; i < 10 ; i++){
                integer[i] = rnd.nextInt(51);
                System.out.print(integer[i] + " ");
            }
            System.out.println("");
            outputStream.println();

            outputStream.print("The content of the sorted array is (ascending): ");
            System.out.println("The following is the sorted array (ascending):");
            for(int i = 0 ; i < 9; i++){
                for(int j = 0 ; j < 9 ; j++){
                    if(integer[j+1] < integer[j]){
                        int temp = integer[j+1];
                        integer[j+1] = integer[j];
                        integer[j] = temp;
                    }
                }
            }
            for(int i = 0 ; i < 10 ; i++){
                System.out.print(integer[i] + " ");
                outputStream.print(integer[i] + " ");
            }
            
            System.out.println("");
            outputStream.println();

            System.out.print("Enter an integer input to be searched within the sorted array: ");
            int n = input.nextInt();
            boolean exist = false;
            for(int i = 0 ; i < 10 ; i ++){
                if(integer[i] == n){
                    exist = true;
                    outputStream.println("Input integer " + n + " was found on index " + i + " of the sorted array.");
                    outputStream.println("It was found in " + (i+1) + " number of loops");
                    break;
                }
            }
            
            if(exist == false){
                outputStream.println("Input integer " + n + " was not found in the sorted array.");
            }
            outputStream.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
}

class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    public Account() {
    }
    
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    
    public void withdraw(int withdraw){
        System.out.println("Previous balance: RM" + balance);
        balance -=  withdraw;
        System.out.println("Current balance after withdrawal of RM " + withdraw + " is: RM" + balance);
    }
    
    public void deposit(int deposit){
        System.out.println("Previous balance: RM" + balance);
        balance +=  deposit;
        System.out.println("Current balance after deposit of RM " + deposit + " is: RM" + balance);
    }
    
    public void displayRecordInfo(){
        System.out.println("Account id is: " + id);
        System.out.println("Account balance is: " + balance);
        System.out.println("Annual interest rate is: " + annualInterestRate);
    }
}

class Q4{
    public static void main(String[] args) {
        Account recordA = new Account(1234 , 10000, 7.77);
        System.out.println("The information about account A is as follows: ");
        recordA.displayRecordInfo();
        
        System.out.println("");
        
        System.out.println("The information about account B is as follows: ");
        Account recordB = new Account(1001, 20000, 8);
        recordB.displayRecordInfo();
        System.out.println("The monthly interest rate is: " + recordB.getMonthlyInterestRate());
        recordB.deposit(1500);
        recordB.withdraw(500);
    }
}