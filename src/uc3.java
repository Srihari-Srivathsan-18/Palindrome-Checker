import java.util.Scanner;

public class uc3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Reverse using StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();

        // Check palindrome
        if (original.equals(reversed)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        sc.close();
    }
}
