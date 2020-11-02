package onesixsem2;
import java.util.Random;
import java.util.Scanner;
public class OneSixSem2 {
    public static void main(String[] args) {
    }
    
}

class Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number in pounds: ");
        double pound = input.nextDouble();
        double kilo = pound*0.454;
        System.out.println(pound + " pounds is " + kilo + " kilograms");
    }
}

class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        String num = input.nextLine();
        int sum = 0 ;
        for(int i = 0 ; i < num.length(); i ++){
            sum += (num.charAt(i)-'0');
        }
        System.out.println("The sum of the digits is " + sum);
       
    }
}

class Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int num = input.nextInt();
        for(int row = 0 ; row < num ; row ++){
            for(int column = 0 ; column < num*2 - 1 ; column ++){
                if(column >= (num-1-row) && column <= (num -1 + row)){
                    if(column <= num-1){
                        System.out.print( num-column);
                    }else{
                        System.out.print( column - num + 2);
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

class Q4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int n = input.nextInt();
        System.out.print("Enter the length of a particular side of the regular polygon (in meter), s: ");
        int s = input.nextInt();
        
        System.out.printf("The area is: %.2f squared meters." , area(n,s) );
    }
    
    public static double area(int n, double s){
        return (n*Math.pow(s,2)/(4*Math.tan(Math.toRadians(180/n))));
    }
}

class Q5{
    public static void main(String[] args) {
        Random rnd = new Random();
        int [][] board = new int [3][3];
        int turn = 0 ; 
        for(int row = 0 ; row < board.length ; row ++){
            for(int column = 0 ; column < board[row].length ; column++){
                //assume 2 as havent fill in 
                board [row][column] = 2;
            }
        }
        
        int row = rnd.nextInt(3);
        int column = rnd.nextInt(3);
        
        while(turn < 9 ){
            turn ++;
            while(board[row][column] != 2){
                row = rnd.nextInt(3);
                column = rnd.nextInt(3);
            }
            board[row][column] = turn%2;
        }
        
        displayBoard(board);
        checkRow(board);
        checkColumn(board);
        checkDiagonal(board);
    }
    
    public static void checkRow(int [][] board ){
        for(int row = 0 ; row < board.length ; row ++){
            boolean same = true;
            for(int column = 1 ; column < board[row].length ; column ++){
                if(board[row][column] != board[row][column - 1]){
                    same = false ;
                }
            }
            if(same)
                System.out.println("All " + board[row][0] + "s on row " + (row+1) );
        }
    }
    
    public static void checkColumn(int [][] board){
        for(int column = 0 ; column < board.length ; column ++){
            boolean same = true;
            for(int row = 1 ; row < board.length ; row ++){
                if(board[row][column] != board[row-1][column]){
                    same = false;
                }
            }
            if(same)
                System.out.println("All " + board[0][column] + "s on column " + (column+1) );
        }
        
    }
    
    public static void checkDiagonal(int [][] board){
        boolean same = true;
        for(int row = 1 ; row < board.length ; row++){
            if(board[row][row] != board[row-1][row-1]){
                same = false;
            }
        }
        if(same){
            System.out.println("All " + board[0][0] + "s on diagonal leftTop to rightBottom");
        }
        
        same = true;
        for(int row = 1 ; row < board.length ; row++){
            if(board[row][board.length - row - 1] != board[row-1][board.length - (row - 1) - 1]){
                same = false;
            }
        }
        if(same){
            System.out.println("All " + board[board.length - 1][0] + "s on diagonal leftBottom to rightTop");
        }
    }
    
    public static void displayBoard(int [][] board){
        for(int [] row : board){
            for(int column : row){
                System.out.print(column);
            }
            System.out.println();
        }
    }
}

class FinancialRecord{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    public FinancialRecord() {
    }
    
    public FinancialRecord(int id, double balance, double annualInterestRate){
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
        System.out.println("Financial record id is: " + id);
        System.out.println("Financial record balance is: " + balance);
        System.out.println("Annual interest rate is: " + annualInterestRate);
    }
}

class Q6{
    public static void main(String[] args) {
        FinancialRecord recordA = new FinancialRecord(1234 , 10000, 7.77);
        System.out.println("The information about financial record A is as follows: ");
        recordA.displayRecordInfo();
        
        System.out.println("");
        
        System.out.println("The information about financial record B is as follows: ");
        FinancialRecord recordB = new FinancialRecord(1001, 20000, 8);
        recordB.displayRecordInfo();
        System.out.println("The monthly interest rate is: " + recordB.getMonthlyInterestRate());
        recordB.deposit(1500);
        recordB.withdraw(500);
    }
}