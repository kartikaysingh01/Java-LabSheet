import java.util.Scanner;

class MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if number is a power of 4
        if (num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) != 0) {
            System.out.println(num + " is a power of 4.");
        } else {
            System.out.println(num + " is not a power of 4.");
        }

        // Toggle the 3rd bit
        int toggled = num ^ (1 << 2);
        System.out.println("After toggling 3rd bit = " + toggled);

        // Multiplication table
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 10; i++) {

            if ((num * i) % 6 == 0) {
                continue;
            }

            if ((num * i) % 48 == 0) {
                break;
            }

            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}