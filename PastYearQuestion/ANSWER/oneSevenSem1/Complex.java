class Complex {
    private double real, imaginary;

    public Complex() {

    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public static void addComplexNum(Complex num1, Complex num2) {
        double newReal = num1.getReal() + num2.getReal();
        double newImaginary = num1.getImaginary() + num2.getImaginary();
        System.out.println("Addition of the two complex numbers: (" + newReal + " + " + newImaginary + "i)");
    }

    public static void substractComplexNum(Complex num1, Complex num2) {
        double newReal = num1.getReal() - num2.getReal();
        double newImaginary = num1.getImaginary() - num2.getImaginary();
        System.out.println("Substraction of the two complex numbers: (" + newReal + " + " + newImaginary + "i)");
    }

    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}
