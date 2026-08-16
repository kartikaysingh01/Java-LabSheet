import java.util.Scanner;

public class MarksPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Subject 1 (out of 100): ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2 (out of 100): ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3 (out of 100): ");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        double percentage = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (sub1 >= 40 && sub2 >= 40 && sub3 >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}