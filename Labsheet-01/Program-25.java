import java.util.Scanner;

class LogicalOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (&& or ||): ");
        String op = sc.next();

        boolean result;

        if (op.equals("&&")) {
            result = (a > 0 && b > 0);
            System.out.println("Result = " + result);
        } 
        else if (op.equals("||")) {
            result = (a > 0 || b > 0);
            System.out.println("Result = " + result);
        } 
        else {
            System.out.println("Invalid logical operator.");
        }

        sc.close();
    }
}