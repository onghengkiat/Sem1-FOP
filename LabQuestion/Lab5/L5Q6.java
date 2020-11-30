import java.util.Scanner;

public class L5Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int row= input.nextInt();
        int [][] SquareMatrix= new int[row][row];
        //iterate through each row of first column
        for(int i=0;i<row;i++){
            SquareMatrix[i][0]= 1;
        }//the first column is just consisted of all "1"


        //iterate through each row starting from row 2 because we have to compare it with previous row
        for(int i=1; i<row; i++){
            //iterate through each column starting from column 2 because we have to compare it with previous column
            for (int k=1; k<row; k++){
                //it is basically sum of the top and top left
                //example row 2 column 2 is the sum of row 1 column 1 and row 1 column 2
                SquareMatrix[i][k]= SquareMatrix[i-1][k-1] + SquareMatrix[i-1][k];
            }
        }

        for (int i=0; i<row; i++){
            for(int k=0 ; k<row ; k++){
                System.out.printf("%4d" , SquareMatrix[i][k]);
            }
            System.out.println("");//to space a line
        }
    }
}
