class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return super.area() * 2 + super.perimeter() * height;
    }

    public double volume() {
        return super.area() * height;
    }

    public String toString() {
        return "Radius : " + radius +
                "\nHeight : " + height +
                "\nArea : " + area() +
                "\nVolume : " + volume();
    }
    //no uml diagram in exam,maybe
}
