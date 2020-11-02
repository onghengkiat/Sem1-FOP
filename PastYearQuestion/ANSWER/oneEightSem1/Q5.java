package oneEightSem1;

class Q5 {
    public static void main(String[] args) {
        Fruit red = new Apple("Red Apple", "RED", 8);
        Fruit green = new Apple("Green Apple", "GREEN", 11);
        Fruit local = new Watermelon("Local Watermelon", "Local", 7.6);
        Fruit imported = new Watermelon("Imported Watermelon", "imported", 4);
        System.out.println(red.toString());
        System.out.println(green.toString());
        System.out.println(local.toString());
        System.out.println(imported.toString());

        System.out.println("The cheapest item is");
        if (red.totalPrice() < green.totalPrice() && red.totalPrice() < local.totalPrice() &&
                red.totalPrice() < imported.totalPrice()) {
            System.out.println(red.toString());
        } else if (green.totalPrice() < local.totalPrice() && green.totalPrice() < imported.totalPrice()) {
            System.out.println(green.toString());
        } else if (local.totalPrice() < imported.totalPrice()) {
            System.out.println(local.toString());
        } else {
            System.out.println(imported.toString());
        }

    }
}
