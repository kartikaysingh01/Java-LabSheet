import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new Exception("Invalid marks. Marks must be between 0 and 100.");
            }

            System.out.println("Valid marks = " + marks);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}