public class ex20 {
    public static void main(String[] args) {
        int matrix[][] = initializeArray();
        System.out.println("Sum: " + sumAll(matrix));
        System.out.println("Sum without repeating elements: " + sum(matrix));
    }

    public static int[][] initializeArray()
    {
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        return arr;
    }

    public static int sumAll(int array[][])
    {
        int mainDiagonal = 0;
        for (int i = 0; i < array.length; i++) {
            mainDiagonal += array[i][i];
        }
        int otherDiagonal = 0;
        for (int i = 0; i < array.length; i++) {
            otherDiagonal += array[i][array.length - 1 - i];
        }
        int sum = mainDiagonal + otherDiagonal;
        return sum;
    }

    public static int sum(int array[][])
    {
        int matrix = sumAll(array) - array[1][1];
        return matrix;
    }
}
