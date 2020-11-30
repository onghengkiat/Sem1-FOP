public class L8Q3 {
    public static void main(String[] args) {
        WeightCalculator person1 = new WeightCalculator(19, 170);
        person1.display();
    }
}


class WeightCalculator {

    private int age, height;
    private double recommendWeight;

    public WeightCalculator(int a, int b) {
        age = a;
        height = b;
        this.recommendWeight = (height - 100 + age / 10) * 0.9;;
    }


    public void display() {
        System.out.println("Age is " + age);
        System.out.println("Height is " + height);
        System.out.println("RecommendWeight is " + this.recommendWeight);
    }
}

