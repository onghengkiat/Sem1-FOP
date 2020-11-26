package Lab3;

import java.util.Random;

public class L3Q2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rnd_num = rnd.nextInt(6);
        String word = "";
        switch(rnd_num) {
            case 0 :
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            default:
                System.out.println("Impossible to reach here");
        }
        System.out.println(rnd_num + " is " + word);

    }
}
