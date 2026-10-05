import java.util.Scanner;

class InvalidExamMarksException extends Exception {

    InvalidExamMarksException(String message) {
        super(message);
    }
}

public class OnlineExamination {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student marks: ");
            String marksInput = sc.nextLine();

            int marks = Integer.parseInt(marksInput);

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException(
                    "Invalid marks. Marks must be between 0 and 100."
                );
            }

            System.out.println("Marks = " + marks);

            if (marks >= 40) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
        catch (InvalidExamMarksException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }
        finally {
            System.out.println("Exam evaluation completed.");
        }

        sc.close();
    }
}