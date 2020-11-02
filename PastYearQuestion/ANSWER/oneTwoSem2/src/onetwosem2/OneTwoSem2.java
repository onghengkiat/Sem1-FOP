package onetwosem2;

import java.util.Scanner;

public class OneTwoSem2 {

    public static void main(String[] args) {
    }
}

//Question 1 idk 
class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double computeBMI() {
        return weight / Math.pow(height, 2);
    }

    public String determineBMIStatus() {
        double BMI = computeBMI();
        if (age >= 16) {
            if (BMI < 16) {
                return "seriously underweight";
            } else if (BMI < 18) {
                return "underweight";
            } else if (BMI < 24) {
                return "normal weight";
            } else if (BMI < 29) {
                return "overweight";
            } else if (BMI < 35) {
                return "seriously overweight";
            } else {
                return "gravely overweight";
            }
        }else{
            return "I dont know, question didnt mention";
        }
    }

}

class TestBMI {

    public static void main(String[] args) {
        BMI a = new BMI("Mr. Bean", 18, 80, 1.6);
        System.out.println("The BMI for Mr.Bean is " + a.computeBMI() + " " + a.determineBMIStatus());
    }
}

class LinearEquation{
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }
    
    public String toString(){
        return a + "x + " + b + "y = " + e +
                "\n" + c + "x + " + d + "y = " + f;
    }
    
    public boolean isSolvable(){
        return a*d-b*c != 0;
    }
    
    public int computeX(){
        return (e*d - b*f) /(a*d - b*c);
    }
    
    public int computeY(){
        return (a*f - e*c)/(a*d - b*c);
    }
    
}

class Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values for a,b,c,d,e and f : ");
        LinearEquation eq1 = new LinearEquation(input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
        
        System.out.println("The equation :");
        System.out.println(eq1.toString());
        
        if(eq1.isSolvable()){
            System.out.println("\nx = " + eq1.computeX() + " ; y = " + eq1.computeY());
        }else{
            System.out.println("The equation has no solution.");
        }
    }
    // uml diagram not in syllabus, maybe
}

class Circle{
    protected double radius;

    public Circle(){
        radius = 0.0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
    
    public double perimeter(){
        return Math.PI*2*radius;
    }
    
    public String toString(){
        return "Radius : " + radius + 
                "\nArea : " + area() + 
                "\nPerimeter : " + perimeter();
    }
}

class Cylinder extends Circle{
    private double height;
    
    public Cylinder(){
        super();
        height = 0 ;
    }
    
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double area() {
        return super.area()*2 + super.perimeter()*height; 
    }

    public double volume(){
        return super.area()*height;
    }
    
    public String toString() {
        return "Radius : " + radius + 
                "\nHeight : " + height +
                "\nArea : " + area() + 
                "\nVolume : " + volume();
    }
    //no uml diagram in exam,maybe
}

class Q4{
    public static void main(String[] args) {
        Circle a = new Circle(15);
        System.out.println(a.toString());
        
        System.out.println("");
        
        Cylinder b = new Cylinder(20,30);
        System.out.println(b.toString());
    }
}

class Location{
    public int row; 
    public int maxValue ;
    
    public Location(){
        row = 0;
        maxValue = 0;
    }

    public Location(int[] integer) {
        this.row = locateMax(integer).row;
        this.maxValue = locateMax(integer).maxValue;
    }
    
    public static Location locateMax(int [] num){
        Location a = new Location();
        a.maxValue = num[0];
        a.row = 0;
        for(int i = 1 ; i < num.length ; i ++){
            if(num[i] > a.maxValue){
                a.maxValue = num[i];
                a.row = i;
            }
        }
        return a;
    }
    
}

class Q5{
    public static void main(String[] args) {
        int [] b = {4,99,2};
        Location a = new Location(b);
        
        System.out.println("The location of the biggest element element is at index [" + a.row + "] and the element is " + a.maxValue + ".");
    }
}
