class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public String toString() {
        return a + "x + " + b + "y = " + e +
                "\n" + c + "x + " + d + "y = " + f;
    }

    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    public int computeX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public int computeY() {
        return (a * f - e * c) / (a * d - b * c);
    }

}
