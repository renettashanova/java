public class ex3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0)
            {
                oddSum += arr[i];
            }
        }
        System.out.println(oddSum);
    }
}
