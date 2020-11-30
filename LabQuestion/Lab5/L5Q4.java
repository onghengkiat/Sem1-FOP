public class L5Q4 {
    public static void main(String[] args) {
        //the input mattrix
        int [][] matrix= { {1,5,7},{3,6,9},{5,3,8} };

        //print the matrix
        System.out.println("3 by 3 Matrix");
        for (int i=0;i<matrix.length;i++){
            for(int z=0; z<matrix.length;z++)
                System.out.print(matrix[i][z] + " ");
            System.out.println("");
        }

        int [][] new_matrix = new int[matrix.length][matrix[0].length];
        int new_row = 0;
        int new_column = 0;

        //iterate by column
        for (int column = 0; column< matrix.length; column++){
            //example first column first row would become third column first row
            //first column second row would become second column first row
            //first column third row would become first column first row
            //conclusion : column become row
            //new column = (length - (current_column -1 ) ) in another word = length - current_column_index
            for (int row = matrix.length - 1; row >= 0; row--){
                new_matrix[new_row][new_column] = matrix[row][column];
                new_column++;
            }
            new_row ++;
            new_column = 0 ;
        }

        //print it out
        System.out.println("After it rotates 90 degree clockwise");
        for (int i=0;i<new_matrix.length;i++){
            for(int z=0; z<new_matrix.length;z++)
                System.out.print(new_matrix[i][z] + " ");
            System.out.println("");
        }
    }
}
