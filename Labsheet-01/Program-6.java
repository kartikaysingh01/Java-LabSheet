import java.util.Scanner;

public class CharToASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int asciiValue = ch;

        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + asciiValue);

        sc.close();
    }
}