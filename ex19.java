public class ex19 {
    public static void main(String[] args) {
        int number = 7;
        if(isPrime(number))
        {
            System.out.println("The  number is prime.");
        }
        else {
            System.out.println("The number is not prime.");
        }

    }
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if(n % 2 != 0 && n % 3 != 0)
        {
            return true;
        }
        return false;
    }

}
