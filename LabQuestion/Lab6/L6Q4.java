public class L6Q4 {
    public static void main(String[] args) {
        System.out.println("gcd for 24 and 8 is " + gcd(24,8));
        System.out.println("gcd for 200 and 625 is " + gcd(200,625));
        System.out.println("gcd for 3 and 7 is " + gcd(7,3));

    }

    public static int gcd(int a, int b){
        int dividend = a;
        int divisor = b;
        int remainder ;
        while(true){
            remainder = dividend % divisor;
            if(remainder == 0){
                break;
            }
            dividend = divisor;
            divisor = remainder;

        }
        return divisor;
    }
}
