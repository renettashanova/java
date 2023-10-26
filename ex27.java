import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature: ");
        double temp = sc.nextDouble();
        System.out.println("Enter unit of measurement:");
        char unit = sc.next().charAt(0);
        if(unit == 'C' || unit == 'c')
        {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println(fahrenheit);
        }
        else if(unit == 'F' || unit == 'f')
        {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println(celsius);
        }
        else
        {
            System.out.println("Invalid.");
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}
