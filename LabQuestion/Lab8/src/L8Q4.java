public class L8Q4 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        fraction1.input(3,6);
        System.out.println("Numerator is: " + fraction1.getNumerator());
        System.out.println("Denominator is: " + fraction1.getDenominator());
        fraction1.displayFraction();
    }
}

class Fraction {

    private int numerator, denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public void input(int numerator, int denominator){
        this.numerator= numerator;
        this.denominator = denominator;
    }

    //mutator
    public void setNumerator(int a) {
        numerator = a;
    }

    public void setDenominator(int a) {
        denominator = a;
    }

    //accessor
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void displayFraction() {
        int gcd = 1, max;
        if (denominator >= numerator) {
            max = denominator;
        } else {
            max = numerator;
        }
        for (int i = max; i >= 1; i--) {
            if (denominator % i == 0 && numerator % i == 0) {
                gcd = i;
                break;
            }
        }

        // gcd = 3
        // 9/6 = 3/2
        denominator /= gcd;
        numerator /= gcd;

        if (denominator == 1){
            System.out.println("The simplest fraction is " + numerator);
        }else{
            System.out.println("The simplest fraction is " + numerator + " / " + denominator);
        }

    }
}
