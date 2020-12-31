import jdk.swing.interop.SwingInterOpUtils;

public class L9Q1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle 1",8,10);
        rectangle.computeArea();
        rectangle.computePerimeter();
        rectangle.display();

        System.out.println("\n");

        rectangle.input(12,14);
        rectangle.computeArea();
        rectangle.computePerimeter();
        rectangle.display();
        System.out.println("\n");

        Square square = new Square("Square 1",10);
        square.computeArea();
        square.computePerimeter();
        square.display();

        System.out.println("\n");

        Circle circle = new Circle("Circle 1",10);
        circle.computeArea();
        circle.computePerimeter();
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

    public void setPerimeter(double a) {
        this.perimeter = a;
    }

    public void setArea(double a) {
        this.area = a;
    }

    public void display() {
        System.out.printf("%s has perimeter of %.2f and area of %.2f", this.name, this.perimeter, this.area);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", perimeter=" + this.getPerimeter() +
                ", area=" + this.getArea() +
                '}';
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

    public void input(int length ,int width){
        this.length = length;
        this.width = width;

    }
    public void computePerimeter() {
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

    public void input(int sideLength){
        this.sideLength = sideLength;
    }

    public void computePerimeter() {
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
    public void input(int diameter){
        this.diameter = diameter;
    }

    public void computePerimeter() {
        this.setPerimeter(Math.PI * this.diameter);
    }

    public void computeArea() {
        this.setArea(Math.PI * Math.pow((this.diameter / 2), 2));
    }
}
