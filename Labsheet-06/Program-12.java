import java.util.Scanner;

class InvalidPatientAgeException extends Exception {

    InvalidPatientAgeException(String message) {
        super(message);
    }
}

public class PatientRegistration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            String ageInput = sc.nextLine();

            int age = Integer.parseInt(ageInput);

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException(
                    "Invalid age. Age must be between 0 and 120."
                );
            }

            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + age);
            System.out.println("Patient registration successful.");
        }
        catch (InvalidPatientAgeException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input for age.");
        }

        sc.close();
    }
}