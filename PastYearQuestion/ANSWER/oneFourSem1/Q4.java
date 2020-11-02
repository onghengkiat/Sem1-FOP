class Q4 {
    public static void main(String[] args) {
        Apple a = new Apple("Apple", "Green", 20.3);
        Apple b = new Apple("Apple", "Red", 10.8);
        Durian c = new Durian("Durian", "D24", 3.2);
        Durian d = new Durian("Durian", "Musang King", 5.9);

        a.display();
        c.display();
        comparePrice(a, c);

        b.display();
        d.display();
        comparePrice(b, d);
    }

    public static void comparePrice(Apple a, Durian b) {
        if (a.totalPrice() > b.totalPrice()) {
            System.out.println(a.getType() + " " + a.getName() + " is more exepensive than " + b.getType() + " " + b.getName());
        } else if (a.totalPrice() < b.totalPrice()) {
            System.out.println(b.getType() + " " + b.getName() + " is more exepensive than " + a.getType() + " " + a.getName());
        } else {
            System.out.println(b.getType() + " " + b.getName() + " same price with " + a.getType() + " " + a.getName());
        }
    }
}
