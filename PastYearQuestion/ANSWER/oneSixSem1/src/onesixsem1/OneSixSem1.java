package onesixsem1;
import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;
public class OneSixSem1 {
    //1st error delete import Scanner
    public static void main(String[] args) {
        //2nd error no ""
        int [] num = {34,15,12,27,74,23};
        int cnt = 0;
        //3rd error num.length
        for(int i = 0 ; i < num.length ; i++)
            //6th error num[i]
            if(isEven(num[i]))
                cnt++;
        System.out.println("The number of even number is " + cnt);
        //7th error num[0] becomes num
        System.out.println("The sum of the array is " + getTotal(num));
    }
    
    //4th error static
    public static boolean isEven(int a){
        //5th error == 
        if(a%2 == 0)
            return true;
        else
            return false;
    }
    
    //8th error void becomes int
    public static int getTotal(int[]a){
        int total = 0;
        for(int i = 0 ; i< a.length; i ++)
            //9th error +=
            total += a[i];
        return total;
    }
}

class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int playerWin = 0 ;
        int compWin = 0;
        int playerAction = 0;
        int compAction = 0;
        String action [] = {"Paper" , "Scisssor" , "Rock"};
        
        while(compWin != 3 && playerWin != 3){
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            playerAction = input.nextInt();
            compAction = rnd.nextInt(3)+1;
            System.out.println("Player : " + action[playerAction-1] + " ----- Computer : " + action[compAction-1]);
            
            if(compAction == playerAction){
            
            }else if(compAction == playerAction+1 || (compAction == 1 && playerAction == 3)){
                compWin ++;
                System.out.println("Computer win " + compWin + " time(s)");
            }else{
                playerWin ++;
                System.out.println("Player win " + playerWin + " time(s)");
            }
        }
        
        if(playerWin == 3){
            System.out.println("Player wins the game.");
        }else{
            System.out.println("Computer wins the game.");
        }
    }
}

class Q3{
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of random integer: ");
        int n = input.nextInt();
        int [] integer = new int[n];
        for(int i = 0 ; i < n ; i ++){
            integer[i] = rnd.nextInt(1001);
        }
        displayInteger(integer);
        System.out.println("");
        
        displayMaxNum(integer);
        System.out.println("");
        
        displayRoundNum(integer);
        System.out.println("");
        
        reverseInteger(integer);
        System.out.println("");
    }
    
    public static void displayInteger(int [] integer){
        System.out.print("The random integer : ");
        for(int i = 0 ; i < integer.length ; i ++){
            System.out.print(integer[i] + " ");
        }
    }
    
    public static void displayMaxNum(int [] integer){
        int max = integer[0] ; 
        for(int i = 1 ; i < integer.length ; i ++){
            if(integer[i] > max){
                max = integer[i];
            }
        }
        System.out.print("Maximum Number : " + max);
    }
    
    public static void displayRoundNum(int [] integer){
        System.out.print("The approximation of the integer to the nearest tenth : ");
        for(int i = 0 ; i < integer.length ; i ++){
            if(integer[i]%10 <=4){
                System.out.print(integer[i] - integer[i]%10 + " ");
            }else{
                System.out.print(integer[i] + (10 - integer[i]%10) + " ");
            }
        }
    }
    
    public static void reverseInteger (int [] integer){
        System.out.print("The random integer in reverse order: " );
        for(int i = 0  ; i < integer.length ; i ++){
            String num = Integer.toString(integer[i]);
            for(int j = num.length() - 1 ; j >= 0 ; j--){
                System.out.print(num.charAt(j));
            }
            System.out.print(" ");
        }
    }
}

class Q4{
    public static void main(String[] args) {
        try{
            Scanner inputStream = new Scanner(new FileInputStream("Q4.txt"));
            while(inputStream.hasNextLine()){
                String password = inputStream.nextLine();
                boolean upperCase = false;
                boolean lowerCase = false;
                boolean digit = false;
                boolean nonAlphabet = false;
                
                for(int i = 0 ; i < password.length(); i++){
                    if(Character.isUpperCase(password.charAt(i))){
                        upperCase = true;
                    }
                    if(Character.isLowerCase(password.charAt(i))){
                        lowerCase = true;
                    }
                    if(Character.isDigit(password.charAt(i))){
                        digit = true;
                    }
                    
                    if(!Character.isSpaceChar(password.charAt(i)) && !Character.isLetterOrDigit(password.charAt(i))){
                        nonAlphabet = true;
                    }
                }
                if(password.length() >= 8 && upperCase && lowerCase && digit && nonAlphabet){
                    System.out.println("Strong password.");
                }else{
                    System.out.println("Not a strong password.");
                }
            }
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
}

class CreditCard{
    protected String name;
    protected String cardNumber;
    protected String cardType;
    protected double totalReward;
    
    public CreditCard(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    public double getTotalReward() {
        return totalReward;
    }

    public void setTotalReward(double totalReward) {
        this.totalReward = totalReward;
    }
    
    public String toString(){
        return "Credit Card : " + name + " (" + cardNumber + ")" +
                "\nCard Type : " + cardType + 
                "\nTotal Cash Reward : " + totalReward;
    }
    
}

class Rebate extends CreditCard{
    
    private double fuel =0 , utility = 0,grocery = 0 ,other = 0;
    
    public Rebate(String name, String cardNumber) {
        super(name, cardNumber);
        cardType = "Cash Rebate";
    }
    
    public void pay(double amount, String type){
        if(type.equalsIgnoreCase("grocery")){
            grocery += amount;
        }
        if(type.equalsIgnoreCase("utility")){
            utility += amount;
        }
        if(type.equalsIgnoreCase("fuel")){
            fuel += amount;
        }
        if(type.equalsIgnoreCase("other")){
            other += amount;
        }
    }
    
    public double getReward(){
        totalReward = fuel*0.08 + utility*0.05 + grocery *0.02 + other *0.002;
        if(fuel >= 100){
            totalReward += fuel/100 * 8;
        }
        return totalReward;
    }
}

class Point extends CreditCard{
    private double friday = 0,saturday = 0,sunday = 0,other = 0;

    public Point(String name, String cardNumber) {
        super(name, cardNumber);
        cardType ="Point Reward";
    }
    
    public void pay(double amount , String day){
        if(day.equalsIgnoreCase("friday")){
            friday += (int)amount*2;
        }
        else if(day.equalsIgnoreCase("saturday")){
            saturday += (int)amount*3;
        }
        else if(day.equalsIgnoreCase("sunday")){
            sunday += (int)amount*4;
        }else{
            other += (int)amount;
        }
    }
    
    public double getReward(){
        totalReward = (friday + saturday + sunday + other)*0.01;
        return totalReward;
    }
}


class Main{
    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim", "1111222233334444");
        Point p = new Point("John Lim" , "5555666677778888");
        
        r.pay(124.80, "Grocery");
        r.pay(64.60, "Other");
        r.pay(95.40, "Fuel");
        r.pay(100.00, "Utility");
        r.pay(220.00, "Other");
        
        p.pay(124.80, "Saturday");
        p.pay(64.60, "Friday");
        p.pay(95.40, "Sunday");
        p.pay(100.00, "Friday");
        p.pay(220.00, "Tuesday");
        
        r.getReward();
        System.out.println(r.toString());
        
        p.getReward();
        System.out.println(p.toString());
        
        if(r.getTotalReward() > p.getTotalReward()){
            System.out.println("The best card is Cash Rebate Card");
        }else{
            System.out.println("The best card is Point Reward Card");
        }
    }
}