import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n <= 1)
        {
            isPrime = false;
        }
        else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
        {
            System.out.println("The number is prime.");
        }
        else {
            System.out.println("The number is not prime.");
        }
    }
}
