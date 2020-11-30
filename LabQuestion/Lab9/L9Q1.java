public class L9Q1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle 1",8,10);
        rectangle.computeArea();
        rectangle.computerPerimeter();
        rectangle.display();

        System.out.println("\n");

        Square square = new Square("Square 1",10);
        square.computeArea();
        square.computerPerimeter();
        square.display();

        System.out.println("\n");

        Circle circle = new Circle("Circle 1",10);
        circle.computeArea();
        circle.computerPerimeter();
        circle.display();
    }
}

class Shape {

    protected String name;
    protected double perimeter, area;

    public Shape() {
        this.name = "";
    }

    public Shape(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    void setPerimeter(int a) {
        this.perimeter = a;
    }

    void setArea(int a) {
        this.area = a;
    }

    void display() {
        System.out.printf("%s has perimer of %.2f and area of %.2f", this.name, this.perimeter, this.area);
    }
}

class Rectangle extends Shape {

    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public void acceptSideLength(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void computerPerimeter() {
        this.perimeter = 2 * (length + width);
    }

    public void computeArea() {
        this.area = length * width;
    }
}

class Square extends Shape {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public Square(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    public void acceptSideLength(double sideLength){
        this.sideLength = sideLength;
    }

    public void computerPerimeter() {
        this.perimeter = 4 * sideLength;
    }

    public void computeArea() {
        this.area = Math.pow(this.sideLength,2);
    }
}

class Circle extends Shape {

    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public Circle(String name, double diameter) {
        super(name);
        this.diameter = diameter;
    }

    public void acceptDiameter(double diameter){
        this.diameter = diameter;
    }
    public void computerPerimeter() {
        this.perimeter = 3.142 * diameter;
    }

    public void computeArea() {
        this.area = 3.142 * Math.pow((this.diameter / 2), 2);
    }
}

