import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, year;
        int numPassenger, cargoCapacity;

        System.out.println("First ship information : ");
        System.out.print("Enter the name : ");
        name = input.nextLine();
        System.out.print("Enter the year : ");
        year = input.nextLine();
        onefoursem2.Ship ship1 = new onefoursem2.Ship(name, year);

        System.out.println("\nSecond ship information : ");
        System.out.print("Enter the name : ");
        name = input.nextLine();
        System.out.print("Enter the year : ");
        year = input.nextLine();
        System.out.print("Enter the maximum number of passengers : ");
        numPassenger = input.nextInt();
        CruiseShip ship2 = new CruiseShip(numPassenger, name, year);

        System.out.println("\nThird ship information : ");
        System.out.print("Enter the name : ");
        input.nextLine();
        name = input.nextLine();
        System.out.print("Enter the year : ");
        year = input.nextLine();
        System.out.print("Enter the cargo capacity : ");
        cargoCapacity = input.nextInt();
        CargoShip ship3 = new CargoShip(cargoCapacity, name, year);


        System.out.println("\nThe information of first ship");
        System.out.println(ship1.toString());

        System.out.println("\nThe information of second ship");
        System.out.println(ship2.toString());

        System.out.println("\nThe information of third ship");
        System.out.println(ship3.toString());
    }
}
