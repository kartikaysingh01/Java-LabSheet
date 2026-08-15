import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);

        if (b != 0) {
            int quotient = a / b;
            int remainder = a % b;
            System.out.println("Division: " + quotient);
            System.out.println("Modulus: " + remainder);
        } else {
            System.out.println("Division and Modulus: undefined (division by zero)");
        }

        sc.close();
    }
}