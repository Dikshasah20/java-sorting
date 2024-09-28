import java.util.Scanner;

public class Matrices5 {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        // Only reached if the key is not found after searching all elements
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3]; // 3 by 3
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Search for the key
        System.out.println("Searching for key 5:");
        search(matrix, 5);
    }
}
