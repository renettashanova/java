import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0)
        {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is positive.");
        }
    }
}
