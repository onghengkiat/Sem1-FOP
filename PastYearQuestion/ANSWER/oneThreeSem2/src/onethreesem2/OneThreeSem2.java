package onethreesem2;

import java.util.Scanner;

public class OneThreeSem2 {
    public static void main(String[] args) {
    }
}

class Car{
    private int year;
    private String model;
    private int speed;

    public Car(){
    
    }
    
    public Car(int year, String model, int speed) {
        this.year = year;
        this.model = model;
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }
    
    public int accelerate(){
        speed += 5;
        return speed;
    }
    
    public int brake(){
        speed -= 5;
        return speed;
    }
    
    public String toString(){
        return "Car Model : " + model +
                "\nCar Year : " + year + 
                "\nInitial Speed : " + speed;
    }
}

class TestCar{
    public static void main(String[] args) {
        Car a = new Car(2006, "Nissa"
                + "n Xtrail" , 80);
        System.out.println(a.toString());
        System.out.println("");
        
        for(int i = 0 ; i < 5 ; i++){
            a.accelerate();
            System.out.println("Car speed now : " + a.getSpeed());
        }
        for(int i = 0 ; i < 5 ; i++){
            a.brake();
            System.out.println("Car speed now : " + a.getSpeed());
        }
    }
}

class QuadraticEquation {

    private int a;
    private int b;
    private int c;

    QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int Discriminant() {
        return (int) Math.pow(b, 2) - 4 * a * c;
    }

    public int calcRoot1() {
        if (Discriminant() < 0) {
            return 0;
        }
        return (int) (b * -1 + Math.sqrt(Discriminant())) / (2 * a);
    }

    public int calcRoot2() {
        if (Discriminant() < 0) {
            return 0;
        }
        return (int) (b * -1 - Math.sqrt(Discriminant())) / (2 * a);
    }
}

class testQuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter values for a,b and c : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        QuadraticEquation equation1 = new QuadraticEquation(a, b, c);
        System.out.println("The equation is : " + a + "x(^2) + " + "(" + b + ")x + " + "(" + c + ")");
        System.out.println("Discriminant : " + equation1.Discriminant());
        if (equation1.Discriminant() == 0) {
            System.out.println("Same roots : " + equation1.calcRoot1());
        } else if (equation1.Discriminant() < 0) {
            System.out.println("The equation has no roots");
        } else {
            System.out.println("The roots : " + equation1.calcRoot1() + " and " + equation1.calcRoot2());
        }
    }
}

class Order {

    protected String customerName;
    protected String customerID;
    protected int quantityOrdered;
    protected double unitPrice;

    Order() {

    }

    public Order(String customerName, String customerID, int quantityOrdered, double unitPrice) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.quantityOrdered = quantityOrdered;
        this.unitPrice = unitPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double computeTotalPrice() {
        return quantityOrdered * unitPrice;
    }

    public String toString() {
        return "Order record"
                + "\nCustomer name is " + customerName
                + "\nCustomer ID is " + customerID
                + "\nQuantity ordered is " + quantityOrdered
                + "\nUnit price is " + unitPrice
                + "\nThe total price is " + computeTotalPrice();
    }
}

class ShippedOrder extends Order {

    public double computeTotalPrice() {
        return quantityOrdered * unitPrice + 4;
    }

    public ShippedOrder(String customerName, String customerID, int quantityOrdered, double unitPrice) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.quantityOrdered = quantityOrdered;
        this.unitPrice = unitPrice;
    }

    public String toString() {
        return "Shipped\nOrder record"
                + "\nCustomer Name : " + customerName
                + "\nCustomer ID : " + customerID
                + "\nQuantity ordered : " + quantityOrdered
                + "\nUnit price : " + unitPrice
                + "\nTotal price : " + computeTotalPrice();
    }
}

class testOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter customer name : ");
        String name = input.next();
        System.out.print("Enter customer id : ");
        String id = input.next();
        System.out.print("Enter quantity ordered : ");
        int quantity = input.nextInt();
        System.out.print("Enter price per unit : ");
        double price = input.nextDouble();

        System.out.println("");
        Order order1 = new Order(name, id, quantity, price);
        System.out.println(order1.toString());

        System.out.println("");
        Order order2 = new ShippedOrder(name, id, quantity, price);
        System.out.println(order2.toString());

    }
}
class Location{
    public int whichIndex; 
    public int minValue ;
    
    public Location(){
        whichIndex = 0;
        minValue = 0;
    }

    public Location(int[] integer) {
        this.whichIndex = locateMin(integer).whichIndex;
        this.minValue = locateMin(integer).minValue;
    }
    
    public static Location locateMin(int [] num){
        Location a = new Location();
        a.minValue = num[0];
        a.whichIndex = 0;
        for(int i = 1 ; i < num.length ; i ++){
            if(num[i] < a.minValue){
                a.minValue = num[i];
                a.whichIndex = i;
            }
        }
        return a;
    }
    
}

class TestLocation{
    public static void main(String[] args) {
        int [] b = {95,100,64,66};
        Location a = new Location(b);
        
        System.out.println("The location of the smallest element element is at index " + a.whichIndex + " and the element is " + a.minValue + ".");
    }
}
