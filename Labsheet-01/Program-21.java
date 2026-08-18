import java.util.Scanner;

class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int a = sc.nextInt();

        System.out.print("Enter second angle: ");
        int b = sc.nextInt();

        System.out.print("Enter third angle: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            if (a + b + c == 180) {
                System.out.println("The angles form a valid triangle.");
            } else {
                System.out.println("The angles do not form a valid triangle.");
            }
        } else {
            System.out.println("Angles must be greater than 0.");
        }

        sc.close();
    }
}