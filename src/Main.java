import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

        System.out.println("Hello , Welcome to my Palindrome Checker.");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int flag = 0 ;
        int left = 0 , right = input.length() - 1 ;
        while (left != right)
        {
            if (input.charAt(left ++) != input.charAt(right --))
            {
                flag = 1 ;
                break ;
            }
        }
        if (flag == 0) System.out.println("Palindrome") ;
        else System.out.println("Not a palindrome") ;
        System.out.println("srihari is motu in aryan's dream.") ;
    }
}