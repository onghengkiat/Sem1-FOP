
public class L6Q4 {
    public static void main(String[] args) {
        System.out.println("gcd for 25 and 8 is " + gcd(25,8));

        System.out.println("\n\n");
        System.out.println("gcd for 200 and 625 is " + gcd(200,625));

        System.out.println("\n\n");
        System.out.println("gcd for 3 and 7 is " + gcd(7,3));

    }

    public static int gcd(int dividend, int divisor){
        /*

        1st round:
        25    =     3*8    +   1
        ^             ^        ^
        dividend    divisor   remainder

        next_dividend = current_divisor
        next_divisor = current_remainder

        2nd round:
        8     =     8*1    +   0
        ^             ^        ^
        dividend    divisor   remainder

        remainder == 0, break the process
        Greatest commen divisor(GCD) = the divisor
        GCD = 1
         */

        //dividend = 25
        //divisor = 8
        //remainder = ?
        int remainder ;
        while(true){

            //find the remainder
            remainder = dividend % divisor;

            System.out.println("Dividend "+ dividend);
            System.out.println("Divisor " + divisor);
            System.out.println("Remainder " + remainder);

            //remainder == 0,means GCD is found
            if(remainder == 0){
                break;
            }
            dividend = divisor;
            divisor = remainder;

        }
        return divisor;
    }

    public static int gcdRecursion(int dividend, int divisor){
        if (divisor != 0)
            return gcdRecursion(divisor, dividend % divisor);
        else
            return dividend;
    }

    /*
    625 and 200
    remainder = dividend % divisor
    dividend = divisor
    divisor = remainder

    1) gcdRecursion(625,200)
    dividend = 625, divisor = 200

    passes the next dividend and divisor
    gcdRecursion(200,625%200)

    2) gcdRecursion(200,25)
    passes the next dividend and divisor
    gcdRecursion(25,200%25)

    3) gcdRecursion(25,0)
    divisor of this method is the remainder of last method. So when remainder = 0, breaks it
    divisor == 0 break it.
    return dividend=25
     */
}

