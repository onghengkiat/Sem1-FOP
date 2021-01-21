import java.util.Random;
import java.util.Scanner;

class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = input.nextInt();
        int[][] matrixA = generateMatrix(n);
        int[][] matrixB = generateMatrix(n);

        System.out.println("Matrix A");
        displayMatrix(matrixA);

        System.out.println("Matrix B");
        displayMatrix(matrixB);

        System.out.println("Matrix A + B");
        addMatrix(matrixA, matrixB);

        System.out.println("Matrix A X B");
        multiplyMatrix(matrixA, matrixB);

    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        Random rnd = new Random();
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = rnd.nextInt(10);
            }
        }
        /* matrix.length returns me 3
        row = 0
        matrix[row.length] returns me the number of column at this row, it will return me 4
        1 2 3 4
        3 7 7 8 7  9  0
        8 9 0 10 3 4
         */
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println("");
        }
    }

    public static void addMatrix(int[][] matrix1, int[][] matrix2) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1.length; column++) {
                System.out.print(matrix2[row][column] + matrix1[row][column]+ " ");
            }
            System.out.println();
        }
    }

    public static void multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                int ans = 0;
                for (int i = 0; i < matrix2[row].length; i++) {
                    ans += matrix1[row][i] * matrix2[i][column];
                }
                System.out.print(ans + " ");
            }
            System.out.println();
        }
        /*
               B           D
               F           G
        A E   A*B + E*F   ans
        B C
         */
    }

}
