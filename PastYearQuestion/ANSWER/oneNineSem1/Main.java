class Main {

    public static void main(String[] args) {
        Delivery delivery1 = new SpecialDelivery("Ali", "Ahmad", 4.4, false, false);
        Delivery delivery2 = new SpecialDelivery("Ah Chong", "Fatimah", 63.1, false, false);
        Delivery delivery3 = new SpecialDelivery("FSKTM, UM", "FJ, UM", 32.5, true, false);
        Delivery delivery4 = new SpecialDelivery("Ang", "Liew", 19.0, true, true);

        System.out.println(delivery1.toString());
        System.out.println("");

        System.out.println(delivery2.toString());
        System.out.println("");

        System.out.println(delivery3.toString());
        System.out.println("");

        System.out.println(delivery4.toString());
        System.out.println("");

        System.out.println("The total shipping cost is RM " + SpecialDelivery.getTotalCost());
    }
}
