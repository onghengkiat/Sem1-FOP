public class L8Q4 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        fraction1.setNumerator(6);
        fraction1.setDenominator(3);
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

    public void setNumerator(int a) {
        numerator = a;
    }

    public void setDenominator(int a) {
        denominator = a;
    }

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
        for (int i = max; i >= 2; i--) {
            if (denominator % i == 0 && numerator % i == 0) {
                gcd = i;
                break;
            }
        }

        denominator /= gcd;
        numerator /= gcd;

        System.out.println("The simplest fraction is " + numerator + " / " + denominator);
    }
}
