public class L8Q3 {
    public static void main(String[] args) {
        WeightCalculator person1 = new WeightCalculator();
        person1.input(17,150);
        person1.calculateRecommendWeight();
        person1.display();
    }
}


class WeightCalculator {

    private int age, height;
    private double recommendWeight;

    public WeightCalculator() {
        age = 0;
        height = 0;
        recommendWeight = 0;
    }

    public void input(int age, int height){
        this.age = age;
        this.height = height;

    }

    public void calculateRecommendWeight(){
        this.recommendWeight = (height - 100 + age / 10) * 0.9;;
    }

    public void display() {
        System.out.println("Age is " + age);
        System.out.println("Height is " + height);
        System.out.println("RecommendWeight is " + this.recommendWeight);
    }
}

