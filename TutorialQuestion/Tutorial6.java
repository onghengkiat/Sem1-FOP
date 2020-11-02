package TutorialQuestion;
import java.util.Random;
public class Tutorial6 {
    public static void main(String [] args){
        System.out.println(IsPentagonal(22));
    }
    
    //1A
    public static int Max(int num1,int num2,int num3){
    int max=0;
    if(num1>num2){
        if(num1>num3){
            max=num1;
        }
        else{
            max=num3;
        }
    }
    else{
        if(num2>num3){
            max=num2;
        }
        else
            max=num3;
    }
        return max;
    }
    
    //1b
    public static void IsSquare(int num){
    for( int i=1; i<(int)Math.pow(num,0.5)+1; i++){
        if (i*i == num){
            System.out.println("It is a square number");
            return;
        }
        }
    System.out.println("It is not a square number");
    return;
    }
    
    //1c
    public static int computeCombination(int n, int k){
        int sumOfN=1,sumOfK=1,sumOfNK=1;
        for (int i=n ; i>0 ; i--){
            sumOfN *= i;
        }
        for (int i=k; i>0 ; i--){
            sumOfK *= i;
        }
        for (int i=(n-k);i>0;i--){
            sumOfNK *= i;
        }
        int C=sumOfN/(sumOfK * (sumOfNK));
        return C;
    }
    
    
    //1d
    public static boolean IsPentagonal(int num){
        for(int i=0; i<= num ; i++){
            if (i*(3.0*i-1)/2 == num){
            return true;
            }
        }
        return false;
    }
    
    //1e
    public static void LettersDigits(String s){
        int letter=0,digit=0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit( s.charAt(i) ) ){
                letter+=1;
            }
            else if(Character.isLetter ( s.charAt(i) ) ){
                digit+=1;
            }
        }
        System.out.println("The number of letters are " + letter);
        System.out.println("The number of digits are " + digit);
        return;
    }
    
    //1f
    public static void Generate10RandomNumber(int [] array){
        Random rnd= new Random();
        for(int i=0; i<10; i++){
            array[i]=rnd.nextInt(101);
        }
    }
    
    //1g
    public static void AreaCircumference(double radius){
        final double pi=3.142;
        double area=pi*radius*radius;
        double circumference= 2*pi*radius;
        System.out.println("The area is " + area);
        System.out.println("The circumference is " + circumference);
        return;
    }
    
    //1h 
    public static int oneRandomNumber(){
        Random rnd=new Random();
        int [] data = new int[12];
        data[0]= rnd.nextInt(11); //need to create a first value to be compared
        for(int i=1; i<12; i++){
            int random= rnd.nextInt(11);
            data[i]=random;
            for (int j=1; j<i; j++){
                if(data[j-1] == random){
                    System.out.println("The random number is " + random);
                    return random;
                }
            }
        }
        return data[11];
    }
    void Methodname(){
        return;
    }
    //Question2
    public static void Descending(int num1, int num2, int num3){
        if(num1<num2 && num3<num2){
            System.out.print(num2 + ", ");
            if (num1>num3){
                System.out.println(num1 + ", " + num3 );
            }
            else{
                System.out.println(num3 + ", " + num1);
            }    
        }
        else if (num1<num3 && num2<num3){
            System.out.print(num3 + ", ");
            if(num1>num2){
                System.out.println(num1 + ", " + num2);
            }
            else {
                System.out.println(num2 + ", " + num1);
            }
        }
        else {
            System.out.print(num1 + ", ");
            if (num2>num3){
                System.out.println(num2 + ", " + num3);
            }
            else{
                System.out.println(num3 + ", " + num2);
            }
        }
        return;
    }
}
