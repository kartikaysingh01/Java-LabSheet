import java.util.Scanner;

class InvalidQuantityException extends Exception {

    InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {

    InsufficientMedicineStockException(String message) {
        super(message);
    }
}

public class PharmacyInventory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String medicineName = sc.nextLine();

            System.out.print("Enter available quantity: ");
            String availableInput = sc.nextLine();

            System.out.print("Enter required quantity: ");
            String requiredInput = sc.nextLine();

            int available = Integer.parseInt(availableInput);
            int required = Integer.parseInt(requiredInput);

            if (available < 0 || required < 0) {
                throw new InvalidQuantityException(
                    "Quantity cannot be negative."
                );
            }

            if (required > available) {
                throw new InsufficientMedicineStockException(
                    "Insufficient medicine stock."
                );
            }

            System.out.println("Medicine Name: " + medicineName);
            System.out.println("Available Quantity: " + available);
            System.out.println("Required Quantity: " + required);
            System.out.println("Medicine issued successfully.");
        }
        catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientMedicineStockException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }
        finally {
            System.out.println("Inventory transaction completed.");
        }

        sc.close();
    }
}