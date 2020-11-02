package onefoursem2;

import java.util.Scanner;

public class OneFourSem2 {
    public static void main(String[] args) {
    }
}

class Pizza {

    private String size;
    private int numOfCheeseTopping;
    private int numOfBeefTopping;
    private int numOfChickenTopping;

    public Pizza() {
    }

    public Pizza(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping) {
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }

    public double computeCost() {
        double cost = 2 * (numOfCheeseTopping + numOfBeefTopping + numOfChickenTopping);;

        if (size.equalsIgnoreCase("Small")) {
            cost += 10;
        } else if (size.equalsIgnoreCase("Medium")) {
            cost += 12;
        } else if (size.equalsIgnoreCase("Large")) {
            cost += 14;
        }

        return cost;
    }

    public String toString() {
        return "Pizza size      :  " + size
        + "\ncheese topping  :  " + numOfCheeseTopping
        + "\nbeef topping    :  " + numOfBeefTopping
        + "\nchicken topping :  " + numOfChickenTopping
        + "\n\nPizza cost      :  $" + computeCost();
    }
}

class TestPizza {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large", 1, 1, 1);
        System.out.println(pizza1.toString());
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

class Q2{
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
            System.out.println("\nThe equation has no solution");
        }
    }
}

class Ship{
    protected String shipName, yearBuilt;
    
    public Ship(){
    
    }

    public Ship(String shipName, String yearBuilt) {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    
    public String toString(){
        return "Ship Name : " + shipName +
                "\nYear Built : " + yearBuilt ; 
    }
}

class CruiseShip extends Ship {
    private int numPassenger;

    public CruiseShip() {
    }

    public CruiseShip(int numPassenger, String shipName, String yearBuilt) {
        super(shipName, yearBuilt);
        this.numPassenger = numPassenger;
    }

    public int getNumPassenger() {
        return numPassenger;
    }

    public void setNumPassenger(int numPassenger) {
        this.numPassenger = numPassenger;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    
    public String toString(){
        return "Ship Name : " + shipName +
                "\nMaximum Number of Passengers : " + numPassenger ; 
    }
}

class CargoShip extends Ship{
    private int cargoCapacity;

    public CargoShip() {
    }

    public CargoShip(int cargoCapacity, String shipName, String yearBuilt) {
        super(shipName, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    
    public String toString(){
        return "Ship Name : " + shipName +
                "\nCargo Capacity : " + cargoCapacity ; 
    }
    //question d draw UML diagram lazy to do liao too many things
}

class Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, year ;
        int numPassenger , cargoCapacity ;
        
        System.out.println("First ship information : ");
        System.out.print("Enter the name : ");
        name = input.nextLine();
        System.out.print("Enter the year : ");
        year = input.nextLine();
        Ship ship1 = new Ship(name, year);
        
        System.out.println("\nSecond ship information : ");
        System.out.print("Enter the name : ");
        name = input.nextLine();
        System.out.print("Enter the year : ");
        year = input.nextLine();
        System.out.print("Enter the maximum number of passengers : ");
        numPassenger = input.nextInt();
        CruiseShip ship2 = new CruiseShip(numPassenger,name,year);
        
        System.out.println("\nThird ship information : ");
        System.out.print("Enter the name : ");
        input.nextLine();
        name = input.nextLine();
        System.out.print("Enter the year : ");
        year = input.nextLine();
        System.out.print("Enter the cargo capacity : ");
        cargoCapacity = input.nextInt();
        CargoShip ship3 = new CargoShip(cargoCapacity,name,year);
        
        
        System.out.println("\nThe information of first ship");
        System.out.println(ship1.toString());
        
        System.out.println("\nThe information of second ship");
        System.out.println(ship2.toString());
        
        System.out.println("\nThe information of third ship");
        System.out.println(ship3.toString());
    }
}

class Position{
    public int whichIndex; 
    public int maxValue ;
    
    public Position(){
        whichIndex = 0;
        maxValue = 0;
    }

    public Position(int[] integer) {
        this.whichIndex = PositionFindMax(integer).whichIndex;
        this.maxValue = PositionFindMax(integer).maxValue;
    }
    
    public static Position PositionFindMax(int [] num){
        Position a = new Position();
        a.maxValue = num[0];
        a.whichIndex = 0;
        for(int i = 1 ; i < num.length ; i ++){
            if(num[i] > a.maxValue){
                a.maxValue = num[i];
                a.whichIndex = i;
            }
        }
        return a;
    }
    
}

class testPosition{
    public static void main(String[] args) {
        int [] b = {95,100,74,66};
        Position a = new Position(b);
        
        System.out.println("The biggest element in the array is " + a.maxValue + " and its position is at index " + a.whichIndex + ".");
    }
}