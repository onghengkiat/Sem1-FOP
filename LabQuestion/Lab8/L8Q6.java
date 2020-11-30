public class L8Q6 {
    public static void main(String[] args) {
        burgerStall stall1 = new burgerStall("123");
        burgerStall stall2 = new burgerStall("321");
        stall1.sold(100);
        stall2.sold(200);
        stall1.sold(300);
        stall1.display();
        stall2.display();
        burgerStall.displaySum();
    }
}

class burgerStall {

    private String ID;
    private int numOfBurger = 0;
    private static int sumOfBurger = 0;

    public burgerStall(String a) {
        ID = a;
    }

    public void sold(int a) {
        numOfBurger += a;
        sumOfBurger += a;
    }

    public void display() {
        System.out.println("The number of burger sold by stall " +  this.ID + " is " + this.numOfBurger);
    }

    public static void displaySum() {
        System.out.println("The total number of burgers sold by all stall(s) is " + sumOfBurger);
    }
}

