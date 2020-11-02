package onefivesem1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class OneFiveSem1 {
    public static void main(String[] args) {
        //1st error Scanner
        Scanner in = new Scanner(System.in);
        //2nd error String
        String reverse="" ;
        System.out.print("Enter a word: ");
        //3rd error in.next()
        String word = in.next();
        
        //4th error word.length();
        //5th error i --
        for(int i = word.length() - 1 ; i >= 0 ; i--){
            //6th error word.charAt(i)
            reverse = reverse + word.charAt(i);
        }
        
        //7th error word.equals(reverse)
        if(word.equals(reverse))
            System.out.println("The word is a palindrome");
        //8th error no if
        else 
            System.out.println("The word is not a palindrome");
    }
}

class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of tender : ");
        int n = input.nextInt();
        String [] name = new String [n] ;
        double [] price = new double [n];
        
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter name : ");
            input.nextLine();
            name[i] = input.nextLine();
            System.out.print("Enter reservation price : ");
            price[i] = input.nextDouble();
        }
        
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0; j < n - 1 ; j++){
                if(price[j+1] > price[j]){
                    double temp = price[j+1];
                    price[j+1] = price[j];
                    price[j] = temp;
                    
                    String temp1 = name[j+1];
                    name[j+1] = name[j];
                    name[j] = temp1;
                }
            }
        }
        
        System.out.println("List of tender : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(name[i]);
            if(i != n - 1){
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.printf("The winner of BMW88 : %s {%.2f)" ,name[0], price[0]);
    }
}

class Q3{
    public static void main(String[] args) {
        try{
            Scanner inputStream = new Scanner(new FileInputStream("Q3.txt"));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream ("summary.txt"));
            int d = 0;
            int e = 0;
            int f = 0;
            
            //assume the text format is type,number
            while(inputStream.hasNextLine()){
                String[] line = inputStream.nextLine().split(",");
                if(line[0].equalsIgnoreCase("Product D")){
                    d = Integer.parseInt(line[1]);
                }
                if(line[0].equalsIgnoreCase("Product E")){
                    e = Integer.parseInt(line[1]);
                }
                if(line[0].equalsIgnoreCase("Product F")){
                    f = Integer.parseInt(line[1]);
                }
            }
            outputStream.println("Total number of orders [Product D] : " + d);
            outputStream.println("Total number of orders [Product E] : " + e);
            outputStream.println("Total number of orders [Product F] : " + f);
            
            if(d > e && d > f){
                outputStream.println("Product D has the highest number of order.");
            }if(e > f){
                outputStream.println("Product E has the highest number of order.");
            }else {
                outputStream.println("Product F has the highest number of order.");
            }
            inputStream.close();
            outputStream.close();
        }catch (Exception e){
            System.out.println("ERROR");
        }
    }
}

class Hero{
    protected String name;
    protected String type;
    protected int health;

    public Hero(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void display(){
        System.out.println(name + " (" + type + ") - HP: " + health);
    }
}

class Strength extends Hero{
    
    public Strength(String name, String type , int health) {
        super(name, type);
        this.health = health;
    }
    
    public void damage (Hero a, Hero b){
        Random rnd = new Random();
        int damage = rnd.nextInt(8) + 3;
        b.setHealth(b.getHealth() - damage);
        
        System.out.print(a.getName() + " damage " + damage + " *** " );
        b.display();
        System.out.println("");
    }
}

class Ability extends Hero{
    
    public Ability(String name, String type, int health) {
        super(name, type);
        this.health = health;
    }
    
    public void damage (Hero a, Hero b){
        Random rnd = new Random();
        int damage = (rnd.nextInt(5)+1)*rnd.nextInt(4);
        b.setHealth(b.getHealth() - damage);
        
        System.out.print(a.getName() + " damage " + damage + " *** " );
        b.display();
        System.out.println("");
    }
}

class Main{
    public static void main(String[] args) {
        Strength a = new Strength("Chaos Knight", "Strength", 30);
        Ability b = new Ability("Bloodseeker", "Agility", 25);
        a.display();
        b.display();
        System.out.println();
        playGame(a,b);
    }
    
    public static void playGame(Strength a, Ability b){
        
        while(a.getHealth() > 0 && b.getHealth() > 0){
            b.damage(b,a);
            if(a.getHealth() <= 0){
                System.out.println(b.getName() + " wins the game!");
                break;
            }
            
            a.damage(a, b);
            if(b.getHealth() <= 0){
                System.out.println(a.getName() + " wins the game!");
                break;
            }
        }
    }
    
    public static void playGame(Strength a, Strength b){
        
        while(a.getHealth() > 0 && b.getHealth() > 0){
            b.damage(b,a);
            if(a.getHealth() <= 0){
                System.out.println(b.getName() + " wins the game!");
                break;
            }
            
            a.damage(a, b);
            if(b.getHealth() <= 0){
                System.out.println(a.getName() + " wins the game!");
                break;
            }
        }
    }
    
    public static void playGame(Ability a, Strength b){
        
        while(a.getHealth() > 0 && b.getHealth() > 0){
            b.damage(b,a);
            if(a.getHealth() <= 0){
                System.out.println(b.getName() + " wins the game!");
                break;
            }
            
            a.damage(a, b);
            if(b.getHealth() <= 0){
                System.out.println(a.getName() + " wins the game!");
                break;
            }
        }
    }
    
    public static void playGame(Ability a, Ability b){
        
        while(a.getHealth() > 0 && b.getHealth() > 0){
            b.damage(b,a);
            if(a.getHealth() <= 0){
                System.out.println(b.getName() + " wins the game!");
                break;
            }
            
            a.damage(a, b);
            if(b.getHealth() <= 0){
                System.out.println(a.getName() + " wins the game!");
                break;
            }
        }
    }
}