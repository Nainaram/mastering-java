import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to check if it's a palindrome:");
        String str = sc.nextLine();
        
        System.out.println(isPalindrome(str));
        sc.close();
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Return false if characters do not match
            }
            left++;
            right--;
        }
        return true; // Return true if all characters match
    }
}
