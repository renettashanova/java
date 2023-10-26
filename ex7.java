public class ex7 {
    public static void main(String[] args) {
        int matrix[][] = {{1,2}, {3,4}};
        int firstRowSum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            firstRowSum += matrix[0][i];
        }
        System.out.println("Sum of the elements in the first row: " + firstRowSum);
    }
}
