public class L6Q6 {
    public static void main(String[] args) {
        //palindromic prime is prime number which after reversed still having same value
        //emirp prime prime number that after reverse the number, it is still primer number (excluding palindromic prime)
        int current_number = 2;

        for (int palindromicCount = 1 ; palindromicCount <= 20 ; ){
            if(palindromicPrime(current_number)){
                System.out.println("The number " + palindromicCount + " palindromic prime is " + current_number);
                palindromicCount++;
            }
            current_number ++;
        }

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
        if (a <= 1){
            return false;
        }

        //reversing the number and assign it to reverse variable
        int reverse=0;
        int a2=a;

        while(a2!=0){
            reverse = reverse*10 + a2%10;
            a2/=10;
        }

        //if after reverse not same with original then it is false
        if (a != reverse){
            return false;
        }

        //then check whether it is primer number
        for (int i=2; i<= a/2 ; i++){
            if (a%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean emirp(int a){
        if (a <= 1 ){
            return false;
        }
        int reverse=0;
        int a2=a;

        //check whether after reverse is the same number, if it is then false
        while(a2!=0){
            reverse = reverse*10 + a2%10;
            a2/=10;
        }
        if(a == reverse){
            return false;
        }

        //check original is prime
        for (int i=2; i< a/2 ; i++){
            if (a%i == 0){
                return false;
            }
        }

        //check reverse is prime
        for (int i=2; i< reverse/2 ; i++){
            if (reverse%i == 0){
                return false;
            }
        }
        return true;
    }
}
