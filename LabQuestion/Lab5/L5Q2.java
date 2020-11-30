import java.util.Random;

public class L5Q2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] num = new int [10];
        for (int i=0;i<10;i++){
            num [i]=rnd.nextInt(21);
            //check all the numbers generated before this
            for (int n=0;n<i;n++){
                if(num[n]==num[i]){
                    //if duplicated, generate again
                    i--;
                    break;
                }
            }
        }

        //print it out
        System.out.print("The 10 numbers are ");
        for (int i=0;i<10;i++)
            System.out.print(num[i] + " ");

    }
}
