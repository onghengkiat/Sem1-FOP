package oneNineSem2;

import java.util.Random;
import java.util.Scanner;

//1st error delete util Scanner 
public class oneNineSem2 {

    public static void main(String[] args) {
        //2nd error "" delte
        int[] num = {66, 15, 20, 27, 74, 33};
        int cnt = 0;

        //3rd error num.length() no need ()
        for (int k = 0; k < num.length; k++) {
             //4th error num become num[k]
            if (isEven(num[k])) {
                cnt++;
            }
        }

        //5th error . behind cnt
        System.out.println("The number of even integers is " + cnt + ".");
        //6th error findMax(num)
        System.out.println("The biggest integer is " + findMax(num));

    }

    //7th error static method
    public static boolean isEven(int a) {
        //8th error redundancy ? wonder consider or not
        return a % 2 == 0;
    }

    //9th error void become int
    public static int findMax(int[] a) {
        int max = a[0];

        //10th error , n = 1
        for (int n = 1; n < a.length; n++) {
            if (a[n] > max) {
                max = a[n];
            }
        }
        return max;

    }
}

class Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int numberOfBags = input.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        int unitWeight = input.nextInt();
        double totalPrice = unitWeight * numberOfBags * 5.99;
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725;
        System.out.println("Price per kilogram:   $5.99");
        System.out.println("Sales tax :            7.25%");
        System.out.printf("Total price :         $ %.2f", totalPriceWithTax);
    }
}

class Q3 {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        char retry = 'y';
        boolean first = true;
        while (retry == 'y') {
            if (first == false) {
                System.out.println("");
            }
            first = false;
            int number1 = rnd.nextInt(10);
            int number2 = rnd.nextInt(10);
            System.out.print("What is " + number1 + " + " + number2 + " ?");
            int answer = input.nextInt();
            boolean correct = true;

            System.out.println(number1 + " + " + number2 + " = " + answer + " is " + correct);
            System.out.print("Do you want to try another question (y/n) ? : ");

            if (answer == number1 + number2) {
                correct = true;
            } else {
                correct = false;
            }
            retry = input.next().charAt(0);

        }
        System.out.println("Program ends");
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

    public void display() {
        System.out.println("The size of the pizza is " + size);
        System.out.println("The number of cheese topping is " + numOfCheeseTopping);
        System.out.println("The number of beef topping is " + numOfBeefTopping);
        System.out.println("The number of chicken topping is " + numOfChickenTopping);
        System.out.println("The cost is " + computeCost());
    }
}

class Q4Main {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large", 1, 1, 1);
        pizza1.display();
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
