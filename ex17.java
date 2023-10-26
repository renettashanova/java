public class ex17 {
    public static void main(String[] args) {
        int array[] = initializeArray();
        System.out.println("Elements: ");
        printArray(array);
        int reverseArray[] = reverseArray(array);
        System.out.println("Reverse array: ");
        printArray(reverseArray);

    }

    public static int[] initializeArray()
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        return arr;
    }

    public static int[] reverseArray(int arr[])
    {
        int reversed[] = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0;i < arr.length; i++) {
            reversed[j] = arr[i];
            j--;
        }
        return reversed;
    }

    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
