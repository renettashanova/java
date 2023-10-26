public class ex6 {
    public static void main(String[] args) {
        int matrix[][] = {{1,2},{3,4}};
        int mainDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonalSum += matrix[i][i];
        }
        int otherDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            otherDiagonalSum += matrix[i][matrix.length - 1 - i];
        }
        System.out.println(mainDiagonalSum);
        System.out.println(otherDiagonalSum);

    }
}
