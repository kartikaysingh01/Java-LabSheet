import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        // Work with absolute value to handle negative numbers safely
        num = Math.abs(num);

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        // Reattach the sign for comparison (negative numbers are not palindromes)
        if (original < 0) {
            reversed = -reversed;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }

        sc.close();
    }
}