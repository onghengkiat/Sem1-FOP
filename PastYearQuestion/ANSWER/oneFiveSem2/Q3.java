import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

class Q3{
    public static void main(String[] args) {
        try{
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("Q3.txt"));
            Random rnd = new Random();
            Scanner input = new Scanner(System.in);

            int [] integer = new int[10];
            System.out.println("The following is the 10 random numbers generated that is stored in an array:");

            for(int i = 0 ; i < 10 ; i++){
                integer[i] = rnd.nextInt(51);
                System.out.print(integer[i] + " ");
            }
            System.out.println("");
            outputStream.println();

            outputStream.print("The content of the sorted array is (ascending): ");
            System.out.println("The following is the sorted array (ascending):");
            for(int i = 0 ; i < 9; i++){
                for(int j = 0 ; j < 9 ; j++){
                    if(integer[j+1] < integer[j]){
                        int temp = integer[j+1];
                        integer[j+1] = integer[j];
                        integer[j] = temp;
                    }
                }
            }
            for(int i = 0 ; i < 10 ; i++){
                System.out.print(integer[i] + " ");
                outputStream.print(integer[i] + " ");
            }

            System.out.println("");
            outputStream.println();

            System.out.print("Enter an integer input to be searched within the sorted array: ");
            int n = input.nextInt();
            boolean exist = false;
            for(int i = 0 ; i < 10 ; i ++){
                if(integer[i] == n){
                    exist = true;
                    outputStream.println("Input integer " + n + " was found on index " + i + " of the sorted array.");
                    outputStream.println("It was found in " + (i+1) + " number of loops");
                    break;
                }
            }

            if(exist == false){
                outputStream.println("Input integer " + n + " was not found in the sorted array.");
            }
            outputStream.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
}
