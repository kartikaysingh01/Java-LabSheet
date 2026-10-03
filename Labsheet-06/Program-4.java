import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String s1 = sc.next();

            System.out.print("Enter second number: ");
            String s2 = sc.next();

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);

            System.out.println("Result = " + (a / b));

            int[] arr = {10, 20, 30, 40, 50};

            System.out.print("Enter array index (0-4): ");
            int index = sc.nextInt();

            System.out.println("Array element = " + arr[index]);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }

        sc.close();
    }
}