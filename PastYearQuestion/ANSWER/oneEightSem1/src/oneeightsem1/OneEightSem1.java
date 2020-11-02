package oneeightsem1;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class OneEightSem1 {
    public static void main(String[] args) {
        //1st error Random become Scanner
        //2nd error out becomes in
        Scanner a = new Scanner(System.in);
        int num, sum = 0;
        do{
            System.out.print("Enter an integer number, -1 to quit:");
            //3rd error double become int
            num = a.nextInt();
            //4th error = should be ==
            //5th error to break the loop immediately, it should be break instead of continue
            if(num == -1)
                break;
            //6th error for even number it should be == 0
            if(num%2 == 0)
                System.out.println("The number is an even number");
            else 
                System.out.println("The number is an odd number");
            //7th error = should be +=
            sum += num;
        }while( num != -1); //8th error == should be != 9th error should put ; at the end
        //10th error + should be ,
        System.out.printf("The sum of all integer number(s) is : %5d\n", sum);
        
    }
}

class Q2{
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N number: ");
        int n = input.nextInt();
        System.out.print("The random numbers are: ");
        int aaa = 0;
        int aa = 0;
        int a = 0;
        for(int i = 0 ; i < n ; i ++){
            int randomNumber = rnd.nextInt(51) +50;
            System.out.print( randomNumber + " ");
            if(randomNumber % 10 >= 7){
                a ++;
            }else if (randomNumber % 10 >= 4){
                aa ++;
            }else{
                aaa ++;
            }
        }
        System.out.println("\nGroup AAA : " + aaa);
        System.out.println("Group AA : " + aa);
        System.out.println("Group A : " + a);
    }
}

class Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter font size: ");
        int fontSize = input.nextInt();
        System.out.print("Enter font type: ");
        char fontType = input.next().charAt(0);
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int format = input.nextInt();
        
        if(format == 1){
            for(int i = 0 ; i < 2 ; i ++){
                printFullHorizontal(fontSize, fontType , format);
                for(int j = 0 ; j < fontSize ; j ++){
                    printPartialHorizontal(fontSize, fontType , format);
                }
            }
            printFullHorizontal(fontSize, fontType , format);
        }
        
        if(format == 2 ){
            printFullHorizontal(fontSize, fontType , format);
            for(int i = 0 ; i < fontSize ; i ++){
                printPartialHorizontal(fontSize, fontType , format);
            }
            printFullHorizontal(fontSize, fontType , format);
        }
        
    }
    
    public static void printFullHorizontal (int fontSize , char fontType , int format){
        if(format == 1){
            for(int i = 0 ; i < fontSize+2 ; i ++){
                System.out.print(fontType);
            }
        }else if (format == 2){
            for(int i = 0 ; i < fontSize*2 +3 ; i ++){
                System.out.print(fontType);
            }
        }
        System.out.println("");
    }
    
    public static void printPartialHorizontal(int fontSize , char fontType, int format){
        System.out.print(fontType);
        for(int i = 0 ; i < fontSize ; i ++){
            System.out.print(" ");
        }
        System.out.print(fontType);
        if(format == 2){
            for(int i = 0 ; i < fontSize ; i ++){
                System.out.print(" ");
            }
            System.out.print(fontType);
        }
        System.out.println("");
    }
}

class Q4{
    public static void main(String[] args) {
        try{
            Scanner inputStream = new Scanner (new FileInputStream ("Q4.txt"));
            String name;
            double [] score = new double [5];
            double difficulty ;
            String winner="" ; 
            double highScore=0 ;
            //assume the textFile is in the format name,score,diffulty
            while(inputStream.hasNextLine()){
                String [] line = inputStream.nextLine().split(",");
                name = line[0];
                //5 judges
                for(int j = 0 ; j < 5 ; j ++){
                    score[j] = Double.parseDouble(line[j+1]);
                }
                Arrays.sort(score);
                difficulty = Double.parseDouble(line[line.length-1]);
                
                double finalScore = 0 ;
                for(int j = 1 ; j < score.length - 1; j ++){
                    finalScore += score[j]*difficulty;
                }
                
                if(finalScore > highScore){
                    highScore = finalScore;
                    winner = name;
                }
                
                System.out.println(name + " score "  + finalScore );
            }
            
            System.out.println(winner + " is the winner");
            inputStream.close();
        }catch (Exception e){
            System.out.println("ERROR");
        }
    }
}

abstract class Fruit{

    protected String name;
    protected String type;
    
    Fruit(String name, String type){
        this.name = name;
        this.type = type;
    }
    
    public abstract double totalPrice();
    
    public String toString(){
        return "Name: " + name +
                "\nType: " + type ;
    }
}

class Apple extends Fruit{
    private int quantity;

    public Apple(String name, String type, int quantity) {
        super(name, type);
        this.quantity = quantity;
    }
    
    @Override
    public double totalPrice() {
        if(type.equalsIgnoreCase("Green")){
            return quantity*1.2;
        }else if(type.equalsIgnoreCase("Red")){
            return quantity*1.8;
        }
        return 0;
    }
    
    public String toString(){
        return name + " - " + quantity + " = RM " + totalPrice();
    }
}

class Watermelon extends Fruit{
    private double weight;
    
    public Watermelon(String name, String type, double weight) {
        super(name, type);
        this.weight = weight;
    }
    public double totalPrice() {
        if(type.equalsIgnoreCase("local")){
            if(weight < 2){
                return 2.25*weight;
            }else if (weight >= 2 && weight <= 5){
                return 1.95*weight;
            }else{
                return 1.65*weight;
            }
        }
        
        if(type.equalsIgnoreCase("Imported")){
            if(weight < 2){
                return 3.75*weight;
            }else if (weight >= 2 && weight <= 5){
                return 3.45*weight;
            }else{
                return 3.15*weight;
            }
        }
        
        return 0 ;
    }
    
    public String toString(){
        return name + " - " + weight + "kg = RM " + totalPrice();
    }
}

class Q5{
    public static void main(String[] args) {
        Fruit red = new Apple("Red Apple" , "RED" , 8);
        Fruit green = new Apple("Green Apple" , "GREEN" , 11);
        Fruit local = new Watermelon("Local Watermelon" , "Local", 7.6);
        Fruit imported = new Watermelon("Imported Watermelon" , "imported", 4);
        System.out.println(red.toString());
        System.out.println(green.toString());
        System.out.println(local.toString());
        System.out.println(imported.toString());
        
        System.out.println("The cheapest item is");
        if(red.totalPrice() < green.totalPrice() && red.totalPrice() < local.totalPrice() &&
                red.totalPrice() < imported.totalPrice()){
            System.out.println(red.toString());
        }else if (green.totalPrice() < local.totalPrice() && green.totalPrice() < imported.totalPrice()){
            System.out.println(green.toString());
        }else if (local.totalPrice() < imported.totalPrice()){
            System.out.println(local.toString());
        }else{
            System.out.println(imported.toString());
        }
        
    }
}
