class TestBMI {

    public static void main(String[] args) {
        BMI a = new BMI("Mr. Bean", 18, 80, 1.6);
        System.out.println("The BMI for Mr.Bean is " + a.computeBMI() + " " + a.determineBMIStatus());
    }
}
