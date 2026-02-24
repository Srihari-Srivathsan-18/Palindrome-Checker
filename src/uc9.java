import java.util.Scanner;

public class uc9{

    public static boolean isPalindrome(String input) {

        // Normalize input
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return checkRecursive(cleaned, 0, cleaned.length() - 1);
    }

    private static boolean checkRecursive(String str, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
           return true ;
        }

        // If mismatch found
        if (str.charAt(start) != str.charAt(end)) {
            return false ;
        }

        // Recursive Call
        return checkRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}