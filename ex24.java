import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        if(isPalindrome(input))
        {
            System.out.println(input+" is a palindromе string");
        }
        else
        {
            System.out.println(input+" is not a palindrome string");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
