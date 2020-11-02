class TestCar {
    public static void main(String[] args) {
        Car a = new Car(2006, "Nissa"
                + "n Xtrail", 80);
        System.out.println(a.toString());
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            a.accelerate();
            System.out.println("Car speed now : " + a.getSpeed());
        }
        for (int i = 0; i < 5; i++) {
            a.brake();
            System.out.println("Car speed now : " + a.getSpeed());
        }
    }
}
