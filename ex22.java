import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int n = sc.nextInt();
        double values[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value #" + (i+1) + ":");
            values[i] = sc.nextDouble();
        }
        double sum = averageSum(values);
        System.out.println("Average sum: " + sum);
    }

    public static double averageSum(double values[])
    {
        double sum = 0;
        if(values.length == 0)
        {
            return 0.0;
        }
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum/values.length;
    }
}
