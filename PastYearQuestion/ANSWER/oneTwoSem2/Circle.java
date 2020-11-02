class Circle{
    protected double radius;

    public Circle(){
        radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI*Math.pow(radius,2);
    }

    public double perimeter(){
        return Math.PI*2*radius;
    }

    public String toString(){
        return "Radius : " + radius +
                "\nArea : " + area() +
                "\nPerimeter : " + perimeter();
    }
}
