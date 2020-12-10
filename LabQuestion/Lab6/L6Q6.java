public class L6Q6 {
    public static void main(String[] args) {

        int current_number = 2;

        //2, 3, 5, 7, 11, 101, 131, 151, 181, 191, 313, 353, 373, 383, 727, 757, 787, 797, 919, 929
        for (int palindromicCount = 1 ; palindromicCount <= 20 ; ){
            if(palindromicPrime(current_number)){
                System.out.println("The number " + palindromicCount + " palindromic prime is " + current_number);
                palindromicCount++;
            }
            current_number ++;
        }

        //13, 17, 31, 37, 71, 73, 79, 97, 107, 113, 149, 157, 167, 179, 199, 311, 337,
        // 347, 359, 389, 701, 709, 733, 739, 743, 751, 761, 769, 907, 937, 941, 953, 967, 971, 983
        current_number = 2;
        for (int emirpCount = 1 ; emirpCount <= 20 ;){
            if(emirp(current_number)){
                System.out.println("The number " + emirpCount + " emirp is " + current_number);
                emirpCount++;
            }
            current_number ++;
        }
    }

    public static boolean palindromicPrime (int a){
        //palindromic prime is prime number which after reversed still having same value
        // original = 131, reverse = 131
        // 1st condition : is prime
        // 2nd condition : reverse is same with original

        //reversing the number and assign it to reverse variable
        int reverse_num=reverse(a);

        //if after reverse not same with original then it is false
        if (a != reverse_num){
            return false;
        }

        //then check whether it is prime number
        return isPrime(a);
    }

    public static boolean emirp(int a){

        //emirp prime number that after reverse the number, it is still primer number (excluding palindromic prime)
        // 1st condition : is prime number
        // 2nd condition : reverse is NOT same with original
        // 3rd condition : reverse_number is prime also
        int reverse_num =reverse(a);
        if(a == reverse_num){
            return false;
        }

        // 17 is prime
        // 71 != 17
        // 71 is prime
        // it meets the condition to be emirp number

        //check original and reverse number are prime number or not
        return isPrime(a) && isPrime(reverse_num);
    }

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i=2; i<= num/2 ; i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }

    //get the reverse number from a number
    public static int reverse(int num){
        //1234
        //return 4321
        int reverse_num = 0;

        //num = 1234
        while(num!=0){
            //first round
            //reverse_num = 0
            //reverse_num * 10 = 0
            // num % 10 = 4
            // reverse_num = 0 + 4 = 4

            //second round
            // num = 123
            // reverse_num = 4
            // reverse_num * 10 = 40
            // num % 10 = 3
            // reverse_num = 40 + 3 = 43

            // reverse_num = 432
            // reverse_num = 4321
            // num = 1 /10 = 0
            reverse_num = reverse_num*10 + num%10;
            num/=10;
        }
        return reverse_num;
    }
}

