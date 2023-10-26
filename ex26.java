import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number: ");
        double num1 = sc.nextDouble();
        System.out.println("Second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Operation: ");
        char operator = sc.next().charAt(0);
        double result = 0;
        if(operator == '+')
        {
            result = num1 + num2;
        }
        else if(operator == '-')
        {
            result = num1 - num2;
        }
        else if(operator == '*')
        {
            result = num1 * num2;
        }
        else if(operator == '/')
        {
            if(num2 != 0)
            {
                result = num1 / num2;
            }
            else {
                System.out.println("Error!");
                return;
            }
        }else{
            System.out.println("Invalid operation.");
            return;
        }
        System.out.println(result);
    }
}
