import java.util.Scanner;

class PalindromeChecker {

    // Encapsulated palindrome logic
    public boolean checkPalindrome(String input) {
        if (input == null) {
            return false;
        }

        // Normalize: remove spaces and ignore case
        String normalized = input.toLowerCase().replaceAll("\\s", "");

        char[] chars = normalized.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class uc11{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (checker.checkPalindrome(input)) {
            System.out.println("It is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("It is NOT a palindrome.");
        }

        scanner.close();
    }
}