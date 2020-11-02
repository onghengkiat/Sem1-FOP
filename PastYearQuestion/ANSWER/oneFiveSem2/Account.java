import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

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

