import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class uc7 {

    public static boolean isPalindrome(String input) {

        // Normalize input (remove non-alphanumeric and convert to lowercase)
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char ch : cleaned.toCharArray()) {
            deque.addLast(ch);
        }

        // Compare front and rear
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
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