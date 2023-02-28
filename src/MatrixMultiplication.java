import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] matrixOne = initializeMatrix(receiveMatrix());
        int[][] matrixTwo = initializeMatrix(receiveMatrix());
        if (matrixOne[0].length == matrixTwo.length) {
            System.out.println("Product Matrix: ");
            printMatrix(calculateMatrixMultiplication(matrixOne, matrixTwo));
        } else {
            System.out.println("The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
        }
    }

    static int[][] receiveMatrix() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int numberOfRow = scanner.nextInt();

        System.out.print("Enter the number of columns in the matrix: ");
        int numberOfColumn = scanner.nextInt();

        return new int[numberOfRow][numberOfColumn];
    }

    static int[][] initializeMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter elements for matrix [" + i + "]" + "[" + j + "]" + " : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static int[][] calculateMatrixMultiplication(int[][] matrixOne, int[][] matrixTwo) {

        int[][] multipliedMatrix = new int[matrixOne.length][matrixTwo[0].length];
        int sum=0;

        for (int i = 0; i < matrixTwo[0].length; i++) {
            for (int j = 0; j < matrixOne.length; j++) {
                for (int k = 0; k < matrixTwo.length; k++) {
                    sum += matrixOne[j][k] * matrixTwo[k][i];
                }
                multipliedMatrix[j][i] = sum;
                sum = 0;
            }
        }
        return multipliedMatrix;
    }

}
