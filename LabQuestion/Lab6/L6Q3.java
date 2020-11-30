import java.util.Arrays;

public class L6Q3 {
    public static void main(String[] args) {
        int [] array = new int []{1,2,3,4,5,6,7,8,9,10};
        ArrayReversing(array);
        System.out.println(Arrays.toString(array));

    }

    public static void ArrayReversing(int [] array){
        int temp=0;

        //half array length
        int half_length=array.length/2;

        //if the array length is odd number
        if(array.length%2 !=0){
            //for example if 11 integers
            //half_length would be 6
            half_length = (array.length+1)/2;
            System.out.println(half_length);
        }

        int max_index = array.length - 1;
        for (int i=0; i<half_length;i++){
            temp=array[i];
            array[i]=array[max_index-i];
            array[max_index-i]=temp;
        }
    }
}
