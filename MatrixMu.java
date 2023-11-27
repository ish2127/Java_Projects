import java.util.Scanner;

public class MatrixMu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n (size of matrices): ");
        int n = scanner.nextInt();

        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];
        int[][] matrixC = new int[n][n]; // Resultant matrix

        // Input matrices A and B
        System.out.println("Enter elements of matrix A:");
        inputMatrix(matrixA, n, scanner);

        System.out.println("Enter elements of matrix B:");
        inputMatrix(matrixB, n, scanner);

        // Perform matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixC[i][j] = calculateDotProduct(matrixA[i], matrixB, j, n);
            }
        }

        // Display resultant matrix C
        System.out.println("Resultant matrix C (A * B):");
        displayMatrix(matrixC, n);

        scanner.close();
    }

    // Helper function to input matrix elements
    private static void inputMatrix(int[][] matrix, int n, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Helper function to calculate dot product of a row and column
    private static int calculateDotProduct(int[] row, int[][] matrix, int column, int n) {
        int dotProduct = 0;
        for (int k = 0; k < n; k++) {
            dotProduct += row[k] * matrix[k][column];
        }
        return dotProduct;
    }

    // Helper function to display matrix elements
    private static void displayMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


