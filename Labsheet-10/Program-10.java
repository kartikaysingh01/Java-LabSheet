
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            File file = new File("employees.txt");

            // Accept employee details
            FileWriter writer = new FileWriter(file, true);

            System.out.print("Enter Employee ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Salary: ");
            String salary = sc.nextLine();

            writer.write(id + "," + name + "," + department
                    + "," + salary + "\n");

            writer.close();

            // Search employee by ID
            System.out.print("Enter Employee ID to search: ");
            String searchID = sc.nextLine();

            if (!file.exists()) {
                System.out.println("Employee file does not exist.");
            } else {
                BufferedReader reader =
                        new BufferedReader(new FileReader(file));

                String line;
                boolean found = false;

                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",", -1);

                    if (data.length == 4 && data[0].equals(searchID)) {
                        System.out.println("Employee Record Found:");
                        System.out.println("Employee ID: " + data[0]);
                        System.out.println("Employee Name: " + data[1]);
                        System.out.println("Department: " + data[2]);
                        System.out.println("Salary: " + data[3]);
                        found = true;
                        break;
                    }
                }

                reader.close();

                if (!found) {
                    System.out.println("Employee record not found.");
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
