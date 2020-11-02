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
        int[][] ans = new int[matrix1.length][matrix1.length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1.length; column++) {
                ans[row][column] = matrix2[row][column] + matrix1[row][column];
            }
        }
        displayMatrix(ans);
    }

    public static void multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] ans = new int[matrix1.length][matrix1.length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                for (int i = 0; i < matrix1[row].length; i++) {
                    ans[row][column] += matrix1[row][i] * matrix2[i][column];
                }
            }
        }
        displayMatrix(ans);
    }

}
