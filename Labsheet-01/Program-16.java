import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        double tax;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = (income - 500000) * 0.20 + 12500;
        } else {
            tax = (income - 1000000) * 0.30 + 112500;
        }

        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);

        sc.close();
    }
}