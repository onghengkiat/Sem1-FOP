import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input =new Scanner(System.in);

        int [] integer = new int [20];
        //Displaying a set of array
        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i=0; i<integer.length; i++){
            integer[i]=rnd.nextInt(101);
            System.out.print(integer[i] + " ");
        }
        System.out.println("");//space a line

        //sorting
        int slot;
        //descending order
        for (int pass=0;pass<integer.length;pass++){
            //if current number smaller than next number
            //then swap
            for (int i=0;i<integer.length-1;i++){
                if(integer[i]<integer[i+1]){
                    slot = integer[i];
                    integer[i]=integer[i+1];
                    integer[i+1]=slot;
                }
            }
        }

        //Displaying a set of array after arranging it
        System.out.println("Array in descending order");
        for (int i=0; i<integer.length; i++){
            System.out.print(integer[i] + " ");
        }
        System.out.println("");//space a line

        //Enter the key to be searched
        System.out.print("Enter a number to search: ");
        int keyword=input.nextInt();
        System.out.println("");//space a line

        //linear search
        for (int i=0; i<integer.length;i++){
            if(integer[i]== keyword){
                System.out.println(keyword +" is found");
                System.out.println("Linear search - " + i +" loops");
                break;
            }
            else if(i==integer.length-1 && integer[i] != keyword){
                System.out.println("Linear search : The number is not found");
            }
        }
        System.out.println("");

        //binary search
        int low=0, middle, high=integer.length-1 , count=0 ;
        do{
            middle=( low + high )/2;
            count+=1;
            if (keyword == integer[middle]){
                System.out.println(keyword + " is found");
                System.out.println("Binary search - " + count + " loops");
                break;
            }else if (integer[middle] < keyword) {
                high = middle - 1;
            }else {
                low = middle + 1;
            }
        } while(low <= high);
        if(low>high){
            System.out.println("Binary search : The number is not found");
        }//if the number is not inside the array

    }
}
