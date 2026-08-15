import java.util.Scanner;

public class FloatToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double originalValue = sc.nextDouble();

        int convertedValue = (int) originalValue;

        System.out.println("Original value: " + originalValue);
        System.out.println("Converted value: " + convertedValue);

        sc.close();
    }
}