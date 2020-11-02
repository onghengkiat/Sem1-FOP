class Car {
    private int year;
    private String model;
    private int speed;

    public Car() {

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

    public int accelerate() {
        speed += 5;
        return speed;
    }

    public int brake() {
        speed -= 5;
        return speed;
    }

    public String toString() {
        return "Car Model : " + model +
                "\nCar Year : " + year +
                "\nInitial Speed : " + speed;
    }
}
