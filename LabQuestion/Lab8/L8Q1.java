
import java.util.Random;

public class L8Q1 {
    public static void main(String[] args) {
        Number a = new Number();
        a.showAll();
        a.showEven();
        a.showPrime();
        a.showSquare();
        a.showMax();
        a.showMin();
        a.showAverage();
        System.out.println("\n\n");


        Number b = new Number(5);
        b.showAll();
        b.showEven();
        b.showPrime();
        b.showSquare();
        b.showMax();
        b.showMin();
        b.showAverage();
        System.out.println("\n\n");

        
        Number c = new Number(4,50);
        c.showAll();
        c.showEven();
        c.showPrime();
        c.showSquare();
        c.showMax();
        c.showMin();
        c.showAverage();

    }
}

class Number{
    private int occurence = 10 ;
    private int maximum = 100;
    private int [] rnd_number_array ;

    public Number(){
        rnd_number_array = new int[occurence];
        generate();
    }

    public Number(int occ){
        occurence = occ;
        rnd_number_array = new int[occurence];
        generate();
    }

    public Number(int occ, int max) {
        occurence = occ;
        maximum = max;
        rnd_number_array = new int [occurence];
        generate();
    }

    public void generate(){
        Random rnd = new Random();
        for(int i = 0 ; i < occurence ; i ++){
            rnd_number_array[i] = rnd.nextInt(maximum+1);
        }
    }

    public void showMin(){
        System.out.println("min");
        int min = rnd_number_array[0];
        for(int i = 1 ; i < occurence ; i ++){
            if(min > rnd_number_array[i]){
                min = rnd_number_array[i];
            }
        }
        System.out.println(min);
    }

    public void showMax(){
        System.out.println("max");
        int max = rnd_number_array[0];
        for(int i = 1 ; i < occurence ; i ++){
            if(max < rnd_number_array[i]){
                max = rnd_number_array[i];
            }
        }
        System.out.println(max);
    }

    public void showAverage(){
        System.out.println("avg");
        int sum = 0;
        for(int i = 1 ; i < occurence ; i ++){
            sum += rnd_number_array[i];
        }
        System.out.printf("%.4f",sum/(double)occurence);
    }

    public void showEven(){
        System.out.println("even");
        for(int i = 0 ; i < occurence ; i ++){
            if(rnd_number_array[i] % 2 == 0 ){
                System.out.print(rnd_number_array[i] + " ");
            }
        }
        System.out.println();
    }

    public void showPrime(){
        System.out.println("prime");
        for(int i = 0 ; i < occurence ; i ++){
            if(isPrime(rnd_number_array[i])){
                System.out.print(rnd_number_array[i] + " ");
            }
        }
        System.out.println();
    }
    private boolean isPrime(int num){
        if(num == 0 )
            return false;
        if(num == 1)
            return false;
        for(int i = 2;  i<= num/2 ; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public void showSquare(){
        System.out.println("square");
        for(int i = 0 ; i < occurence ; i++){
            if(isSquare(rnd_number_array[i])){
                System.out.print(rnd_number_array[i] + " ");
            }
        }
        System.out.println();
    }

   private boolean isSquare(int num){
        int n = (int)(Math.sqrt(num));
        if(Math.pow(n,2)  == num){
            return true;
        }
        return false;
   }

   public void showAll(){
       System.out.println("all");
        for(int i = 0;  i < occurence ; i++){
            System.out.print(rnd_number_array[i] + " ");
        }
       System.out.println();
   }
}