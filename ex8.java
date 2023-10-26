public class ex8 {
    public static void main(String[] args) {
        int matrix[][] = {{1,2}, {3,4}};
        int secondRowSum = 0;
        for (int i = 0; i < matrix[1].length; i++) {
            secondRowSum += matrix[1][i];
        }
        System.out.println(secondRowSum);
    }
}
