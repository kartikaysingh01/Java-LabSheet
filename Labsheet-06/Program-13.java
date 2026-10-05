import java.util.Scanner;

class InvalidDosageException extends Exception {

    InvalidDosageException(String message) {
        super(message);
    }
}

public class DosageValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String patientName = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drugName = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            String dosageInput = sc.nextLine();

            int dosage = Integer.parseInt(dosageInput);

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException(
                    "Invalid dosage. Dosage must be between 1 and 1000 mg."
                );
            }

            System.out.println("Patient Name: " + patientName);
            System.out.println("Drug Name: " + drugName);
            System.out.println("Dosage: " + dosage + " mg");
            System.out.println("Dosage is valid.");
        }
        catch (InvalidDosageException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input for dosage.");
        }
        finally {
            System.out.println("Dosage validation completed.");
        }

        sc.close();
    }
}