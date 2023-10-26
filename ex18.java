public class ex18 {
    public static void main(String[] args) {
        int array[] = initializeArray();
        int max = maxElement(array);
        int min = minElement(array);
        System.out.println("Print the elements: ");
        printArray(array);
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
    }

    public static int[] initializeArray()
    {
        int arr[] = {1,2,3,4,5};
        return arr;
    }

    public static int maxElement(int arr[])
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minElement(int arr[])
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
