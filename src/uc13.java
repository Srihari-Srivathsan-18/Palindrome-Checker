import java.util.*;

public class uc13{

    // Normalize input (ignore case & spaces)
    public static String normalize(String input) {
        return input.toLowerCase().replaceAll("\\s", "");
    }

    // 1️⃣ Two-Pointer Approach
    public static boolean twoPointer(String input) {
        String str = normalize(input);
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 2️⃣ Stack Approach
    public static boolean stackMethod(String input) {
        String str = normalize(input);
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // 3️⃣ Deque Approach
    public static boolean dequeMethod(String input) {
        String str = normalize(input);
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        long start, end;

        // Two Pointer
        start = System.nanoTime();
        boolean result1 = twoPointer(input);
        end = System.nanoTime();
        long time1 = end - start;

        // Stack
        start = System.nanoTime();
        boolean result2 = stackMethod(input);
        end = System.nanoTime();
        long time2 = end - start;

        // Deque
        start = System.nanoTime();
        boolean result3 = dequeMethod(input);
        end = System.nanoTime();
        long time3 = end - start;

        System.out.println("\nPalindrome Result: " + result1);
        System.out.println("\nPerformance Comparison (in nanoseconds):");
        System.out.println("Two-Pointer Method: " + time1);
        System.out.println("Stack Method:       " + time2);
        System.out.println("Deque Method:       " + time3);

        scanner.close();
    }
}