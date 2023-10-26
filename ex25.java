import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sumOfSecondRow = 0;
        for (int i = 0; i < cols; i++) {
            sumOfSecondRow += matrix[1][i];
        }
        printMatrix(matrix);
        System.out.println("Sum of elements: " + sumOfSecondRow);
    }

    public static void printMatrix(int matrix[][])
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
