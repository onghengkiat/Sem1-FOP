class QuadraticEquation {

    private int a;
    private int b;
    private int c;

    QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int Discriminant() {
        return (int) Math.pow(b, 2) - 4 * a * c;
    }

    public int calcRoot1() {
        if (Discriminant() < 0) {
            return 0;
        }
        return (int) (b * -1 + Math.sqrt(Discriminant())) / (2 * a);
    }

    public int calcRoot2() {
        if (Discriminant() < 0) {
            return 0;
        }
        return (int) (b * -1 - Math.sqrt(Discriminant())) / (2 * a);
    }
}
