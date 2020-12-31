import java.util.Random;

public class L5Q2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number_to_be_generated = 10;
        int [] num = new int [number_to_be_generated];
        for (int i=0;i<num.length;i++){
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
        System.out.println("The " + number_to_be_generated + " numbers are ");
        for (int i=0;i<num.length;i++)
            System.out.print(num[i] + " ");

    }
}
