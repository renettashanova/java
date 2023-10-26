import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int numbers[] = {1,2,3};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of the elements: " + sum);
    }
}
