//Question 1 idk
class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double computeBMI() {
        return weight / Math.pow(height, 2);
    }

    public String determineBMIStatus() {
        double BMI = computeBMI();
        if (age >= 16) {
            if (BMI < 16) {
                return "seriously underweight";
            } else if (BMI < 18) {
                return "underweight";
            } else if (BMI < 24) {
                return "normal weight";
            } else if (BMI < 29) {
                return "overweight";
            } else if (BMI < 35) {
                return "seriously overweight";
            } else {
                return "gravely overweight";
            }
        }else{
            return "I dont know, question didnt mention";
        }
    }

}
