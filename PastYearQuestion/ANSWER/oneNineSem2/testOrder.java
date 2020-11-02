package oneNineSem2;

import java.util.Scanner;

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
