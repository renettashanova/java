import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
       int arr[] = {2,6,3};
       int evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
            {
                evenSum += arr[i];
            }
        }
        System.out.println(evenSum);
    }
}
