package onefoursem1;
//1st error import
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Random;
import java.util.Scanner;
public class OneFourSem1 {
    public static void main(String[] args) {
        //2nd error no System.in
        Random r = new Random();
        int count = 0 ;
        int num;
        //3rd error nextInt(20)
        num = r.nextInt(20) + 1;
        
        while(true){
            //4th error num%2
            //5th error ==
            //6th error {}
            if(num%2 == 0){
                System.out.println("Even Number: Exit While Loop");
                break;
            }
            else{
                //7th error count++
                count ++;
                System.out.print(num + " ");
            }
        }
        //8th error + should be , 
        System.out.printf("\nThe total number of random odd number from 1 - 20 is : %f" , count);
    }
}

class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of employee : ");
        int n = input.nextInt();
        String [] name = new String [n] ;
        double [] salary = new double [n];
        
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter name : ");
            input.nextLine();
            name[i] = input.nextLine();
            System.out.print("Enter salary : ");
            salary[i] = input.nextDouble();
        }
        
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0; j < n - 1 ; j++){
                if(salary[j+1] < salary[j]){
                    double temp = salary[j+1];
                    salary[j+1] = salary[j];
                    salary[j] = temp;
                    
                    String temp1 = name[j+1];
                    name[j+1] = name[j];
                    name[j] = temp1;
                }
            }
        }
        
        System.out.println("Name of employees in increasing order of their salaries:  : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(name[i]);
            if(i != n - 1){
                System.out.print("  ");
            }
        }
    }
}

class Q3{
    public static void main(String[] args) {
        try{
            ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream("player1.dat"));
            ObjectInputStream inputStream2 = new ObjectInputStream(new FileInputStream("player2.dat"));
            int player1 = 0, player2 = 0 ;
            
            try{
                while(true){
                    //assume the score is stored in double type
                    player1 += inputStream1.readDouble();
                }
            }catch (EOFException f){
                System.out.println("ERROR");
            }
            
            try{
                while(true){
                    //assume the score is stored in double type
                    player2 += inputStream2.readDouble();
                }
            }catch (EOFException f){
                System.out.println("ERROR");
            }
            
            System.out.println("Player 1 Score : " + player1);
            System.out.println("Player 2 Score : " + player2);
            
            if(player1 > player2){
                System.out.println("Player 1 wins");
            }else if (player1 < player2){
                System.out.println("Player 2 wins");
            }else{
                System.out.println("Draw");
            }
            
            inputStream1.close();
            inputStream2.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
}

class Fruit{

    protected String name;
    protected String type;
    
    Fruit(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    
    public void display(){
        System.out.println(type + " " + name);
    }
}

class Apple extends Fruit{
    private double weight;

    public Apple(String name, String type, double weight) {
        super(name, type);
        this.weight = weight;
    }
    
    public double totalPrice() {
        if(type.equalsIgnoreCase("Green")){
            return weight*7.2;
        }else if(type.equalsIgnoreCase("Red")){
            return weight*8.3;
        }
        return 0;
    }
    
    public void display(){
        super.display();
        System.out.println(weight + " KG - RM  " + totalPrice());
    }
}

class Durian extends Fruit{
    private double weight;
    
    public Durian(String name, String type, double weight) {
        super(name, type);
        this.weight = weight;
    }
    
    public double totalPrice() {
        if(type.equalsIgnoreCase("Musang King")){
            return 28*weight;
        }else if (type.equalsIgnoreCase("Udang Merah")){
            return 25*weight;
        }else if(type.equalsIgnoreCase("D24")){
            return 22*weight;
        }else if(type.equalsIgnoreCase("Mas Pahang")){
            return 18*weight;
        }else{
            return 0;
        }
    }
    
    public void display(){
        super.display();
        System.out.println(weight + " KG - RM " + totalPrice());
    }
}

class Q4{
    public static void main(String[] args) {
        Apple a = new Apple("Apple", "Green" , 20.3);
        Apple b = new Apple("Apple", "Red" , 10.8);
        Durian c = new Durian("Durian", "D24" , 3.2);
        Durian d = new Durian("Durian", "Musang King" , 5.9);
        
        a.display();
        c.display();
        comparePrice(a,c);
        
        b.display();
        d.display();
        comparePrice(b,d);
    }
    
    public static void comparePrice(Apple a, Durian b){
        if(a.totalPrice() > b.totalPrice()){
            System.out.println(a.getType() + " " + a.getName() + " is more exepensive than " + b.getType() + " " + b.getName());
        }else if(a.totalPrice() < b.totalPrice()){
            System.out.println(b.getType() + " " + b.getName() + " is more exepensive than " + a.getType() + " " + a.getName());
        }else{
            System.out.println(b.getType() + " " + b.getName() + " same price with " + a.getType() + " " + a.getName());
        }
    }
}
