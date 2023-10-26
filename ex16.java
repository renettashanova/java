public class ex16 {

    public static void main(String[] args) {
        int array[] = initializeArray();
        System.out.println("Array elements: ");
        printArray(array);
        int totalSum = sumElements(array);
        int evenSum = sumEvenElements(array);
        int oddSum = sumOddElements(array);
        System.out.println("Total sum: " + totalSum);
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);
    }

    public static int[] initializeArray()
    {
            int arr[] = {1,2,3,4,5};
            return arr;
    }

    public static int sumElements(int arr[])
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sumEvenElements(int arr[])
    {
        int sumEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
            {
                sumEven += arr[i];
            }
        }
        return sumEven;
    }

    public static int sumOddElements(int arr[])
    {
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0)
            {
                sumOdd += arr[i];
            }
        }
        return sumOdd;
    }

    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }


}
