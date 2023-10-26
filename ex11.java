import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 10)
        {
            System.out.println("The number is greater than 10.");
        }
        else
        {
            System.out.println("The number is less than 10.");
        }
    }
}
