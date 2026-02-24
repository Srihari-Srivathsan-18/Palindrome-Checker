import java.util.Scanner;

public class uc10 {

    public static boolean isPalindrome(String input) {
        // Step 1: Normalize string
        String normalized = input.toLowerCase().replaceAll("\\s", "");

        // Step 2: Convert to char array
        char[] chars = normalized.toCharArray();

        // Step 3: Two-pointer comparison
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("It is NOT a palindrome.");
        }

        scanner.close();
    }
}